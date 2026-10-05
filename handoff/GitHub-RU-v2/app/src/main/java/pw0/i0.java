package pw0;

import java.util.List;
import ow0.v0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static v0 c(ea.e eVar, aa.w wVar) {
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
        ur0.d0 c = ur0.e0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new v0(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, v0 v0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, v0Var.b);
        List list = ur0.e0.a;
        ur0.d0 d0Var = v0Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d0Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, d0Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, d0Var.b);
        fVar.z0("timelineItems");
        aa.c.c(ur0.h0.a, false).b(fVar, wVar, d0Var.c);
    }
}
