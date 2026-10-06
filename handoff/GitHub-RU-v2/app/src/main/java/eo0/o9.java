package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o9 implements aaShadow.a {
    public static final o9 a = new o9();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        kr0.a c = kr0.b.c(eVar, wVar);
        if (str != null) {
            return new jn0.he(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.he heVar = (jn0.he) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(heVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, heVar.a);
        List list = kr0.b.a;
        kr0.b.d(fVar, wVar, heVar.b);
    }
}
