# MKot
![alt text](http://www.yelinaung.xyz/img/MKot.png "Logo Title Text 1")


#### Myanmar font convertor library for kotlin ####

# Examples #

## Converting a String ##

 
### **Zawgyi** ###
** **
#### Input ####
``` 
//Zawgyi 
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
//Unicode 
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
//Zawgyi

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
//Unicode 

println("မင်္ဂလာပါ".isUnicode())
 ```
 
 

#### Output #### 
 ```
true
```


## Converting everything in a list  ##

### **Zawgyi** ###
** **
#### Input ####
``` 
//Zawgyi 

var randomList = mutableListOf("aa","bb","cc","dd","မဂၤလာပါ","မင်္ဂလာပါ");

randomList.convertListToZg().forEach {
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
//Unicode 

var randomList = mutableListOf("aa","bb","cc","dd","မဂၤလာပါ","မင်္ဂလာပါ");

    randomList.convertListToUni().forEach {
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
//Zawgyi 

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
//Unicode 

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





# Download Jar

<a href="https://github.com/ye-lin-aung/MKot/blob/master/build/libs/MKot-1.0.jar?raw=true" target="_blank"><img src="http://cognition.ouc.ac.cy/cclab/images/DownloadButton.png" alt="IMAGE ALT TEXT HERE" width="100" height="100"  />
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