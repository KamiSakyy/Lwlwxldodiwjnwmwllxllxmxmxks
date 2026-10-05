package mo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"repository", "name", "url", "id"});

    public static n c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d0 d0Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                d0Var = (d0) aa.c.c(l1.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (d0Var == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (str3 != null) {
            return new n(d0Var, str, str2, str3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, n nVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nVar, "value");
        fVar.z0("repository");
        aa.c.c(l1.a, false).b(fVar, wVar, nVar.a);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, nVar.b);
        fVar.z0("url");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, nVar.c);
        fVar.z0("id");
        bVar.b(fVar, wVar, nVar.d);
    }
}
