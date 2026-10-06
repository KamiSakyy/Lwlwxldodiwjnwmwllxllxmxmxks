package px0;

import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s0 implements aa.a {
    public static final s0 a = new s0();
    public static final List b = sy.d0Shadow.o(new String[]{"unreadCount", "count", "list"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        Integer num2 = null;
        ox0.u0 u0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                long nextLong2 = eVar.nextLong();
                if (nextLong2 > 2147483647L) {
                    while (nextLong2 > 2147483647L) {
                        nextLong2 = f4Shadow.c(1, nextLong2, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong2);
                } else {
                    num2 = Integer.valueOf((int) nextLong2);
                }
            } else {
                if (r0 != 2) {
                    break;
                }
                u0Var = (ox0.u0) aa.c.c(r0.a, true).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "unreadCount");
            throw null;
        }
        int intValue = num.intValue();
        if (num2 == null) {
            k41.b.B(eVar, "count");
            throw null;
        }
        int intValue2 = num2.intValue();
        if (u0Var != null) {
            return new ox0.v0(intValue, intValue2, u0Var);
        }
        k41.b.B(eVar, "list");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ox0.v0 v0Var = (ox0.v0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v0Var, "value");
        fVar.z0("unreadCount");
        fVar.z(v0Var.a);
        fVar.z0("count");
        fVar.z(v0Var.b);
        fVar.z0("list");
        aa.c.c(r0.a, true).b(fVar, wVar, v0Var.c);
    }
}
