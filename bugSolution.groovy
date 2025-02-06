```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { element, index ->
    if (element == null) {
      println "Null element found at index: $index"
    } else {
      println element
    }
  }
}

myMethod(["a", null, "b"])
```