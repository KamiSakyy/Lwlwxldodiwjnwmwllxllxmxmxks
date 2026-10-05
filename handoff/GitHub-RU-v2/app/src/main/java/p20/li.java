package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class li implements aa.a {
    public static final li a = new li();
    public static final List b = sy.d0.n("subject");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.yq yqVar = null;
        while (eVar.r0(b) == 0) {
            yqVar = (u10.yq) aa.c.b(aa.c.c(mi.a, true)).a(eVar, wVar);
        }
        return new u10.xq(yqVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.xq xqVar = (u10.xq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xqVar, "value");
        fVar.z0("subject");
        aa.c.b(aa.c.c(mi.a, true)).b(fVar, wVar, xqVar.a);
    }
}
