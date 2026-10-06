package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ng implements aaShadow.a {
    public static final ng a = new ng();
    public static final List b = sy.d0.n("minimizedComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.no noVar = null;
        while (eVar.r0(b) == 0) {
            noVar = (jo.no) aa.c.b(aa.c.c(og.a, true)).a(eVar, wVar);
        }
        return new jo.mo(noVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.mo moVar = (jo.mo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(moVar, "value");
        fVar.z0("minimizedComment");
        aa.c.b(aa.c.c(og.a, true)).b(fVar, wVar, moVar.a);
    }
}
