package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n7 implements aa.a {
    public static final n7 a = new n7();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(o7.a, true)))).a(eVar, wVar);
        }
        return new i7(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i7 i7Var = (i7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i7Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(o7.a, true)))).b(fVar, wVar, i7Var.a);
    }
}
