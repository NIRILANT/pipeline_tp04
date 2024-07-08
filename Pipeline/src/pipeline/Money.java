package pipeline;



public class Money {
	private int fAmount;
	private String  fCurrency;
	
	public Money (int amount, String currency){
		fAmount = amount;
		fCurrency = currency;
	}
	public boolean equals (Money obj){
		if(this == obj){
			return true;
		}
		if (!(obj instanceof Money)) return false;
		return obj instanceof Money;
	}
	
	public int amount() {
		return fAmount; 
		}
	public String currency() { 
		return fCurrency; 
		}
	public Money add(Money m) {
		if (m.currency().equals(currency())){
			return new Money(amount() + m.amount(), currency());
		}
		//return new (Money(amount() + m.amount(), currency()));
		return m;
	}
		
			//return new MoneyBag(this, m);
	//public IMoney add(IMoney aMoney) {
		//return new (Money(amount() + m.amount(), currency()));
			//return IMoney m = new Money(m);
	}
