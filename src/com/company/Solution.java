package com.company;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode storage=result;

        boolean shinnKou=false;

        result.val=l1.val+l2.val;
        l1=l1.next;
        l2=l2.next;
        if (result.val>=10){
            result.val-=10;
            shinnKou=true;
        }

        int temp=0;

        
        while(l1!=null&&l2!=null){

            if (shinnKou){
                temp=l1.val+l2.val+1;
                shinnKou=false;
            }else {
                temp=l1.val+l2.val;
            }

            if (temp>=10){
                temp-=10;
                shinnKou=true;
            }

            result.next=new ListNode(temp);
            l1=l1.next;
            l2=l2.next;
            result=result.next;

        }

        ListNode notEmpNode=(l1==null?l2:l1);


        while(notEmpNode!=null){

            if (shinnKou){
                notEmpNode.val++;
                shinnKou=false;
            }

            if (notEmpNode.val>=10){
                notEmpNode.val-=10;
                shinnKou=true;
            }

            result.next=new ListNode(notEmpNode.val);
            notEmpNode=notEmpNode.next;

            result=result.next;

//            result.next=new ListNode(notEmpNode.val);
//            result=result.next;
//            notEmpNode=notEmpNode.next;
        }
        if (shinnKou){
            result.next=new ListNode(1);
        }

        return storage;
    }
    
    
}