package fd0;

import java.util.List;
import kc0.u40;
import kc0.v40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bs implements aaShadow.a {
    public static final bs a = new bs();
    public static final List b = sy.d0.o(new String[]{"number", "repository", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        v40 v40Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                v40Var = (v40) aa.c.c(cs.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "number");
            throw null;
        }
        int intValue = num.intValue();
        if (v40Var == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u40(intValue, v40Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u40 u40Var = (u40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u40Var, "value");
        fVar.z0("number");
        fVar.z(u40Var.a);
        fVar.z0("repository");
        aa.c.c(cs.a, false).b(fVar, wVar, u40Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u40Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, u40Var.d);
    }
}
