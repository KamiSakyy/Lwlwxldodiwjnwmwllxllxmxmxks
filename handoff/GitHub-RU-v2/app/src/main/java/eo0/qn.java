package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qn implements aa.a {
    public static final qn a = new qn();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        cp0.c c = cp0.d.c(eVar, wVar);
        if (str != null) {
            return new jn0.ay(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ay ayVar = (jn0.ay) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ayVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, ayVar.a);
        List list = cp0.d.a;
        cp0.d.d(fVar, wVar, ayVar.b);
    }
}
