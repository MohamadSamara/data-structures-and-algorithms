# Hash Table

## Challenge Title
Implement a Hash Table data structure with set, get, has, keys, and hash methods

## Description of the challenge
This challenge is to implement a hash table data structure in Java. A hash table is a data structure that maps keys to values. Keys are hashed into buckets, and values are stored in the buckets. Hash tables are efficient for retrieving values, given a key.

## Approach & Efficiency
I implemented a hash table using separate chaining to handle collisions. Here's the approach for each method:

- `set(key, value)`: which takes a key and a value as input and inserts the key-value pair into the hash table. This method should hash the key into a bucket index and then add the key-value pair to the linked list at that bucket index, If the key already exists, update its value.
- `get(key)`:  which takes a key as input and returns the value associated with that key, or null if the key does not exist in the hash table. This method should hash the key into a bucket index and then iterate over the linked list at that bucket index to find the key-value pair with the given key. If the key-value pair is found, the method should return the value; otherwise, the method should return null.
- `has(key)`: which takes a key as input and returns true if the key exists in the hash table, or false otherwise. This method can be implemented by simply calling the get() method and checking if the returned value is null.
- `keys()`: which returns a list of all the keys in the hash table. This method can be implemented by iterating over the array of linked lists and adding all of the keys in each linked list to the list.

The time complexity of each method is O(1) on average, assuming a good hash function and relatively even distribution of keys. In the worst case, when there are many collisions, the time complexity is O(n), where n is the number of keys.

## Solution
To use this Hash Table implementation, follow these steps:

1. Create an instance of the `HashMap` class, specifying the size of the hash table.
2. Use the `set(key, value)` method to add key-value pairs to the hash table.
3. Use the `get(key)` method to retrieve values by their keys.
4. Use the `has(key)` method to check if a key exists in the hash table.
5. Use the `keys()` method to retrieve a list of all unique keys in the hash table.

Example:

```java
HashMap<String, Integer> hashMap = new HashMap<>(10);
hashMap.set("Mohamad", 1);
hashMap.set("Samara", 2);

System.out.println(hashMap.get("Mohamad"));  // Output: 1
System.out.println(hashMap.has("Samara"));  // Output: true
System.out.println(hashMap.keys());      // Output: ["Mohamad", "Samara"]
```