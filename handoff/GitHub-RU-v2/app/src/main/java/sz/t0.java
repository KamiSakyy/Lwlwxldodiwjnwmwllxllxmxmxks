package sz;

import java.util.List;
import rz.s1;
import rz.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t0 implements aa.a {
    public static final t0 a = new t0();
    public static final List b = sy.d0.o("recentProjects", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        s1 s1Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                s1Var = (s1) aa.c.c(s0.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (s1Var == null) {
            k41.b.B(eVar, "recentProjects");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new t1(s1Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t1 t1Var = (t1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t1Var, "value");
        fVar.z0("recentProjects");
        aa.c.c(s0.a, true).b(fVar, wVar, t1Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t1Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, t1Var.c);
    }
}
