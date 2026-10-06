package fy;

import aa.w;
import ey.t;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import m10.v90;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q implements aa.a {
    public static final q a = new q();
    public static final List b = d0Shadow.o("count", "state");

    public final Object a(ea.e eVar, w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        v90 v90Var = null;
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
            } else {
                if (r0 != 1) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                v90.Companion.getClass();
                Iterator it = v90.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((v90) obj).r.equals(u)) {
                        break;
                    }
                }
                v90 v90Var2 = (v90) obj;
                v90Var = v90Var2 == null ? v90.t : v90Var2;
            }
        }
        if (num == null) {
            k41.b.B(eVar, "count");
            throw null;
        }
        int intValue = num.intValue();
        if (v90Var != null) {
            return new t(intValue, v90Var);
        }
        k41.b.B(eVar, "state");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        t tVar = (t) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tVar, "value");
        fVar.z0("count");
        fVar.z(tVar.a);
        fVar.z0("state");
        fVar.I(tVar.b.r);
    }

}
