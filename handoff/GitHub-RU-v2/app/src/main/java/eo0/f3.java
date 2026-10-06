package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f3 implements aaShadow.a {
    public static final f3 a = new f3();
    public static final List b = sy.d0Shadow.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.e5 e5Var = null;
        while (eVar.r0(b) == 0) {
            e5Var = (jn0.e5) aa.c.b(aa.c.c(h3.a, false)).a(eVar, wVar);
        }
        return new jn0.b5(e5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.b5 b5Var = (jn0.b5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b5Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(h3.a, false)).b(fVar, wVar, b5Var.a);
    }
}
