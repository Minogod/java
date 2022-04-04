//계좌 class
public class BankAccount {
	private int balance; // 계좌 잔고
	private Person owner; // 계좌 주인연결
	
	//balance 접근제어자
	public void setBalance(int newBalance) {
		if (newBalance >0){
			balance = newBalance;
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
	
	//owner 접근제어자
	public void setOwner(Person newOwner) {
		owner = newOwner;
	}
	
	public Person getOwner() {
		return owner;
	}
	
	
    // 파라미터 : 입금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean deposit(int amount) {
        if (owner.getcashAmount() >= amount && amount>0){
        	balance += amount;
        	owner.setcashAmount(owner.getcashAmount()-amount);
        	System.out.println(amount+"원 입금하였습니다. "+"잔고: "+balance+"원, "+"현금: "+owner.getcashAmount()+"원");
        	return true;
        }else{
        	System.out.println("입금 실패입니다."+"잔고: "+balance+"원, "+"현금: "+owner.getcashAmount()+"원");
        	return false;
        }
    }

    // 파라미터 : 출금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean withdraw(int amount) {
    	if (balance >= amount && amount>0){
        	balance -= amount;
        	owner.setcashAmount(owner.getcashAmount()+ amount);
        	System.out.println(amount+"원 출금하였습니다. "+"잔고: "+balance+"원, "+"현금: "+owner.getcashAmount()+"원");
        	return true;
    	}else{
        	System.out.println("출금 실패입니다."+"잔고: "+balance+"원, "+"현금: "+owner.getcashAmount()+"원");
        	return false;
    	}
    }
    //계좌이체 사람
    public boolean transfer(Person to, int amount) {
    	if (balance >= amount &&amount>0) {
    		balance -= amount;
    		to.getAccount().balance += amount;
    		System.out.println("true - from: "+owner.getName()+", to: "+to.getName()+", amount: "+amount+", balance: "+balance);
    		return true;
    	}return false;
    	
    }
    //계좌이체 은행계좌
    public boolean transfer(BankAccount to, int amount) {
    	if (balance >= amount &&amount>0) {
    		balance -= amount;
    		to.balance += amount;
    		System.out.println("true - from: "+owner.getName()+", to: "+to.owner.getName()+", amount: "+amount+", balance: "+balance);
    		return true;
    		} return false;
    }
}