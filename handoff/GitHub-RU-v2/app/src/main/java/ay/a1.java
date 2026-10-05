package ay;

import java.util.List;
import zx.v1;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static v1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        ct.j0 c = ct.k0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new v1(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, v1 v1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, v1Var.b);
        List list = ct.k0.a;
        ct.j0 j0Var = v1Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j0Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, j0Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, j0Var.b);
        fVar.z0("timelineItems");
        aa.c.c(ct.n0.a, false).b(fVar, wVar, j0Var.c);
    }
}
