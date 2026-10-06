package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g2 implements aaShadow.a {
    public static final g2 a = new g2();
    public static final List b = sy.d0.n("blockUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.r3 r3Var = null;
        while (eVar.r0(b) == 0) {
            r3Var = (jo.r3) aa.c.b(aa.c.c(f2.a, false)).a(eVar, wVar);
        }
        return new jo.t3(r3Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.t3 t3Var = (jo.t3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t3Var, "value");
        fVar.z0("blockUser");
        aa.c.b(aa.c.c(f2.a, false)).b(fVar, wVar, t3Var.a);
    }
}
