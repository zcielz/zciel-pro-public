package cn.zciel.java8.java8FromGit01.stream;


import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class Optional01 {
    //TODO option的用法
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("bam");

        String s1 = Optional.of("").orElse("xiaobai");
        log.info(s1);

        optional.isPresent();
        optional.get();
        optional.orElse("fallback");

        optional.ifPresent((s) -> log.info(String.valueOf(s.charAt(0))));
    }
}
