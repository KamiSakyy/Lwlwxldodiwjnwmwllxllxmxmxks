package fd0;

import java.util.List;
import kc0.d40;
import kc0.g40;
import kc0.h40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rr implements aa.a {
    public static final rr a = new rr();
    public static final List b = sy.d0.o(new String[]{"actor", "unlockedRecord"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d40 d40Var = null;
        h40 h40Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                d40Var = (d40) aa.c.b(aa.c.c(pr.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new g40(d40Var, h40Var);
                }
                h40Var = (h40) aa.c.b(aa.c.c(sr.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g40 g40Var = (g40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g40Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(pr.a, true)).b(fVar, wVar, g40Var.a);
        fVar.z0("unlockedRecord");
        aa.c.b(aa.c.c(sr.a, true)).b(fVar, wVar, g40Var.b);
    }
}
