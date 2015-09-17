package com.company;

/**
 * Created by faraon on 15.09.2015.
 */

//public private static and not static
public class StatPublicClass {
    public static int publicStaticVar=0;
    public int publicNonStaticVar=1;
    private static int privateStaticVar =2;
    private static int privateNonStaticVar=3;

    public static int getPublicStaticVar()
    {
        return privateStaticVar;
    }

    public int getNonStaticVar()
    {
        return privateNonStaticVar;
    }
}

