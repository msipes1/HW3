/*
 * *** Mimi Sipes / COMP 272-002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */

  // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
  //
  // This can be done numerous ways, but once such will only that
  // *several* lines of code. Hint: create two temporary TreeSets and utilize the
  // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    Set<Integer> tempA = new TreeSet<>(setA);
    Set<Integer> tempB = new TreeSet<>(setB);

    tempA.addAll(tempB);
    tempB.retainAll(setA);
    tempA.removeAll(tempB);

    return tempA;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    Set<Integer> evenKeys = new TreeSet<>();

    for (Integer key : treeMap.keySet()) {
      if (key % 2 == 0) {
        evenKeys.add(key);
      }
    }
    for (Integer key : evenKeys) {
      treeMap.remove(key);
    }
  }

  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    for (Integer key : tree1.keySet()) {
      String value1 = tree1.get(key);
      String value2 = tree2.get(key);

      if (!tree2.containsKey(key) || !value1.equals(value2)) {
        return false;
      }
    }
    return true;

  }
} // end treeProblems class
