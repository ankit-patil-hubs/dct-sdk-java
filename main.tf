terraform {
  required_providers {
    delphix = {
      source = "delphix-integrations/delphix"
      # version = "3.3.0"
      version = ">=3.1.0"
    }
  }
}

provider "delphix" {
  tls_insecure_skip = true
  key               = "1.jTElhpXIao7pTNzVCYdkj1HpGXriTBlYbPha1Di8HjvMF6nESA1crkGlljowDs7y"
  host              = "ubuntu-2-uv49-qar-125346-27a4593a.dlpxdc.co"
}


resource "delphix_appdata_dsource" "test_app_data_dsource_second" {
  source_value                  = "13-APPDATA_STAGED_SOURCE_CONFIG-122"
  group_id                   = "13-GROUP-1"
  log_sync_enabled           = false
  make_current_account_owner = true
  link_type                  = "AppDataStaged"
  name                       = "appdata_dsource_second_new"
  staging_mount_base         = ""
  environment_user           = "HOST_USER-125"
  staging_environment        = "13-UNIX_HOST_ENVIRONMENT-125"
  parameters = jsonencode({
    delphixInitiatedBackupFlag : true,
    delphixInitiatedBackup : [
      {
        userName : "delphix",
        postgresSourcePort : 5432,
        userPass : "delphix",
        sourceHostAddress : "psrc.dlpxdc.co"
      }
    ],
    postgresPort : 5436,
    mountLocation : "/datadrive1/provision/ds-assetmanagement-neur-tntnpk-dev-rocsexecution-1"
  })
  sync_parameters = jsonencode({
    resync = true
  })
}
