package com.company;

/**
 * Created by faraon on 15.09.2015.
 */
public class WhyStaticPrivate {
    public static void main(String[] args)
    {
        //System.out.println("WhyStaticPrivate.publicStaticVar=" + WhyStaticPrivate.publicStaticVar);
        StatPublicClass w=new StatPublicClass();
        System.out.println("w.publicNonStaticVar=" + w.publicNonStaticVar);
        w.publicNonStaticVar = 10;
    }
}
