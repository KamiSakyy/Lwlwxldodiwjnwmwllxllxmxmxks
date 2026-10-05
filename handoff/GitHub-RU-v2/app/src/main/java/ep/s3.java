package ep;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s3 implements aa.a {
    public static final s3 a = new s3();
    public static final List b = sy.d0.o("language", "path", "matchCount", "snippets");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.t5 t5Var = null;
        String str = null;
        Integer num = null;
        ArrayList arrayList = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                t5Var = (jo.t5) aa.c.b(aa.c.c(r3.a, false)).a(eVar, wVar);
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
                arrayList = aa.c.a(aa.c.c(u3.a, false)).c(eVar, wVar);
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
            return new jo.u5(t5Var, str, intValue, arrayList);
        }
        k41.b.B(eVar, "snippets");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.u5 u5Var = (jo.u5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u5Var, "value");
        fVar.z0("language");
        aa.c.b(aa.c.c(r3.a, false)).b(fVar, wVar, u5Var.a);
        fVar.z0("path");
        aa.c.a.b(fVar, wVar, u5Var.b);
        fVar.z0("matchCount");
        fVar.z(u5Var.c);
        fVar.z0("snippets");
        aa.c.a(aa.c.c(u3.a, false)).e(fVar, wVar, u5Var.d);
    }
}
