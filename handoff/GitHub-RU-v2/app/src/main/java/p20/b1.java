package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b1 implements aaShadow.a {
    public static final b1 a = new b1();
    public static final List b = sy.d0Shadow.n("addUpvote");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.w1 w1Var = null;
        while (eVar.r0(b) == 0) {
            w1Var = (u10.w1) aa.c.b(aa.c.c(a1.a, false)).a(eVar, wVar);
        }
        return new u10.y1(w1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.y1 y1Var = (u10.y1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y1Var, "value");
        fVar.z0("addUpvote");
        aa.c.b(aa.c.c(a1.a, false)).b(fVar, wVar, y1Var.a);
    }
}
