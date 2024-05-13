//Liked List is More than Just a Node :)

public class LL {
    private Box head;
    private Box tail;
    private int size;
    public LL(){this.size = 0;}

    public void insertFirst(int value) {
        Box box = new Box(value);
        box.next = head;
        head = box;
        if(tail == null) {
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int value) {

        if(tail == null) {
            insertFirst(value);
            return;
        }
        Box box = new Box(value);
        tail.next = box;
        tail = box;
        size++;

    }

    public void insert(int val , int index) {
        if(index==0) {
            insertFirst(val);
            return;
        }
        if(index== size) {
            insertLast(val);
        }

        Box temp = head;
        for(int i = 1; i<index;i++) {
            temp = temp.next;
        }
        Box box = new Box(val,temp.next);
        temp.next = box;
        size++;
    }

    public void display() {
        Box temp = head;
        while(temp!=null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }


    private class Box {
        private int val;
        private Box next;

        public Box(int value) {
            this.val = value;
        }

        public Box(int value, Box next) {
            this.val = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL first = new LL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        first.display();
    }
}
