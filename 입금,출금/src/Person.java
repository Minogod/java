//고객 class
//이름
//나이
//현금
//계좌

public class Person {
	private String name; // 고객 이름
	private int age; // 고객 나이
	private int cashAmount; // 고객 현금잔액
	private BankAccount account; // 고객 계좌연결
	
	//name 접근제어자
	public void setName(String newName) {
		if (true){
			name = newName;
		}
	}
	
	public String getName() {
		return name;
	}
	
	//Age 접근제어자
	public void setAage(int newAge) {
		if (newAge>0) {
			age = newAge;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	//cashAmount 접근제어자
	public void setcashAmount(int newcashAmount) {
		if (newcashAmount>0) {
			cashAmount = newcashAmount;
		}
	}
	public int getcashAmount() {
		return cashAmount;
	}
	
	//Account 접근제어자
	public void setAccount(BankAccount newAccount) {
		account = newAccount;
	}
	public BankAccount getAccount() {
		return account;
	}
	
	
    //계좌이체
    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
    	if (account.getBalance() >= amount &&amount>0) {
    		account.setBalance(account.getBalance()-amount);
    		to.getAccount().setBalance(to.getAccount().getBalance()+amount);
    		System.out.println("true - from: "+account.getOwner().getName()+", to: "+to.getName()+", amount: "+amount+", balance: "+account.getBalance());
    		return true;
    	}return false;
    	
    }
    //계좌이체
    public boolean transfer(BankAccount to, int amount) {
    	if (account.getBalance() >= amount &&amount>0) {
    		account.setBalance(account.getBalance()-amount);
    		to.setBalance(to.getBalance()+amount);
    		System.out.println("true - from: "+account.getOwner().getName()+", to: "+to.getOwner().getName()+", amount: "+amount+", balance: "+account.getBalance());
    		return true;
    		} return false;
    }
	
	
}