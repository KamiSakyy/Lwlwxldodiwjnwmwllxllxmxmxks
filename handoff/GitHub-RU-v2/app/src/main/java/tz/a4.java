package tz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "login", "userAvatar"});

    public static s1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "login");
            throw null;
        }
        if (str3 != null) {
            return new s1(str, str2, str3);
        }
        k41.b.B(eVar, "userAvatar");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, s1 s1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, s1Var.a);
        fVar.z0("login");
        bVar.b(fVar, wVar, s1Var.b);
        fVar.z0("userAvatar");
        bVar.b(fVar, wVar, s1Var.c);
    }
}
