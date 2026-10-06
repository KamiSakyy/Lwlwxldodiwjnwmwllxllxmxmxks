package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x5 implements aaShadow.a {
    public static final x5 a = new x5();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(r5.a, true)))).a(eVar, wVar);
        }
        return new u10.y8(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.y8 y8Var = (u10.y8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y8Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(r5.a, true)))).b(fVar, wVar, y8Var.a);
    }
}
