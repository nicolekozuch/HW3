/*
 * *** Nicole Kozuch / Section 002 ***
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
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    // Create new temporary set with all elements of setA and setB
    Set<Integer> combinedElements = new HashSet<>(setA);
    combinedElements.addAll(setB);

    // Create new temporary set with elements only found in both sets
    Set<Integer> sharedElements = new HashSet<>(setA);
    sharedElements.retainAll(setB);

    // Get the elements not present in both sets
    combinedElements.removeAll(sharedElements);

    return combinedElements;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    // Create array to store even keys to be deleted
    ArrayList<Integer> removedKeys = new ArrayList<>();
    for (Map.Entry<Integer, String> mapElement : treeMap.entrySet()) {
      int key = (int) mapElement.getKey();
      // Find even keys
        if (key % 2 == 0) {
            removedKeys.add(key);
        }
    }

    // Remove all even keys from treeMap
    for (Integer key : removedKeys) {
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
    // Returns the direct comparison of the two treeMaps
    return tree1.equals(tree2);
  }

} // end treeProblems class
