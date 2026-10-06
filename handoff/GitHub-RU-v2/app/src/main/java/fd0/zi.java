package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zi implements aaShadow.a {
    public static final zi a = new zi();
    public static final List b = sy.d0.o(new String[]{"subject", "reaction"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.or orVar = null;
        kc0.mr mrVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                orVar = (kc0.or) aa.c.b(aa.c.c(aj.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new kc0.nr(orVar, mrVar);
                }
                mrVar = (kc0.mr) aa.c.b(aa.c.c(yi.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.nr nrVar = (kc0.nr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nrVar, "value");
        fVar.z0("subject");
        aa.c.b(aa.c.c(aj.a, true)).b(fVar, wVar, nrVar.a);
        fVar.z0("reaction");
        aa.c.b(aa.c.c(yi.a, false)).b(fVar, wVar, nrVar.b);
    }
}
