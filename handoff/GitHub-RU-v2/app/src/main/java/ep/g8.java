package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g8 implements aaShadow.a {
    public static final List a = sy.d0.n("discussion");

    public static jo.gc c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.ec ecVar = null;
        while (eVar.r0(a) == 0) {
            ecVar = (jo.ec) aa.c.b(aa.c.c(e8.a, false)).a(eVar, wVar);
        }
        return new jo.gc(ecVar);
    }

    public static void d(ea.f fVar, aa.w wVar, jo.gc gcVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gcVar, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(e8.a, false)).b(fVar, wVar, gcVar.a);
    }
}
