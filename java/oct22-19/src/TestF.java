public class TestF {
	TestF() {
		this(10);
		// this();//constructor should not call itself.
	}

	TestF(int a) {
		// this();
	}
}
