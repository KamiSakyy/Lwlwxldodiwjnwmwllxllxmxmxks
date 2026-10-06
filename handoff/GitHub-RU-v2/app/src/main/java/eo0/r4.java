package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r4 implements aaShadow.a {
    public static final r4 a = new r4();
    public static final List b = sy.d0Shadow.n("createDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.b7 b7Var = null;
        while (eVar.r0(b) == 0) {
            b7Var = (jn0.b7) aa.c.b(aa.c.c(q4.a, false)).a(eVar, wVar);
        }
        return new jn0.c7(b7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.c7 c7Var = (jn0.c7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c7Var, "value");
        fVar.z0("createDiscussion");
        aa.c.b(aa.c.c(q4.a, false)).b(fVar, wVar, c7Var.a);
    }
}
