package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h5 implements aa.a {
    public static final h5 a = new h5();
    public static final List b = sy.d0.n("createGoogleIapSubscription");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.y7 y7Var = null;
        while (eVar.r0(b) == 0) {
            y7Var = (jo.y7) aa.c.b(aa.c.c(g5.a, false)).a(eVar, wVar);
        }
        return new jo.z7(y7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.z7 z7Var = (jo.z7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z7Var, "value");
        fVar.z0("createGoogleIapSubscription");
        aa.c.b(aa.c.c(g5.a, false)).b(fVar, wVar, z7Var.a);
    }
}
