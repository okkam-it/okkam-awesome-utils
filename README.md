# okkam-awesome-utils

A library containing some awesome, incredible, unbelievable utils. Very common functions to avoid lots of duplications and re-coding :)

### ArrayUtils:

+ int getObjPos(T[] array, T obj) -> return the position of the object into the array. -1 if not exists
+ List<T> toList(T[] array) -> Build a list based on the array
+ List<T> toListStartingWith(T elem, T[] array) -> Build a list based on the array, prepending an element
+ List<T> toListEndingWith(T[] array, T elem) -> Build a list based on the array, appending an element

### CharUtils:

+ boolean isBetween(char start, char end, char toCheck) -> Returns true if the char is between the range
+ boolean isStrinctBetween(char start, char end, char toCheck) -> Returns true if the char is strict between the range

### MapUtils:

+ List<T> keySetToList(Map<T, T> map) -> Transform the key set of a map to a List
+ Map<T, T> putIfNotExists(Map<T, T> map, T key, T value) -> Put an element to a map only if the key does not exist

### SetUtils:

+ List<T> toList(Set<T> set) -> Build a list based on the input set

### StringUtils:

+ boolean isEmptyOrNull(String string) -> Returns true if the string is null or empty

