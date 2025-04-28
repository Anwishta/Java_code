package HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable {
    static class HashMap<K, V>{
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        public int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        public int searchLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) { // Use equals() for comparison
                    return i;
                }
            }
            return -1;
        }
        
        public void rehash() {
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2; // Update capacity
        
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        
            n = 0; // Reset size
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value); // Reinsert into new buckets
                }
            }
        }
        
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchLL(key,bi);
            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            else{
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double)n/N;

            if (lambda > 2.0) {
                rehash();
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if (di == -1) {
                return null;
            }else{
                Node node = buckets[bi].get(di);
                return node.value;
            }
        } 
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
        
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i]; // Use the existing linked list
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key); // Add the key from the node
                }
            }
            return keys;
        }
        
        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if (di == -1) {
                return null;
            }
            else{
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;

            }
        }
        public boolean containsKey(int sum) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'containsKey'");
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 150);
        map.put("China", 300);
        map.put("Canada", 60);
        map.put("Australia", 100);
        map.put("US", 130);
        ArrayList<String> keys = map.keySet();
        for(int i=0; i<keys.size(); i++){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
        System.out.println(map.remove("US"));

    }
}
