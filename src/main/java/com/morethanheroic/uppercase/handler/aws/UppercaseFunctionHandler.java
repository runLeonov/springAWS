package com.morethanheroic.uppercase.handler.aws;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import java.util.Map;

public class UppercaseFunctionHandler extends SpringBootRequestHandler<Map<String, String>, Map<String, String>> {
}
