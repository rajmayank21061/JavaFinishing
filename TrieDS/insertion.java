public class insertion {
    static class Node {
        Node[] children;
        boolean endOfWord;

        public Node() {
            children = new Node[26]; // 26 alphabets
            for (int i = 0; i < 26; i++) {
                children[i] = null;  //For empty location
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
    public static boolean wordBreak(String key){
    if(key.length() == 0){
        return true;
    }
    for(int i = 1; i<= key.length(); i++){
        String firstPart = key.substring(0, i);
        String secondPart = key.substring(i);
        if(search(firstPart) && wordBreak(secondPart)){
            return true;
        }
    } 
    return false;
    }
    
    public static boolean searchPrefix(String key){
        Node currNode = root;
        for(int i = 0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';
            if( currNode.children[idx] == null){
                return false;
            }
            currNode = currNode.children[idx];
        }
        return true;
    }

    public static int countNodes( Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for( int i = 0; i < 26; i++){
            if( root.children[i] != null){
                count += countNodes(root.children[i]);
                
            }
        }
        return count + 1;
    }
    // Longest word with all prefix
    public static String ans = "";
    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }
        for( int i = 0; i < 26; i++){
        if( root.children[i] != null && root.children[i].endOfWord == true ){
        temp.append((char)( i + 'a'));
        if(temp.length() > ans.length()){
            ans = temp.toString();
        }

        longestWord(root.children[i], temp);

        temp.deleteCharAt(temp.length()-1);

            }
        }
    }

    public static void main(String[] args) {
        //String words[] = { "the", "a", "there", "their", "any" };
        String words[] = { "a", "app" , "ap","apple","apply", "appl"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
            }
        /*
        String prefix = "an";
        String key = "their";
        boolean ans = search("key");
        System.out.println(wordBreak(key));
        System.out.println(searchPrefix(prefix));
        */
        /*
        String str = "abca";

        for(int i = 0; i < str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
         */
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}