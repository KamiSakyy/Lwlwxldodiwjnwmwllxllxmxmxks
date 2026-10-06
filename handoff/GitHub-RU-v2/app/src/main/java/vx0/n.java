package vx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n implements aa.a {
    public static final n a = new n();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        wx0.c c = wx0.f.c(eVar, wVar);
        if (str != null) {
            return new ux0.w(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ux0.w wVar2 = (ux0.w) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wVar2, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, wVar2.a);
        List list = wx0.f.a;
        wx0.f.d(fVar, wVar, wVar2.b);
    }
}
