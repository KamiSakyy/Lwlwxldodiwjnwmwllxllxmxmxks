package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q5 implements aaShadow.a {
    public static final q5 a = new q5();
    public static final List b = sy.d0Shadow.n("deleteDiscussionComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.o8 o8Var = null;
        while (eVar.r0(b) == 0) {
            o8Var = (jn0.o8) aa.c.b(aa.c.c(r5.a, false)).a(eVar, wVar);
        }
        return new jn0.n8(o8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.n8 n8Var = (jn0.n8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n8Var, "value");
        fVar.z0("deleteDiscussionComment");
        aa.c.b(aa.c.c(r5.a, false)).b(fVar, wVar, n8Var.a);
    }
}
