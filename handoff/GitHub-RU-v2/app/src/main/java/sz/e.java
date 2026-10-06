package sz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements aa.a {
    public static final e a = new e();
    public static final List b = sy.d0Shadow.n("clearProjectV2ItemFieldValue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        rz.f fVar = null;
        while (eVar.r0(b) == 0) {
            fVar = (rz.f) aa.c.b(aa.c.c(d.a, false)).a(eVar, wVar);
        }
        return new rz.h(fVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rz.h hVar = (rz.h) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("clearProjectV2ItemFieldValue");
        aa.c.b(aa.c.c(d.a, false)).b(fVar, wVar, hVar.a);
    }
}
