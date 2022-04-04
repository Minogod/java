
public class MarketGood {
	private	String name; 		//상품의이름
	private int retailPrice;	//상품출시가격
	private int discountRate;	//상품의할인율,단위%)
	
	//생성자
	public MarketGood(String name, int retailPrice, int discountRate) {
		if (discountRate<0 || discountRate>100) {
			this.discountRate = 0;
		} else {
			this.discountRate = discountRate;
		}
		this.name = name;
		this.retailPrice = retailPrice;
	}
	//생성자
	public MarketGood(String name,int retailPrice) {
		this.name = name;
		this.retailPrice = retailPrice;
		this.discountRate = 0;
	}
	
	//접근제어자 Setter
	public void setDiscountRate(int NewDiscountRate) {discountRate = NewDiscountRate;}
	
	//접근제어자 Getter
	public String getName() {return name;}
	public int getDiscountRate() {return discountRate;}
	public int getRetailPrice() {return retailPrice;}
	
	//할인가 접근제어자
	public int getDiscountedPrice() {
		double x = retailPrice *(100-discountRate)*0.01;
		return (int) x;
		}
}