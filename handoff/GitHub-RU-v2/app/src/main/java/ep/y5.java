package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y5 implements aa.a {
    public static final y5 a = new y5();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.z8 z8Var = null;
        while (eVar.r0(b) == 0) {
            z8Var = (jo.z8) aa.c.b(aa.c.c(z5.a, true)).a(eVar, wVar);
        }
        return new jo.y8(z8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.y8 y8Var = (jo.y8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y8Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(z5.a, true)).b(fVar, wVar, y8Var.a);
    }
}
