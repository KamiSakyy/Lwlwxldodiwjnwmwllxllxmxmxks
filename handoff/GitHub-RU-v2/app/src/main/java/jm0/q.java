package jm0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements aa.a {
    public static final q a = new q();
    public static final List b = sy.d0Shadow.n("getsReviewRequests");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new im0.z(bool.booleanValue());
        }
        k41.b.B(eVar, "getsReviewRequests");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        im0.z zVar = (im0.z) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zVar, "value");
        fVar.z0("getsReviewRequests");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(zVar.a));
    }
}
