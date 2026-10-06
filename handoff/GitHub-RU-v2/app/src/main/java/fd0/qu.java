package fd0;

import java.util.List;
import kc0.b80;
import kc0.j80;
import kc0.k80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qu implements aaShadow.a {
    public static final qu a = new qu();
    public static final List b = sy.d0Shadow.o(new String[]{"actor", "pullRequest"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b80 b80Var = null;
        j80 j80Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                b80Var = (b80) aa.c.b(aa.c.c(iu.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new k80(b80Var, j80Var);
                }
                j80Var = (j80) aa.c.b(aa.c.c(pu.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k80 k80Var = (k80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k80Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(iu.a, true)).b(fVar, wVar, k80Var.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(pu.a, true)).b(fVar, wVar, k80Var.b);
    }
}
