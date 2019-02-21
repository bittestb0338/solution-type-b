package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		int add = this.amount + money.amount;
		return new Money(add);
	}

	public Money minus(Money money) {
		int minus = this.amount - money.amount;
		return new Money(minus);
	}

	public Money multiply(Money money) {
		int multiplay = this.amount * money.amount;
		return new Money(multiplay);
	}

	public Money devide(Money money) {
		int devide = this.amount / money.amount;
		return new Money(devide);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Money) {
			Money money = (Money)obj;
			if(this.amount==money.amount) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.hashCode() + this.amount;
	}
}