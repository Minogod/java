//���� class
//�ܾ�
//������
public class BankAccount {
	int balance;
	Person owner;
	
    // �Ķ���� : �Ա��� �׼�(����)
    // ���� : ��������(�Ҹ�)
    boolean deposit(int amount) {
        if (owner.cashAmount >= amount && amount>0){
        	owner.account.balance += amount;
        	owner.cashAmount -= amount;
        	System.out.println(amount+"�� �Ա��ϼ̽��ϴ�. "+"�ܰ�: "+owner.account.balance+"��, "+"����: "+owner.cashAmount+"��");
        }else{
        	System.out.println("�Ա� �����Դϴ�."+"�ܰ�: "+owner.account.balance+"��, "+"����: "+owner.cashAmount+"��");
        }
        return owner.cashAmount >= amount && amount>0;
    }

    // �Ķ���� : ����� �׼�(����)
    // ���� : ��������(�Ҹ�)
    boolean withdraw(int amount) {
    	if (owner.account.balance >= amount && amount>0){
        	owner.account.balance -= amount;
        	owner.cashAmount += amount;
        	System.out.println(amount+"�� ����ϼ̽��ϴ�. "+"�ܰ�: "+owner.account.balance+"��, "+"����: "+owner.cashAmount+"��");
        }else{
        	System.out.println("��� �����Դϴ�."+"�ܰ�: "+owner.account.balance+"��, "+"����: "+owner.cashAmount+"��");
        }
        return owner.account.balance >= amount && amount>0;
    }

    // ù ��° �Ķ���� : �޴� ���(Person)
    // �� ��° �Ķ���� : ��ü�� �ݾ�(����)
    // ���� : ��������(�Ҹ�)
    // boolean transfer(Person to, int amount) {
    // (���� �������� ����ϹǷ�, �켱 skip�մϴ�.)
    // }
}