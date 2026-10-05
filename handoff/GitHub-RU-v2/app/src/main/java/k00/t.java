package k00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t implements aa.a {
    public static final t a = new t();
    public static final List b = sy.d0.n("getsReviewRequests");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new j00.e0(bool.booleanValue());
        }
        k41.b.B(eVar, "getsReviewRequests");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.e0 e0Var = (j00.e0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e0Var, "value");
        fVar.z0("getsReviewRequests");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(e0Var.a));
    }
}
