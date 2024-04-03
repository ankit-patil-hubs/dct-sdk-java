

# PasswordPoliciesParams

Parameters to read or update password policies

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | True if password policies are enforced/enabled. |  [optional]
**minLength** | **Integer** | Minimum length for password. |  [optional]
**reuseDisallowLimit** | **Integer** | The password can not be the same as any of the previous n passwords. |  [optional]
**digit** | **Boolean** | Mandate at least one digit in password. |  [optional]
**uppercaseLetter** | **Boolean** | Mandate at least one uppercase letter in password. |  [optional]
**lowercaseLetter** | **Boolean** | Mandate at least one lower letter in password. |  [optional]
**specialCharacter** | **Boolean** | Mandate at least one special character in password. |  [optional]
**disallowUsernameAsPassword** | **Boolean** | Disallows password containing case-insensitive user name or reversed user name. |  [optional]
**maximumPasswordAttempts** | **Integer** | The number of allowed attempts for incorrect password, after which the account gets locked. |  [optional]



