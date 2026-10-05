package bm0;

import gn0.hn;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "isDraft", "number", "pullRequestState", "repository", "isInMergeQueue", "titleHTML"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0019. Please report as an issue. */
    public static am0.o c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Boolean bool2;
        Integer valueOf;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool3 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        Boolean bool4 = null;
        hn hnVar = null;
        am0.i0 i0Var = null;
        String str3 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool = bool3;
                    str = (String) aa.c.a.a(eVar, wVar);
                    bool3 = bool;
                case 1:
                    bool = bool3;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    bool3 = bool;
                case 2:
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                case 3:
                    Boolean bool5 = bool3;
                    bool2 = bool4;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num = valueOf;
                    bool3 = bool5;
                    bool4 = bool2;
                case 4:
                    Boolean bool6 = bool3;
                    Integer num2 = num;
                    bool2 = bool4;
                    String u = eVar.u();
                    k71.k.d(u);
                    hn.Companion.getClass();
                    Iterator it = hn.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((hn) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    hn hnVar2 = (hn) obj;
                    hnVar = hnVar2 == null ? hn.v : hnVar2;
                    bool3 = bool6;
                    num = num2;
                    bool4 = bool2;
                case 5:
                    i0Var = (am0.i0) aa.c.c(h0.a, false).a(eVar, wVar);
                    bool3 = bool3;
                    num = num;
                case 6:
                    bool = bool3;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool3 = bool;
                case 7:
                    bool = bool3;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    bool3 = bool;
            }
            Boolean bool7 = bool3;
            if (str == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (bool7 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            Integer num3 = num;
            boolean booleanValue = bool7.booleanValue();
            if (num3 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Boolean bool8 = bool4;
            int intValue = num3.intValue();
            if (hnVar == null) {
                k41.b.B(eVar, "pullRequestState");
                throw null;
            }
            if (i0Var == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (bool8 == null) {
                k41.b.B(eVar, "isInMergeQueue");
                throw null;
            }
            boolean booleanValue2 = bool8.booleanValue();
            if (str3 != null) {
                return new am0.o(str, str2, booleanValue, intValue, hnVar, i0Var, booleanValue2, str3);
            }
            k41.b.B(eVar, "titleHTML");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, am0.o oVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, oVar.b);
        fVar.z0("isDraft");
        aa.b bVar2 = aa.c.f;
        f4.C(oVar.c, bVar2, fVar, wVar, "number");
        fVar.z(oVar.d);
        fVar.z0("pullRequestState");
        fVar.I(oVar.e.r);
        fVar.z0("repository");
        aa.c.c(h0.a, false).b(fVar, wVar, oVar.f);
        fVar.z0("isInMergeQueue");
        f4.C(oVar.g, bVar2, fVar, wVar, "titleHTML");
        bVar.b(fVar, wVar, oVar.h);
    }
}
