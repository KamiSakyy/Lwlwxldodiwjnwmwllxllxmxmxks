package sz;

import java.util.List;
import rz.r1;
import rz.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 implements aa.a {
    public static final r0 a = new r0();
    public static final List b = sy.d0.o("user", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t1 t1Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                t1Var = (t1) aa.c.b(aa.c.c(t0.a, false)).a(eVar, wVar);
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
            return new r1(t1Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r1 r1Var = (r1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r1Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(t0.a, false)).b(fVar, wVar, r1Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r1Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, r1Var.c);
    }
}
