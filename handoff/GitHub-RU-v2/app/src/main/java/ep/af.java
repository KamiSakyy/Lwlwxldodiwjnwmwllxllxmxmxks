package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class af implements aa.a {
    public static final af a = new af();
    public static final List b = sy.d0.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.mm mmVar = null;
        while (eVar.r0(b) == 0) {
            mmVar = (jo.mm) aa.c.b(aa.c.c(bf.a, false)).a(eVar, wVar);
        }
        return new jo.lm(mmVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.lm lmVar = (jo.lm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lmVar, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(bf.a, false)).b(fVar, wVar, lmVar.a);
    }
}
