package nc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"url", "team", "id"});

    public static q c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        f0 f0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                f0Var = (f0) aa.c.c(m1.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (f0Var == null) {
            k41.b.B(eVar, "team");
            throw null;
        }
        if (str2 != null) {
            return new q(str, f0Var, str2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, q qVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qVar, "value");
        fVar.z0("url");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qVar.a);
        fVar.z0("team");
        aa.c.c(m1.a, false).b(fVar, wVar, qVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, qVar.c);
    }
}
