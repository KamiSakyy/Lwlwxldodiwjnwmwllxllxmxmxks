package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pe implements aaShadow.a {
    public static final pe a = new pe();
    public static final List b = sy.d0Shadow.n("markNotificationSubjectAsRead");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.rl rlVar = null;
        while (eVar.r0(b) == 0) {
            rlVar = (jo.rl) aa.c.b(aa.c.c(qe.a, false)).a(eVar, wVar);
        }
        return new jo.ql(rlVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ql qlVar = (jo.ql) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qlVar, "value");
        fVar.z0("markNotificationSubjectAsRead");
        aa.c.b(aa.c.c(qe.a, false)).b(fVar, wVar, qlVar.a);
    }
}
