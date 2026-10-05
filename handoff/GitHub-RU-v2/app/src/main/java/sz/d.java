package sz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = sy.d0.n("projectV2Item");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        rz.i iVar = null;
        while (eVar.r0(b) == 0) {
            iVar = (rz.i) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
        }
        return new rz.f(iVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rz.f fVar2 = (rz.f) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("projectV2Item");
        aa.c.b(aa.c.c(f.a, true)).b(fVar, wVar, fVar2.a);
    }
}
