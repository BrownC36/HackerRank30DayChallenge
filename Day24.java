public static Node removeDuplicates(Node head) {
Node current = head;
Node next_next;

if (head == null)
  return head;

while (current.next != null) {
  if (current.data == current.next.data) {
    next_next = current.next.next;
    current.next = null;
    current.next = next_next;
  } else // advance if no deletion
    current = current.next;
}
return head;
}
