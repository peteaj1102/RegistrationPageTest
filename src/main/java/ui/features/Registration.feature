Feature: User Login
Scenario: Login an existing user
      Given Facebook Log In page is opened
      When Login with valid facebook credentials
      Then User home page is displayed