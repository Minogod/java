
public class Main {

	public static void main(String[] args) {
		//�� 1
		Person p1 = new Person("�����",28,30000);

		//�� 2
		Person p2 = new Person("���ȣ",30,100000);

		
		//��1 �������
        BankAccount a1 = new BankAccount(100000,p1);
        p1.setAccount(a1);
        
        //��2 �������
        BankAccount a2 = new BankAccount(500000,p2);
        p2.setAccount(a2);
        
        
//        System.out.println(a2.deposit(30000));
//        System.out.println(a2.withdraw(170000));
//        System.out.println(a2.deposit(620000));
//        System.out.println(a2.withdraw(890000));
        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
	}

}
