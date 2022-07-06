# Java-LinkedinLearning
This repository consist of Java Learning and basic notes taken from the Linkedin Learning and udemy
//written By Swapnil Gupta (twitter)[https://twitter.com/insanity_xi]
- first course is on Java Basics: (Linkedin Learning)[https://www.linkedin.com/learning/learning-java-4]
- Second is on Java OOPs : (Linkedin Learning)[https://www.linkedin.com/learning/java-object-oriented-programming-2/what-is-object-orientation]

# 1-Basics
- JDK= JRE, compiler and Tools
- IDE= Editor, debugger and  tools

Java codes needs compilation first then execution 
 ```
>> javac HelloWorld.java
>> java HelloWorld
 ```
Whereas the code can be written in file as such:
 ```
 //HelloWorld.java
 public class HelloWorld{
     public static void main(String[] args){
         System.out.println("Hello World!");
     }
 }
 ```
## Main Function-
 each file has main function 
 > main function: Runtime system, Code must be connected to this to call and in order to be executed by the program 

 #### difference between main function and regular function is main function is called automatically whereas other function is need to be called.

 #### -will be sharing more details on function in "Functional Programming:Java" Repo 

## Function in Java: 
function is series of finite steps to complete the task.
- Designed once, used many times
- orgnize code, easy modification

A function needs to be -  
Defined - outside main function  
-public static void functionName(){  
    setps  
     }  
Used- inside main function  
-fuctionName();  
-Syso(functionName()); //syso is shortHand for system output

Returned- each function either return a void value or a datatype.

> to get the dynamic values we pass the parameters and argument through input, arguments are the actual values.




# 2- Java OOPs:
everything can be converted to code  
## OOPS: object oriented programming model based around objects and data 

-it makes easier and reusable code 
-attributes and Behaviour makes and object     
### Eg. TREE  
-attributes: height, trunk diameter  
-Behaviour: ability to grow  

## Object Oriented Progamming comes with four pillars   
-- Abstaction  
-- Inheritence   
-- Encapsulation  
-- polymorphism  

## Classes-
we can model attributes and behaviour of objects as blueprint that defines object.
It has combination of variable and function.
> a class can create multiple objects.  
> class -> object1, object2

### eg: Triangle :
-attributes: base, height, s1, s2, s3
-behaviour/method: area(), type()

> we have to add the static keyword to, if function does not use the attribute of the class but relates to overall idea.

### Constructor class -  
a constructor is method or behavior inside every class that creates and initialised the instances.
>instance - an object created from class blueprint. eg: Triangle1 from triangle class
- A constructor always returns an instance of the class it is in. having same name of class, i.e. constructor of triangle class return triangle
```
pubilc triangle{
    public triangle(){
       
    }
}
```

### this keyword- to access the attribute for the triangle instance we are trying to create we use this keyword.

eg:   
this.base=base;  
this.height= height;  
this.s1=sidelen1;   
this.s2=sideLen2;  
this.s3=sideLen3;  

>we call constructor with new keyword in main as we are creating new instance.
<br/>

a constructor also initalizes all the attributes with dynamic values,i.e. the values of constructor is called with, determine the values of attributes.

### creating a class
```
public class Main{
    public static void main(String[] args){
        //some code
        //
    }
}
```

### instance method vs class method
- instance method are non-static method, and it needed an instance to use. can be dynamically changed.
- class method are called as static method because no need of instance.

> similarly, there are static and Non-Static variables.

## Objects:
