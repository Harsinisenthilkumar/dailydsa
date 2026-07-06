'''    
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
'''

from xml.dom import Node


class Solution:
    def insertAtEnd(self, head, x):
        if head is None:
            return Node(x)
        temp = head
        while temp.next is not None:
            temp = temp.next
        temp.next = Node(x)
        return head