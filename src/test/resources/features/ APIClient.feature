Feature: Testing API Client

  Scenario: Test GET endpoint
    Given I have a GET request
    # Request URL will be logged before sending the request
    When I send the request
    # Response content will be logged after receiving the response
    Then I should receive a 200 status code
    And the response should contain "data"

  Scenario: Test POST endpoint
    Given I have a POST request
    # Request URL will be logged before sending the request
    When I send the request
    # Response content will be logged after receiving the response
    Then I should receive a 201 status code
    And the response should contain "morpheus"

  Scenario: Test PUT endpoint
    Given I have a PUT request
    # Request URL will be logged before sending the request
    When I send the request
    # Response content will be logged after receiving the response
    Then I should receive a 200 status code
    And the response should contain "morpheus"

  Scenario: Test PATCH endpoint
    Given I have a PATCH request
    # Request URL will be logged before sending the request
    When I send the request
    # Response content will be logged after receiving the response
    Then I should receive a 200 status code
    And the response should contain "morpheus"

  Scenario: Test DELETE endpoint
    Given I have a DELETE request
    # Request URL will be logged before sending the request
    When I send the request
    # Response content will be logged after receiving the response
    Then I should receive a 204 status code
