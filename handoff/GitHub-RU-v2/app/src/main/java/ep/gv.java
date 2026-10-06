package ep;

import java.util.List;
import jo.b90;
import jo.v80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gvShadow implements aaShadow.a {
    public static final gvShadow a = new gvShadow();
    public static final List b = sy.d0Shadow.o("pullRequestReview", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b90 b90Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                b90Var = (b90) aa.c.b(aa.c.c(mv.a, false)).a(eVar, wVar);
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
            return new v80(b90Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v80 v80Var = (v80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v80Var, "value");
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(mv.a, false)).b(fVar, wVar, v80Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v80Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, v80Var.c);
    }
}
