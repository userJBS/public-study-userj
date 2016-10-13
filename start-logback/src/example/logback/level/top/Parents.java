package example.logback.level.top;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Parents {
    private static final Logger logger = LoggerFactory.getLogger(Parents.class);

    public void run() {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }
}
