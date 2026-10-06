package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m8 implements aaShadow.a {
    public static final m8 a = new m8();
    public static final List b = sy.d0.n("topic");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.xc xcVar = null;
        while (eVar.r0(b) == 0) {
            xcVar = (kc0.xc) aa.c.b(aa.c.c(q8.a, false)).a(eVar, wVar);
        }
        return new kc0.tc(xcVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.tc tcVar = (kc0.tc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tcVar, "value");
        fVar.z0("topic");
        aa.c.b(aa.c.c(q8.a, false)).b(fVar, wVar, tcVar.a);
    }
}
