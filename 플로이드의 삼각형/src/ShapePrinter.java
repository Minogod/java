
public class ShapePrinter {
	public void printFloydsPyramid(int height) {
		
		//����Ʈ�� ����
		int num = 1;
		
		//�ִ밪�� ���� �ڸ��� 
		int length = String.valueOf(height * (height + 1) / 2).length();
	
		for (int i=1;i<height+1;i++) {
			for (int j=0;j<i;j++) {
				//���� ������ �ڸ���
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