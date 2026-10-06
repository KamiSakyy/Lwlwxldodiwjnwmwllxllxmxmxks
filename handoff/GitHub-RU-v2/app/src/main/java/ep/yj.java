package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class yj implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("reactions");

    public static jo.dt c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.ft ftVar = null;
        while (eVar.r0(a) == 0) {
            ftVar = (jo.ft) aa.c.c(ak.a, false).a(eVar, wVar);
        }
        if (ftVar != null) {
            return new jo.dt(ftVar);
        }
        k41.b.B(eVar, "reactions");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.dt dtVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dtVar, "value");
        fVar.z0("reactions");
        aa.c.c(ak.a, false).b(fVar, wVar, dtVar.a);
    }
}
