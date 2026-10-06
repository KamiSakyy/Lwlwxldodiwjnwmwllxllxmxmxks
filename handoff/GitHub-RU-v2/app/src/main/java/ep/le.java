package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class le implements aaShadow.a {
    public static final le a = new le();
    public static final List b = sy.d0.n("markNotificationAsUnread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.jl jlVar = null;
        while (eVar.r0(b) == 0) {
            jlVar = (jo.jl) aa.c.b(aa.c.c(me.a, false)).a(eVar, wVar);
        }
        return new jo.il(jlVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.il ilVar = (jo.il) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ilVar, "value");
        fVar.z0("markNotificationAsUnread");
        aa.c.b(aa.c.c(me.a, false)).b(fVar, wVar, ilVar.a);
    }
}
