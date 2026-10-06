package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class w6 implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("discussion");

    public static u10.ha c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.fa faVar = null;
        while (eVar.r0(a) == 0) {
            faVar = (u10.fa) aa.c.b(aa.c.c(u6.a, false)).a(eVar, wVar);
        }
        return new u10.ha(faVar);
    }

    public static void d(ea.f fVar, aa.w wVar, u10.ha haVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(haVar, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(u6.a, false)).b(fVar, wVar, haVar.a);
    }
}
