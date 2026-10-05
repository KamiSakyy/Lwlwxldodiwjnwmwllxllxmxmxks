package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kk implements aa.a {
    public static final kk a = new kk();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.st stVar = null;
        while (eVar.r0(b) == 0) {
            stVar = (u10.st) aa.c.b(aa.c.c(lk.a, false)).a(eVar, wVar);
        }
        return new u10.rt(stVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.rt rtVar = (u10.rt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rtVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(lk.a, false)).b(fVar, wVar, rtVar.a);
    }
}
