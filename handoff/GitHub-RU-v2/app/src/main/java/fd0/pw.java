package fd0;

import java.util.List;
import kc0.lb0;
import kc0.mb0;
import kc0.nb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pw implements aa.a {
    public static final pw a = new pw();
    public static final List b = sy.d0.o(new String[]{"user", "organization"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        nb0 nb0Var = null;
        mb0 mb0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                nb0Var = (nb0) aa.c.b(aa.c.c(rw.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new lb0(nb0Var, mb0Var);
                }
                mb0Var = (mb0) aa.c.b(aa.c.c(qw.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        lb0 lb0Var = (lb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lb0Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(rw.a, true)).b(fVar, wVar, lb0Var.a);
        fVar.z0("organization");
        aa.c.b(aa.c.c(qw.a, true)).b(fVar, wVar, lb0Var.b);
    }
}
