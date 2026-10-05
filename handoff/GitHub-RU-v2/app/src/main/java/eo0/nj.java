package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class nj implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "target", "message", "name", "commitUrl", "tagger"});

    public static jn0.js c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.ts tsVar = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        jn0.ss ssVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                tsVar = (jn0.ts) aa.c.c(xj.a, true).a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                str4 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                ssVar = (jn0.ss) aa.c.b(aa.c.c(wj.a, false)).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (tsVar == null) {
            k41.b.B(eVar, "target");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str4 != null) {
            return new jn0.js(str, tsVar, str2, str3, str4, ssVar);
        }
        k41.b.B(eVar, "commitUrl");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.js jsVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jsVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jsVar.a);
        fVar.z0("target");
        aa.c.c(xj.a, true).b(fVar, wVar, jsVar.b);
        fVar.z0("message");
        aa.c.i.b(fVar, wVar, jsVar.c);
        fVar.z0("name");
        bVar.b(fVar, wVar, jsVar.d);
        fVar.z0("commitUrl");
        bVar.b(fVar, wVar, jsVar.e);
        fVar.z0("tagger");
        aa.c.b(aa.c.c(wj.a, false)).b(fVar, wVar, jsVar.f);
    }
}
