import java.util.Scanner;
public class Complex{
	private float real;
	private float imag;
	Complex(float r, float i){
		real = r;
		imag = i;
	}
	Complex(){
		real=0;imag=0;
	}
	public float sqrMagnitude(){
		return real*real+imag*imag;
	}
	public Complex Add(Complex c){
		return new Complex(real+c.real,imag+c.imag);
	}
	public Complex Add(Complex c1,Complex c2){
		return new Complex(real+c1.real+c2.real,imag+ c1.imag + c2.imag);
	}
	public Complex Subtract(Complex c){
		return new Complex(real-c.real,imag-c.imag);
	}
	public boolean equals(Complex c){
		return (real==c.real) && (imag==c.imag);
	}
	public String toString(){
		return Float.toString(real)+'+'+Float.toString(imag)+'i';
	}
	//public 
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first complex number components");
		float a = in.nextFloat();
		float b = in.nextFloat();
		Complex c1 = new Complex(a,b);
		System.out.println("Enter second complex number components");
		a = in.nextFloat();
		b = in.nextFloat();
		Complex c2 = new Complex(a,b);

		System.out.println("c1="+c1.toString());
		System.out.println("|c1|="+Math.sqrt(c1.sqrMagnitude()));
		System.out.println("c2="+c2.toString());
		System.out.println("|c2|="+Math.sqrt(c2.sqrMagnitude()));

		System.out.println("Sum:"+c1.Add(c2));
		System.out.println("Difference:"+c1.Subtract(c2));

		System.out.println("c1 and c2 are "+(c1.equals(c2)?"equal":"not equal"));


		//Complex c3 = new Complex(7.0f,8.6f);
		// System.out.println("c1="+c1.toString());
		// System.out.println("c4="+c4.Add(c2).toString());
		// System.out.println("|c1|^2="+c1.SqrMagnitude());
		

		in.close();
		//Complex.SqrMagnitude(
	}
}
