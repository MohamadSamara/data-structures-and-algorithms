# Challenge Title: Repeated Word

## Description

function that finds the first word to occur more than once in a string

## Approach & Efficiency
- The code begins by validating the input string to ensure it's not null or empty.
- It then splits the input string into words, converting them to lowercase and using a regular expression to identify word boundaries.
- A custom `HashMap` is used to store word counts efficiently.
- The code iterates over the words, and for each word:
    - It checks if the word already exists in the `HashMap` to identify the first repeated word.
    - If the word is not found, it adds the word to the `HashMap` with a count of 1.
- The overall time complexity is O(n), where n is the length of the input string, and the space complexity is O(n + m), where m is the number of unique words in the input string.

## Solution
To run the code, you can create an instance of the `RepeatedWord` class and call the `repeatedWord` method, passing your input string as an argument.

Example usage:

``` java
RepeatedWord repeatedWord = new RepeatedWord();
String input = "Once upon a time, there was a brave princess who...";
String repeated = repeatedWord.repeatedWord(input);
System.out.println("First repeated word: " + repeated);
```

### Examples
- Input: "Once upon a time, there was a brave princess who..."
    - Output: "a"
- Input: "It was the best of times, it was the worst of times..."
    - Output: "No repeated word"
- Input: "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs..."
    - Output: "summer"

You can test the code with different input strings to find the first repeated word or check for the absence of a repeated word.