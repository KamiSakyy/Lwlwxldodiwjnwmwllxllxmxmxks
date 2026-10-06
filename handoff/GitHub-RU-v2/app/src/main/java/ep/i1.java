package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i1 implements aaShadow.a {
    public static final i1 a = new i1();
    public static final List b = sy.d0Shadow.n("addUpvote");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.h2 h2Var = null;
        while (eVar.r0(b) == 0) {
            h2Var = (jo.h2) aa.c.b(aa.c.c(h1.a, false)).a(eVar, wVar);
        }
        return new jo.j2(h2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.j2 j2Var = (jo.j2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j2Var, "value");
        fVar.z0("addUpvote");
        aa.c.b(aa.c.c(h1.a, false)).b(fVar, wVar, j2Var.a);
    }
}
