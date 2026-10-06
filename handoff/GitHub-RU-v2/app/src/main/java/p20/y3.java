package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y3 implements aaShadow.a {
    public static final y3 a = new y3();
    public static final List b = sy.d0Shadow.n("createCommitOnBranch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.a6 a6Var = null;
        while (eVar.r0(b) == 0) {
            a6Var = (u10.a6) aa.c.b(aa.c.c(x3.a, false)).a(eVar, wVar);
        }
        return new u10.b6(a6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.b6 b6Var = (u10.b6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b6Var, "value");
        fVar.z0("createCommitOnBranch");
        aa.c.b(aa.c.c(x3.a, false)).b(fVar, wVar, b6Var.a);
    }
}
