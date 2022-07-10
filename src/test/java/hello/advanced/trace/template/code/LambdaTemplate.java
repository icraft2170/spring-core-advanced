package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LambdaTemplate {
    public void execute(FunctionalInterfaceCall call) {
        long startTime = System.currentTimeMillis();

        // 비즈니스 로직 실행
        call.call();
        // 비즈니스 로직 종료

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime : {}", resultTime);

    }
}
