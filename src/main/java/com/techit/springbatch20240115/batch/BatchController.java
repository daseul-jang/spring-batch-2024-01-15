package com.techit.springbatch20240115.batch;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/batch")
@RequiredArgsConstructor
public class BatchController {
    private final BatchService batchService;

    @GetMapping("/hello")
    @ResponseBody
    public String runHello3Job() {
        batchService.runHello3Job();

        return "hello3Job OK";
    }
}
