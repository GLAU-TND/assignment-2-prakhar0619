/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;

//executable class
public class MyMain {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student(1, "Manish", 5, 4));
        studentList.add(new Student(2, "Aman", 0, 0));
        studentList.add(new Student(3, "Prakhar", 1, 1));
        studentList.add(new Student(4, "Tina", 6, 3));
        studentList.add(new Student(5, "Dharmendra", 0, 0));
        studentList.add(new Student(6, "Rahul", 4, 2));
        studentList.add(new Student(7, "Yoyo", 2, 1));
        studentList.add(new Student(8, "ishi", 1, 1));
        studentList.add(new Student(9, "Unnati", 0, 0));
        studentList.add(new Student(10, "shivam", 5, 0));
        studentList.add(new Student(11, "Suraj", 0, 0));

        MyCircularQueue ob = new MyCircularQueue();
        ob.enqueue(studentList);

        ob.printQueue();
    }
}
