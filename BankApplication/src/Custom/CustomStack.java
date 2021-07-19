package Custom;

class Stk {
    private final int MAX_SIZE=100;
    int top;
    int[] ele=new int[MAX_SIZE];

    public Stk() {
        top=-1;
    }

    void push(int x) {
        if(top>=MAX_SIZE-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        else {
            ele[++top]=x;
        }
    }
    int pop() {
        if(top<0)
        {
            System.out.println("Underflow");
            return -1;
        }
        int a = ele[top--];
        return a;
    }

    int peek() {
        if(top<0)
        {
            System.out.println("Underflow");
            return -1;
        }
        int a = ele[top];
        return a;
    }

}

public class CustomStack {
    public static void main(String[] args) {
        Stk s = new Stk();
        s.push(10);
        s.push(5);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }


}
