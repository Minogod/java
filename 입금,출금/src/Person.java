//�� class
//�̸�
//����
//����
//����

public class Person {
	private String name; // �� �̸�
	private int age; // �� ����
	private int cashAmount; // �� �����ܾ�
	private BankAccount account; // �� ���¿���
	
	// �� ������
	public Person(String pName, int pAge) {
	    if (pAge<0){
	    	age = 12;
	    }else {
		    age = pAge;
	    }
		name = pName;
	    cashAmount = 0;
	}
	public Person(String pName, int pAge, int pCashAmount) {
	    if (pAge<0){
	    	age = 12;
	    }else {
		    age = pAge;
	    }
	    if (pCashAmount<0){
	    	cashAmount = 0;
	    }else {
	    	cashAmount = pCashAmount;
	    }
	    name = pName;
	}
	
	
	
	
	
	
	//name ���������� Setter
	public void setName(String newName) {
		if (true){
			name = newName;
		}
	}
	//name ���������� Getter
	public String getName() {
		return name;
	}
	
	//Age ����������
	public void setAge(int newAge) {
		if (newAge>0) {
			age = newAge;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	//cashAmount ����������
	public void setcashAmount(int newcashAmount) {
		if (newcashAmount>0) {
			cashAmount = newcashAmount;
		}
	}
	public int getcashAmount() {
		return cashAmount;
	}
	
	//Account ����������
	public void setAccount(BankAccount newAccount) {
		account = newAccount;
	}
	public BankAccount getAccount() {
		return account;
	}
	
	
    //������ü
    // ù ��° �Ķ����: �޴� ��� (Person)
    // �� ��° �Ķ����: ��ü�� �ݾ� (����)
    // ���� : �������� (�Ҹ�)
    public boolean transfer(Person to, int amount) {
    	if (account.getBalance() >= amount &&amount>0) {
    		account.setBalance(account.getBalance()-amount);
    		to.getAccount().setBalance(to.getAccount().getBalance()+amount);
    		System.out.println("true - from: "+account.getOwner().getName()+", to: "+to.getName()+", amount: "+amount+", balance: "+account.getBalance());
    		return true;
    	}return false;
    	
    }
    //������ü
    public boolean transfer(BankAccount to, int amount) {
    	if (account.getBalance() >= amount &&amount>0) {
    		account.setBalance(account.getBalance()-amount);
    		to.setBalance(to.getBalance()+amount);
    		System.out.println("true - from: "+account.getOwner().getName()+", to: "+to.getOwner().getName()+", amount: "+amount+", balance: "+account.getBalance());
    		return true;
    		} return false;
    }
	
	
}