/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree MyBinarySearchTree =new MyBinarySearchTree();
        MyBinarySearchTree.add(50);
        MyBinarySearchTree.add(95);
        MyBinarySearchTree.add(560);
        MyBinarySearchTree.add(356);
        MyBinarySearchTree.add(820);
        MyBinarySearchTree.add(404);
        MyBinarySearchTree.add(200);
        MyBinarySearchTree.add(78);
        MyBinarySearchTree.add(100);
        MyBinarySearchTree.add(60);
        MyBinarySearchTree.add(69);
        MyBinarySearchTree.add(85);
        MyBinarySearchTree.add(72);
        MyBinarySearchTree.add(50);
        MyBinarySearchTree.add(12);
        MyQueue queue = new MyQueue();
        queue.enqueue(MyBinarySearchTree.root);
        queue.printQueue();
    }

}
