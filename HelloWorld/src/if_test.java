
public class if_test {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		
		if (a==b) {
			System.out.println("a�� b�� �����ϴ�. a = b = "+a);
		} else if (a!=b) {
			System.out.println("a�� b�� ���� �ʽ��ϴ�.");
			if (a>b) {
				System.out.println("a�� b���� "+(a-b)+"��ŭ �� Ů�ϴ�.");
			}else if (a<b)
				System.out.println("b�� a���� "+(b-a)+"��ŭ �� Ů�ϴ�.");
		}

	}

}
