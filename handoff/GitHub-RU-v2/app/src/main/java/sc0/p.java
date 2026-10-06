package sc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements aa.a {
    public static final p a = new p();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        rc0.u uVar = null;
        while (eVar.r0(b) == 0) {
            uVar = (rc0.u) aa.c.b(aa.c.c(r.a, true)).a(eVar, wVar);
        }
        return new rc0.s(uVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rc0.s sVar = (rc0.s) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(r.a, true)).b(fVar, wVar, sVar.a);
    }
}
