import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class firstTaskTest {

    StatisticsGiver statisticsGiver = new StatisticsGiver();
    @Test
    public void minimumValue(){
        assertEquals(-2 , StatisticsGiver.calculateStats("min"));
    }

    @Test
    public void maxValue(){
        assertEquals(92 , StatisticsGiver.calculateStats("max"));
    }
}