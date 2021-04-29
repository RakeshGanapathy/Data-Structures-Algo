# Data-Structures-Algo

# linked List

A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.
The elements in a linked list are linked using pointers as shown in the below image:
![alt text](https://github.com/RakeshGanapathy/Data-Structures-Algo/blob/master/Images/Singlelinkedlist.png)

# Creating and Inserting a node in the linked list
  insertion in the list is done at the end, that is the new node is added after the last node of the given Linked List. For example, if the given Linked List is 5->10->15->20->25 and 30 is to be inserted, then the Linked List becomes 5->10->15->20->25->30. 

Since a Linked List is typically represented by the head pointer of it, it is required to traverse the list till the last node and then change the next to last node to the new node.

![alt text](https://github.com/RakeshGanapathy/Data-Structures-Algo/blob/master/Images/Linkedlist_insert_last.png)

# Deletion By KEY

Search the key for its first occurrence in the list , 3 conditions can be there:

![alt text](https://github.com/RakeshGanapathy/Data-Structures-Algo/blob/master/Images/Linkedlist_deletion.png)

Case 1: The key is found at the head
In this case, Change the head of the node to the next node of the current head. 
Free the memory of the replaced head node.

Case 2: The key is found in the middle or last, except at the head 
In this case, Find the previous node of the node to be deleted.Change the next the previous node to the next node of the current node.
Free the memory of the replaced node.

Case 3: The key is not found in the list , No operation needs to be done
