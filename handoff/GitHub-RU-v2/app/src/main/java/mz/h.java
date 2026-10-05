package mz;

import java.util.List;
import jo.f4;
import m10.zd;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "number", "discussionStateReason", "answer", "repository"});

    public static lz.i c(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        zd zdVar = null;
        lz.a aVar = null;
        lz.l0 l0Var = null;
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
                        nextLong = f4.c(1, nextLong, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong);
                } else {
                    num2 = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 3) {
                num = num2;
                zdVar = (zd) aa.c.b(n10.a.B).a(eVar, wVar);
            } else if (r0 == 4) {
                num = num2;
                aVar = (lz.a) aa.c.b(aa.c.c(a.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                num = num2;
                l0Var = (lz.l0) aa.c.c(k0.a, false).a(eVar, wVar);
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
        if (l0Var != null) {
            return new lz.i(str, str2, intValue, zdVar, aVar, l0Var);
        }
        k41.b.B(eVar, "repository");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, lz.i iVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, iVar.b);
        fVar.z0("number");
        fVar.z(iVar.c);
        fVar.z0("discussionStateReason");
        aa.c.b(n10.a.B).b(fVar, wVar, iVar.d);
        fVar.z0("answer");
        aa.c.b(aa.c.c(a.a, false)).b(fVar, wVar, iVar.e);
        fVar.z0("repository");
        aa.c.c(k0.a, false).b(fVar, wVar, iVar.f);
    }
}
