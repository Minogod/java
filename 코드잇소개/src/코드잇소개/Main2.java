package �ڵ��ռҰ�;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean inMainMenu = true;
        while (inMainMenu) {
            System.out.println("(I)ntro (C)ourses (E)xit");

            switch (scanner.next()) {
                case "I":
                case "i":
                    System.out.println("�ȳ��ϼ���! �츮�� �ڵ����Դϴ�.\n" +
                            "�Բ� �����սô�!");
                    break;

                case "C":
                case "c":
                    boolean inCourseMenu = true;
                    while (inCourseMenu) {
                        System.out.println("�ڵ��� ������ �Ұ��մϴ�.\n" +
                                "(P)ython (J)ava (i)os (B)ack");
                        switch (scanner.next()) {
                            case "P":
                            case "p":
                                System.out.println("Python �� ���� ��ǻ�� ���̾��� ���ʸ� ���ϴ�.\n" +
                                        "����: ������\n" +
                                        "��õ ��������: ����");
                                break;
                            case "J":
                            case "j":
                                System.out.println("Java�� �⺻ ������ ��ü������ ���α׷����� ���ϴ�.\n" +
                                        "����: �����\n" +
                                        "��õ ��������: Python");
                                break;
                            case "I":
                            case "i":
                                System.out.println("�ֽ� Swift �� ���� iOS ������ ������ �� �ֽ��ϴ�.\n" +
                                        "����: ����ȣ\n" +
                                        "��õ ��������: Python, Java");
                                break;
                            case "B":
                            case "b":
                                inCourseMenu = false;
                                break;
                            default:
                                System.out.println("�ٽ� �Է��� �ּ���.");
                                break;
                        }
                    }
                case "E":
                case "e":
                    System.out.println("�ȳ��� ������.");
                    inMainMenu = false;
                    break;
                default:
                    System.out.println("�ٽ� �Է��� �ּ���.");
                    break;
            }
        }
    }
}