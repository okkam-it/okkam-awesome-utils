# okkam-awesome-utils

A library containing some awesome, incredible, unbelievable utils. Very common functions to avoid lots of duplications and re-coding :)

### ArrayUtils:

+ **int** getObjPos(T[] array, T obj) -> return the position of the object into the array. -1 if not exists
+ **List<T>** toList(T[] array) -> Build a list based on the array
+ **List<T>** toListStartingWith(T elem, T[] array) -> Build a list based on the array, prepending an element
+ **List<T>** toListEndingWith(T[] array, T elem) -> Build a list based on the array, appending an element
+ **T[]** addElementToArray(T[] array, T addElmt) -> Append a single element to an array
+ **T[]** addElementsToArray(T[] array, List<T> addElmts) -> Append a list of elements to an array

### CharUtils:

+ **boolean** isBetween(char start, char end, char toCheck) -> Returns true if the char is between the range
+ **boolean** isStrictBetween(char start, char end, char toCheck) -> Returns true if the char is strict between the range

### CollectionUtils:

+ **List<T>** toList(Collection<T> coll) -> Build a list based on the input collection

### ListUtils:

+ **List<T>** appendElementsToList(List<T> list, T... elements) -> Append elements to a list
+ **List<T>** prependElementsToList(List<T> list, T... elements) -> Prepend elements to a list
+ **List<T>** addIfEquals(List<T> list, T element1, T element2) -> Add element1 to the list if it is equals to element2
+ **List<T>** addIfEquals(List<T> list, T elemToAdd, T1 element1, T1 element2) -> Add elemToAdd to the list if element1 is equals to element2

### MapUtils:

+ **List<T>** keySetToList(Map<T, ?> map) -> Transform the key set of a map into a List
+ **List<T>** valuesToList(Map<?, T> map) -> Transform the values of a map into a List
+ **Map<T, T>** putIfNotExists(Map<T, T> map, T key, T value) -> Put an element to a map only if the key does not exist

### SetUtils:

+ **List<T>** toList(Set<T> set) -> Build a list based on the input set

### StringUtils:

+ **boolean** isEmptyOrNull(String string) -> Returns true if the string is null or empty
+ boolean isNullEmptyOrBlank(String string) -> Returns true if the string is null or empty or blank
+ boolean isEmptyOrBlanNotNull(String string) -> Returns true if the string is empty or blank
+ **StringBuilder** appendAll(StringBuilder sb, T... elements) -> Append all elements to the string builder

## Usage:

```xml
	<dependencies>
		<dependency>
			<groupId>it.okkam.utils</groupId>
			<artifactId>okkam-awesome-utils</artifactId>
			<version>0.0.3-SNAPSHOT</version>
		</dependency>
	</dependencies>
```
