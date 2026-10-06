package eo0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l3 implements aaShadow.a {
    public static final l3 a = new l3();
    public static final List b = sy.d0Shadow.o(new String[]{"language", "path", "matchCount", "snippets"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.j5 j5Var = null;
        String str = null;
        Integer num = null;
        ArrayList arrayList = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                j5Var = (jn0.j5) aa.c.b(aa.c.c(k3.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 3) {
                    break;
                }
                arrayList = aa.c.a(aa.c.c(n3.a, false)).c(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "path");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "matchCount");
            throw null;
        }
        int intValue = num.intValue();
        if (arrayList != null) {
            return new jn0.k5(j5Var, str, intValue, arrayList);
        }
        k41.b.B(eVar, "snippets");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.k5 k5Var = (jn0.k5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k5Var, "value");
        fVar.z0("language");
        aa.c.b(aa.c.c(k3.a, false)).b(fVar, wVar, k5Var.a);
        fVar.z0("path");
        aa.c.a.b(fVar, wVar, k5Var.b);
        fVar.z0("matchCount");
        fVar.z(k5Var.c);
        fVar.z0("snippets");
        aa.c.a(aa.c.c(n3.a, false)).e(fVar, wVar, k5Var.d);
    }
}
