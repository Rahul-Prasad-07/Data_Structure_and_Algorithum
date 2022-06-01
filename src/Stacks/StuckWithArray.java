package Stacks;

public class StuckWithArray {


    int top;
    int a[];
    int size;

    StuckWithArray(int size){
        top=-1;
        a=new int[size];
        this.size=size;
    }

    private boolean push(int data){
        if( top >=size-1){
            System.out.println("max size reach , Stack over flow error");
            return false;
            // return directly from here.
        }else {
            a[++top] = data;
            System.out.println("pushed " + data+"into stack");
            return true;

        }

    }


    public static void main(String[] args) {
        StuckWithArray stack = new StuckWithArray(5);
        //push
        stack.push(14);
        stack.push(15);
        stack.push(16);
    }
}
