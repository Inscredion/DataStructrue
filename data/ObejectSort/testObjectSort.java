package ObejectSort;

public class testObjectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxsize = 100;
		ArrayInOb arr;
		arr = new ArrayInOb(maxsize);
		
		arr.insert("Evans", "Patty", 24);
		arr.insert("Smith", "Doc", 59);
		arr.insert("Smith", "Lorraine", 37);
		arr.insert("Smith", "Paul", 37);
		arr.insert("Yee", "Tom", 43);
		arr.insert("Hashimoto", "Sato", 21);
		arr.insert("Velasquez", "Jose", 72);
		arr.insert("Vang", "Minh", 22);
		arr.insert("Creswell", "Lucinda", 18);
		
		System.out.println("Before sorting");
		arr.display();
		
		arr.insertionSort();
		System.out.println("After sorting");
		arr.display();

	}

}
