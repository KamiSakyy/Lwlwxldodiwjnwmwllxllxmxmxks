package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ki implements aa.a {
    public static final ki a = new ki();
    public static final List b = sy.d0.n("comment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.cr crVar = null;
        while (eVar.r0(b) == 0) {
            crVar = (jo.cr) aa.c.b(aa.c.c(ii.a, false)).a(eVar, wVar);
        }
        return new jo.fr(crVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.fr frVar = (jo.fr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(frVar, "value");
        fVar.z0("comment");
        aa.c.b(aa.c.c(ii.a, false)).b(fVar, wVar, frVar.a);
    }
}
