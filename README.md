## Java Bootstrap

---

### Prerequisites

- Java 10
- Gradle 4.8
  
  OR
  
- Docker v17.09.0+

### Installation (OSX)

```
# Using Homebrew
$ ./bin/install
```

### Build

`$ ./bin/build`

### Test

`$ ./bin/test`

### Run

`$ ./bin/run`

### Using Docker

The `bin/docker` shim provides the required runtime for all other bin actions to run, you simply pass one to the other.  
ie: `$ ./bin/docker ./bin/run`  
or  `$ ./bin/docker ./bin/test`
