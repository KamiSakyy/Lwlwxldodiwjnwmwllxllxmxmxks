package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dm implements aaShadow.a {
    public static final dm a = new dm();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.cw cwVar = null;
        while (eVar.r0(b) == 0) {
            cwVar = (kc0.cw) aa.c.b(aa.c.c(fm.a, false)).a(eVar, wVar);
        }
        return new kc0.aw(cwVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.aw awVar = (kc0.aw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(awVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(fm.a, false)).b(fVar, wVar, awVar.a);
    }
}
