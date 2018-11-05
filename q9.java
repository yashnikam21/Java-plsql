package assignment1;

import java.util.Arrays;

public class q9 {

public static void main(String[] args) {
int a[]= new int[] {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
int finalArray[]=getCalculation(a);
display(finalArray);
}

private static int[] getCalculation(int[] a) {
a[15]=getSum(a);
a[16]=getAvg(a);
a[17]=getSmallestVal(a);
return a;
}

private static int getSmallestVal(int[] a) {
int n =a[0];
for(int i=1; i<a.length-3;i++) {
if(a[i]<n) {
n=a[i];
}
}
return n;
}

private static int getAvg(int[] a) {
return getSum(a)/(a.length-3);
}

private static int getSum(int[] a) {
int sum=0;
for(int i=0; i<a.length-3; i++) {
sum= sum + a[i];
}
return sum;
}
private static void display(int[] finalArray) {

System.out.println("Resultant Array: "+Arrays.toString(finalArray));
}



}