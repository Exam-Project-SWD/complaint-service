import org.junit.Assert;
import org.junit.Test;
import com.complaint.logic.complaintLogic;
public class complaintLogicTest {
    @Test
    public void givenComplaint_whenLengthAndNoBannedWords_thenReturnTrue(){
        String goodComplaint = "This is a good complaint";
        boolean actual = complaintLogic.validComplaint(goodComplaint);
        Assert.assertTrue(actual);
    }

    @Test
    public void givenComplaint_whenLengthLessThanMinimumAllowed_thenReturnFalse(){
        String shortComplaint = "Short";
        boolean actual = complaintLogic.validComplaint(shortComplaint);
        Assert.assertFalse(actual);
    }
    @Test
    public void givenComplaint_whenBannedWordOccursButLengthIsFine_thenReturnFalse(){
        String badWordComplaint = "This shit is a good complaint";
        boolean actual = complaintLogic.validComplaint(badWordComplaint);
        Assert.assertFalse(actual);
    }
}
