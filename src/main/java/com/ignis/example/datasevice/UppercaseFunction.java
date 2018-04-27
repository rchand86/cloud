package com.ignis.example.datasevice;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.ignis.example.datasevice.domain.UppercaseRequest;
import com.ignis.example.datasevice.domain.UppercaseResponse;
import com.ignis.example.datasevice.service.UppercaseService;

@Component("uppercaseFunction")
public class UppercaseFunction implements Function<UppercaseRequest, UppercaseResponse> {

    private final UppercaseService uppercaseService;

    public UppercaseFunction(final UppercaseService uppercaseService) {
        this.uppercaseService = uppercaseService;
    }

    @Override
    public UppercaseResponse apply(final UppercaseRequest uppercaseRequest) {
        final UppercaseResponse result = new UppercaseResponse();

        result.setResult(uppercaseService.uppercase(uppercaseRequest.getInput()));

        return result;
    }
}
