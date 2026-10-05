package c20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static b20.s1 c(ea.e eVar, aa.w wVar) {
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
        g20.a1 c = g20.d1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new b20.s1(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, b20.s1 s1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, s1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, s1Var.b);
        List list = g20.d1.a;
        g20.d1.d(fVar, wVar, s1Var.c);
    }
}
