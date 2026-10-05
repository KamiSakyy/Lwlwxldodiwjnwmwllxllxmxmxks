package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cl implements aa.a {
    public static final cl a = new cl();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.uu uuVar = null;
        while (eVar.r0(b) == 0) {
            uuVar = (u10.uu) aa.c.b(aa.c.c(fl.a, false)).a(eVar, wVar);
        }
        return new u10.ru(uuVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ru ruVar = (u10.ru) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ruVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(fl.a, false)).b(fVar, wVar, ruVar.a);
    }
}
