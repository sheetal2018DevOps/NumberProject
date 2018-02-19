package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRange() {
		Assert.assertEquals( "-1", "Number out of Range", numberWords.toWords(-1) ) ;
	}
	
	@Test
	public void numberRangeList() {
		Assert.assertEquals( "18", "Eighteen", numberWords.toWords(18) ) ;
	}
	@Test
	public void numberRangeTenslist() {
		Assert.assertEquals( "78", "Seventy Eight", numberWords.toWords(78) ) ;
	}

	@Test
	public void numberRangeTensMultiple() {
		Assert.assertEquals( "778", "Seven hundred Seventy Eight", numberWords.toWords(778) ) ;
	}
}
