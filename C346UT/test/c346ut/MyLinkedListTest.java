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
    
    first.next();
    ILinkedList actual=first.next();
    ILinkedList expected=second;
    assertEquals(actual,expected);
    
    }
    @Test
   public void testLast() {
    ILinkedList<Integer> first = new MyLinkedList(5);
    ILinkedList<Integer> second = new MyLinkedList(6);
    ILinkedList<Integer> third = new MyLinkedList(7);
    first.setNext(second);
    second.setNext(third);    
   
    first.last();
    ILinkedList actual=first.last();
    ILinkedList expected=third;
    assertEquals(actual,expected);
    } 
   
    @Test
    public void testAfter() {
    ILinkedList<Integer> first = new MyLinkedList(5);
    ILinkedList<Integer> second = new MyLinkedList(6);
    ILinkedList<Integer> third = new MyLinkedList(7);
    first.setNext(second);
    second.setNext(third);    
   
    first.after(2);
    ILinkedList actual=first.after(1);
    ILinkedList expected=third;
    assertEquals(actual,expected);
    }
    
    @Test
    public void testDetach() {
    ILinkedList<Integer> first = new MyLinkedList(5);
    ILinkedList<Integer> second = new MyLinkedList(6);
    ILinkedList<Integer> third = new MyLinkedList(7);
    first.setNext(second);
    second.setNext(third);
    
   
    first.detach();
    ILinkedList actual=first.next();
    ILinkedList expected=null;
    assertEquals(actual,expected);
    }
    
    @Test
    public void testGet() {
    ILinkedList<Integer> first = new MyLinkedList(5);
    ILinkedList<Integer> second = new MyLinkedList(6);
    ILinkedList<Integer> third = new MyLinkedList(7);
    first.setNext(second);
    second.setNext(third);
    
   
    first.get();
    Integer actual=first.get();
    Integer expected=5;
    assertEquals(actual,expected);
    }
    
    @Test
    public void testSet() {
    ILinkedList<Integer> first = new MyLinkedList(5);
    ILinkedList<Integer> second = new MyLinkedList(6);
    ILinkedList<Integer> third = new MyLinkedList(7);
    first.setNext(second);
    
   
    first.set(8);
    Integer actual=first.get();
    Integer expected=8;
    assertEquals(actual,expected);
    }
    
    @Test
    public void testAppend() {
    ILinkedList<Integer> first = new MyLinkedList(5);
    ILinkedList<Integer> second = new MyLinkedList(6);
    ILinkedList<Integer> third = new MyLinkedList(7);
    first.setNext(second);
    
   
    first.append(second);
    ILinkedList actual=first.next();
    ILinkedList expected=second;
    assertEquals(actual,expected);
    }
    
    @Test
    public void testInsert() {
    ILinkedList<Integer> first = new MyLinkedList(5);
    ILinkedList<Integer> second = new MyLinkedList(6);
    ILinkedList<Integer> third = new MyLinkedList(7);
    ILinkedList<Integer> fourth = new MyLinkedList(8);
    first.setNext(second);
    second.setNext(third);
    
   
    first.insert(fourth);
    ILinkedList actual=fourth.next();
    ILinkedList expected=first;
    assertEquals(actual,expected);
    }
}
