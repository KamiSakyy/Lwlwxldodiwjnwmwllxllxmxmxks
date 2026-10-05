package sc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u implements aa.a {
    public static final u a = new u();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        rc0.b0 b0Var = null;
        while (eVar.r0(b) == 0) {
            b0Var = (rc0.b0) aa.c.b(aa.c.c(w.a, true)).a(eVar, wVar);
        }
        return new rc0.z(b0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rc0.z zVar = (rc0.z) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(w.a, true)).b(fVar, wVar, zVar.a);
    }
}
