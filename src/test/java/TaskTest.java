import org.junit.After;
import org.junit.Assert;
import org.junit.Test;


public class TaskTest {

    @Test
    public void testJewels() {
        Task task = new Task();
        Assert.assertEquals(3, task.numJewelsInStones("aA", "aAAbbbb"));
        Assert.assertEquals(0, task.numJewelsInStones("z", "ZZ"));
    }

    @Test
    public void testNums() {
        Task task = new Task();
        Assert.assertEquals(4, task.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        Assert.assertEquals(6, task.numIdenticalPairs(new int[]{1, 1, 1, 1}));
        Assert.assertEquals(0, task.numIdenticalPairs(new int[]{1, 2, 3}));
    }

    @After
    public void cleanUp(){
        System.setOut(null);
    }
}
