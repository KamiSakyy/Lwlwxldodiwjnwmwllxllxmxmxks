package px0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x implements aa.a {
    public static final List a = x61.l.r(new String[]{"organization", "slug", "id"});

    public static ox0.y c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ox0.c0 c0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                c0Var = (ox0.c0) aa.c.c(b0.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (c0Var == null) {
            k41.b.B(eVar, "organization");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "slug");
            throw null;
        }
        if (str2 != null) {
            return new ox0.y(c0Var, str, str2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, ox0.y yVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yVar, "value");
        fVar.z0("organization");
        aa.c.c(b0.a, false).b(fVar, wVar, yVar.a);
        fVar.z0("slug");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, yVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, yVar.c);
    }
}
