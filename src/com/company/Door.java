package com.company;

/**
 * Created by faraon on 15.09.2015.
 */
public class Door {
    public String color="wood";
    public static String made="China";

    public  String p1="Closed";
    //private  String p2="Open";

    public  String state()
    {
      return p1;
    }

    public void open ()
    {
     p1="Open";
    }


}
