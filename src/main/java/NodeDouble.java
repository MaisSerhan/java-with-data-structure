
public class NodeDouble {
int data;
NodeDouble next=null;
NodeDouble prev=null;

    public NodeDouble() {
    }

    public NodeDouble(int data, NodeDouble next, NodeDouble prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public NodeDouble(int data) {
        this.data = data;
    }


}
