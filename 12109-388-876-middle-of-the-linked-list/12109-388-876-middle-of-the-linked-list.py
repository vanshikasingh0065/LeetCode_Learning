# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        count=0
        #one fast pointer, one slow pointer
        #when fats pointer reaches to the end , slow pointer reaches mid
        slow =head
        fast= head
        temp = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            temp = slow
        
        if slow is not None:
            print(slow.val)

        return slow