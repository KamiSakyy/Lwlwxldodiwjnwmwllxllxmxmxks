package ay;

import java.util.List;
import jo.f4;
import zx.k1;
import zx.l1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t0 implements aa.a {
    public static final t0 a = new t0();
    public static final List b = sy.d0.o("id", "planLimit", "suggestedActors", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        l1 l1Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
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
                l1Var = (l1) aa.c.c(u0.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "planLimit");
            throw null;
        }
        int intValue = num.intValue();
        if (l1Var == null) {
            k41.b.B(eVar, "suggestedActors");
            throw null;
        }
        if (str2 != null) {
            return new k1(str, intValue, l1Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k1 k1Var = (k1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k1Var.a);
        fVar.z0("planLimit");
        fVar.z(k1Var.b);
        fVar.z0("suggestedActors");
        aa.c.c(u0.a, false).b(fVar, wVar, k1Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k1Var.d);
    }
}
