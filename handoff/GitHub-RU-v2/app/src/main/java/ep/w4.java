package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w4 implements aaShadow.a {
    public static final w4 a = new w4();
    public static final List b = sy.d0Shadow.n("createCommitOnBranch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.h7 h7Var = null;
        while (eVar.r0(b) == 0) {
            h7Var = (jo.h7) aa.c.b(aa.c.c(v4.a, false)).a(eVar, wVar);
        }
        return new jo.i7(h7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.i7 i7Var = (jo.i7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i7Var, "value");
        fVar.z0("createCommitOnBranch");
        aa.c.b(aa.c.c(v4.a, false)).b(fVar, wVar, i7Var.a);
    }
}
