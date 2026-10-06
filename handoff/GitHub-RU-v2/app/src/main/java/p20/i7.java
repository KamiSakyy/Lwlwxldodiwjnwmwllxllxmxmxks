package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i7 implements aaShadow.a {
    public static final i7 a = new i7();
    public static final List b = sy.d0.n("organization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.cb cbVar = null;
        while (eVar.r0(b) == 0) {
            cbVar = (u10.cb) aa.c.b(aa.c.c(j7.a, false)).a(eVar, wVar);
        }
        return new u10.bb(cbVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.bb bbVar = (u10.bb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bbVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(j7.a, false)).b(fVar, wVar, bbVar.a);
    }
}
