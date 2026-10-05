package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w4 implements aa.a {
    public static final w4 a = new w4();
    public static final List b = sy.d0.n("deleteDiscussionComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.m7 m7Var = null;
        while (eVar.r0(b) == 0) {
            m7Var = (u10.m7) aa.c.b(aa.c.c(x4.a, false)).a(eVar, wVar);
        }
        return new u10.l7(m7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.l7 l7Var = (u10.l7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l7Var, "value");
        fVar.z0("deleteDiscussionComment");
        aa.c.b(aa.c.c(x4.a, false)).b(fVar, wVar, l7Var.a);
    }
}
