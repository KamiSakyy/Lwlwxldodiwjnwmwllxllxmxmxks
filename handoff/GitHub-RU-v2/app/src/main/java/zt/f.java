package zt;

import aa.w;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "login", "isCopilot", "displayName", "id"});

    public static a c(ea.e eVar, w wVar) {
        Boolean bool;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str4 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        eVar.s0();
        eq.g c = eq.h.c(eVar, wVar);
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "login");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "isCopilot");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str3 == null) {
            k41.b.B(eVar, "displayName");
            throw null;
        }
        if (str4 != null) {
            return new a(str, str2, booleanValue, str3, str4, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, a aVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, aVar.a);
        fVar.z0("login");
        bVar.b(fVar, wVar, aVar.b);
        fVar.z0("isCopilot");
        f4Shadow.C(aVar.c, aa.c.f, fVar, wVar, "displayName");
        bVar.b(fVar, wVar, aVar.d);
        fVar.z0("id");
        bVar.b(fVar, wVar, aVar.e);
        List list = eq.h.a;
        eq.h.d(fVar, wVar, aVar.f);
    }
}
