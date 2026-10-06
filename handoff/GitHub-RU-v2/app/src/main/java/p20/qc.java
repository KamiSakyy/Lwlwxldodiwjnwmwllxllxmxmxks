package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class qc implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("mentionableItems");

    public static u10.aj c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ui uiVar = null;
        while (eVar.r0(a) == 0) {
            uiVar = (u10.ui) aa.c.b(aa.c.c(kc.a, false)).a(eVar, wVar);
        }
        return new u10.aj(uiVar);
    }

    public static void d(ea.f fVar, aa.w wVar, u10.aj ajVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ajVar, "value");
        fVar.z0("mentionableItems");
        aa.c.b(aa.c.c(kc.a, false)).b(fVar, wVar, ajVar.a);
    }
}
