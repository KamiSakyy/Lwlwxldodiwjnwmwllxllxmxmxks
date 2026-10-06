package lv;

import aa.w;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "displayName", "isCopilot", "url"});

    public static k c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "displayName");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "isCopilot");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str3 != null) {
            return new k(str, str2, str3, booleanValue);
        }
        k41.b.B(eVar, "url");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, k kVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, kVar.a);
        fVar.z0("displayName");
        bVar.b(fVar, wVar, kVar.b);
        fVar.z0("isCopilot");
        f4Shadow.C(kVar.c, aa.c.f, fVar, wVar, "url");
        bVar.b(fVar, wVar, kVar.d);
    }
}
