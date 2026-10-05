package vn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"inputs", "id", "__typename"});

    public static h2 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.c(i2.a, false))).a(eVar, wVar);
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
            return new h2(str, str2, list);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, h2 h2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h2Var, "value");
        fVar.z0("inputs");
        aa.c.b(aa.c.a(aa.c.c(i2.a, false))).b(fVar, wVar, h2Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h2Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, h2Var.c);
    }
}
