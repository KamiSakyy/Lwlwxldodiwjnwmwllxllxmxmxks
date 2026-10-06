package ny0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u implements aa.a {
    public static final u a = new u();
    public static final List b = sy.d0Shadow.n("getsDeploymentRequests");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new my0.f0(bool.booleanValue());
        }
        k41.b.B(eVar, "getsDeploymentRequests");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        my0.f0 f0Var = (my0.f0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f0Var, "value");
        fVar.z0("getsDeploymentRequests");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(f0Var.a));
    }
}
