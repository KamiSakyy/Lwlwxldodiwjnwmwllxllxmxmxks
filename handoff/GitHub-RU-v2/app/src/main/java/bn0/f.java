package bn0;

import aa.w;
import java.util.ArrayList;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f implements aa.a {
    public static final List a = l.r(new String[]{"language", "repository", "matchCount", "path", "refName", "snippets"});

    public static e c(ea.e eVar, w wVar) {
        Integer num;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        a aVar = null;
        c cVar = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                num = num2;
                aVar = (a) aa.c.b(aa.c.c(g.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                num = num2;
                cVar = (c) aa.c.b(aa.c.c(i.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong);
                } else {
                    num2 = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 3) {
                num = num2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                num = num2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                num = num2;
                arrayList = aa.c.a(aa.c.c(j.a, false)).c(eVar, wVar);
            }
            num2 = num;
        }
        Integer num3 = num2;
        if (num3 == null) {
            k41.b.B(eVar, "matchCount");
            throw null;
        }
        int intValue = num3.intValue();
        if (str == null) {
            k41.b.B(eVar, "path");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "refName");
            throw null;
        }
        if (arrayList != null) {
            return new e(aVar, cVar, intValue, str, str2, arrayList);
        }
        k41.b.B(eVar, "snippets");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, e eVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(eVar, "value");
        fVar.z0("language");
        aa.c.b(aa.c.c(g.a, false)).b(fVar, wVar, eVar.a);
        fVar.z0("repository");
        aa.c.b(aa.c.c(i.a, false)).b(fVar, wVar, eVar.b);
        fVar.z0("matchCount");
        fVar.z(eVar.c);
        fVar.z0("path");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, eVar.d);
        fVar.z0("refName");
        bVar.b(fVar, wVar, eVar.e);
        fVar.z0("snippets");
        aa.c.a(aa.c.c(j.a, false)).e(fVar, wVar, eVar.f);
    }

}
