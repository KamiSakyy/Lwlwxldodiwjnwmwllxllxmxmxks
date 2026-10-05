package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v5 implements aa.a {
    public static final v5 a = new v5();
    public static final List b = sy.d0.n("dashboard");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.w8 w8Var = null;
        while (eVar.r0(b) == 0) {
            w8Var = (jo.w8) aa.c.b(aa.c.c(w5.a, false)).a(eVar, wVar);
        }
        return new jo.v8(w8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.v8 v8Var = (jo.v8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v8Var, "value");
        fVar.z0("dashboard");
        aa.c.b(aa.c.c(w5.a, false)).b(fVar, wVar, v8Var.a);
    }
}
