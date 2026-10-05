package w80;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o3 implements aa.a {
    public static final o3 a = new o3();
    public static final List b = sy.d0.o("__typename", "id", "stargazerCount", "viewerHasStarred");

    public static m3 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Integer num = null;
        Boolean bool = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
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
                if (r0 != 3) {
                    break;
                }
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "stargazerCount");
            throw null;
        }
        int intValue = num.intValue();
        if (bool != null) {
            return new m3(intValue, str, str2, bool.booleanValue());
        }
        k41.b.B(eVar, "viewerHasStarred");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, m3 m3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m3Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m3Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, m3Var.b);
        fVar.z0("stargazerCount");
        fVar.z(m3Var.c);
        fVar.z0("viewerHasStarred");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(m3Var.d));
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (m3) obj);
    }
}
