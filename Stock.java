public class Stock {

	String ticker;
	String type;
	int lastDividend;
	int fixedDividend;
	int parValue;
	double price;
	boolean callable;
	double votingRights;

	public Stock(String ticker, String type, int lastDividend, int fixedDividend, int parValue, double price, boolean callable, double votingRights){
		this.ticker = ticker;
		this.type = type;
		this.lastDividend = lastDividend;
		this.fixedDividend = fixedDividend;
		this.parValue = parValue;
		this.price = price;
		this.callable = callable;
		this.votingRights = votingRights;
	}

	public String getTicker(){
		return this.ticker;
	}


}