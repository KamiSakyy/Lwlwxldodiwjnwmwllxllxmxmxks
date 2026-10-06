package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oc implements aaShadow.a {
    public static final oc a = new oc();
    public static final List b = sy.d0Shadow.n("markNotificationSubjectAsRead");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.vi viVar = null;
        while (eVar.r0(b) == 0) {
            viVar = (kc0.vi) aa.c.b(aa.c.c(pc.a, false)).a(eVar, wVar);
        }
        return new kc0.ui(viVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ui uiVar = (kc0.ui) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uiVar, "value");
        fVar.z0("markNotificationSubjectAsRead");
        aa.c.b(aa.c.c(pc.a, false)).b(fVar, wVar, uiVar.a);
    }
}
