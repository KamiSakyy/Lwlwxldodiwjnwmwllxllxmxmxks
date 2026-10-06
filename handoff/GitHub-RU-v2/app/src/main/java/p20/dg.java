package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dg implements aaShadow.a {
    public static final dg a = new dg();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.yn ynVar = null;
        while (eVar.r0(b) == 0) {
            ynVar = (u10.yn) aa.c.b(aa.c.c(fg.a, true)).a(eVar, wVar);
        }
        return new u10.wn(ynVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.wn wnVar = (u10.wn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wnVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(fg.a, true)).b(fVar, wVar, wnVar.a);
    }
}
