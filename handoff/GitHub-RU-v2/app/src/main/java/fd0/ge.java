package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ge implements aaShadow.a {
    public static final ge a = new ge();
    public static final List b = sy.d0.n("minimizeComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.jl jlVar = null;
        while (eVar.r0(b) == 0) {
            jlVar = (kc0.jl) aa.c.b(aa.c.c(he.a, false)).a(eVar, wVar);
        }
        return new kc0.il(jlVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.il ilVar = (kc0.il) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ilVar, "value");
        fVar.z0("minimizeComment");
        aa.c.b(aa.c.c(he.a, false)).b(fVar, wVar, ilVar.a);
    }
}
