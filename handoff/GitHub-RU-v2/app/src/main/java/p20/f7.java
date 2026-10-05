package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f7 implements aa.a {
    public static final f7 a = new f7();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.xa xaVar = null;
        while (eVar.r0(b) == 0) {
            xaVar = (u10.xa) aa.c.b(aa.c.c(g7.a, true)).a(eVar, wVar);
        }
        return new u10.wa(xaVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.wa waVar = (u10.wa) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(waVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(g7.a, true)).b(fVar, wVar, waVar.a);
    }
}
