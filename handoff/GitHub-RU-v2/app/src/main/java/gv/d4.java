package gv;

import java.util.List;
import m10.jz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d4 implements aa.a {
    public static final d4 a = new d4();
    public static final List b = sy.d0.o("id", "reviewDecision", "totalCommentsCount", "__typename");

    public static a4 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jz jzVar = null;
        Integer num = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                jzVar = (jz) aa.c.b(n10.b.t).a(eVar, wVar);
            } else if (r0 == 2) {
                num = (Integer) aa.c.b(tp.a.a).a(eVar, wVar);
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
            return new a4(str, jzVar, num, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, a4 a4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a4Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, a4Var.a);
        fVar.z0("reviewDecision");
        aa.c.b(n10.b.t).b(fVar, wVar, a4Var.b);
        fVar.z0("totalCommentsCount");
        aa.c.b(tp.a.a).b(fVar, wVar, a4Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, a4Var.d);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (a4) obj);
    }
}
