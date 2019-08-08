package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Goods[] goods = new Goods[COUNT_GOODS];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<COUNT_GOODS; i++) {
			String info = scanner.nextLine();
			
			String[] data = info.split(" ");
			
			String name = data[0];
			int price = Integer.parseInt(data[1]);
			int countStock = Integer.parseInt(data[2]);
			goods[i] = new Goods();
			goods[i].setName(name);
			goods[i].setPrice(price);
			goods[i].setCountStock(countStock);
		}
		for(int i=0; i<goods.length; i++) {
			System.out.println(goods[i].getName() + "(가격:" + goods[i].getPrice() + "원)이 " + goods[i].getCountStock() + "개 입고 되었습니다.");
		}
		
		scanner.close();
	}
}
