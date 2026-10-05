package hz0;

import aa.w;
import java.util.List;
import jo.f4;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = d0.o(new String[]{"color", "id", "name"});

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
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
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "color");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        int intValue = num.intValue();
        if (str2 != null) {
            return new a(str, intValue, str2);
        }
        k41.b.B(eVar, "name");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        a aVar = (a) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("color");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, aVar.a);
        fVar.z0("id");
        fVar.z(aVar.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, aVar.c);
    }

}
