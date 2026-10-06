package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements aaShadow.a {
    public static final m a = new m();
    public static final List b = sy.d0.n("pollOption");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.w wVar2 = null;
        while (eVar.r0(b) == 0) {
            wVar2 = (jo.w) aa.c.b(aa.c.c(p.a, false)).a(eVar, wVar);
        }
        return new jo.s(wVar2);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.s sVar = (jo.s) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sVar, "value");
        fVar.z0("pollOption");
        aa.c.b(aa.c.c(p.a, false)).b(fVar, wVar, sVar.a);
    }
}
