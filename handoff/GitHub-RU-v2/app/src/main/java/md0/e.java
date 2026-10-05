package md0;

import aa.w;
import java.util.List;
import jo.f4;
import k71.k;
import ld0.f;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements aa.a {
    public static final e a = new e();
    public static final List b = d0.o(new String[]{"id", "planLimit", "assignableUsers", "__typename"});

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        ld0.a aVar = null;
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
                aVar = (ld0.a) aa.c.c(a.a, false).a(eVar, wVar);
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
        if (aVar == null) {
            k41.b.B(eVar, "assignableUsers");
            throw null;
        }
        if (str2 != null) {
            return new f(str, intValue, aVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        f fVar2 = (f) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(fVar2, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fVar2.a);
        fVar.z0("planLimit");
        fVar.z(fVar2.b);
        fVar.z0("assignableUsers");
        aa.c.c(a.a, false).b(fVar, wVar, fVar2.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, fVar2.d);
    }
}
