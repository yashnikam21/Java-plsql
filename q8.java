package assignment1;

import java.util.Scanner;

public class q8 {

public static void main(String[] args) {
if(args.length==2) {
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
if(a>=1 && a<=40 && b>=1 && b<=40) {
int n1 = a;
int n2 = b;
passIt(n1,n2);
}
else {
System.out.println("Entered value is not in 1-40 range. Please re-enter correct values");
}
}
else {
System.out.println("Enter only 2 integer numbers between 1 to 40 range");
}

}

private static void passIt(int n1, int n2) {
int a[] = new int[5];
int temp[] = new int[5];
Scanner sc = new Scanner(System.in);
System.out.println("Enter 5 integer values in 1-40 range in the array");
for(int i=0; i<5; i++) {
temp[i]=sc.nextInt();
if(temp[i]>=1 && temp[i]<=40) {
a[i] = temp[i]; 
}
else {
System.out.println("You must enter exact 5 integers between 1-40 range.");
System.exit(0);
}
}
sc.close();
int flag1=0,flag2=0;
for(int i=0; i<2; i++) {
for(int j=0; j<5; j++) {
if(n1==a[j]) {
flag1=1;
break;
}
else {
continue;
}
}
n1 = n2;
flag1 = flag2;
}
if(flag1==1) {
System.out.println("Bingo!!!"); 
}
else {
System.out.println("Not found!!!");
}
}

}

