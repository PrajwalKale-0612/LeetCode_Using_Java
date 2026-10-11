public class MergeTwoSortList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode ans = list1;

        while (list1 != null && list2 != null) {

            ListNode temp = list1;

            while (list1 != null && list1.val <= list2.val) {
                temp = list1;
                list1 = list1.next;
            }

            temp.next = list2;

            ListNode t = list1;
            list1 = list2;
            list2 = t;
        }

        return ans;
    }

    static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // First list: 1 -> 2 -> 4
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        // Second list: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(l1, l2);

        printList(result);
    }
}