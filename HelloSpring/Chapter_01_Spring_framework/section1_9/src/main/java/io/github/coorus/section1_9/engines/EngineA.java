package io.github.coorus.section1_9.engines;

import org.springframework.stereotype.Component;

@Component
public class EngineA implements IEngine{
    @Override
    public String toString() {
        return "EngineA{}";
    }
}
