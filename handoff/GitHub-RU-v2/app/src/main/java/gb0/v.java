package gb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v implements aa.a {
    public static final List a = x61.l.r(new String[]{"organization", "slug", "id"});

    public static fb0.w c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fb0.a0 a0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                a0Var = (fb0.a0) aa.c.c(z.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (a0Var == null) {
            k41.b.B(eVar, "organization");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "slug");
            throw null;
        }
        if (str2 != null) {
            return new fb0.w(a0Var, str, str2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, fb0.w wVar2) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wVar2, "value");
        fVar.z0("organization");
        aa.c.c(z.a, false).b(fVar, wVar, wVar2.a);
        fVar.z0("slug");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, wVar2.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, wVar2.c);
    }
}
