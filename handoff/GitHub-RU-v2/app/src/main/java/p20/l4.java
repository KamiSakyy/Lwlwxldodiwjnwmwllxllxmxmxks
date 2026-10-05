package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l4 implements aa.a {
    public static final l4 a = new l4();
    public static final List b = sy.d0.n("createRef");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.v6 v6Var = null;
        while (eVar.r0(b) == 0) {
            v6Var = (u10.v6) aa.c.b(aa.c.c(k4.a, false)).a(eVar, wVar);
        }
        return new u10.w6(v6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.w6 w6Var = (u10.w6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w6Var, "value");
        fVar.z0("createRef");
        aa.c.b(aa.c.c(k4.a, false)).b(fVar, wVar, w6Var.a);
    }
}
