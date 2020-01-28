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
	public float SqrMagnitude(){
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
	public boolean isEqual(Complex c){
		return (real==c.real) && (imag==c.imag);
	}
	public String toString(){
		return Float.toString(real)+'+'+Float.toString(imag)+'i';
	}
	//public 
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		float a = in.nextFloat();
		float b = in.nextFloat();
		Complex c1 = new Complex(a,b);
		Complex c2 = new Complex();
		Complex c3 = new Complex(7.0f,8.6f);
		Complex c4 = c1.Add(c1,c3).Subtract(c3).Subtract(c1);
		System.out.println("c1="+c1.toString());
		System.out.println("c4="+c4.Add(c2).toString());
		System.out.println("|c1|^2="+c1.SqrMagnitude());
		

		in.close();
		//Complex.SqrMagnitude(
	}
}
