Feature: Anagram checker
  As a user
  I want to check if two strings are anagrams
  So that I can verify their relationships

  Scenario Outline: Check if two strings are anagrams
    Given the input strings "<input1>" and "<input2>"
    When I check if there are anagrams
    Then the result should be "<output>"
    Examples:
      | input1 | input2 | output |
      | hello  | world  | true   |
      | rat    | car    | false  |

