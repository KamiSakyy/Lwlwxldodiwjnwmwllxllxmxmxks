package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ke implements aaShadow.a {
    public static final ke a = new ke();
    public static final List b = sy.d0.n("mobileEventsUpdate");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.pl plVar = null;
        while (eVar.r0(b) == 0) {
            plVar = (kc0.pl) aa.c.b(aa.c.c(le.a, false)).a(eVar, wVar);
        }
        return new kc0.ol(plVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ol olVar = (kc0.ol) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(olVar, "value");
        fVar.z0("mobileEventsUpdate");
        aa.c.b(aa.c.c(le.a, false)).b(fVar, wVar, olVar.a);
    }
}
