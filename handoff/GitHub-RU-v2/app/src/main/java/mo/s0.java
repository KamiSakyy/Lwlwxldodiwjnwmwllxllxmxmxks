package mo;

import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"repository", "number", "url", "id"});

    public static k c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        a0 a0Var = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                a0Var = (a0) aa.c.c(i1.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (a0Var == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "number");
            throw null;
        }
        int intValue = num.intValue();
        if (str == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (str2 != null) {
            return new k(a0Var, intValue, str, str2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, k kVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("repository");
        aa.c.c(i1.a, false).b(fVar, wVar, kVar.a);
        fVar.z0("number");
        fVar.z(kVar.b);
        fVar.z0("url");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, kVar.c);
        fVar.z0("id");
        bVar.b(fVar, wVar, kVar.d);
    }
}
