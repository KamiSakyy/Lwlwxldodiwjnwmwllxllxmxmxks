package p41;

import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public interface b {
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

    p51.b c(o oVar);

    p51.b d(o oVar);

    default p51.b e(Class cls) {
        return d(o.a(cls));
    }

    m f(o oVar);

    default Set g(o oVar) {
        return (Set) c(oVar).get();
    }
}
