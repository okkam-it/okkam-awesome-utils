[![Quality Gate](https://dev.okkam.it/sonar/api/badges/gate?key=org.okkam.utils:okkam-awesome-utils)](https://dev.okkam.it/sonar/dashboard/index/org.okkam.utils:okkam-awesome-utils)
[![Quality Gate](https://dev.okkam.it/sonar/api/badges/measure?key=org.okkam.utils:okkam-awesome-utils&metric=ncloc)](https://dev.okkam.it/sonar/dashboard/index/org.okkam.utils:okkam-awesome-utils)

# okkam-awesome-utils

A library containing some awesome, incredible, unbelievable utils. Very common functions to avoid lots of duplication and re-coding :) Please report any problem or request.

### OkkamArrays:
```java
+ int indexOf(T[] array, T obj) -> return the position of the object into the array. -1 if not exists
+ ArrayList<T> toArrayList(T[] array) -> Build a list based on the array
+ ArrayList<T> toArrayListStartingWith(T[] array, T... elems) -> Build a list based on the array, prepending a set of elements
+ ArrayList<T> toArrayListEndingWith(T[] array, T... elems) -> Build a list based on the array, appending a set of elements
+ T[] addAll(T[] array, T... addElmt) -> Append a set of elements to an array
+ T[] addAll(T[] array, List<T> addElmts) -> Append a list of elements to an array
```
### OkkamChars:
```java
+ boolean isBetween(char start, char end, char toCheck) -> Returns true if the char is between the range
+ boolean isStrictBetween(char start, char end, char toCheck) -> Returns true if the char is strict between the range
```
### OkkamComparators:
```java
+ Comparator<T> sortAscending() -> Comparator to sort ascending (or alphabetically for strings)
+ Comparator<T> sortDescending() -> Comparator to sort descending (or reverse alphabetically for strings)
```
### OkkamCollections:
```java
+ List<T> toList(Collection<T> coll) -> Build a list based on the input collection
```
### OkkamLists:
```java
+ List<T> appendElements(List<T> list, T... elements) -> Append elements to a list
+ List<T> prependElements(List<T> list, T... elements) -> Prepend elements to a list
+ boolean addIfEquals(List<T> list, T elemToAdd, T elemToCompare) -> Add elemToAdd to the list if it is equals to elemToCompare
+ boolean addIfEquals(List<T> list, T elemToAdd, T1 element1, T1 element2) -> Add elemToAdd to the list if element1 is equals to element2
+ List<T> addIfNotContained(List<T> list, T... elements) -> append elements to the list if they are not already contained
+ List<T> createArrayListIfNull(List<T> list) -> create an empty list if the input is null. Return the input otherwise
```
### OkkamMaps:
```java
+ List<V> valuesToList(Map<?, V> map) -> Transform the values of a map into a List
+ Map<K, V> putIfNotExists(Map<K, V> map, K key, V value) -> Put an element to a map only if the key does not exist
```
### OkkamSets:
```java
+ Set<T> addIfNotNull(Set<T> set, T element) -> Add element to a set if it is not empty
+ Set<T> createIfNull(Set<T> set) -> create an empty set if the input is null. Return the input set otherwise
+ Set<T> addSafeToHashSet(Set<T> set, T... elements) -> Add elements to the HashSet. Create a new HashSet if the input set is null (initialized with elements).
```
### OkkamStrings:
```java
+ boolean isEmptyOrNull(String string, boolean trim)) -> Returns true if the string is null or empty
+ boolean isEmptyAndNotNull(String string, boolean trim)) -> Check if the string is empty and not null
+ boolean noOneIsEmptyOrNull(boolean trim, String... strings) -> Check if the strings are not empty and not blank
+ boolean isOneOf(String string, boolean trim, String... ors) -> Check if the string is one of the specified values. String could also be null, in this case the method will return true if there's a null element in the passed array
+ String trimIfNecessary(boolean trim, String src) -> Returns the trimmed string when not null and necessary (i.e. trim is true)
+ StringBuilder appendAll(StringBuilder sb, T... elements) -> Append all elements to the string builder
+ String separateArrayBy(T[] array, String separator) -> Generate a String based on array values and separator
+ String separateTreeMapValuesBy(Map<T, String> map, String separator) -> Generate a String based on map values and separator. Pass a TreeMap to guarantee ordering
```

## Usage:

Last stable version:

```xml
	<dependencies>
		<dependency>
			<groupId>org.okkam.utils</groupId>
			<artifactId>okkam-awesome-utils</artifactId>
			<version>1.0.0</version>
		</dependency>
	</dependencies>
```
Snapshot version:

```xml
	<dependencies>
		<dependency>
			<groupId>org.okkam.utils</groupId>
			<artifactId>okkam-awesome-utils</artifactId>
			<version>1.0.1-SNAPSHOT</version>
		</dependency>
	</dependencies>
```