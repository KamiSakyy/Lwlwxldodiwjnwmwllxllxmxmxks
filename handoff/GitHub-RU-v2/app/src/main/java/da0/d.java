package da0;

import aa.w;
import ca0.g;
import ea.f;
import java.util.List;
import jo.f4;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0.n("totalCount");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
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
            return new g(num.intValue());
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(f fVar, w wVar, Object obj) {
        g gVar = (g) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(gVar, "value");
        fVar.z0("totalCount");
        fVar.z(gVar.a);
    }
}
