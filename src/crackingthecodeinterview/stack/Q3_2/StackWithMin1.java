package crackingthecodeinterview.stack.Q3_2;

import java.util.Stack;

/*
Stack Min: How would you design a crackingthecodeinterview.stack which, in addition to push and pop, has a function min
which returns the minimum element? Push, pop and min should all operate in 0(1) time.

 */



    public class StackWithMin1 extends Stack<NodeWithMin> {

        public static void main(String[] args) {

            StackWithMin1 stack = new StackWithMin1();
            stack.push(5);
            stack.push(5);
            stack.push(3);
            stack.push(1);
            stack.push(5);
            stack.push(2);


            System.out.println(stack.min());
        }

        public void push(int value) {
            int newMin = Math.min(value, min());
            super.push(new NodeWithMin(value, newMin));

        }

        public int min() {
            if (this.isEmpty()) {
                return Integer.MAX_VALUE; // Error value
            } else {

                return peek().min;
            }
        }



    }

    class NodeWithMin {
        public int value;
        public int min;
        public NodeWithMin(int v, int min){
                 value = v;
                this.min = min;
        }
    }