package com.learning.validation.customValidators;

import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface ContactNumberConstraint {
    String message() default "Invalid Phone number";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
