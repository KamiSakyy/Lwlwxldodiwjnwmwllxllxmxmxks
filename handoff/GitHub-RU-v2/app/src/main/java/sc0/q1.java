package sc0;

import java.util.List;
import jo.f4Shadow;
import wc0.i2;
import wc0.l2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q1 implements aa.a {
    public static final q1 a = new q1();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "totalCount"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            }
        }
        eVar.s0();
        i2 c = l2.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (num != null) {
            return new rc0.l2(str, num.intValue(), c);
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rc0.l2 l2Var = (rc0.l2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l2Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, l2Var.a);
        fVar.z0("totalCount");
        fVar.z(l2Var.b);
        List list = l2.a;
        l2.d(fVar, wVar, l2Var.c);
    }
}
