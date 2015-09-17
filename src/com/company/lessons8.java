package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by faraon on 20.08.2015.
 */
public class lessons8 {
    @Test
    public void test1() {
        Assert.assertEquals(20,10+10);
        Assert.assertEquals(true, 1==1);//
        Assert.assertTrue(1 == 1);// ravnosil'no
    }
    @Test
    public void test3 (){
        Assert.assertEquals(10, summAll(new int[]{1, 4, 2, 3, 0}));
    }
    @Test
    public void test2 (){
        Assert.assertEquals(38, summAll(new int[]{1,41,2}));
    }

    @Test
    public void test4(){
        Assert.assertEquals(15,summAll(new int[]{1,10,4}));
    }

    @Test
    public void test5 () {
       Assert.assertEquals(1, summAll(new int [] {1,0,1,0,3}));
    }

  public static int  summAll ( int [] a){
    //  int s [] ;
      int sum=0;   //int res=0
      for (int i=0; i<a.length; i++) {  // for (int a:e) {res = res + e}
      sum = sum + a[i];  //int e=a[i]; res=res+e
      }
      System.out.println(sum);
      return sum;  // return res
  }
}

