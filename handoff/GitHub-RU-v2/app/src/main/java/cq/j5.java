package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j5 implements aa.a {
    public static final j5 a = new j5();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        us.a c = us.b.c(eVar, wVar);
        if (str != null) {
            return new u4(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u4 u4Var = (u4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u4Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, u4Var.a);
        List list = us.b.a;
        us.b.d(fVar, wVar, u4Var.b);
    }
}
