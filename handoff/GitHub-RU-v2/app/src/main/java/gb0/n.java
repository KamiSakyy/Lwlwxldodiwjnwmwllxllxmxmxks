package gb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "tagName", "url", "repository"});

    public static fb0.o c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        fb0.i0 i0Var = null;
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
                i0Var = (fb0.i0) aa.c.c(h0.a, false).a(eVar, wVar);
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
        if (i0Var != null) {
            return new fb0.o(str, str2, str3, i0Var);
        }
        k41.b.B(eVar, "repository");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, fb0.o oVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oVar.a);
        fVar.z0("tagName");
        bVar.b(fVar, wVar, oVar.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, oVar.c);
        fVar.z0("repository");
        aa.c.c(h0.a, false).b(fVar, wVar, oVar.d);
    }
}
