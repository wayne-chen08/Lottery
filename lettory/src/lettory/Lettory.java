package lettory;
//抽出四個號碼，第一個1到8、後三個1到46，後三個不重複
public class Lettory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[46];
		for(int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		
		for(int i = 0; i < a.length - 1; i++) {//打亂a的順序，a.length - 1是因為做46次交換跟做45次沒差
			int rand = (int)(Math.random() * 46);
			int temp = a[rand];
			a[rand] = a[i];
			a[i] = temp;
		}
		
		System.out.println("第1個號碼為：" + ((int)(Math.random() * 8) + 1));
		for(int i = 0; i < 3; i++) {
			System.out.println("第" + (i + 2) + "個號碼為：" + a[i]);
		}
	}

}
