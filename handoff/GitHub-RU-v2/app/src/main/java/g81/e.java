package g81;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.serialization.KSerializer;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /home/user/work/p/classes5.dex */
public @interface e {
    Class with() default KSerializer.class;
    public Object b(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object c(Object p1, Object p2, Object p3) { return null; }
    public Object q(Object p1, Object p2) { return null; }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object z(Object p1, Object p2, Object p3) { return null; }
}
