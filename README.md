# okkam-awesome-utils

A library containing some awesome, incredible, unbelievable utils. Very common functions to avoid lots of duplication and re-coding :) Please report any problem or request.

### ArrayUtils:
```java
+ int getObjPos(T[] array, T obj) -> return the position of the object into the array. -1 if not exists
+ List<T> toList(T[] array) -> Build a list based on the array
+ List<T> toListStartingWith(T elem, T[] array) -> Build a list based on the array, prepending an element
+ List<T> toListEndingWith(T[] array, T elem) -> Build a list based on the array, appending an element
+ T[] addElementToArray(T[] array, T addElmt) -> Append a single element to an array
+ T[] addElementsToArray(T[] array, List<T> addElmts) -> Append a list of elements to an array
```
### CharUtils:
```java
+ boolean isBetween(char start, char end, char toCheck) -> Returns true if the char is between the range
+ boolean isStrictBetween(char start, char end, char toCheck) -> Returns true if the char is strict between the range
```
### CollectionUtils:
```java
+ List<T> toList(Collection<T> coll) -> Build a list based on the input collection
```
### ListUtils:
```java
+ List<T> appendElementsToList(List<T> list, T... elements) -> Append elements to a list
+ List<T> prependElementsToList(List<T> list, T... elements) -> Prepend elements to a list
+ List<T> addIfEquals(List<T> list, T element1, T element2) -> Add element1 to the list if it is equals to element2
+ List<T> addIfEquals(List<T> list, T elemToAdd, T1 element1, T1 element2) -> Add elemToAdd to the list if element1 is equals to element
+ List<T> addIfNotContained(List<T> list, T... elements) -> append elements to the list if they are not already contained
+ List<T> createIfNull(List<T> list) -> create an empty list if the input is null. Return the input otherwise
```
### MapUtils:
```java
+ List<T> keySetToList(Map<T, ?> map) -> Transform the key set of a map into a List
+ List<T> valuesToList(Map<?, T> map) -> Transform the values of a map into a List
+ Map<T, T> putIfNotExists(Map<T, T> map, T key, T value) -> Put an element to a map only if the key does not exist
```
### SetUtils:
```java
+ List<T> toList(Set<T> set) -> Build a list based on the input set
+ Set<T> createIfNull(Set<T> set) -> create an empty set if the input is null. Return the input set otherwise
```
### StringUtils:
```java
+ boolean isEmptyOrNull(String string) -> Returns true if the string is null or empty
+ boolean isNullEmptyOrBlank(String string) -> Returns true if the string is null or empty or blank
+ boolean isEmptyOrBlanNotNull(String string) -> Returns true if the string is empty or blank
+ StringBuilder appendAll(StringBuilder sb, T... elements) -> Append all elements to the string builder
+ boolean noOneIsEmptyNorBlank(String... strings) -> Return true if there are not empty or blank strings
+ boolean noOneIsEmpty(String... strings) -> Return true if there are not empty strings
+ boolean isEmptyBlankOr(String string, String... ors) -> Returns true if the string is empty, blank, or one of the ors strings
+ String separateArrayBy(T[] array, String separator) -> Generate a String based on array values and separator
+ String separateTreeMapValuesBy(Map<T, String> map, String separator) -> Generate a String based on map values and separator. Pass a TreeMap to guarantee ordering
```
### FlinkMappers:
```java
+ JacksonObjectMapper<T> -> Maps input pojo T into a Jackson Object string
```

## Usage:


```xml
	<dependencies>
		<dependency>
			<groupId>it.okkam.utils</groupId>
			<artifactId>okkam-awesome-utils</artifactId>
			<version>1.0.0-SNAPSHOT</version>
		</dependency>
	</dependencies>
```