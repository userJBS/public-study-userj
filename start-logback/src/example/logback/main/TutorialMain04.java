package example.logback.main;

import lombok.extern.slf4j.Slf4j;

//(�Һ�) log������ �ʵ忡 ����. LoggerFactory.getLogger(TutorialMain04.class); ������
@Slf4j
public class TutorialMain04 {
	// @Slf4j(�Һ� ������̼�) ����� �Ʒ� �ڵ尡 �ڵ����� �����ȴ�.
	// private static final Logger log = LoggerFactory.getLogger(TutorialMain04.class);

	public static void main(String[] args) {
		TutorialMain04 class1 = new TutorialMain04();
		class1.logTest();
		class1.logException();
	}

	void logTest() {
		log.info("info ���� �׽�Ʈ");
	}

	void logException() {
		try {
			throw new RuntimeException("### ���� ���� ###");
		} catch (Exception e) {
			log.info("RuntimeException!!! : {}", e.getMessage());
		}
	}
}