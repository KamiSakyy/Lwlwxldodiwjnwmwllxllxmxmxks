package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ne implements aaShadow.a {
    public static final ne a = new ne();
    public static final List b = sy.d0Shadow.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.zl zlVar = null;
        while (eVar.r0(b) == 0) {
            zlVar = (u10.zl) aa.c.b(aa.c.c(re.a, false)).a(eVar, wVar);
        }
        return new u10.vl(zlVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.vl vlVar = (u10.vl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vlVar, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(re.a, false)).b(fVar, wVar, vlVar.a);
    }
}
