package com.ignis.example.datasevice.handler.aws;

import com.ignis.example.datasevice.domain.UppercaseRequest;
import com.ignis.example.datasevice.domain.UppercaseResponse;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class UppercaseFunctionHandler extends SpringBootRequestHandler<UppercaseRequest, UppercaseResponse> {
}
