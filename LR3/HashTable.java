import java.util.LinkedList;

public class HashTable<K, V> {
    
    private LinkedList<Entry<K, V>>[] table;
    private int size;
    private static final int CAPACITY = 15;

    // Внутренний класс для хранения пар ключ-значение
    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
    
    // Конструктор, инициализирующий таблицу заданного размера
    @SuppressWarnings("unchecked")
    public HashTable() {
        
        table = new LinkedList[CAPACITY];
        size = 0;
    }

    // Хеш-функция
    private int hash(K key) {
        return Math.abs(key.hashCode()) % CAPACITY;
    }

    // Добавление пары ключ-значение
    public void put(K key, V value) {
        int index = hash(key);
        // Проверка, есть ли уже ключ в таблице
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        for (Entry<K, V> entry : table[index]) { 
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        // Добавление новой записи, если ключа нет
        table[index].add(new Entry<>(key, value));
        size++;
    }

    // Получение значения по ключу
    public V get(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    // Удаление пары ключ-значение
    public void remove(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (int i = 0; i < table[index].size(); i++) {
                if (table[index].get(i).getKey().equals(key)) {
                    table[index].remove(i);
                    size--;
                    return;
                }
            }
        }
        // Ключ не найден
    }

    // Получение размера таблицы
    public int size() {
        return size;
    }

    // Проверка, пуста ли таблица
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        HashTable<String, String> hashTable = new HashTable<>();
        hashTable.put("apple", "red");
        hashTable.put("banana", "yellow");
        hashTable.put("orange", "orange");

        System.out.println(hashTable.get("apple")); // Вывод: red
        System.out.println(hashTable.get("banana")); // Вывод: yellow

        hashTable.remove("banana");
        System.out.println(hashTable.get("banana")); // Вывод: null

        System.out.println(hashTable.size()); // Вывод: 2

        System.out.println(hashTable.isEmpty()); // Вывод: false
    }
}