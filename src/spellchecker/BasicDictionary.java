package spellchecker;

import static org.apache.commons.io.FileUtils.*;

import java.io.*;
import java.util.*;

public class BasicDictionary implements Dictionary {

	BinaryTree DiTree;

	public BasicDictionary() {
		DiTree = new BinaryTree();
		DiTree.root = null;
	}

	@Override
	public void importFile(String filename) throws Exception {

		String DictString = readFileToString((new File(filename)));
		String[] DictList = DictString.split("\\r?\\n");
		int DictLength = DictList.length;

		BasicDictionary NewDictionary = new BasicDictionary();
		//
		// String[] sortList;
		//
		// for (int x = 0; x < DictLength/2; x++) {
		// int tempDictLength = DictLength;
		// sortList[x] = DictList[tempDictLength/2];
		// tempDictLength = tempDictLength/2;
		// }
		//

		List<String> random = new ArrayList<String>(Arrays.asList(DictList));

		Collections.shuffle(random);

		for (String word : random) {
			NewDictionary.add(word);
		}

	}

	@Override
	public void load(String filename) throws Exception {

	}

	@Override
	public void save(String filename) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public String[] find(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(String word) {
		DiTree.addNode(word);
		// wordCount++;
	}

	@Override
	public BinaryTreeNode getRoot() {
		// TODO Auto-generated method stub
		return DiTree.root;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return DiTree.count();
	}

}
