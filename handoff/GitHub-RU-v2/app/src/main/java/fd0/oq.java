package fd0;

import java.util.List;
import kc0.p20;
import kc0.v20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oq implements aaShadow.a {
    public static final oq a = new oq();
    public static final List b = sy.d0.o(new String[]{"pullRequestReview", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v20 v20Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                v20Var = (v20) aa.c.b(aa.c.c(uq.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
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
            return new p20(v20Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p20 p20Var = (p20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p20Var, "value");
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(uq.a, false)).b(fVar, wVar, p20Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p20Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p20Var.c);
    }
}
