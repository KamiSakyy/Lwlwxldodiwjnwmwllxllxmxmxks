package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a2 implements aaShadow.a {
    public static final a2 a = new a2();
    public static final List b = sy.d0Shadow.n("blockUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.j3 j3Var = null;
        while (eVar.r0(b) == 0) {
            j3Var = (jn0.j3) aa.c.b(aa.c.c(z1.a, false)).a(eVar, wVar);
        }
        return new jn0.l3(j3Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.l3 l3Var = (jn0.l3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l3Var, "value");
        fVar.z0("blockUser");
        aa.c.b(aa.c.c(z1.a, false)).b(fVar, wVar, l3Var.a);
    }
}
