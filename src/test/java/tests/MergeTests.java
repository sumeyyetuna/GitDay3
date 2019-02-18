package tests;

import org.testng.annotations.Test;

public class MergeTests {
    @Test
    public void mergeTest(){
        System.out.println("Testing the merge");
    }

    @Test
    public void stashTest1(){
        System.out.println("This will be stashed");

    }
    @Test
    public void stashTest2(){
        System.out.println("This is stash 2");
    }
}
