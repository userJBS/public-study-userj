package example.logback.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: sonegy@sk.com
 */
public class TutorialMain01 {
    private static final Logger logger = LoggerFactory.getLogger(TutorialMain01.class);

    public static void main(String[] args) {

            logger.trace("trace");
            logger.debug("debug");
            logger.info("info");
            logger.warn("warn");
            logger.error("error");
    }
}
