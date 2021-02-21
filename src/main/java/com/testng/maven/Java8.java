package com.testng.maven;

import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
public class Java8 {
   public static void main(String[] args) {
      Map<Integer, String> hmap = new HashMap<Integer, String>();
      hmap.put(11, "Apple");
      hmap.put(22, "Orange");
      hmap.put(33, "Kiwi");
      hmap.put(44, "Banana");

      Map<Object, Object> result = hmap.entrySet()
      .stream()
      .filter(map -> map.getValue().equalsIgnoreCase("Orange"))
      .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

      System.out.println("Result: " + result);
   }
}
