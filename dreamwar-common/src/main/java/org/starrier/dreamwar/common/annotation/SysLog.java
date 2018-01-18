package org.starrier.dreamwar.common.annotation;

import java.lang.annotation.*;

/**
 * Created by Starrier on 2018/1/18.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

    String value() default "";
}