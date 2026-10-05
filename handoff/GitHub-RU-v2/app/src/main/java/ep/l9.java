package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l9 implements aa.a {
    public static final l9 a = new l9();
    public static final List b = sy.d0.n("patch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.fe feVar = null;
        while (eVar.r0(b) == 0) {
            feVar = (jo.fe) aa.c.b(aa.c.c(n9.a, false)).a(eVar, wVar);
        }
        return new jo.de(feVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.de deVar = (jo.de) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(deVar, "value");
        fVar.z0("patch");
        aa.c.b(aa.c.c(n9.a, false)).b(fVar, wVar, deVar.a);
    }
}
