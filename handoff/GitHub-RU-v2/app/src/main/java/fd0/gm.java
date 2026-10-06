package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gm implements aaShadow.a {
    public static final gm a = new gm();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.iw iwVar = null;
        while (eVar.r0(b) == 0) {
            iwVar = (kc0.iw) aa.c.b(aa.c.c(jm.a, false)).a(eVar, wVar);
        }
        return new kc0.fw(iwVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.fw fwVar = (kc0.fw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fwVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(jm.a, false)).b(fVar, wVar, fwVar.a);
    }
}
