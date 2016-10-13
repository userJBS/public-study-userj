import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyClass {
	//private static final Logger log = LoggerFactory.getLogger(MyClass.class);

	public static void main(String[] args) {
		MyClass class1 = new MyClass();
		class1.logSimpleMessage();
		class1.logWithTag();
		class1.logWithExtras();
		class1.logException();
	}

	void logSimpleMessage() {
		log.info("This is a test");
	}

	void logWithTag() {
		log.info("This is a test");
	}

	void logWithExtras() {
		log.info("This is a test");
	}

	void logException() {
		try {
			exceptionMethod();
		} catch (Exception e) {
			log.error("Exception caught {}", e.getMessage());
		}
	}

	void exceptionMethod() {
		throw new RuntimeException("### 강제 에러 ###");
	}
}