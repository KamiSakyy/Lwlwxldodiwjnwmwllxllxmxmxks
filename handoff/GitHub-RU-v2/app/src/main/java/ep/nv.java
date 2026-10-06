package ep;

import java.util.List;
import jo.c90;
import jo.u80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nvShadow implements aaShadow.a {
    public static final nvShadow a = new nvShadow();
    public static final List b = sy.d0Shadow.o("id", "issueOrPullRequest", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u80 u80Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                u80Var = (u80) aa.c.b(aa.c.c(fv.a, true)).a(eVar, wVar);
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
            return new c90(str, u80Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c90 c90Var = (c90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c90Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c90Var.a);
        fVar.z0("issueOrPullRequest");
        aa.c.b(aa.c.c(fv.a, true)).b(fVar, wVar, c90Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, c90Var.c);
    }
}
