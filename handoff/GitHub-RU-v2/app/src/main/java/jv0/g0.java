package jv0;

import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"term", "name", "negative", "value"});

    public static m c(ea.e eVar, aa.w wVar) {
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
            k41.b.B(eVar, "term");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "negative");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str3 != null) {
            return new m(str, str2, str3, booleanValue);
        }
        k41.b.B(eVar, "value");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, m mVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mVar, "value");
        fVar.z0("term");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, mVar.b);
        fVar.z0("negative");
        f4Shadow.C(mVar.c, aa.c.f, fVar, wVar, "value");
        bVar.b(fVar, wVar, mVar.d);
    }
}
