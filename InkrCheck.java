class InkrCheck {
public static void main (String []args) {
int x = 6;
System.out.println (x);
System.out.println (++x);
System.out.println ("x = "+(x++));
System.out.println (x);

byte b = 1;
System.out.println (b++); //1
System.out.println (++b); //3

char c = 'c';
System.out.println (c--); 
System.out.println (--c); 

float f = 3.16f;
System.out.println (--f); //2.16
System.out.println (++f); //3.16

double d = 4.6;
System.out.println (d++); // 4.6
System.out.println (--d); // 4.6


int a, b1 = 5, c1 = 7, d1 = 9;
a = b1++ +c1+++ ++d1;

System.out.println (a); 

int ga = 6;
ga += ++ga + ga++; // ga = ga+(++ga + ga++) ; 20
System.out.println(ga);

int q = 6;
q += q++;
System.out.println(q);


int q1 = 6;
q1 = q1 + q1++;
System.out.println(q1);

int q2 = 6;
q2 = q2++ + (q2+q2++);

System.out.println(q2);
}
}