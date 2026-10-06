package hp;

import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j implements aa.a {
    public static final List a = x61.l.r(new String[]{"avatarUrl", "bot", "displayName", "integrationId", "slug", "isCopilot"});

    public static h c(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        g gVar = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                num = num2;
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                num = num2;
                gVar = (g) aa.c.b(aa.c.c(i.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                num = num2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                Boolean bool2 = bool;
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4.c(1, nextLong, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong);
                } else {
                    num2 = Integer.valueOf((int) nextLong);
                }
                bool = bool2;
            } else if (r0 == 4) {
                num = num2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                num = num2;
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            }
            num2 = num;
        }
        Integer num3 = num2;
        if (str2 == null) {
            k41.b.B(eVar, "displayName");
            throw null;
        }
        if (num3 == null) {
            k41.b.B(eVar, "integrationId");
            throw null;
        }
        Boolean bool3 = bool;
        int intValue = num3.intValue();
        if (str3 == null) {
            k41.b.B(eVar, "slug");
            throw null;
        }
        if (bool3 != null) {
            return new h(str, gVar, str2, intValue, str3, bool3.booleanValue());
        }
        k41.b.B(eVar, "isCopilot");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, h hVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("avatarUrl");
        aa.c.i.b(fVar, wVar, hVar.a);
        fVar.z0("bot");
        aa.c.b(aa.c.c(i.a, false)).b(fVar, wVar, hVar.b);
        fVar.z0("displayName");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hVar.c);
        fVar.z0("integrationId");
        fVar.z(hVar.d);
        fVar.z0("slug");
        bVar.b(fVar, wVar, hVar.e);
        fVar.z0("isCopilot");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(hVar.f));
    }
}
