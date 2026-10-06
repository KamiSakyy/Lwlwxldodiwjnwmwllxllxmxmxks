package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h1 implements aaShadow.a {
    public static final h1 a = new h1();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new jn0.h2(str);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.h2 h2Var = (jn0.h2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h2Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, h2Var.a);
    }
}
