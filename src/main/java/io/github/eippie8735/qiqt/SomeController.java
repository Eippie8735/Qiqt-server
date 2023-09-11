package io.github.eippie8735.qiqt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
    // 리퀘 받아서 가공 후 보냄
    // 함정 만든다고 해서 아무것도 못함..?

    @GetMapping("/hello") // 해당 경로로 갔을 때 해당 값을 반환
    public String con(){
        return "Hello";
    }

}
