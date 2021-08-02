package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;

public class JsonMessageFunc implements Function<Map<String, String>, Map<String, String>> {
    private final Logger logger = LoggerFactory.getLogger(JsonMessageFunc.class);


    @Override
    public Map<String, String> apply(Map<String, String> data) {
        for (Map.Entry<String, String> obj : data.entrySet()) {
                logger.info("ya ebal suka oyat pusto");
        }
        final String KEY_MESSAGE = "message";
        if (data == null || !data.containsKey(KEY_MESSAGE)) {
            logger.info("Json object has to have 'message' key");
            return Map.of("error", "Field message can not be null or empty");
        }


        StringBuilder sb = new StringBuilder();
        IntStream.range(0, data.get(KEY_MESSAGE).length())
                .filter(x -> x % 2 == 0)
                .mapToObj(data.get(KEY_MESSAGE)::charAt)
                .forEach(sb::append);
        logger.info(sb.toString());
        return Map.of("message", sb.toString());
    }
}
