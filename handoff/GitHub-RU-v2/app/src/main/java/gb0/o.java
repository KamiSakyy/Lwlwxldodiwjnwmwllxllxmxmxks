package gb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "owner", "name"});

    public static fb0.p c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        fb0.f0 f0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                f0Var = (fb0.f0) aa.c.c(e0.a, false).a(eVar, wVar);
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
        if (f0Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str2 != null) {
            return new fb0.p(str, f0Var, str2);
        }
        k41.b.B(eVar, "name");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, fb0.p pVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, pVar.a);
        fVar.z0("owner");
        aa.c.c(e0.a, false).b(fVar, wVar, pVar.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, pVar.c);
    }
}
