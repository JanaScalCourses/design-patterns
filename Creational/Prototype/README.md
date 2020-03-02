# The Prototype
The Prototype is a creational design pattern that clones an object through a method, thereby, 
allowing to create a new object without depending on its class.

There're 2 types of cloning:
- shallow copy:  
The new object copy the reference of its fields

- deep copy:  
The new object creates a new objects for its fields, copying them.

In Java, the object's inherited copy method makes a shallow copy.
To implement a deep copy, it is necessary to call `super.clone ()`, 
copy the objects from the fields and change these fields to the copies.
  
# Example
For this design pattern, an example of a college was created, which has courses and students. 
At each new semester, new courses are created in which students can enroll.

The courses are divided into classroom courses`ClassroomCourse`, with classroom lessons `ClassroomLesson`, 
and distance course `DistanceCourse`, with distance lessons `DistanceLesson`.
The difference between them is in the relationship of the student with the lesson, 
where in the classroom lesson a list of students who attended is maintained, 
and in the distance lesson each student has a list of classes available.

Each course has tests to be applied, that means, copy a test prototype and delivery it to the students, 
which will resolve it.
 
In this example, it was possible to implement both a shallow copy, in the tests cloning, and a deep copy, 
in the courses and lessons cloning. 
It was also possible to show how cloning allows to abstracts the object's class without losing its characteristics, 
demonstrated when creating new courses for a new semester.

# Run the example
To run the example, you need have the jdk to compile the code, consult the [installation instructions](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html).  

After that, you need to compile the code, enter `src` folder:
```
javac college.College.java
```
And then, run it:
```
java college.College
```