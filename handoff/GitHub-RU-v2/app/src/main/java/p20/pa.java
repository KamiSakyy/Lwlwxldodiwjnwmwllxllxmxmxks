package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pa implements aa.a {
    public static final pa a = new pa();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.sf sfVar = null;
        while (eVar.r0(b) == 0) {
            sfVar = (u10.sf) aa.c.b(aa.c.c(qa.a, true)).a(eVar, wVar);
        }
        return new u10.rf(sfVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.rf rfVar = (u10.rf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rfVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(qa.a, true)).b(fVar, wVar, rfVar.a);
    }
}
