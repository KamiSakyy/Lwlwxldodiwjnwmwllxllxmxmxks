package p41;

import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public class b {
    default Object a(Class cls) {
        return b(o.a(cls));
    }

    default Object b(o oVar) {
        p51.b d = d(oVar);
        if (d == null) {
            return null;
        }
        return d.get();
    }

    p51.b c(o oVar) { return null; }

    p51.b d(o oVar) { return null; }

    default p51.b e(Class cls) {
        return d(o.a(cls));
    }

    m f(o oVar) { return null; }

    default Set g(o oVar) {
        return (Set) c(oVar).get();
    }
    public b() {
    }

    public b(Object p1) {
    }

    public b(Object p1, Object p2) {
    }

    public b(Object p1, Object p2, Object p3) {
    }

    public b(Object p1, Object p2, Object p3, Object p4) {
    }

    public b(Object p1, Object p2, Object p3, Object p4, Object p5) {
    }

    public b(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
    }
}
