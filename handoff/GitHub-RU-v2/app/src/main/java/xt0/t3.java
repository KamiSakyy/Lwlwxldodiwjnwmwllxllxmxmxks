package xt0;

import java.util.List;
import pz0.ot;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t3 implements aa.a {
    public static final t3 a = new t3();
    public static final List b = sy.d0.o(new String[]{"id", "reviewDecision", "totalCommentsCount", "__typename"});

    public static q3 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ot otVar = null;
        Integer num = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                otVar = (ot) aa.c.b(qz0.b.h).a(eVar, wVar);
            } else if (r0 == 2) {
                num = (Integer) aa.c.b(ro0.a.a).a(eVar, wVar);
            } else {
                if (r0 != 3) {
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
            return new q3(str, otVar, num, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, q3 q3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q3Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, q3Var.a);
        fVar.z0("reviewDecision");
        aa.c.b(qz0.b.h).b(fVar, wVar, q3Var.b);
        fVar.z0("totalCommentsCount");
        aa.c.b(ro0.a.a).b(fVar, wVar, q3Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, q3Var.d);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (q3) obj);
    }
}
