package pla9_10;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//System.out.println("1円以上のアイテム一覧表を表示します。");
		//ArrayList<Item> items = ItemsDAO.findByMinimumPrice(1);
		//for (Item item : items) {
		//System.out.printf("%10s%4d%4d", item.getName(),item.getPrice(), item.getWeight());
		//}

		//INSERT文
		//System.out.println("アイテムを追加します。");
		//ItemsDAO.InsertItem("やくそう2", 100, 10);//　(NAME,PRICE,WEIGHT)
		
		//ArrayList<Item> items = ItemsDAO.findByMinimumPrice(1);
		//for (Item item : items) {
		//System.out.printf("%10s%4d%4d", item.getName(),item.getPrice(), item.getWeight());
		//}
		
		
		//DELETE文　（NAMEで指定）
		ItemsDAO.DeleteItem("テスト");
		
		System.out.println("\n");
		System.out.println("1円以上のアイテム一覧表を表示します。");
		ArrayList<Item> items = ItemsDAO.findByMinimumPrice(1);
				for (Item item : items) {
				System.out.printf( "%-20s%-10d%-10d",item.getName(),item.getPrice(), item.getWeight());
				//▲出力フォーマット左揃えで20文字分、10文字分、10文字分の幅で出力
				System.out.println("\n");
				}
	}
		

}
