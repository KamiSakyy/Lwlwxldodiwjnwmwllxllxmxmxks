package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l1 implements aa.a {
    public static final l1 a = new l1();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        w0 c = x0.c(eVar, wVar);
        if (str != null) {
            return new i1(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i1 i1Var = (i1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i1Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, i1Var.a);
        List list = x0.a;
        x0.d(fVar, wVar, i1Var.b);
    }
}
