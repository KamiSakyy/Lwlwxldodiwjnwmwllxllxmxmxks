package k81;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class a implements KSerializer {
    public abstract Object a();

    public static abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // kotlinx.serialization.KSerializer
    public Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    public static final Object e(Decoder decoder) {
        Object a = a();
        int b = b(a);
        j81.a b2 = decoder.b(getDescriptor());
        while (true) {
            int t = b2.t(getDescriptor());
            if (t == -1) {
                b2.g(getDescriptor());
                return h(a);
            }
            f(b2, t + b, a);
        }
    }

    public static abstract void f(j81.a aVar, int i, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
    public Object b(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; }
    public boolean f(Object p1) { return null; }
    public static Object j(Object p1) { return null; }
    public static final Object u = null;
}
