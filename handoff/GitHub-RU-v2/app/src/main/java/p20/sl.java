package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sl implements aaShadow.a {
    public static final sl a = new sl();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.qv qvVar = null;
        while (eVar.r0(b) == 0) {
            qvVar = (u10.qv) aa.c.b(aa.c.c(tl.a, false)).a(eVar, wVar);
        }
        return new u10.pv(qvVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.pv pvVar = (u10.pv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pvVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(tl.a, false)).b(fVar, wVar, pvVar.a);
    }
}
