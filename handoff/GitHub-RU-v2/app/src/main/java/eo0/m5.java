package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m5 implements aaShadow.a {
    public static final m5 a = new m5();
    public static final List b = sy.d0Shadow.n("createUserDisinterest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.g8 g8Var = null;
        while (eVar.r0(b) == 0) {
            g8Var = (jn0.g8) aa.c.b(aa.c.c(l5.a, false)).a(eVar, wVar);
        }
        return new jn0.h8(g8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.h8 h8Var = (jn0.h8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h8Var, "value");
        fVar.z0("createUserDisinterest");
        aa.c.b(aa.c.c(l5.a, false)).b(fVar, wVar, h8Var.a);
    }
}
