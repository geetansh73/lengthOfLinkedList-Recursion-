public class linkedlist
{
    Node head=null;
    class Node
    {
    int data;
    Node next;
    Node(int d)
    {
    data=d;
    next=null;
    }
    }
    void append(int data)
    {
    Node o=new Node(data);
    if (head==null)
    {
    head=o;
    return;
    }
    Node last=head;
    while(last.next!=null)
    {
    last=last.next;
    }
    last.next=o;
    }
    int getLength(Node t)
    {
    if (t==null)
    {
    return 0;
    }
    else
    {
        t=t.next;
int length=1+getLength(t);
return length;
}

}
public static void main(String g[])
{
    linkedlist obj=new linkedlist();
    obj.append(5);
        obj.append(6);
            obj.append(7);
                obj.append(8);
                    obj.append(9);
                          obj.append(9);
                           obj.append(9);
                  System.out.println(  obj.getLength(obj.head));
}
}