
public class Main {

	public static void main(String[] args) {
		//∞Ì∞¥ 1
		Person p1 = new Person();
		p1.setName("±ËΩ≈¿«");
		p1.setAage(28);
		p1.setcashAmount(30000);
		//∞Ì∞¥ 2
		Person p2 = new Person();
		p2.setName("±ËπŒ»£");
		p2.setAage(30);
		p2.setcashAmount(100000);
		
		//∞Ì∞¥1 ¿∫«‡∞Ë¡¬
        BankAccount a1 = new BankAccount();
        a1.setBalance(100000);
        p1.setAccount(a1);
        a1.setOwner(p1);
        
        //∞Ì∞¥2 ¿∫«‡∞Ë¡¬
        BankAccount a2 = new BankAccount();
        a2.setBalance(500000);
        p2.setAccount(a2);
        a2.setOwner(p2);
        
        
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
