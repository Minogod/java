
public class MarketGood {
	private	String name; 		//��ǰ���̸�
	private int retailPrice;	//��ǰ��ð���
	private int discountRate;	//��ǰ��������,����%)
	
	//������
	public MarketGood(String name, int retailPrice, int discountRate) {
		if (discountRate<0 || discountRate>100) {
			this.discountRate = 0;
		} else {
			this.discountRate = discountRate;
		}
		this.name = name;
		this.retailPrice = retailPrice;
	}
	//������
	public MarketGood(String name,int retailPrice) {
		this.name = name;
		this.retailPrice = retailPrice;
		this.discountRate = 0;
	}
	
	//���������� Setter
	public void setDiscountRate(int NewDiscountRate) {discountRate = NewDiscountRate;}
	
	//���������� Getter
	public String getName() {return name;}
	public int getDiscountRate() {return discountRate;}
	public int getRetailPrice() {return retailPrice;}
	
	//���ΰ� ����������
	public int getDiscountedPrice() {
		double x = retailPrice *(100-discountRate)*0.01;
		return (int) x;
		}
}