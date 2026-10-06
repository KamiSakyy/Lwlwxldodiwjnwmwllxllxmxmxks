package z70;

import hc0.nl;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k3 implements aa.a {
    public static final k3 a = new k3();
    public static final List b = sy.d0Shadow.o("id", "reviewDecision", "totalCommentsCount", "__typename");

    public static i3 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        nl nlVar = null;
        Integer num = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                nlVar = (nl) aa.c.b(ic0.b.b).a(eVar, wVar);
            } else if (r0 == 2) {
                num = (Integer) aa.c.b(y20.a.a).a(eVar, wVar);
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
            return new i3(str, nlVar, num, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, i3 i3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i3Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i3Var.a);
        fVar.z0("reviewDecision");
        aa.c.b(ic0.b.b).b(fVar, wVar, i3Var.b);
        fVar.z0("totalCommentsCount");
        aa.c.b(y20.a.a).b(fVar, wVar, i3Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, i3Var.d);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (i3) obj);
    }
}
