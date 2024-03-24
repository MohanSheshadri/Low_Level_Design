class MyHashMap<I, J> {
  int INTIAL_CAPACITY = 1 << 4;
  int MAXIMUM_CAPACITY = 1 << 30;
  int size;
  Entry[] entries;

  MyHashMap() {
    size = INTIAL_CAPACITY;
    entries = new Entry[size];
  }

  class Entry<I, J> {
    I key;
    J value;
    Entry next;

    Entry(I key, J value) {
      this.key = key;
      this.value = value;
    }
  }

  MyHashMap(int capacity) {
    size = getCorrectCapacity(capacity);
  }

  private int getCorrectCapacity(int cap) {
    int n = cap - 1;
    n |= n >>> 1;
    n |= n >>> 2;
    n |= n >>> 4;
    n |= n >>> 8;
    n |= n >>> 16;
    return n < 0 ? 1 : n >= MAXIMUM_CAPACITY ? MAXIMUM_CAPACITY : n + 1;
  }

  public void put(I key, J value) {
    int hashCode = key.hashCode() % entries.length;
    Entry node = entries[hashCode];
    if (node == null) {
      Entry currNode = new Entry(key, value);
      entries[hashCode] = currNode;
    } else {
      Entry previousNode = node;
      while (node != null) {
        if (node.key == key) {
          node.value = value;
          return;
        }
        previousNode = node;
        node = node.next;
      }
      Entry currNode = new Entry(key, value);
      previousNode.next = currNode;
    }
  }

  public J get(I key) {
    int hashCode = key.hashCode() % entries.length;
    Entry node = entries[hashCode];
    while (node != null) {
      if (key == node.key) {
        return (J) node.value;
      }
      node = node.next;
    }
    return null;
  }
}