package bm0;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r0 implements aa.a {
    public static final r0 a = new r0();
    public static final List b = sy.d0.o(new String[]{"unreadCount", "count", "list"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        Integer num2 = null;
        am0.t0 t0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                long nextLong2 = eVar.nextLong();
                if (nextLong2 > 2147483647L) {
                    while (nextLong2 > 2147483647L) {
                        nextLong2 = f4.c(1, nextLong2, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong2);
                } else {
                    num2 = Integer.valueOf((int) nextLong2);
                }
            } else {
                if (r0 != 2) {
                    break;
                }
                t0Var = (am0.t0) aa.c.c(q0.a, true).a(eVar, wVar);
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
        if (t0Var != null) {
            return new am0.u0(intValue, intValue2, t0Var);
        }
        k41.b.B(eVar, "list");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        am0.u0 u0Var = (am0.u0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u0Var, "value");
        fVar.z0("unreadCount");
        fVar.z(u0Var.a);
        fVar.z0("count");
        fVar.z(u0Var.b);
        fVar.z0("list");
        aa.c.c(q0.a, true).b(fVar, wVar, u0Var.c);
    }
}
