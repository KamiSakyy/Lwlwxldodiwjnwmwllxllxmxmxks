package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e8 implements aaShadow.a {
    public static final e8 a = new e8();
    public static final List b = sy.d0.n("enterpriseSupportContact");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ic icVar = null;
        while (eVar.r0(b) == 0) {
            icVar = (kc0.ic) aa.c.b(aa.c.c(f8.a, false)).a(eVar, wVar);
        }
        return new kc0.hc(icVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.hc hcVar = (kc0.hc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hcVar, "value");
        fVar.z0("enterpriseSupportContact");
        aa.c.b(aa.c.c(f8.a, false)).b(fVar, wVar, hcVar.a);
    }
}
