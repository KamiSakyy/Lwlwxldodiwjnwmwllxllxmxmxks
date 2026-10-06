package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t implements aaShadow.a {
    public static final t a = new t();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        gu0.f fVar = gu0.f.a;
        gu0.c c = gu0.f.c(eVar, wVar);
        if (str != null) {
            return new jn0.e0(c, str);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.e0 e0Var = (jn0.e0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, e0Var.a);
        gu0.f fVar2 = gu0.f.a;
        gu0.f.d(fVar, wVar, e0Var.b);
    }
}
