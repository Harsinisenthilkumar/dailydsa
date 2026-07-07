class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Solution:
    def insertInMiddle(self, head, x):
        if head is None:
            return Node(x)
        slow = head
        fast = head

        while fast.next is not None and fast.next.next is not None:
            slow = slow.next
            fast = fast.next.next

        newNode = Node(x)
        newNode.next = slow.next
        slow.next = newNode

        return head