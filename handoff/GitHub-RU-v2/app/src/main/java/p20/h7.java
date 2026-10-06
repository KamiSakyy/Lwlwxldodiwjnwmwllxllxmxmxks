package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h7 implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("__typename");

    public static u10.ya c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        e50.l0 c = e50.q0.c(eVar, wVar);
        if (str != null) {
            return new u10.ya(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.ya yaVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yaVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, yaVar.a);
        List list = e50.q0.a;
        e50.q0.d(fVar, wVar, yaVar.b);
    }
}
