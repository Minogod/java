package �ڵ��ռҰ�;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		mainloop:  //�ݺ��� �ȿ� switch���� break�ϱ����� �������� (label ����)
		while (true) {
			System.out.println("(I)ntro (C)ourses (E)xit");
			String input = scanner.next();
			switch (input) {
			case "i":
			case "I":
				System.out.println("�ȳ��ϼ���! �츮�� �ڵ����Դϴ�.");
				System.out.println("�Բ� �����սô�!");
				break;
			case "c":
			case "C":
				while (true) {
					System.out.println("�ڵ��� ������ �Ұ��մϴ�.");
					System.out.println("(P)ython (J)ava (i)OS (B)ack");
					String input2 = scanner.next();
					switch (input2) {
					case "p":
					case "P":
						System.out.println("Python �� ���� ��ǻ�� ���̾��� ���ʸ� ���ϴ�.");
						System.out.println("����: ������");
						System.out.println("��õ ��������: ����");
						break;
					case "j":
					case "J":
						System.out.println("Java�� �⺻ ������ ��ü������ ���α׷����� ���ϴ�.");
						System.out.println("����: �����");
						System.out.println("��õ ��������: Python");
						break;
					case "i":
					case "I":
						System.out.println("�ֽ� Swift �� ���� iOS ������ ������ �� �ֽ��ϴ�.");
						System.out.println("����: ����ȣ");
						System.out.println("��õ ��������: Python, Java");
						break;
					case "b":
					case "B":
						continue mainloop;
					default:
						break;
					}
				}
			case "e":
			case "E":
				System.out.println("�ȳ��� ������.");
				break mainloop;
			default:
				break;
			}
		}
	}
}
