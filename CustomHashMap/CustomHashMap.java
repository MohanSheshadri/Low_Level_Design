class CustomHashMap<I, J> {
  Entry[] entries;
  int INITIAl_CAPACITY = 1 << 4;
  int MAXIMUM_CAPACITY = 1 << 30;

  CustomHashMap() {
    entries = new Entry[INITIAl_CAPACITY];
  }

  CustomHashMap(int cap) {
    int size = getCurrentcapacity(cap);
    entries = new Entry[size];
  }

  private int getCurrentcapacity(int cap) {
    int n = cap - 1;
    n |= n >>> 1;
    n |= n >>> 2;
    n |= n >>> 4;
    n |= n >>> 8;
    n |= n >>> 16;
    return n < 0 ? 1 : n >= MAXIMUM_CAPACITY ? MAXIMUM_CAPACITY : n + 1;
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
      if (node.key == key) {
        return (J) node.value;
      }
      node = node.next;
    }
    return null;
  }
}