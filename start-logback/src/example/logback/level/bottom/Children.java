package example.logback.level.bottom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Children {
    private static final Logger logger = LoggerFactory.getLogger(Children.class);

    public void run() {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }
}
