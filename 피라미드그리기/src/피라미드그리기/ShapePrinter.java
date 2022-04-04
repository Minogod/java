package 피라미드그리기;

public class ShapePrinter {
	public void printPyramid(int height) {
		String star = "*";
		String flat = "";
		int x = height;
		for (int i=0;i<height;i++) {
			for (int j=0;j<x-1;j++) {
				flat += " ";
			}
			System.out.println(flat+star);
			star += "**";
			flat = "";
			x -= 1;
		}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public void printPyramid(int height) {
//		String star = "*";
//		String flat = " ";
//		for (int i=0;i<height;i++) {
//			System.out.println(flat.repeat(height-1-i)+star);
//			star += "**";
//		}
//	}
//}
