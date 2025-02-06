```groovy
def myMethod(List<String> list) {
  list.each { element ->
    if (element == null) {
      println "Null element found"
      return //This will exit the each loop prematurely
    }
    println element
  }
}

myMethod(["a", null, "b"])
```