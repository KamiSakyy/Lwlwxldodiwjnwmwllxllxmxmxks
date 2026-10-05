package p20;

import java.util.List;
import u10.q00;
import u10.y00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lp implements aa.a {
    public static final lp a = new lp();
    public static final List b = sy.d0.o("id", "issueOrPullRequest", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        q00 q00Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                q00Var = (q00) aa.c.b(aa.c.c(dp.a, true)).a(eVar, wVar);
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
            return new y00(str, q00Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y00 y00Var = (y00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y00Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y00Var.a);
        fVar.z0("issueOrPullRequest");
        aa.c.b(aa.c.c(dp.a, true)).b(fVar, wVar, y00Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, y00Var.c);
    }
}
