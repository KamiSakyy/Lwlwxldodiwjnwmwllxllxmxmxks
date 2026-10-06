package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ub implements aaShadow.a {
    public static final ub a = new ub();
    public static final List b = sy.d0.n("markNotificationSubjectAsRead");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.th thVar = null;
        while (eVar.r0(b) == 0) {
            thVar = (u10.th) aa.c.b(aa.c.c(vb.a, false)).a(eVar, wVar);
        }
        return new u10.sh(thVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.sh shVar = (u10.sh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(shVar, "value");
        fVar.z0("markNotificationSubjectAsRead");
        aa.c.b(aa.c.c(vb.a, false)).b(fVar, wVar, shVar.a);
    }
}
