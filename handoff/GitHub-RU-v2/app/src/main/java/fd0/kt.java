package fd0;

import java.util.List;
import kc0.j60;
import kc0.n60;
import kc0.s60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kt implements aaShadow.a {
    public static final kt a = new kt();
    public static final List b = sy.d0Shadow.o(new String[]{"actor", "issue"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j60 j60Var = null;
        n60 n60Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                j60Var = (j60) aa.c.b(aa.c.c(bt.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new s60(j60Var, n60Var);
                }
                n60Var = (n60) aa.c.b(aa.c.c(et.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s60 s60Var = (s60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s60Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(bt.a, true)).b(fVar, wVar, s60Var.a);
        fVar.z0("issue");
        aa.c.b(aa.c.c(et.a, true)).b(fVar, wVar, s60Var.b);
    }
}
