## Implementing A Minutes-To-Years-And-Days Calculator For Advanced Time Conversions
- Write a method printYearsAndDays with parameter of type long named minutes.

- The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

- If the parameter is less than 0, print text "Invalid Value".

- Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

  - XX represents the original value minutes.
  - YY represents the calculated years.
  - ZZ represents the calculated days.


### EXAMPLES OF INPUT/OUTPUT:

> printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"

> printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"

> printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"



#### TIPS:

Be extra careful about spaces in the printed message.

Use the remainder operator

1 hour = 60 minutes

1 day = 24 hours

1 year = 365 days

NOTES

The printYearsAndDays method needs to be defined as public static ​like we have been doing so far in the course.

Do not add main method to solution code.

The solution will not be accepted if there are extra spaces

#### HINTS
- Understand the Conversion Factors: Make sure to understand the relationships between minutes, hours, days, and years in terms of the constants provided (e.g., MIN_PER_HOUR, HOURS_PER_DAY, DAYS_PER_YEAR, etc.).

- Check for Negative Input: Begin by checking if the input minutes is negative. If it is, print "Invalid Value" and return.

- Calculate Years and Days: Calculate the total number of years by dividing minutes by MIN_PER_YEAR. This will give you the complete years. Then, calculate the remaining days by taking the modulus of (minutes / MIN_PER_DAY) with DAYS_PER_YEAR.

- Print the Result: Use System.out.println to display the result in the format "X min = Y y and Z d", where X is the input minutes, Y is the calculated years, and Z is the calculated days.