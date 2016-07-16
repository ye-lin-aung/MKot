# MKot 
![alt text](http://www.yelinaung.xyz/img/MKot.png "Logo Title Text 1")


#### Myanmar font util library for kotlin ( 9KB ) ####

# Features

- [Converting a String](https://github.com/ye-lin-aung/MKot#converting-a-string) 
- [Detector](https://github.com/ye-lin-aung/MKot#detecting-unicode-or-zawgyi)
- [Converting everything in a list](https://github.com/ye-lin-aung/MKot#converting-everything-in-a-list)
- [Filtering a list](https://github.com/ye-lin-aung/MKot#filtering--in-a-list)
- [Sorting List](https://github.com/ye-lin-aung/MKot#sorting-list)
- [Count](https://github.com/ye-lin-aung/MKot#count)


# Examples #

## Converting a String ##

 
### **Zawgyi** ###
** **
#### Input ####
``` 
var mingalarpar = "မဂၤလာပါ".zg2uni()

println("With Varaiable : "+mingalarpar)

println("Directly : " + "မဂၤလာပါ".zg2uni())

println("zawgyi2uni")
 ```

#### Output 
 ```
  With Varaiable : မင်္ဂလာပါ
  Directly : မင်္ဂလာပါ
  zawgyi2uni
```

### **Unicode** ###
** **
#### Input ####
```  
var mingalarpar = "မင်္ဂလာပါ".zg2uni()

println("With Varaiable : "+mingalarpar)

println("Directly : " + "မင်္ဂလာပါ".zg2uni())

println("zawgyi2uni")
 ```
 
 

#### Output 
 ```
  With Varaiable : မဂၤလာပါ
  Directly : မဂၤလာပါ
  zawgyi2uni
```

## Detecting Unicode or Zawgyi ##

### **Zawgyi** ###
** **
#### Input ####
``` 
println("မဂၤလာပါ".isUnicode())
 ```

#### Output 

 ```
false
```

### **Unicode** ###
** **
#### Input ####
``` 
println("မင်္ဂလာပါ".isUnicode())
 ```
 
 

#### Output 
 ```
true
```


## Converting everything in a list  ##

### **Zawgyi** ###
** **
#### Input ####
``` 
var randomList = mutableListOf("aa","bb","cc","dd","မဂၤလာပါ","မင်္ဂလာပါ");

randomList.toZawgyi().forEach {
        println(it)
    }
 ```

#### Output 
 ```
 aa
bb
cc
dd
မဂၤလာပါ
မဂၤလာပါ
```

### **Unicode** ###

#### Input ####
``` 
var randomList = mutableListOf("aa","bb","cc","dd","မဂၤလာပါ","မင်္ဂလာပါ");

    randomList.toUnicode.forEach {
        println(it)
    }
 ```
 
 

####  Output 
 ```
aa
bb
cc
dd
မင်္ဂလာပါ
မင်္ဂလာပါ
```


## Filtering  in a list   ##

### **Zawgyi** ###
** **
#### Input ####
``` 
 var randomList = mutableListOf("မဂၤလာပါ","မဂၤလာပါ","မင်္ဂလာပါ","မဂၤလာပါ","မဂၤလာပါ","မင်္ဂလာပါ");

    randomList.filterZgText().forEach {
        println(it)
    }

 ```

#### Output 
 ```
မဂၤလာပါ
မဂၤလာပါ
မဂၤလာပါ
မဂၤလာပါ

```

### **Unicode** ###
** **
#### Input ####
``` 
  var randomList = mutableListOf("မဂၤလာပါ","မဂၤလာပါ","မင်္ဂလာပါ","မဂၤလာပါ","မဂၤလာပါ","မင်္ဂလာပါ");

    randomList.filterUniText().forEach {
        println(it)
    }

 ```
 
 

#### Output 

 ```
မင်္ဂလာပါ
မင်္ဂလာပါ
```


## Sorting List  ##

### **Zawgyi** ###
** **
#### Input ####
``` 
var randomList = mutableListOf("ခ","က","cc","ဂ","မဂၤလာပါ","မင်္ဂလာပါ","မဂၤလာပါ");

randomList.sortByZawgyi().forEach {
        println(it)
    }

 ```

#### Output 
 ```
cc
က
ခ
ဂ
မဂၤလာပါ
မဂၤလာပါ
မင်္ဂလာပါ
```

### **Unicode** ###
** **
#### Input ####
``` 
var randomList = mutableListOf("ခ","က","cc","ဂ","မဂၤလာပါ","မင်္ဂလာပါ","မဂၤလာပါ");

randomList.sortByUnicode().forEach {
        println(it)
    }
 ```
 
 

#### Output 

 ```
cc
က
ခ
ဂ
မဂၤလာပါ
မဂၤလာပါ
မင်္ဂလာပါ
```
## Searching List  ##

### **Zawgyi** ###
** **
#### Input ####
``` 
 val map: MutableMap<Int, String> = mutableMapOf()
    map[1] = "မဂၤလာပါ"
    map[2] = "bb"
    map[3] = "မဂၤလာပါ"
    map[4] = "dd"
    map[5] = "ee"
    map[6] = "ff"
    map[7] = "မင်္ဂလာပါ"
    

    //Can use list too

    map.searchTexts("မဂၤလာပါ").forEach {
        println(it)
    }


 ```

#### Output 
 ```
 //Return index list

1
3
```

### **Unicode** ###
** **
#### Input ####
``` 
val map: MutableMap<Int, String> = mutableMapOf()
    map[1] = "မင်္ဂလာပါ"
    map[2] = "bb"
    map[3] = "မင်္ဂလာပါ"
    map[4] = "dd"
    map[5] = "ee"
    map[6] = "ff"
    map[7] = "မဂၤလာပါ"


    //Can use list too

    map.searchTexts("မင်္ဂလာပါ").forEach {
        println(it)
    }

 ```
 
 

#### Output 

 ```

1
3

```


## Count  ##

### **Zawgyi** ###
** **
#### Input ####
``` 
var randomList = mutableListOf("မဂၤလာပါ","မဂၤလာပါ","မင်္ဂလာပါ","မဂၤလာပါ","မဂၤလာပါ","မင်္ဂလာပါ");

println(randomList.zgCount())

 ```

#### Output 
 ```
4
```

### **Unicode** ###
** **
#### Input ####
``` 
var randomList = mutableListOf("မဂၤလာပါ","မဂၤလာပါ","မင်္ဂလာပါ","မဂၤလာပါ","မဂၤလာပါ","မင်္ဂလာပါ");

println(randomList.uniCount())

 ```
 
 

#### Output 

 ```
2
```


# Other Features

- Converting a Map
- Filtering a Map
- Searching a Map



# Download Jar ( version 1.1.0 )

_You need to add [org.json.jar](https://github.com/ye-lin-aung/MKot/blob/master/jars/org.json.jar?raw=true)_ 

<a href="https://github.com/ye-lin-aung/MKot/blob/master/MKot/build/libs/MKot-1.1.2.jar?raw=true" target="_blank"><img src="http://cognition.ouc.ac.cy/cclab/images/DownloadButton.png" alt="IMAGE ALT TEXT HERE" width="100" height="100"  />
</a>

# License #
```
DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE Version 2, December 2004

Copyright (C) 2004 Sam Hocevar sam@hocevar.net

Everyone is permitted to copy and distribute verbatim or modified copies of this license document, and changing it is allowed as long as the name is changed.

        DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION

You just DO WHAT THE FUCK YOU WANT TO.

```