package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ri implements aaShadow.a {
    public static final ri a = new ri();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.jr jrVar = null;
        while (eVar.r0(b) == 0) {
            jrVar = (u10.jr) aa.c.b(aa.c.c(ti.a, true)).a(eVar, wVar);
        }
        return new u10.hr(jrVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.hr hrVar = (u10.hr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hrVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(ti.a, true)).b(fVar, wVar, hrVar.a);
    }
}
