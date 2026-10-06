package a81;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class e {
    public static final List a;

    static {
        try {
            a = s71.j.l0(s71.j.g0(Arrays.asList(new w71.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
    public Object h(Object p1, Object p2, Object p3) { return null; }
}
