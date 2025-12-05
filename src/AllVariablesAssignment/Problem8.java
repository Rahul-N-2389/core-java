package AllVariablesAssignment;

public class Problem8 {
	static int num=5;
	static int sqare() {
		int sq=num*num;
		return sq;
	}
	static int cube() {
		int cb=sqare()*num;
		System.out.println("cube value :"+cb);
		return cb;
	}
	public static void main(String[] args) {
		cube();
	}

}
