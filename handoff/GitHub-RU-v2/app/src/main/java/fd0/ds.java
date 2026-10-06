package fd0;

import java.util.List;
import kc0.u40;
import kc0.w40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ds implements aaShadow.a {
    public static final ds a = new ds();
    public static final List b = sy.d0.o(new String[]{"clientMutationId", "pullRequest"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u40 u40Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new w40(str, u40Var);
                }
                u40Var = (u40) aa.c.b(aa.c.c(bs.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w40 w40Var = (w40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w40Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, w40Var.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(bs.a, false)).b(fVar, wVar, w40Var.b);
    }
}
