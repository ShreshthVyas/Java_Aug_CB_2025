package Lecture33;

public class BTClient {
	// 1 true 2 true 3 false false false True 4 True 6 False False True 7 False False
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt =  new BinaryTree();
//		bt.Display();
//		System.out.println(bt.Max());
//		System.out.println(bt.Find(9));
//		System.out.println(bt.Height());
		bt.PreOrder();
		bt.InOrder();
		bt.PostOrder();
		bt.LevelOrdertraversal();
		
	}

}
