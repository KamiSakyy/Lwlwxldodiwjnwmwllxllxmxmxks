package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jh implements aaShadow.a {
    public static final jh a = new jh();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.up upVar = null;
        while (eVar.r0(b) == 0) {
            upVar = (kc0.up) aa.c.b(aa.c.c(oh.a, false)).a(eVar, wVar);
        }
        return new kc0.pp(upVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.pp ppVar = (kc0.pp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ppVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(oh.a, false)).b(fVar, wVar, ppVar.a);
    }
}
