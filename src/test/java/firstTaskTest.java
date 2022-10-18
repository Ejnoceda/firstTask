import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class firstTaskTest {

    StatisticsGiver statisticsGiver = new StatisticsGiver();
    @Test
    public void minimumValue(){
        assertEquals(-2 , StatisticsGiver.calculateStats(new int[]{6, 9, 15, -2, 92, 11}));
    }

    @Test
    public void maxValue(){
        assertEquals(92 , StatisticsGiver.calculateStats(new int[]{6, 9, 15, -2, 92, 11}));
    }
}