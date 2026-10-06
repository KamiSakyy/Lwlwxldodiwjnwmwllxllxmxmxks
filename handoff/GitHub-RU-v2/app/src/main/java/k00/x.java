package k00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x implements aa.a {
    public static final x a = new x();
    public static final List b = sy.d0Shadow.n("getsDeploymentRequests");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new j00.k0(bool.booleanValue());
        }
        k41.b.B(eVar, "getsDeploymentRequests");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.k0 k0Var = (j00.k0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k0Var, "value");
        fVar.z0("getsDeploymentRequests");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(k0Var.a));
    }
}
