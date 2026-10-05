package g81;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.serialization.KSerializer;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /home/user/work/p/classes5.dex */
public @interface e {
    Class with() default KSerializer.class;
}
