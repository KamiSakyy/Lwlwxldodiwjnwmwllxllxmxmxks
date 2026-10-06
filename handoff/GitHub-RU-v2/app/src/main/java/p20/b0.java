package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 implements aaShadow.a {
    public static final b0 a = new b0();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(d0.a, true)))).a(eVar, wVar);
        }
        return new u10.p0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.p0 p0Var = (u10.p0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p0Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(d0.a, true)))).b(fVar, wVar, p0Var.a);
    }
}
