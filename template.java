/*******************************************************
Name Problem:problem
Problem Category:category
Problem Tester: Julio Cesar Mamani Villena.
Email: mamanivillenajc@gmail.com
*******************************************************/
import java.io.*;
import java.util.*;
import java.math.*;
public class template {

	public static class Task {
	    public void solve(Scanner sc, PrintWriter pw) throws IOException {
	        code
	    }
	}

	public static void main(String[] args) throws IOException {
	    Scanner sc = new Scanner(System.in);
	    PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
	    Task t = new Task();
	    t.solve(sc, pw);
	    pw.close();
	}

	static class Scanner {
    StringTokenizer st;
    BufferedReader br;
	public Scanner(InputStream s) {	br = new BufferedReader(new InputStreamReader(s)); }
	public String next() throws IOException {
        while (st == null || ! st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }
	public int nextInt() throws IOException { return Integer.parseInt(next()); }
	public long nextLong() throws IOException { return Long.parseLong(next()); }
	public String nextLine() throws IOException { return br.readLine(); }
	public double nextDouble() throws IOException { return Double.parseDouble(next()); }
	public boolean ready() throws IOException { return br.ready(); }
	}
}