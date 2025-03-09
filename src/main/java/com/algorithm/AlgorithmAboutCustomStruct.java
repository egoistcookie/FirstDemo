package com.algorithm;

import java.util.*;

public class AlgorithmAboutCustomStruct {



    public static void main(String[] args) {

        // 力扣算法146.请你设计并实现一个满足  LRU (最近最少使用) 缓存 约束的数据结构。
        // LRUCache lRUCache = new LRUCache(2);
        // lRUCache.put(1, 1); // 缓存是 {1=1}
        // lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        // System.out.println(lRUCache.get(1));    // 返回 1
        // lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        // System.out.println(lRUCache.get(2));    // 返回 -1 (未找到)
        // lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        // System.out.println(lRUCache.get(1));    // 返回 -1 (未找到)
        // System.out.println(lRUCache.get(3));    // 返回 3
        // System.out.println(lRUCache.get(4));    // 返回 4
        // ds算法：双向链表
        // LRUCacheByDs lRUCache = new LRUCacheByDs(2);
        // lRUCache.put(1, 1); // 缓存是 {1=1}
        // lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        // System.out.println(lRUCache.get(1));    // 返回 1
        // lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        // System.out.println(lRUCache.get(2));    // 返回 -1 (未找到)
        // lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        // System.out.println(lRUCache.get(1));    // 返回 -1 (未找到)
        // System.out.println(lRUCache.get(3));    // 返回 3
        // System.out.println(lRUCache.get(4));    // 返回 4

        // 力扣算法208.Trie（发音类似 "try"）或者说 前缀树 是一种树形数据结构，用于高效地存储和检索字符串数据集中的键。
        //  这一数据结构有相当多的应用情景，例如自动补全和拼写检查。
        // Trie trie = new Trie();
        // // trie.insert("apple");
        // System.out.println(trie.search("apple"));   // 返回 True
        // System.out.println(trie.search("app"));     // 返回 False
        // System.out.println(trie.startsWith("app")); // 返回 True
        // trie.insert("app");
        // System.out.println(trie.search("app"));     // 返回 True

        // 力扣算法705.不使用任何内建的哈希表库设计一个哈希集合（HashSet）。
        // 实现 MyHashSet 类：
        // void add(key) 向哈希集合中插入值 key 。
        // bool contains(key) 返回哈希集合中是否存在这个值 key 。
        // void remove(key) 将给定值 key 从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。
        // MyHashSetARC myHashSet = new MyHashSetARC();
        // myHashSet.add(1);      // set = [1]
        // myHashSet.add(2);      // set = [1, 2]
        // // myHashSet.printString();
        // System.out.println(myHashSet.contains(1));; // 返回 True
        // System.out.println(myHashSet.contains(3));; // 返回 False ，（未找到）
        // myHashSet.add(2);      // set = [1, 2]
        // // myHashSet.printString();
        // System.out.println(myHashSet.contains(2));; // 返回 True
        // myHashSet.remove(2);   // set = [1]
        // myHashSet.add(66);
        // myHashSet.remove(6);
        // // myHashSet.printString();
        // System.out.println(myHashSet.contains(66));
        // System.out.println(myHashSet.contains(2));; // 返回 False ，（已移除）

        // 力扣算法706.不使用任何内建的哈希表库设计一个哈希映射（HashMap）。
        // 实际也是链表数组，但不是简单的int链表，而改成自定义Entry链表，Entry有key有value，还有next
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(10, 1); // myHashMap 现在为 [[1,1]]
        myHashMap.put(20, 2); // myHashMap 现在为 [[1,1], [2,2]]
        System.out.println(myHashMap.get(1));    // 返回 1 ，myHashMap 现在为 [[1,1], [2,2]]
        System.out.println(myHashMap.get(3));   // 返回 -1（未找到），myHashMap 现在为 [[1,1], [2,2]]
        myHashMap.put(2220, 11122); // myHashMap 现在为 [[1,1], [2,1]]（更新已有的值）
        myHashMap.put(1220, 11122);
        System.out.println(myHashMap.get(2220));   // 返回 1 ，myHashMap 现在为 [[1,1], [2,1]]
        myHashMap.remove(2220); // 删除键为 2 的数据，myHashMap 现在为 [[1,1]]
        System.out.println(myHashMap.get(2220));    // 返回 -1（未找到），myHashMap 现在为 [[1,1]]


    }

    static class MyHashMap {
        // 定义内部类 Entry 用于存储键值对
        class Entry {
            int key;
            int value;
            Entry next;

