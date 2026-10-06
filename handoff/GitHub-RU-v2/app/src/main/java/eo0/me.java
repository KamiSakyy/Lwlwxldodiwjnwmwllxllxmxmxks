package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class me implements aaShadow.a {
    public static final me a = new me();
    public static final List b = sy.d0Shadow.n("__typename");

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
            return new jn0.ql(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ql qlVar = (jn0.ql) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qlVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, qlVar.a);
        List list = qs0.e.a;
        qs0.e.d(fVar, wVar, qlVar.b);
    }
}
