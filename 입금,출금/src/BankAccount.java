//���� class
public class BankAccount {
	private int balance; // ���� �ܰ�
	private Person owner; // ���� ���ο���
	
	//���� ������
	public BankAccount(int pBalance) {
	    if (pBalance < 0) {
	        balance = 0;
	    } else {
	        balance = pBalance;
	    }
	}
	public BankAccount(Person pOwner) {
	    owner = pOwner;
	    balance = 0;
	}
	public BankAccount(int pBalance, Person pOwner) {
	    if (pBalance < 0) {
	        balance = 0;
	    } else {
	        balance = pBalance;
	    }
	    owner = pOwner;
	}
	
	
	
	//balance ����������
	public void setBalance(int newBalance) {
		if (newBalance >0){
			balance = newBalance;
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
	
	//owner ����������
	public void setOwner(Person newOwner) {
		owner = newOwner;
	}
	
	public Person getOwner() {
		return owner;
	}
	
	
    // �Ķ���� : �Ա��� �׼�(����)
    // ���� : ��������(�Ҹ�)
    boolean deposit(int amount) {
        if (owner.getcashAmount() >= amount && amount>0){
        	balance += amount;
        	owner.setcashAmount(owner.getcashAmount()-amount);
        	System.out.println(amount+"�� �Ա��Ͽ����ϴ�. "+"�ܰ�: "+balance+"��, "+"����: "+owner.getcashAmount()+"��");
        	return true;
        }else{
        	System.out.println("�Ա� �����Դϴ�."+"�ܰ�: "+balance+"��, "+"����: "+owner.getcashAmount()+"��");
        	return false;
        }
    }

    // �Ķ���� : ����� �׼�(����)
    // ���� : ��������(�Ҹ�)
    boolean withdraw(int amount) {
    	if (balance >= amount && amount>0){
        	balance -= amount;
        	owner.setcashAmount(owner.getcashAmount()+ amount);
        	System.out.println(amount+"�� ����Ͽ����ϴ�. "+"�ܰ�: "+balance+"��, "+"����: "+owner.getcashAmount()+"��");
        	return true;
    	}else{
        	System.out.println("��� �����Դϴ�."+"�ܰ�: "+balance+"��, "+"����: "+owner.getcashAmount()+"��");
        	return false;
    	}
    }
    //������ü ���
    public boolean transfer(Person to, int amount) {
    	if (balance >= amount &&amount>0) {
    		balance -= amount;
    		to.getAccount().balance += amount;
    		System.out.println("true - from: "+owner.getName()+", to: "+to.getName()+", amount: "+amount+", balance: "+balance);
    		return true;
    	}return false;
    	
    }
    //������ü �������
    public boolean transfer(BankAccount to, int amount) {
    	if (balance >= amount &&amount>0) {
    		balance -= amount;
    		to.balance += amount;
    		System.out.println("true - from: "+owner.getName()+", to: "+to.owner.getName()+", amount: "+amount+", balance: "+balance);
    		return true;
    		} return false;
    }
}