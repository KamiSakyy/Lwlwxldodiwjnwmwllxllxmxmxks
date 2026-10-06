package k81;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e extends f1 {
    public boolean[] a;
    public int b;

    @Override // k81.f1
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.a, this.b);
        k71.k.f(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // k81.f1
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i);
            k71.k.f(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // k81.f1
    public final int d() {
        return this.b;
    }
    public Object a(Object p1) { return null; }
    public Object i(Object p1, Object p2, Object p3, Object p4) { return null; }
    public Object j(Object p1, Object p2) { return null; }
    public static Object k(Object p1) { return null; }
    public Object k(Object p1, Object p2) { return null; }
    public static Object p(Object p1, Object p2) { return null; }
    public Object s(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object b = null;
    public static final Object c = null;
    public static final Object d = null;
    public Object a(Object p1) { return null; }
    public Object k(Object p1) { return null; }
    public Object s(Object p1, Object p2) { return null; }
}
