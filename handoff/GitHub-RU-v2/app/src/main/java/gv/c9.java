package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c9 implements aa.a {
    public static final c9 a = new c9();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(z8.a, false)))).a(eVar, wVar);
        }
        return new u8(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u8 u8Var = (u8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u8Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(z8.a, false)))).b(fVar, wVar, u8Var.a);
    }
}
