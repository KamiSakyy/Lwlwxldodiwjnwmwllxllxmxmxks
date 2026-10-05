package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b2 implements aa.a {
    public static final b2 a = new b2();
    public static final List b = sy.d0.n("gitUrl");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new g1(str);
        }
        k41.b.B(eVar, "gitUrl");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g1 g1Var = (g1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g1Var, "value");
        fVar.z0("gitUrl");
        aa.c.a.b(fVar, wVar, g1Var.a);
    }
}
