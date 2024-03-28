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
