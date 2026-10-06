package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mk implements aaShadow.a {
    public static final mk a = new mk();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.au auVar = null;
        while (eVar.r0(b) == 0) {
            auVar = (u10.au) aa.c.b(aa.c.c(rk.a, false)).a(eVar, wVar);
        }
        return new u10.vt(auVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.vt vtVar = (u10.vt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vtVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(rk.a, false)).b(fVar, wVar, vtVar.a);
    }
}
