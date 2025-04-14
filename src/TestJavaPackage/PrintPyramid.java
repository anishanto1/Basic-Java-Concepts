package TestJavaPackage;

public class PrintPyramid {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"); ///// It should be Print .. not Println
			}
			System.out.println();
		}
	}

}