            Entry(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        // 定义哈希表的大小
        private static final int CAPACITY = 1000;
        private Entry[] table;

        // 构造函数初始化哈希表
        public MyHashMap() {
            table = new Entry[CAPACITY];
        }

        // 哈希函数，计算键的哈希值
        private int hash(int key) {
            return key % CAPACITY;
        }

        // 插入键值对
        public void put(int key, int value) {
            int index = hash(key);
            Entry entry = table[index];
            Entry prev = null;

            // 如果该位置已经有元素，遍历链表
            while (entry != null) {
                if (entry.key == key) {
                    // 如果键已存在，更新值
                    entry.value = value;
                    return;
                }
                prev = entry;
                entry = entry.next;
            }

            // 如果键不存在，创建新节点并插入
            Entry newEntry = new Entry(key, value);
            if (prev == null) {
                table[index] = newEntry;
            } else {
                prev.next = newEntry;
            }
        }

        // 获取键对应的值
        public int get(int key) {
            int index = hash(key);
            Entry entry = table[index];

            // 遍历链表查找键
            while (entry != null) {
                if (entry.key == key) {
                    return entry.value;
                }
                entry = entry.next;
            }

            // 如果键不存在，返回 -1
            return -1;
        }

        // 删除键值对
        public void remove(int key) {
            int index = hash(key);
            Entry entry = table[index];
            Entry prev = null;

            // 遍历链表查找键
            while (entry != null) {
                if (entry.key == key) {
                    // 如果找到键，删除节点
                    if (prev == null) {
                        table[index] = entry.next;
                    } else {
                        prev.next = entry.next;
                    }
                    return;
                }
                prev = entry;
                entry = entry.next;
            }
        }
    }

    static class MyHashSetARC {
        private static final int BASE = 769; // 哈希表大小，选择一个质数
        private LinkedList<Integer>[] set;   // 使用链表数组存储元素

        public MyHashSetARC() {
            set = new LinkedList[BASE];
            for (int i = 0; i < BASE; i++) {
                set[i] = new LinkedList<>();
            }
        }

        public void add(int key) {
            int index = key % BASE;
            if (!set[index].contains(key)) {
                set[index].add(key); // 如果不存在则添加
            }
        }

        public void remove(int key) {
            int index = key % BASE;
            set[index].remove((Integer) key); // 删除指定元素
        }

        public boolean contains(int key) {
            int index = key % BASE;
            return set[index].contains(key); // 检查是否存在
        }
    }

    // 不使用任何内建的哈希表库设计一个哈希集合（HashSet）。
    static class MyHashSetByList {

        private List<Integer> intList ;

        public MyHashSetByList() {
            intList = new ArrayList<>();
        }

        // 向哈希集合中插入值 key 。
        public void add(int key) {
            if(!intList.contains(key)){
                intList.add(key);
            }
        }

        // 将给定值 key 从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。
        public void remove(int key) {
            for(int i=0;i<intList.size();i++){
                if(intList.get(i) == key){
                    intList.remove(i);
                }
            }
        }

        // 返回哈希集合中是否存在这个值 key 。
        public boolean contains(int key) {
            return intList.contains(key);
        }

        public void printString(){

            for(int i=0;i<intList.size();i++){
                System.out.print(intList.get(i)+" ");
            }
            System.out.println();
        }
    }

    /**
     * 树节点
     */
    static class TrieNode {

        private TrieNode[] children = new TrieNode[26]; // 假设仅小写字母
        private boolean isEnd;

        public boolean containsKey(char c) { return children[c - 'a'] != null; }
        public TrieNode get(char c) { return children[c - 'a']; }
        public void put(char c) { children[c - 'a'] = new TrieNode(); }
        public void setEnd() { isEnd = true; }
        public boolean isEnd() { return isEnd; }
    }

    static class Trie {
        private TrieNode root;

        public Trie() { root = new TrieNode(); }

        public void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (!node.containsKey(c)) node.put(c);
                node = node.get(c);
            }
            node.setEnd();
        }

        public boolean search(String word) {
            TrieNode node = searchPrefix(word);
            return node != null && node.isEnd();
        }

        public boolean startsWith(String prefix) {
            return searchPrefix(prefix) != null;
        }

        private TrieNode searchPrefix(String prefix) {
            TrieNode node = root;
            for (char c : prefix.toCharArray()) {
                if (!node.containsKey(c)) return null;
                node = node.get(c);
            }
            return node;
        }
    }

    /**
     * Trie（发音类似 "try"）或者说 前缀树 是一种树形数据结构，用于高效地存储和检索字符串数据集中的键。
     *  这一数据结构有相当多的应用情景，例如自动补全和拼写检查。
     */
    static class TrieByHap {

        private HashMap<String,String>  storeMap;

        public TrieByHap() {
            storeMap = new HashMap<>();
        }

        // 向前缀树中插入字符串 word
        public void insert(String word) {
            storeMap.put(word,word);
        }

        // 如果字符串 word 在前缀树中，返回 true（即，在检索之前已经插入）；否则，返回 false 。
        public boolean search(String word) {
            return storeMap.get(word) != null;
        }

