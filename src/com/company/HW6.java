package com.company;

import java.util.ArrayList;

/**
 * Created by Litvinenko.NV on 05.08.2015.
 */
public class HW6 {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        System.out.println(s.get(3));

        ArrayList<String> f = new ArrayList<>();
        f.add("a");
        f.add("b");
        f.add("c");
        f.add("d");
        f.add("d");
        s.add("b");
       // System.out.println(isListsEqual(s, f));

        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
     //   System.out.println(isListsEqual(s1, s2));

        String[] a = {"a", "b", "c", "d", "b"};
        // String a1= new String(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        //  System.out.println(a.length);//dlina stroki

     //   System.out.println(isListsEqual1(a, s));


//    public static boolean isListsEqual1(String [] a, ArrayList<String> s) {
        //       if (a.equals(s)){
//        else return false;
        //   }

        //public static boolean isListsEqual(ArrayList<String> s, ArrayList<String> f) {
        //  if (s.equals(f)){
        //    return true;}
        // else return false;
        //}
    }
}

