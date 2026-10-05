package fd0;

import java.util.List;
import kc0.vb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vw implements aa.a {
    public static final vw a = new vw();
    public static final List b = sy.d0.n("totalCount");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        while (eVar.r0(b) == 0) {
            long nextLong = eVar.nextLong();
            if (nextLong > 2147483647L) {
                while (nextLong > 2147483647L) {
                    nextLong = jo.f4.c(1, nextLong, "substring(...)");
                }
                num = Integer.valueOf((int) nextLong);
            } else {
                num = Integer.valueOf((int) nextLong);
            }
        }
        if (num != null) {
            return new vb0(num.intValue());
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        vb0 vb0Var = (vb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vb0Var, "value");
        fVar.z0("totalCount");
        fVar.z(vb0Var.a);
    }
}
