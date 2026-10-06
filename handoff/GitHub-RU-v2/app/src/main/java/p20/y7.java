package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y7 implements aaShadow.a {
    public static final y7 a = new y7();
    public static final List b = sy.d0Shadow.n("enterpriseSupportContact");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ac acVar = null;
        while (eVar.r0(b) == 0) {
            acVar = (u10.ac) aa.c.b(aa.c.c(z7.a, false)).a(eVar, wVar);
        }
        return new u10.zb(acVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.zb zbVar = (u10.zb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zbVar, "value");
        fVar.z0("enterpriseSupportContact");
        aa.c.b(aa.c.c(z7.a, false)).b(fVar, wVar, zbVar.a);
    }
}
