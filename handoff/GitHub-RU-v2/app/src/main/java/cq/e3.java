package cq;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "relatedItems"});

    public static d3 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                arrayList = aa.c.a(aa.c.c(f3.a, true)).c(eVar, wVar);
            }
        }
        eVar.s0();
        i3 c = k3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (arrayList != null) {
            return new d3(str, arrayList, c);
        }
        k41.b.B(eVar, "relatedItems");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, d3 d3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d3Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, d3Var.a);
        fVar.z0("relatedItems");
        aa.c.a(aa.c.c(f3.a, true)).e(fVar, wVar, d3Var.b);
        List list = k3.a;
        k3.d(fVar, wVar, d3Var.c);
    }
}
