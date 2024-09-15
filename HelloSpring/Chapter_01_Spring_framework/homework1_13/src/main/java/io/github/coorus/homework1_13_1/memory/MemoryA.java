package io.github.coorus.homework1_13_1.memory;

import lombok.ToString;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ToString
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MemoryA implements IMemory{
}
