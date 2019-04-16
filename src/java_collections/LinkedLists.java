package java_collections;

import java.util.HashSet;
import java.util.Set;

public class LinkedLists {

  static class SinglyLinkedListNode {

    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
      this.data = nodeData;
      this.next = null;
    }
  }

  static class SinglyLinkedList {

    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
      this.head = null;
      this.tail = null;
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

      SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode(data);
      singlyLinkedListNode.next = llist;
      return singlyLinkedListNode;
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
      SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode(data);
      // function insertAfter(Node node, Node newNode) // insert newNode after node
      //     newNode.next := node.next
      //     node.next    := newNode
      singlyLinkedListNode.next = head.next;
      head.next = singlyLinkedListNode;
      return singlyLinkedListNode;
    }

    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
      head.next = null;
      head.data = 0;
      return null;
    }

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
      Set<SinglyLinkedListNode> nodes = new HashSet<>();
      SinglyLinkedListNode reference1 = head1;
      SinglyLinkedListNode reference2 = head2;

      nodes.add(reference1);
      nodes.add(reference2);

      while (reference1.next != null) {
        nodes.add(reference1.next);
        reference1 = reference1.next;
      }

      while (reference2.next != null) {
        if (nodes.contains(reference2.next)) {
          return reference2.next.data;
        }
        reference2 = reference2.next;
      }
      return 0;
    }

    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

      DoublyLinkedListNode reference = head;

      while (reference.next != null) {
        swapNodes(reference.next);
        reference = reference.next;
      }

      while (reference.prev != null) {
        reference = reference.prev;
      }
      return reference;

    }

    static void swapNodes(DoublyLinkedListNode node) {
      DoublyLinkedListNode temp = node.next;
      node.next = node.prev;
      node.prev = temp;
    }

    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
      DoublyLinkedListNode reference = head;
      DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
      if (data < head.data) {
        newNode.next = head;
        return newNode;
      } else {
        while (reference.next != null) {
          if (data >= reference.data && data <= reference.next.data) {
            DoublyLinkedListNode temp = reference.next;
            reference.next = newNode;
            newNode.next = temp;
            return head;
          }

          reference = reference.next;
        }
        reference.next = newNode;
      }
      return head;
    }
  }
}
