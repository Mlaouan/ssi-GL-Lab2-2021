public class Huffman {
  public static void printCode(HuffmanNode root, String s)
    {
     // base case; if the left and right are null
        // then its a leaf node and we print
        // the code s generated by traversing the tree.
        if (root.left
                == null
                && root.right
                == null
                && Character.isLetter(root.c)) {

            // c is the character in the node
            System.out.println(root.c + ":" + s);

            return;
        }

        // if we go to left then add "0" to the code.
        // if we go to the right add"1" to the code.

        // recursive calls for left and
        // right sub-tree of the generated tree.
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }
public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);

		// number of characters.
		int n = 6;
		char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
		int[] charfreq = { 5, 9, 12, 13, 16, 45 };

		// creating a priority queue q.
		// makes a min-priority queue(min-heap).
		PriorityQueue<HuffmanNode> q
			= new PriorityQueue<HuffmanNode>(n, new MyComparator());
	
	for (int i = 0; i < n; i++) {

			// creating a Huffman node object
			// and add it to the priority queue.
			HuffmanNode hn = new HuffmanNode();

			hn.c = charArray[i];
			hn.data = charfreq[i];

			hn.left = null;
			hn.right = null;

			// add functions adds
			// the huffman node to the queue.
			q.add(hn);
		}
    }
}
