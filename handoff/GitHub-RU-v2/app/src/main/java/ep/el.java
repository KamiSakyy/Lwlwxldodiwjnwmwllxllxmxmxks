package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class el implements aaShadow.a {
    public static final el a = new el();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.tuShadow tuVar = null;
        while (eVar.r0(b) == 0) {
            tuVar = (jo.tu) aa.c.b(aa.c.c(hl.a, true)).a(eVar, wVar);
        }
        return new jo.qu(tuVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.qu quVar = (jo.qu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(quVar, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(hl.a, true)).b(fVar, wVar, quVar.a);
    }
}
