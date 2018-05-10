package insert_sort;

public class test {
	public static <T extends Comparable<? super T>> void insertSort(T[] a){
		          for(int p = 1; p < a.length; p++)
		          {
		              T tmp = a[p];//���浱ǰλ��p��Ԫ�أ�����[0,p-1]�Ѿ�����
		              int j;
		              for(j = p; j > 0 && tmp.compareTo(a[j-1]) < 0; j--)
		              {
		                     a[j] = a[j-1];//����һλ
		                                  }
		             a[j] = tmp;//���뵽���ʵ�λ��
		         }
		     }
		     
		     //for test purpose
		     public static void main(String[] args) {
		         Integer[] arr = {34,8,64,51,32,21};
		         insertSort(arr);
		         for (Integer i : arr) {
		             System.out.print(i + " ");
		         }
		     }
}
