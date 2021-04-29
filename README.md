# Data-Structures-Algo

# linked List

A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.
The elements in a linked list are linked using pointers as shown in the below image:
![alt text](https://github.com/RakeshGanapathy/Data-Structures-Algo/blob/master/Images/Singlelinkedlist.png)

# Creating and Inserting a node in the linked list
  insertion in the list is done at the end, that is the new node is added after the last node of the given Linked List. For example, if the given Linked List is 5->10->15->20->25 and 30 is to be inserted, then the Linked List becomes 5->10->15->20->25->30. 
Since a Linked List is typically represented by the head pointer of it, it is required to traverse the list till the last node and then change the next to last node to the new node.

![alt text](https://github.com/RakeshGanapathy/Data-Structures-Algo/blob/master/Images/Linkedlist_insert_last.png)

