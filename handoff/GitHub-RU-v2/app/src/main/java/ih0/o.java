package ih0;

import aa.w;
import java.util.List;
import jo.f4;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements aa.a {
    public static final o a = new o();
    public static final List b = d0.n("totalCount");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        while (eVar.r0(b) == 0) {
            long nextLong = eVar.nextLong();
            if (nextLong > 2147483647L) {
                while (nextLong > 2147483647L) {
                    nextLong = f4.c(1, nextLong, "substring(...)");
                }
                num = Integer.valueOf((int) nextLong);
            } else {
                num = Integer.valueOf((int) nextLong);
            }
        }
        if (num != null) {
            return new l(num.intValue());
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        l lVar = (l) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lVar, "value");
        fVar.z0("totalCount");
        fVar.z(lVar.a);
    }

}
