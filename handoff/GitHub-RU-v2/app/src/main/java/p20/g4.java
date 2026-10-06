package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g4 implements aaShadow.a {
    public static final g4 a = new g4();
    public static final List b = sy.d0Shadow.n("createPullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.o6 o6Var = null;
        while (eVar.r0(b) == 0) {
            o6Var = (u10.o6) aa.c.b(aa.c.c(f4.a, false)).a(eVar, wVar);
        }
        return new u10.p6(o6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.p6 p6Var = (u10.p6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p6Var, "value");
        fVar.z0("createPullRequest");
        aa.c.b(aa.c.c(f4.a, false)).b(fVar, wVar, p6Var.a);
    }
}
