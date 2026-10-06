package px0;

import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import pz0.gu;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "isDraft", "number", "pullRequestState", "repository", "isInMergeQueue", "titleHTML"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0019. Please report as an issue. */
    public static ox0.p c(ea.e eVar, aa.w wVar) {
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
        gu guVar = null;
        ox0.j0 j0Var = null;
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
                            nextLong = f4Shadow.c(1, nextLong, "substring(...)");
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
                    gu.Companion.getClass();
                    Iterator it = gu.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((gu) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    gu guVar2 = (gu) obj;
                    guVar = guVar2 == null ? gu.v : guVar2;
                    bool3 = bool6;
                    num = num2;
                    bool4 = bool2;
                case 5:
                    j0Var = (ox0.j0) aa.c.c(i0.a, false).a(eVar, wVar);
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
            if (guVar == null) {
                k41.b.B(eVar, "pullRequestState");
                throw null;
            }
            if (j0Var == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (bool8 == null) {
                k41.b.B(eVar, "isInMergeQueue");
                throw null;
            }
            boolean booleanValue2 = bool8.booleanValue();
            if (str3 != null) {
                return new ox0.p(str, str2, booleanValue, intValue, guVar, j0Var, booleanValue2, str3);
            }
            k41.b.B(eVar, "titleHTML");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, ox0.p pVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, pVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, pVar.b);
        fVar.z0("isDraft");
        aa.b bVar2 = aa.c.f;
        f4Shadow.C(pVar.c, bVar2, fVar, wVar, "number");
        fVar.z(pVar.d);
        fVar.z0("pullRequestState");
        fVar.I(pVar.e.r);
        fVar.z0("repository");
        aa.c.c(i0.a, false).b(fVar, wVar, pVar.f);
        fVar.z0("isInMergeQueue");
        f4Shadow.C(pVar.g, bVar2, fVar, wVar, "titleHTML");
        bVar.b(fVar, wVar, pVar.h);
    }
}
