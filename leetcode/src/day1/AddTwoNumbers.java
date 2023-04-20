package day1;
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2));
        ListNode l2 = new ListNode(1, new ListNode(2));
        ListNode listNode = new ListNode();
        listNode = addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int u = 0;
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;
        while(l1 != null || l2 != null) {
            int x = l1 == null ? 0:l1.val;
            int y = l2 == null ? 0:l2.val;
            int sum = x + y + u;
            u = sum/10;
            sum = sum % 10;
            cur.next = new ListNode(sum);
            cur = cur.next;
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        if(u == 1) {
            cur.next = new ListNode(u);
        }
        return pre.next;
    }
}
