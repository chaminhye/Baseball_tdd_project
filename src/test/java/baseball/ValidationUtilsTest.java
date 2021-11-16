package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @Test
    void validationNumber(){
        assertThat(ValidationUtils.validNo(9)).isTrue();
        assertThat(ValidationUtils.validNo(10)).isFalse();
        assertThat(ValidationUtils.validNo(0)).isFalse();
    }
}
