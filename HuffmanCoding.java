import java.util.*;

class HuffmanNode{
    int frequency;
    char character;
    HuffmanNode left;
    HuffmanNode right;
}

// Comparator for Priority Queue
class MyComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.frequency - y.frequency;
    }
}

public class HuffmanCoding {

    // Function to print Huffman codes
    public static void printCode(HuffmanNode root, String s) {

        if (root.left == null && root.right == null) {
            System.out.println(root.character + " : " + s);
            return;
        }

        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static void main(String[] args) {

        int n = 6;
        char[] charArray = { 'A', 'B', 'C', 'D', 'E', 'F' };
        int[] charFreq = { 5, 9, 12, 13, 16, 45 };

        PriorityQueue<HuffmanNode> q = new PriorityQueue<>(n, new MyComparator());

        for (int i = 0; i < n; i++) {

            HuffmanNode node = new HuffmanNode();

            node.character = charArray[i];
            node.frequency = charFreq[i];

            node.left = null;
            node.right = null;

            q.add(node);
        }

        HuffmanNode root = null;

        while (q.size() > 1) {

            HuffmanNode x = q.poll();
            HuffmanNode y = q.poll();

            HuffmanNode f = new HuffmanNode();

            f.frequency = x.frequency + y.frequency;
            f.character = '-';

            f.left = x;
            f.right = y;

            root = f;

            q.add(f);
        }

        System.out.println("Huffman Codes:");

        printCode(root, "");
    }
}