package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
                System.out.println("QA Factory");
                int x=10;
                int a;
                int y;
                String s;
                s="hello class";
                System.out.println(s);
                int g=288;
                System.out.println(s+g);
                System.out.println(s+ " "+g);
                System.out.println("g=" + g);
                a=15;
                a=15+27;
                System.out.print("a=");
                System.out.println(a);
                y=a+100;
                System.out.print("y=");
                System.out.println(y);
                y++;
                // System.out.println(a);
                System.out.print("y1=");
                System.out.println(y);
                System.out.print("x=");
                System.out.println(x);
                double h=10.5;
                h=h/9;
                System.out.println(h);
                boolean j;
                j=true;
                j=true && true;
                System.out.println(j);
                j=true || false;
                System.out.println(j);
                System.out.println(h==10.5);
                System.out.println(10>5); //������
                System.out.println(10!=6); // �� �����
                int[] m = {1,2,3,4,5,10};
                System.out.println(m [1]);
                System.out.println(m[0]+ " "+ m[1]+" "+m[2]);
                int p;
                p=m[0];
                System.out.println("p=" + p);
                String [] m1={"hello world", "QAFactory"};
                System.out.println(m1[0] + " " + m1[1]);

                int k=10;
                if (k<10) {
                    System.out.print("k<10");
                }
                else {
                    System.out.println("k>=10");
                }
                int xy=0;
                while (xy<10) {
                    xy+=5;
                    xy= xy-4;
                    System.out.println("xy=" +xy);
                }
                System.out.println("finish");

                int qq=0;
                while (qq<=1000) {
                    System.out.println("qq=" +qq);
                    qq+=2;
                    // System.out.println("qq=" +qq);

                }
                int w1=0, w2=1, w3, w4=0;
                while (w4<20)
                {
                    System.out.println(w1 + " ");
                    w3 = w1;
                    w1 = w2;
                    w2 = w1 + w3;
                    w4 = w4 +1;
                }



            }


}
