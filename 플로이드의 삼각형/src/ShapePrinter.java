
public class ShapePrinter {
	public void printFloydsPyramid(int height) {
		
		//프린트될 숫자
		int num = 1;
		
		//최대값의 숫자 자릿수 
		int length = String.valueOf(height * (height + 1) / 2).length();
	
		for (int i=1;i<height+1;i++) {
			for (int j=0;j<i;j++) {
				//현재 숫자의 자릿수
				int numlen = String.valueOf(num).length();
				while (numlen<length){
					System.out.print(" ");
					numlen += 1;
					}
				System.out.print(num+" ");
				num+=1;
			}
			System.out.println();
		}
	}
}