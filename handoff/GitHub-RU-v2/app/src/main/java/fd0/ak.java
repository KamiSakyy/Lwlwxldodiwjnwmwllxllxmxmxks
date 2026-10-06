package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ak implements aaShadow.a {
    public static final ak a = new ak();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ht htVar = null;
        while (eVar.r0(b) == 0) {
            htVar = (kc0.ht) aa.c.b(aa.c.c(dk.a, true)).a(eVar, wVar);
        }
        return new kc0.et(htVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.et etVar = (kc0.et) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(etVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(dk.a, true)).b(fVar, wVar, etVar.a);
    }
}
