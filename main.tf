terraform {
  required_providers {
    delphix = {
      version = "VERSION"
      source  = "delphix-integrations/delphix"
    }
  }
}

provider "delphix" {
  tls_insecure_skip = true
  key               = "1.XXXX"
  host              = "HOSTNAME"
}
