/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("Akshay",1);
        obj.insert("Nandani",4);
        obj.insert("Lalit",3);
        obj.insert("Harsh",2);
        obj.insert("Vishal",5);
        obj.display();
    }
}

