// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
import java.util.Stack;

class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();    
    }
    
    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) 
            minStack.push(val);
    }
    
    public void pop() {
        int poppedValue = mainStack.pop();
        if (poppedValue == minStack.peek()) 
            minStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}


 