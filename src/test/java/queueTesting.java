import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class queueTesting
{
	Queue<String> q = new Queue<String>();
	
	@Test
	public void queueTest(){
		assertEquals(true, q.isEmpty());
		assertThrows(QueueUnderFlowException.class, () -> q.pop());
		q.push("Noah");
		assertEquals(false, q.isEmpty());
		q.push("Gid");
		assertEquals("Noah", q.pop());
		
		q.pop();
		assertEquals(true, q.isEmpty());
		assertThrows(QueueUnderFlowException.class, () -> q.pop());
		
		}
	
	

}
