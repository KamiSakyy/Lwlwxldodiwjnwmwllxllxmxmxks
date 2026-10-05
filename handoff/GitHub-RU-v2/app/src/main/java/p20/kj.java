package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kj implements aa.a {
    public static final kj a = new kj();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ks ksVar = null;
        while (eVar.r0(b) == 0) {
            ksVar = (u10.ks) aa.c.b(aa.c.c(mj.a, true)).a(eVar, wVar);
        }
        return new u10.is(ksVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.is isVar = (u10.is) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(isVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(mj.a, true)).b(fVar, wVar, isVar.a);
    }
}
