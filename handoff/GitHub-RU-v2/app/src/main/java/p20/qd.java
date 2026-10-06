package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qd implements aaShadow.a {
    public static final qd a = new qd();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.qk qkVar = null;
        while (eVar.r0(b) == 0) {
            qkVar = (u10.qk) aa.c.c(sd.a, false).a(eVar, wVar);
        }
        if (qkVar != null) {
            return new u10.ok(qkVar);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ok okVar = (u10.ok) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(okVar, "value");
        fVar.z0("viewer");
        aa.c.c(sd.a, false).b(fVar, wVar, okVar.a);
    }
}
