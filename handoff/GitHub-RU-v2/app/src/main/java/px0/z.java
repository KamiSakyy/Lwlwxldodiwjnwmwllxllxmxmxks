package px0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z implements aa.a {
    public static final List a = x61.l.r(new String[]{"login", "userName", "id"});

    public static ox0.a0 c(ea.e eVar, aa.w wVar) {
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
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "login");
            throw null;
        }
        if (str3 != null) {
            return new ox0.a0(str, str2, str3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, ox0.a0 a0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a0Var, "value");
        fVar.z0("login");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, a0Var.a);
        fVar.z0("userName");
        aa.c.i.b(fVar, wVar, a0Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, a0Var.c);
    }
}
