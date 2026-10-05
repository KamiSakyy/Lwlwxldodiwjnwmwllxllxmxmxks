package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s8 implements aa.a {
    public static final s8 a = new s8();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.hd hdVar = null;
        while (eVar.r0(b) == 0) {
            hdVar = (u10.hd) aa.c.b(aa.c.c(w8.a, false)).a(eVar, wVar);
        }
        return new u10.dd(hdVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.dd ddVar = (u10.dd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ddVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(w8.a, false)).b(fVar, wVar, ddVar.a);
    }
}