        // 如果之前已经插入的字符串 word 的前缀之一为 prefix ，返回 true ；否则，返回 false 。
        public boolean startsWith(String prefix) {
            boolean existWord = false;

            // lambda遍历 jdk1.8后才支持
            // storeMap.forEach((key, value) -> {
            //     if(key.startsWith(prefix)){
            //         System.out.println(key);
            //     }
            // });

            // key遍历
            for (String key : storeMap.keySet()) {
                if(key.startsWith(prefix)){
                    existWord = true;
                    break;
                }
            }

            // 迭代器遍历
            // Iterator<Map.Entry<String, String>> it = storeMap.entrySet().iterator();
            // while(it.hasNext()){
            //     Map.Entry<String, String> entry = it.next();
            //     if(entry.getKey().startsWith(prefix)){
            //         existWord = true;
            //         break;
            //     }
            //     it.next();
            // }
            return  existWord;
        }
    }

    /**
     * Your Trie object will be instantiated and called as such:
     * Trie obj = new Trie();
     * obj.insert(word);
     * boolean param_2 = obj.search(word);
     * boolean param_3 = obj.startsWith(prefix);
     */

    static class LRUCacheByDs {
        class Node {
            int key, value;
            Node prev, next;
            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private final int capacity;
        private final HashMap<Integer, Node> cache = new HashMap<>();
        private final Node head = new Node(-1, -1);  // 虚拟头节点
        private final Node tail = new Node(-1, -1);  // 虚拟尾节点

        public LRUCacheByDs(int capacity) {
            this.capacity = capacity;
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if (!cache.containsKey(key)) return -1;
            Node node = cache.get(key);
            moveToHead(node);  // 移动到头部表示最近使用
            return node.value;
        }

        public void put(int key, int value) {
            if (cache.containsKey(key)) {
                Node node = cache.get(key);
                node.value = value;
                moveToHead(node);
            } else {
                if (cache.size() >= capacity) {
                    Node lruNode = tail.prev;
                    cache.remove(lruNode.key);
                    removeNode(lruNode);  // 删除尾部节点
                }
                Node newNode = new Node(key, value);
                cache.put(key, newNode);
                addToHead(newNode);  // 新节点插入头部
            }
        }

        private void moveToHead(Node node) {
            removeNode(node);
            addToHead(node);
        }

        private void addToHead(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        private void removeNode(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }


    /**
     * LRUCache(int capacity) 以 正整数 作为容量 capacity 初始化 LRU 缓存
     * int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 ，  O(1) 的平均时间复杂度
     * void put(int key, int value) 如果关键字 key 已经存在，则变更其数据值 value ，  O(1) 的平均时间复杂度
     *  如果不存在，则向缓存中插入该组 key-value 。如果插入操作导致关键字数量超过 capacity ，则应该 逐出 最久未使用的关键字。
     *
     */
    static class LRUCache{

        private int capacity;
        private HashMap<Integer,Integer> cacheMap;
        // key的操作序号，越小代表越久没操作过
        private HashMap<String,Integer> keyOperateMap;
        private int operateNo = 0;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            cacheMap = new HashMap<>();
            keyOperateMap = new HashMap<>();
        }

        public int get(int key) {
            if(cacheMap.get(key) ==null){
                return -1;
            }else{
                keyOperateMap.put(key+"", ++operateNo);
                return cacheMap.get(key);
            }
        }

        public void put(int key, int value) {

            if(cacheMap.get(key) ==null){

                // 先放了再说
                cacheMap.put(key, value);
                keyOperateMap.put(key+"", ++operateNo);

                if(cacheMap.size()>=capacity+1){
                    //逐出最久未使用的关键字

                    // 转换为 TreeMap 实现自动排序
                    // 自定义 Comparator 根据 Value 排序，根据 Value 升序排序
                    Comparator<String> comparator = (key1, key2) -> {
                        int valueCompare = keyOperateMap.get(key1).compareTo(keyOperateMap.get(key2));
                        if (valueCompare == 0) {
                            return key1.compareTo(key2); // 如果 Value 相同，按 Key 排序
                        }
                        return valueCompare;
                    };
                    // 使用 TreeMap 排序
                    TreeMap<String,Integer> sortedMap = new TreeMap<>(comparator);
                    sortedMap.putAll(keyOperateMap);
                    // sortedMap.remove(sortedMap.lastKey());
                    keyOperateMap = new HashMap<>();
                    keyOperateMap.putAll(sortedMap);
                    // 删除操作序号排名最前的
                    keyOperateMap.remove(sortedMap.firstKey());
                    cacheMap.remove(Integer.parseInt(sortedMap.firstKey()));

                }
            }else{
                cacheMap.put(key, value);

                keyOperateMap.put(key+"", ++operateNo);
            }
        }

        public String toString(){
            return cacheMap.size()+"";
        }

    }

}
