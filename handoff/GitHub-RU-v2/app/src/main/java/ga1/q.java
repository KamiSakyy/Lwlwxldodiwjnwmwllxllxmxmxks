package ga1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /home/user/work/p/classes5.dex */
public @interface q {
    String encoding() default "binary";

    String value() default "";
}
