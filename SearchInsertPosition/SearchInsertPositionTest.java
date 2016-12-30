package SearchInsertPosition;

import static org.junit.Assert.*;
import org.junit.Test;

public class SearchInsertPositionTest {
	@Test
	public void testSearchInsertPosition() throws Exception {
		int [][] inputs = {
                {1,3,5,6},
                {1,3,5,6},
                {1,3,5,6},
                {1,3,5,6},
        };
        int[] targets = {5,2,7,0};
        int[] results = {2,1,4,0};
        SearchInsertPosition s = new SearchInsertPosition();
        for (int i = 0; i < inputs.length; i++) {
            int r = s.searchInsert(inputs[i], targets[i]);
            System.out.println(r);
            assertEquals(results[i], r);
        }
	}
}
