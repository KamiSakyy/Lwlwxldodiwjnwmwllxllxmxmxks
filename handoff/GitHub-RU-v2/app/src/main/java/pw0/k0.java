package pw0;

import java.util.List;
import ow0.u0;
import ow0.x0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k0 implements aa.a {
    public static final k0 a = new k0();
    public static final List b = sy.d0.o(new String[]{"id", "issueOrPullRequest", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u0 u0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                u0Var = (u0) aa.c.b(aa.c.c(h0.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new x0(str, u0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x0 x0Var = (x0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x0Var.a);
        fVar.z0("issueOrPullRequest");
        aa.c.b(aa.c.c(h0.a, true)).b(fVar, wVar, x0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, x0Var.c);
    }
}
