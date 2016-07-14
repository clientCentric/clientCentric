package online.clientcentric.unit.sample.face.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SampleEntity {

    private final String text;
}