import static java.lang.System.out;
import java.util.Scanner;
public class HorseMatch{
	int count = 0;
	int table[];
	String t;int n;
	String p;int m;
	HorseMatch(String t,String p,int size){
		int i,j;
		this.t = t;n = t.length();
		this.p = p;m = p.length();
		table = new int[size];
		for(i = 0;i<size;i++){
			table[i] = m;
		}
		for(i=0;i<m-1;i++) table[(int)p.charAt(i)] = m-1-i;

	}

	int match(){
		int k;
		for(int i=m-1;i<n;){
			for(k=0;k<m&&p.charAt(m-1-k)==t.charAt(i-k);k++);
			if(k==m) return i-m+1;
			else i+=table[ (int)t.charAt(i)];
		}
		return -1;
	}


	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		out.print("Enter text\n:");
		String text = in.nextLine();
		out.print("Enter pattern\n:");
		String pattern = in.nextLine();
		int pos;
		if((pos = new HorseMatch(text,pattern,256).match())==-1){
			out.println("Pattern absent");
		}else{
			out.format("Pattern present %d\n",pos);
		}
		

	}
}


