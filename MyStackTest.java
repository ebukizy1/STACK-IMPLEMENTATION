package stack_Building;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    MyStack stack = new MyStack();
    @Test
    public void testStackExist(){
        assertNotNull(stack);
    }
    @Test
    public void testStackIsEmpty(){
        stack.isEmpty();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void testWhen_Push_X_Check_If_StackIsEmpty(){
        stack.push("emmanuel");
        assertFalse(stack.isEmpty());
    }
    @Test
    public void testWhen_Push_X_Check_if_When_I_Stack_Is_Empty(){
    stack.push(1);
    stack.pop();
    assertTrue(stack.isEmpty());
    }
    @Test
    public void testWhen_Push_X_Check_if_I_Pop_Can_Get_The_Value_I_Pushed(){
        stack.push("EMMANUEL");
        assertEquals("EMMANUEL", stack.pop());
    }
    @Test
    public void testWhen_Push_X_Y_Check_if_I_PopTwice_The_Value_I_Pushed(){
        stack.push("EMMANUEL");
        stack.push("samuel");
        stack.push("david");
        stack.pop();
        stack.pop();
        assertEquals("EMMANUEL", stack.pop());
    }
    @Test
    public void testToCheckCheckIfStackIsFull() {
        try {
            stack.push("EMMANUEL");
            stack.push("samuel");
            stack.push("david");
            stack.push("david");
            stack.push("david");
            stack.push("david");
            assertTrue(stack.isFull());
        } catch (Exception exception) { // catch exception thrown in method1
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();
        }
    }
    @Test
    public void testToCheckCheckIfStackIsFullCanIpop(){
        stack.push("EMMANUEL");
        stack.push("samuel");
        stack.push("david");
        stack.push("david");
        stack.push("david");
        assertEquals("david", stack.pop());
    }
//    @Test
//    public void testYouCanPeekFromTheStack(){
//        stack.push("EMMANUEL");
//        stack.push("samuel");
//        assertEquals("EMMANUEL", stack.peek());
//
//    }


}
