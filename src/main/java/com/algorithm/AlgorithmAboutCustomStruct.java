package com.algorithm;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

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
        LRUCacheByDs lRUCache = new LRUCacheByDs(2);
        lRUCache.put(1, 1); // 缓存是 {1=1}
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        System.out.println(lRUCache.get(1));    // 返回 1
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        System.out.println(lRUCache.get(2));    // 返回 -1 (未找到)
        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        System.out.println(lRUCache.get(1));    // 返回 -1 (未找到)
        System.out.println(lRUCache.get(3));    // 返回 3
        System.out.println(lRUCache.get(4));    // 返回 4


    }

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
