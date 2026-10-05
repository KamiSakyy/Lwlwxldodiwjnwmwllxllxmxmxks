package mz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "tagName", "url", "repository"});

    public static lz.p c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        lz.k0 k0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                k0Var = (lz.k0) aa.c.c(j0.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "tagName");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (k0Var != null) {
            return new lz.p(str, str2, str3, k0Var);
        }
        k41.b.B(eVar, "repository");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, lz.p pVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, pVar.a);
        fVar.z0("tagName");
        bVar.b(fVar, wVar, pVar.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, pVar.c);
        fVar.z0("repository");
        aa.c.c(j0.a, false).b(fVar, wVar, pVar.d);
    }
}
