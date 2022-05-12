Feature: Booking application of adactin
Scenario Outline: login
Given: launch the url
When enter the "<username>" in username field
And enter the "<password>" in pass field
Then login button

Examples:
|username|password|
|sangee|098|
|girijavetrivel|Giri@2019|
