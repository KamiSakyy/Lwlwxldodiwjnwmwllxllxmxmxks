package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class gg implements aa.a {
    public static final List a = sy.d0.n("reactions");

    public static u10.zn c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.bo boVar = null;
        while (eVar.r0(a) == 0) {
            boVar = (u10.bo) aa.c.c(ig.a, false).a(eVar, wVar);
        }
        if (boVar != null) {
            return new u10.zn(boVar);
        }
        k41.b.B(eVar, "reactions");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.zn znVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(znVar, "value");
        fVar.z0("reactions");
        aa.c.c(ig.a, false).b(fVar, wVar, znVar.a);
    }
}
