package io.github.coorus.section1_8_1.config;

import io.github.coorus.section1_8_1.car.Car;
import io.github.coorus.section1_8_1.engines.EngineA;
import io.github.coorus.section1_8_1.engines.EngineB;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Car.class, EngineA.class, EngineB.class})
@Qualifier("engineB")
public class Config {
}
