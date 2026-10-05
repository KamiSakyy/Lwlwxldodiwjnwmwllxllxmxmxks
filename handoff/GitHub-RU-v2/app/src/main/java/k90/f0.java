package k90;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"term", "name", "negative", "value", "loginRef"});

    public static j c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        c cVar = null;
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
                cVar = (c) aa.c.b(aa.c.c(y.a, true)).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "term");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "negative");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str3 != null) {
            return new j(str, str2, booleanValue, str3, cVar);
        }
        k41.b.B(eVar, "value");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, j jVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("term");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, jVar.b);
        fVar.z0("negative");
        f4.C(jVar.c, aa.c.f, fVar, wVar, "value");
        bVar.b(fVar, wVar, jVar.d);
        fVar.z0("loginRef");
        aa.c.b(aa.c.c(y.a, true)).b(fVar, wVar, jVar.e);
    }
}
