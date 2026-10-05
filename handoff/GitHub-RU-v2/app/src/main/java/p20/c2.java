package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c2 implements aa.a {
    public static final c2 a = new c2();
    public static final List b = sy.d0.n("mobileCapabilities");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.i)).a(eVar, wVar);
        }
        return new u10.p3(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.p3 p3Var = (u10.p3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p3Var, "value");
        fVar.z0("mobileCapabilities");
        aa.c.b(aa.c.a(aa.c.i)).b(fVar, wVar, p3Var.a);
    }
}
