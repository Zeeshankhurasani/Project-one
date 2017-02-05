Dependencies
-----------------------
<pre><code>C:\Users\Zeeshan>java -version
java version "1.8.0_91"
Java(TM) SE Runtime Environment, Standard Edition (build 1.8.0_91-b15)</code></pre>
<b>1.8.0.91</b> version of java is used to run this project. 

<pre><code>Eclipse Mars 4.5 version
Available at: https://eclipse.org/mars/ </code></pre>
- [x] Eclipse

Eclipse is a Java based open source platform that allows a software developer to create a customized development environment (IDE) from plug-in components built by Eclipse members. Eclipse Mars 4.5 version were used and it supports Java version 8. Can be download [Here](https://eclipse.org/mars/) .  


<pre><code>class LinkedList {
 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    /* Function to reverse the linked list */
   <b> YOUR LOGIC HERE</b>
 
}</code></pre>
`LinkedList` class holds the logic to Reversing list. 


<pre><code>class Node {
    Node next = null;
    int data; </code></pre>
The next holds the next node in a list. If it is the last node, it holds null. The data is a data associated with this node, which in this case is of type int(BTW it should be final).

<pre><code>public Node(int d) {
    data = d;
} </code></pre>
This is a simple constructor which just copies the argument to its field. It represent the head of the list and a list itself.
 
 ```javascript
 Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
	}
	```
	
Create 3 nodes: `currNode`, `PrevNode` and `nextNode`.
Initially take three pointers: PrevNode, CurrNode, NextNode
currNode = head; nextNode = null;prevNode = null;
Let `CurrNode` point to `HeaderNode` of the list. And let `PrevNode` and `NextNode` points to `null`
Now iterate through the linked list until `CurrNode` is `null`
In the loop, we need to change `NextNode` to `PrevNode`, `PrevNode` to `CurrNode` and `CurrNode` to `NextNode`
Now keep reversing the pointers one by one till `currNode!=null`.

<pre><code>void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
	}</code></pre>
printList is used to prints content of double linked list. 

________________________________________________

HOW TO RUN CODE
----------------------
To run this program: follow these steps:

Once you downloaded the eclipse and Jdk and Jre installed on machine
Start Eclipse:
 Create a new Java Project.
 <pre><code>File->New->Project and Select "Java" in the category list.
  Select "Java Project" in the project list. Click "Next".
  Enter a project name into the Project name field, for example, Reverses Link List".
  Click "Finish"--It will ask you if you want the Java perspective to open.</code></pre>
	
Create a new Java class:
<pre><code>Click the `Create a Java Class` button in the toolbar. (This is the icon below `Run` and `Window` with a tooltip that says `New Java Class`)
  In the dialog give the Class Name I.e. File Name -Alert it should start with Capital Letter Always
  Then Select main method check box click on `Ok`.</code></pre>
It will create a new class with Public Static Void Main method in it - you can see this in editor Save the file and right click on file - go to Run - java .. See the console window for output. 
