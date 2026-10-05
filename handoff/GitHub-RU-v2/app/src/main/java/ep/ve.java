package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ve implements aa.a {
    public static final ve a = new ve();
    public static final List b = sy.d0.n("markNotificationsAsUndone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.dm dmVar = null;
        while (eVar.r0(b) == 0) {
            dmVar = (jo.dm) aa.c.b(aa.c.c(we.a, false)).a(eVar, wVar);
        }
        return new jo.cm(dmVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.cm cmVar = (jo.cm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cmVar, "value");
        fVar.z0("markNotificationsAsUndone");
        aa.c.b(aa.c.c(we.a, false)).b(fVar, wVar, cmVar.a);
    }
}
