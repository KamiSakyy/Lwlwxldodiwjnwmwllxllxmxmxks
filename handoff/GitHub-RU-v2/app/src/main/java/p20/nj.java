package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class nj implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("stargazers");

    public static u10.ls c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ns nsVar = null;
        while (eVar.r0(a) == 0) {
            nsVar = (u10.ns) aa.c.c(pj.a, false).a(eVar, wVar);
        }
        if (nsVar != null) {
            return new u10.ls(nsVar);
        }
        k41.b.B(eVar, "stargazers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.ls lsVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lsVar, "value");
        fVar.z0("stargazers");
        aa.c.c(pj.a, false).b(fVar, wVar, lsVar.a);
    }
}
