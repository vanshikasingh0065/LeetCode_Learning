# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def splitListToParts(
        self, head: Optional[ListNode], k: int
    ) -> List[Optional[ListNode]]:

        curr = head
        length = 0
        while curr:
            curr = curr.next
            length += 1

        sublength = length // k
        remainder = length%k
        print(sublength)
        print(length)
        ans = []
        curr = head
        temp = head
        subcount = 0
        for i in range(k):
            ans.append(curr)  # Start a new part
            baselength = 0

            if remainder:
                baselength = sublength + 1  # Give extra node if remainder exists
            else:
                baselength = sublength
                #in this loop we are creating the sub nodes
            for j in range(baselength - 1):
                if not curr:
                    break
                curr = curr.next
            if remainder != 0:
                remainder -= 1  # Reduce remainder after using extra node
            if curr:
                temp = curr.next
                curr.next = None  # Break the link to separate the part
                curr = temp  # Move to the next part
        return ans
