package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pb implements aa.a {
    public static final pb a = new pb();
    public static final List b = sy.d0.o(new String[]{"actor", "lockedRecord"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ah ahVar = null;
        kc0.eh ehVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ahVar = (kc0.ah) aa.c.b(aa.c.c(nb.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new kc0.dh(ahVar, ehVar);
                }
                ehVar = (kc0.eh) aa.c.b(aa.c.c(qb.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.dh dhVar = (kc0.dh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dhVar, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(nb.a, true)).b(fVar, wVar, dhVar.a);
        fVar.z0("lockedRecord");
        aa.c.b(aa.c.c(qb.a, true)).b(fVar, wVar, dhVar.b);
    }
}
