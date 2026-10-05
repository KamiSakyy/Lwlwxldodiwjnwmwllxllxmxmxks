package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c4 implements aa.a {
    public static final c4 a = new c4();
    public static final List b = sy.d0.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.l6 l6Var = null;
        while (eVar.r0(b) == 0) {
            l6Var = (u10.l6) aa.c.b(aa.c.c(e4.a, false)).a(eVar, wVar);
        }
        return new u10.j6(l6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.j6 j6Var = (u10.j6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j6Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(e4.a, false)).b(fVar, wVar, j6Var.a);
    }
}
