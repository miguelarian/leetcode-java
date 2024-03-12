# Find the Index of the First Occurrence in a String - 28

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

## Example 1

```java
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
```

Explanation: "sad" occurs at index 0 and 6.

The first occurrence is at index 0, so we return 0.

## Example 2

```java
Input: haystack = "leetcode", needle = "leeto"
Output: -1
```

Explanation: "leeto" did not occur in "leetcode", so we return -1.

## Constraints

```java
1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
```

[Source](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/)