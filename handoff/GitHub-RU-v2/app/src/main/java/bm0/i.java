package bm0;

import gn0.u9;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "number", "discussionStateReason", "answer", "repository"});

    public static am0.j c(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        u9 u9Var = null;
        am0.a aVar = null;
        am0.k0 k0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                num = num2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                num = num2;
                str2 = (String) aa.c.a.a(eVar, wVar);
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
                u9Var = (u9) aa.c.b(hn0.a.o).a(eVar, wVar);
            } else if (r0 == 4) {
                num = num2;
                aVar = (am0.a) aa.c.b(aa.c.c(a.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                num = num2;
                k0Var = (am0.k0) aa.c.c(j0.a, false).a(eVar, wVar);
            }
            num2 = num;
        }
        Integer num3 = num2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (num3 == null) {
            k41.b.B(eVar, "number");
            throw null;
        }
        int intValue = num3.intValue();
        if (k0Var != null) {
            return new am0.j(str, str2, intValue, u9Var, aVar, k0Var);
        }
        k41.b.B(eVar, "repository");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, am0.j jVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, jVar.b);
        fVar.z0("number");
        fVar.z(jVar.c);
        fVar.z0("discussionStateReason");
        aa.c.b(hn0.a.o).b(fVar, wVar, jVar.d);
        fVar.z0("answer");
        aa.c.b(aa.c.c(a.a, false)).b(fVar, wVar, jVar.e);
        fVar.z0("repository");
        aa.c.c(j0.a, false).b(fVar, wVar, jVar.f);
    }
}
