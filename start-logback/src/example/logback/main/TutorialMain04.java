package example.logback.main;

import lombok.extern.slf4j.Slf4j;

//(롬복) log변수를 필드에 생성. LoggerFactory.getLogger(TutorialMain04.class); 설정됨
@Slf4j
public class TutorialMain04 {
	// @Slf4j(롬복 어너테이션) 선언시 아래 코드가 자동으로 생성된다.
	// private static final Logger log = LoggerFactory.getLogger(TutorialMain04.class);

	public static void main(String[] args) {
		TutorialMain04 class1 = new TutorialMain04();
		class1.logTest();
		class1.logException();
	}

	void logTest() {
		log.info("info 레벨 테스트");
	}

	void logException() {
		try {
			throw new RuntimeException("### 강제 에러 ###");
		} catch (Exception e) {
			log.info("RuntimeException!!! : {}", e.getMessage());
		}
	}
}