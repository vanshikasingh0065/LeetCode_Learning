# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        
        curr = head
        dummy = ListNode(0)
        dummy.next = head
        prev = dummy

        while curr and curr.next:

            first = curr
            second = curr.next
            prev.next = second
            first.next = second.next
            second.next = first

            prev = first
            curr = first.next

        return dummy.next



        