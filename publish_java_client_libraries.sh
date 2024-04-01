#!/bin/bash
#
# Copyright (c) 2023, 2024 by Delphix. All rights reserved.
#

function die
{
	echo "$(basename $0): $*" >&2
	exit 1
}

function usage() {
	echo "usage: $(basename $0) version"
	exit 2
}

[[ $# -eq 1 ]] || usage
version=$1

curl -O https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/7.4.0/openapi-generator-cli-7.4.0.jar
[[ $? -eq 0 ]] || die "Failed to download openapi-generator"

./gradlew -PvirtualizationVersion=$version :app:mergeOpenApiFiles
mkdir -p java-api-package || die "failed to mkdir java-api-package"
java -jar openapi-generator-cli-7.4.0.jar generate  \
    -i app/src/main/resources/dct-api-schema/api.yaml \
    -g java -o java-api-package --global-property skipFormModel=false \
    --additional-properties \
    artifactVersion=$version,invokerPackage=com.delphix.dct,modelPackage=com.delphix.dct.models,apiPackage=com.delphix.dct.api,artifactId=dct-api,groupId=com.delphix
[[ $? -eq 0 ]] || die "Failed to generate Java client library"

mvn verify gpg:sign install:install deploy:deploy -DaltDeploymentRepository=ossrh::default::https://s01.oss.sonatype.org/service/local/staging/deploy/maven2 || die "failed to mvn verify"