package 삼각형그리기;

public class ShapePrinter {
	public void printTriangle(int height) {
		String x = "* ";
			for (int i=0;i<height;i++) {
				System.out.println(x);
				x += "* ";
		}
	}
}
