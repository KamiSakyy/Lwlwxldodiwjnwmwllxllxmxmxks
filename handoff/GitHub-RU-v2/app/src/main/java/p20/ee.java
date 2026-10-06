package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ee implements aaShadow.a {
    public static final ee a = new ee();
    public static final List b = sy.d0.n("organization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.kl klVar = null;
        while (eVar.r0(b) == 0) {
            klVar = (u10.kl) aa.c.b(aa.c.c(ge.a, false)).a(eVar, wVar);
        }
        return new u10.il(klVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.il ilVar = (u10.il) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ilVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(ge.a, false)).b(fVar, wVar, ilVar.a);
    }
}
