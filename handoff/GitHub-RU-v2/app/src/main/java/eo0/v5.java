package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v5 implements aa.a {
    public static final v5 a = new v5();
    public static final List b = sy.d0.n("deleteDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.v8 v8Var = null;
        while (eVar.r0(b) == 0) {
            v8Var = (jn0.v8) aa.c.b(aa.c.c(w5.a, false)).a(eVar, wVar);
        }
        return new jn0.u8(v8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.u8 u8Var = (jn0.u8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u8Var, "value");
        fVar.z0("deleteDiscussion");
        aa.c.b(aa.c.c(w5.a, false)).b(fVar, wVar, u8Var.a);
    }
}
