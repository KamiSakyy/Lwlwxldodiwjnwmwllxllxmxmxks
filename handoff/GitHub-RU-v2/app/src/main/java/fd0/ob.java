package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ob implements aaShadow.a {
    public static final ob a = new ob();
    public static final List b = sy.d0.n("lockLockable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.dh dhVar = null;
        while (eVar.r0(b) == 0) {
            dhVar = (kc0.dh) aa.c.b(aa.c.c(pb.a, false)).a(eVar, wVar);
        }
        return new kc0.ch(dhVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ch chVar = (kc0.ch) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(chVar, "value");
        fVar.z0("lockLockable");
        aa.c.b(aa.c.c(pb.a, false)).b(fVar, wVar, chVar.a);
    }
}
