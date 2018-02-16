public class Solution {
    // Write your code here.
   Stack stack = new Stack();
   LinkedList queue = new LinkedList<>();


    void pushCharacter(char ch) {
        stack.push(ch);
    }

    void enqueueCharacter(char ch) {
        queue.addLast(ch);
    }

    char popCharacter() {
        return((char)stack.pop());
    }

    char dequeueCharacter() {
        return((char)queue.remove());
    }
