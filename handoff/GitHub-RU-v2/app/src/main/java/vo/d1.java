package vo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "checkSuites", "__typename"});

    public static a1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        v0 v0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                v0Var = (v0) aa.c.b(aa.c.c(c1.a, false)).a(eVar, wVar);
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
            return new a1(str, v0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, a1 a1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, a1Var.a);
        fVar.z0("checkSuites");
        aa.c.b(aa.c.c(c1.a, false)).b(fVar, wVar, a1Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, a1Var.c);
    }
}
