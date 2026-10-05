package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ke implements aa.a {
    public static final ke a = new ke();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        qs0.d c = qs0.e.c(eVar, wVar);
        if (str != null) {
            return new jn0.ol(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ol olVar = (jn0.ol) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(olVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, olVar.a);
        List list = qs0.e.a;
        qs0.e.d(fVar, wVar, olVar.b);
    }
}
