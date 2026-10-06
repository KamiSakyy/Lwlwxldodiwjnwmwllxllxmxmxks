package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class tj implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("watchers");

    public static u10.ts c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.vs vsVar = null;
        while (eVar.r0(a) == 0) {
            vsVar = (u10.vs) aa.c.c(vj.a, false).a(eVar, wVar);
        }
        if (vsVar != null) {
            return new u10.ts(vsVar);
        }
        k41.b.B(eVar, "watchers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.ts tsVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tsVar, "value");
        fVar.z0("watchers");
        aa.c.c(vj.a, false).b(fVar, wVar, tsVar.a);
    }
}
