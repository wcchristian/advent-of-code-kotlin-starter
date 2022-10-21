# Advent of Code YYYY
This repo houses my solutions for Advent of Code YYYY

https://adventofcode.com/

# Running The Solutions
You can run the solutions with `./gradlew run`. This will print out all of the solutions.

You can also check them for accuracy by using `./gradlew test`.

# Workflow
Each Day...
1. Copy the input and example input into the resources directory
2. Duplicate Day00.kt in the puzzle package and name it according to the day of the puzzle (Day00 is a template file)
3. Go to App.kt and add a new entry to call for the new puzzle
4. Duplicate one of the test files and adjust for your new DayXX.kt with the expected results.