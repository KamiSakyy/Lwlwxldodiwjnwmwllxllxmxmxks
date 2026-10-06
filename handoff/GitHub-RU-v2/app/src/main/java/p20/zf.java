package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zf implements aaShadow.a {
    public static final zf a = new zf();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.tn tnVar = null;
        while (eVar.r0(b) == 0) {
            tnVar = (u10.tn) aa.c.c(cg.a, false).a(eVar, wVar);
        }
        if (tnVar != null) {
            return new u10.qn(tnVar);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.qn qnVar = (u10.qn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qnVar, "value");
        fVar.z0("viewer");
        aa.c.c(cg.a, false).b(fVar, wVar, qnVar.a);
    }
}
