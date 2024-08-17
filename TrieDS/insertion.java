
public class insertion {
    static class Node {
        Node[] children;
        boolean endOfWord;

        public Node() {
            children = new Node[26]; // 26 alphabets
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (current.children[idx] == null) {
                // add new node
                current.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                current.children[idx].endOfWord = true;
            }
            current = current.children[idx];
        }
    }

    public static boolean search(String key) {
        Node current = root;
        for (int i = 0; i < key.length(); i++) {
        int idx = key.charAt(i) - 'a';
    if (current.children[idx] == null) {
        return false;
            }
    if (current.children[idx].endOfWord == false && i== key.length()-1) {
        return false;
            }
            current = current.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        boolean ans = search("their");
        System.out.println(ans);
    }
}