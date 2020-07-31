import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	//Integer 是int的包裹类型
	private HashMap<Integer,String>coinnames = new HashMap<Integer,String>();
	
	//构造器
	public Coin() {
		coinnames.put(1, "penny");
		coinnames.put(10, "dime");
		coinnames.put(25, "quarter");
	//对hash表来说，键是唯一的	
		coinnames.put(50, "half-dolar");
		coinnames.put(50, "5毛");
		System.out.println(coinnames);
	//遍历hash表
		for (Integer k : coinnames.keySet()) {
			String s = coinnames.get(k);
			System.out.println(s);
		}
		System.out.println(coinnames.keySet().size());
	}
	
	public String getName(int amount) {
		if(coinnames.containsKey(amount)) {
			return coinnames.get(amount);
		}
		else {
			return "NOT FOUND";
		}		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.println(name);
	}
	
}
