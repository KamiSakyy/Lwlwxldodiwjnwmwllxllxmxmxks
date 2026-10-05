package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class fc implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static jn0.xh c(ea.e eVar, aa.w wVar) {
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
        uu0.k3 c = uu0.r3.c(eVar, wVar);
        eVar.s0();
        uu0.o c2 = uu0.t.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jn0.xh(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.xh xhVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xhVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xhVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, xhVar.b);
        List list = uu0.r3.a;
        uu0.r3.d(fVar, wVar, xhVar.c);
        List list2 = uu0.t.a;
        uu0.t.d(fVar, wVar, xhVar.d);
    }
}
