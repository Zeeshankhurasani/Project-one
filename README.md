Dependencies
-----------------------
<pre><code>class Node {
    Node next = null;
    int data; </code></pre>
The next holds the next node in a list. If it is the last node, it holds null. The data is a data associated with this node, which in this case is of type int(BTW it should be final).

<pre><code>public Node(int d) {
    data = d;
} </code></pre>

This is a simple constructor which just copies the argument to its field. It represent the head of the list and a list itself.



HOW TO RUN CODE
----------------------
To run this program: follow these steps:

Once you downloaded the eclipse and Jdk and Jre installed on machine
Start Eclipse:
 Create a new Java Project.
 File->New->Project and Select "Java" in the category list.
  Select "Java Project" in the project list. Click "Next".
  Enter a project name into the Project name field, for example, "Reverses Link List".
  Click "Finish"--It will ask you if you want the Java perspective to open.
	
Create a new Java class:
Click the "Create a Java Class" button in the toolbar. (This is the icon below "Run" and "Window" with a tooltip that says "New Java Class.")
  In the dialog give the Class Name I.e. File Name -Alert it should start with Capital Letter Always
  Then Select main method check box click on Ok.
It will create a new class with Public Static Void Main method in it - you can see this in editor Save the file and right click on file - go to Run - java .. See the console window for output. 
