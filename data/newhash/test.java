package newhash;

public class test {
	public static void main(String[] args) {
		hashtable ha = new hashtable();
		
		ha.insert(new hash("a", "����"));
		ha.insert(new hash("ct", "����"));
		ha.insert(new hash("cba", "����"));
		ha.insert(new hash("acb", "����"));
		ha.insert(new hash("zhangsanzhangsan", "����"));
		
		System.out.println(ha.find("a").getName());
		System.out.println(ha.find("ct").getName());
		System.out.println(ha.find("cba").getName());
		System.out.println(ha.find("acb").getName());
		System.out.println(ha.find("zhangsanzhangsan").getName());
		
		hashtable.delete("acb");
		System.out.println(ha.find("acb").getName());
	}
}
