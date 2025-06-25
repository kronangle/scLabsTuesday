Narrative: 
Various scenarios to test Calculator

    
Scenario: Test add method
Given a calculator
When I add 2 and 9
Then the outcome should be 11

Scenario: Test subtract method
Given a calculator
When I subtract 7 and 2
Then the result should be 5

Scenario: Test multiply method
Given a calculator
When I multiply	<number1> and <number2>
Then the result should be <result>
Examples:
| number1 | number2 | result |
| 4       | 3       | 12     |
| 5       | 6       | 30     |
| 7       | 9       | 63     |

