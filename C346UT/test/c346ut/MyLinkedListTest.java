/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c346ut;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author steve
 */
public class MyLinkedListTest {
    
    public MyLinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testNext() {
    ILinkedList<Integer> first = new MyLinkedList(5);
    ILinkedList<Integer> second = new MyLinkedList(6);
    ILinkedList<Integer> third = new MyLinkedList(7);
    first.setNext(second);
    second.setNext(third);
    
    first.next();
    }
    
    public void testLast() {
    ILinkedList<Integer> first = new MyLinkedList(5);
    ILinkedList<Integer> second = new MyLinkedList(6);
    ILinkedList<Integer> third = new MyLinkedList(7);
    first.setNext(second);
    second.setNext(third);
    
    first.last(); 
    }
    
}
