package vis;

public class Vendermachine {

	static int teaqun=500,coffequn=500,sugarqun=600,milk=8000,water=15000;
	double teaprice=1,coffeprice=2,sugarprice=1.5,milkprice=0.15,waterprice=0.02;
	
	public double Strongcoffe(int x)
	{
		sugarqun=sugarqun-(x*2);
		milk=milk-(x*50);
		coffequn=coffequn-(x*4);
		water=water-(x*100);
		double totalprice=17.5*x;
		return totalprice;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
