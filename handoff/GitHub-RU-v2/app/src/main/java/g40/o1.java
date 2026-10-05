package g40;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o1 implements aa.a {
    public static final o1 a = new o1();
    public static final List b = sy.d0.o("__typename", "avatarUrl", "name", "user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        k1 k1Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                k1Var = (k1) aa.c.b(aa.c.c(r1.a, false)).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new h1(str, str2, str3, k1Var);
        }
        k41.b.B(eVar, "avatarUrl");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h1 h1Var = (h1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h1Var.a);
        fVar.z0("avatarUrl");
        bVar.b(fVar, wVar, h1Var.b);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, h1Var.c);
        fVar.z0("user");
        aa.c.b(aa.c.c(r1.a, false)).b(fVar, wVar, h1Var.d);
    }
}
