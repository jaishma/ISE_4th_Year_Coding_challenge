﻿1a. Write a JAVA Program to demonstrate Constructor overloading and Method overloading.
class RectArea {
int l,b;
RectArea() {
l=-1;
b=-1;
}
RectArea(int x,int y) {
l=x;
b=y;
}
RectArea(int x) {
l=x;
b=x;
}
int computeArea() {
return(l*b);
}
int computeArea(int a,int b) {
return(a*b);
}
int computeArea(int a) {
return(a*a);
}
}
class Prog1a {
public static void main(String args[]) {
int area;
RectArea r1=new RectArea(10,20);
area=r1.computeArea();
System.out.println("Using Constructor overloading");
System.out.println("Area of r1 is" + area);
RectArea r2=new RectArea(25);
area=r2.computeArea();
System.out.println("Area of r2 is" + area);
RectArea r3=new RectArea();
area=r3.computeArea(15,20);
System.out.println("Using Method overloading");
System.out.println("Area of r3 is" + area);
RectArea r4=new RectArea();
area=r4.computeArea(15,25);
System.out.println("Area of r4 is" + area);
}
}
