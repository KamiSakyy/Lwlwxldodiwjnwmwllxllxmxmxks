package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dj implements aaShadow.a {
    public static final dj a = new dj();
    public static final List b = sy.d0Shadow.n("removeStar");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.wr wrVar = null;
        while (eVar.r0(b) == 0) {
            wrVar = (kc0.wr) aa.c.b(aa.c.c(ej.a, false)).a(eVar, wVar);
        }
        return new kc0.vr(wrVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.vr vrVar = (kc0.vr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vrVar, "value");
        fVar.z0("removeStar");
        aa.c.b(aa.c.c(ej.a, false)).b(fVar, wVar, vrVar.a);
    }
}
