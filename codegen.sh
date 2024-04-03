#!/bin/bash
#
# Copyright (c) 2022 by Delphix. All rights reserved.
#

OPEN_API_GENERATOR_URL=https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/5.2.1/openapi-generator-cli-5.2.1.jar

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


if [[ ! -f openapi-generator-cli.jar ]]; then
    echo "No generator tool found. Downloading it"
    wget $OPEN_API_GENERATOR_URL -O openapi-generator-cli.jar \
        || die "failed to download JAR"
fi

# generate a TMP directory
[[ ! -d "/tmp" ]] && mktemp
script_base_dir=$(dirname $0)

current_dir=$(pwd)


java -jar openapi-generator-cli.jar generate \
    -i $current_dir/api.yaml -g java --global-property skipFormModel=false -o $current_dir/ --additional-properties  artifactVersion=$version,invokerPackage=com.delphix.dct,modelPackage=com.delphix.dct.models,apiPackage=com.delphix.dct.api,artifactId=dct-api,groupId=com.delphix || die "failed to generate code"


#java -jar openapi-generator-cli.jar generate \
#    -i $current_dir/api.yaml -g java --global-property skipFormModel=false -o tmp/ --additional-properties  artifactVersion=$version,invokerPackage=com.delphix.dct,modelPackage=com.delphix.dct.models,apiPackage=com.delphix.dct.api,artifactId=dct-api,groupId=com.delphix || die "failed to generate code"
#
#
#shopt -s extglob
#mv tmp/!(README.md) ..
#rm -r tmp

#mkdir -p ../src/main/resources && cp ../LICENSE.txt $_ || die "failed to copy license"
