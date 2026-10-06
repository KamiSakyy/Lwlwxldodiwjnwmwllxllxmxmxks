package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e4 implements aaShadow.a {
    public static final e4 a = new e4();
    public static final List b = sy.d0.n("createCommitOnBranch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.i6 i6Var = null;
        while (eVar.r0(b) == 0) {
            i6Var = (kc0.i6) aa.c.b(aa.c.c(d4.a, false)).a(eVar, wVar);
        }
        return new kc0.j6(i6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.j6 j6Var = (kc0.j6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j6Var, "value");
        fVar.z0("createCommitOnBranch");
        aa.c.b(aa.c.c(d4.a, false)).b(fVar, wVar, j6Var.a);
    }
}
