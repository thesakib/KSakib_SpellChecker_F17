package spellchecker;

public class BinaryTree {

	BinaryTreeNode root, cursor;
	int wordCount = 0;

	public void addNode(String word) {
		BinaryTreeNode newNode = new BinaryTreeNode(word);

		if (root == null) {
			root = newNode;
		} else {
			cursor = root;
			BinaryTreeNode temp;
			while (true) {
				temp = cursor;
				if (cursor.toString().compareTo(word) > 0) {
					temp = cursor.left;
					if (temp == null) {
						cursor.left = newNode;
						wordCount++;
						break;
					} else
						cursor = temp;
				} else {
					temp = cursor.right;
					if (temp == null) {
						cursor.right = newNode;
						wordCount++;
						break;
					} else
						cursor = temp;
				}

			}
		}

	}

	public int count() {
		return wordCount;
	}
}
