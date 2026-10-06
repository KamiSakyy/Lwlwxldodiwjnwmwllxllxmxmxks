package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ga implements aaShadow.a {
    public static final ga a = new ga();
    public static final List b = sy.d0Shadow.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.gf gfVar = null;
        while (eVar.r0(b) == 0) {
            gfVar = (kc0.gf) aa.c.b(aa.c.c(ha.a, true)).a(eVar, wVar);
        }
        return new kc0.ff(gfVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ff ffVar = (kc0.ff) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ffVar, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(ha.a, true)).b(fVar, wVar, ffVar.a);
    }
}
