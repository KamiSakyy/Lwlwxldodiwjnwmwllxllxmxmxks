package fd0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h3 implements aa.a {
    public static final h3 a = new h3();
    public static final List b = sy.d0.o(new String[]{"language", "path", "matchCount", "snippets"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.d5 d5Var = null;
        String str = null;
        Integer num = null;
        ArrayList arrayList = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                d5Var = (kc0.d5) aa.c.b(aa.c.c(g3.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 3) {
                    break;
                }
                arrayList = aa.c.a(aa.c.c(j3.a, false)).c(eVar, wVar);
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
            return new kc0.e5(d5Var, str, intValue, arrayList);
        }
        k41.b.B(eVar, "snippets");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.e5 e5Var = (kc0.e5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e5Var, "value");
        fVar.z0("language");
        aa.c.b(aa.c.c(g3.a, false)).b(fVar, wVar, e5Var.a);
        fVar.z0("path");
        aa.c.a.b(fVar, wVar, e5Var.b);
        fVar.z0("matchCount");
        fVar.z(e5Var.c);
        fVar.z0("snippets");
        aa.c.a(aa.c.c(j3.a, false)).e(fVar, wVar, e5Var.d);
    }
}
