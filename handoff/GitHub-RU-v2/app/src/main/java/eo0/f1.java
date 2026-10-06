package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f1Shadow implements aaShadow.a {
    public static final f1Shadow a = new f1Shadow();
    public static final List b = sy.d0Shadow.n("addUpvote");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.c2 c2Var = null;
        while (eVar.r0(b) == 0) {
            c2Var = (jn0.c2) aa.c.b(aa.c.c(e1.a, false)).a(eVar, wVar);
        }
        return new jn0.e2(c2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.e2 e2Var = (jn0.e2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e2Var, "value");
        fVar.z0("addUpvote");
        aa.c.b(aa.c.c(e1.a, false)).b(fVar, wVar, e2Var.a);
    }
}
