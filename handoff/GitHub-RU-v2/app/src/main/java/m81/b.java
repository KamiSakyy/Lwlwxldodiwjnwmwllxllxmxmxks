package m81;

import sy.y;
import t71.w;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class b {
    public static final int a;

    static {
        Integer d;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            d = property != null ? w.G(property) : null;
        } catch (Throwable th) {
            d = y.d(th);
        }
        Integer num = d instanceof w61.m ? null : d;
        a = num != null ? num.intValue() : 2097152;
    }
}
