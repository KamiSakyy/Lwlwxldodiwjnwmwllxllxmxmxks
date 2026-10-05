package tz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "name"});

    public static u0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u0(str, str2);
        }
        k41.b.B(eVar, "name");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u0 u0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u0Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, u0Var.b);
    }
}
