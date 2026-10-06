package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class he implements aaShadow.a {
    public static final he a = new he();
    public static final List b = sy.d0.n("minimizedComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.kl klVar = null;
        while (eVar.r0(b) == 0) {
            klVar = (kc0.kl) aa.c.b(aa.c.c(ie.a, true)).a(eVar, wVar);
        }
        return new kc0.jl(klVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.jl jlVar = (kc0.jl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jlVar, "value");
        fVar.z0("minimizedComment");
        aa.c.b(aa.c.c(ie.a, true)).b(fVar, wVar, jlVar.a);
    }
}
