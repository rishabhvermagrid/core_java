class ListNode{
     int data;
     ListNode next;
    ListNode(int data){
        this.data = data;
        this.next = null;
    }
    static ListNode convertArrayToLinkedList(int[] arr){
        if(arr.length==0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for(int i=1;i<arr.length;i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
}
public class LinkedList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        ListNode head = ListNode.convertArrayToLinkedList(arr);
        while(head!=null) {
            System.out.print(head.data);
            head = head.next;
        }
    }
}


