package example.logback.main;

import example.logback.level.bottom.Children;
import example.logback.level.top.Parents;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMain02 {
    private static final Logger logger = LoggerFactory.getLogger(TutorialMain02.class);

    public void run() {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

    public static void main(String[] args) {
        new TutorialMain02().run();
        new Parents().run();
        new Children().run();
    }

}
