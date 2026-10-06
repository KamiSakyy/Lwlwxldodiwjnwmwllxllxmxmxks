package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nj implements aaShadow.a {
    public static final nj a = new nj();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ns nsVar = null;
        while (eVar.r0(b) == 0) {
            nsVar = (kc0.ns) aa.c.b(aa.c.c(pj.a, true)).a(eVar, wVar);
        }
        return new kc0.ls(nsVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ls lsVar = (kc0.ls) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lsVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(pj.a, true)).b(fVar, wVar, lsVar.a);
    }
}
