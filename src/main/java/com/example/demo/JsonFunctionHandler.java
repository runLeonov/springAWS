package com.example.demo;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import java.util.Map;

public class JsonFunctionHandler extends SpringBootRequestHandler<Map<String, String>, Map<String, String>> {
}
