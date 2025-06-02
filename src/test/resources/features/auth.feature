Feature: User do hit request auth user

  Scenario: User do request auth user with valid data
    Given User already have valid data "auth_user.yaml"
    When User hit request POST to "BASEURL_APIVIDEO" and path "PostAuth"
    Then User successfully get bearer token