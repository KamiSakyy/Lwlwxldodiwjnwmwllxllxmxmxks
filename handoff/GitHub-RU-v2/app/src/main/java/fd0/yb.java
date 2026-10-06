package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yb implements aaShadow.a {
    public static final yb a = new yb();
    public static final List b = sy.d0.o(new String[]{"clientMutationId", "pullRequest"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.sh shVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new kc0.qh(str, shVar);
                }
                shVar = (kc0.sh) aa.c.b(aa.c.c(ac.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.qh qhVar = (kc0.qh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qhVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, qhVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(ac.a, false)).b(fVar, wVar, qhVar.b);
    }
}
