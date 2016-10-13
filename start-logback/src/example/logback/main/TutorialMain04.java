package example.logback.main;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TutorialMain04 {
	 // private static final Logger log = LoggerFactory.getLogger(LogMain.class);

	public static void main(String[] args) {
		
		TutorialMain04 class1 = new TutorialMain04();
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
			log.error("RuntimeException : {}", e.getMessage());
		}
	}

	void exceptionMethod() {
		throw new RuntimeException("### 강제 에러 ###");
	}
}