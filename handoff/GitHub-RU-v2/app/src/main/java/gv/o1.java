package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "headRefOid", "viewerCanEditFiles", "baseRefName", "headRefName", "additions", "deletions", "headRepository", "headRepositoryOwner", "repository", "diff", "pendingReviews", "files"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002e. Please report as an issue. */
    public static h1 c(ea.e eVar, aa.w wVar) {
        Integer num;
        Integer valueOf;
        Integer valueOf2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num2 = null;
        String str4 = null;
        String str5 = null;
        Integer num3 = null;
        u0 u0Var = null;
        v0 v0Var = null;
        f1 f1Var = null;
        p0 p0Var = null;
        e1 e1Var = null;
        t0 t0Var = null;
        while (true) {
            Boolean bool2 = bool;
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    bool = bool2;
                case 1:
                    num = num2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                    bool = bool2;
                case 2:
                    num = num2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                    bool = bool2;
                case 3:
                    bool = (Boolean) aa.c.f.a(eVar, wVar);
                    num2 = num2;
                case 4:
                    num = num2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                    bool = bool2;
                case 5:
                    num = num2;
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                    bool = bool2;
                case 6:
                    String str6 = str;
                    Integer num4 = num3;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4.c(1, nextLong, "substring(...)");
                        }
                        valueOf2 = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf2 = Integer.valueOf((int) nextLong);
                    }
                    str = str6;
                    bool = bool2;
                    num3 = num4;
                    num2 = valueOf2;
                case 7:
                    num = num2;
                    String str7 = str;
                    long nextLong2 = eVar.nextLong();
                    if (nextLong2 > 2147483647L) {
                        while (nextLong2 > 2147483647L) {
                            nextLong2 = jo.f4.c(1, nextLong2, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong2);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong2);
                    }
                    num3 = valueOf;
                    str = str7;
                    num2 = num;
                    bool = bool2;
                case 8:
                    u0Var = (u0) aa.c.b(aa.c.c(p1.a, false)).a(eVar, wVar);
                    bool = bool2;
                case 9:
                    v0Var = (v0) aa.c.b(aa.c.c(q1.a, false)).a(eVar, wVar);
                    bool = bool2;
                case 10:
                    f1Var = (f1) aa.c.c(a2.a, true).a(eVar, wVar);
                    bool = bool2;
                case 11:
                    p0Var = (p0) aa.c.b(aa.c.c(j1.a, false)).a(eVar, wVar);
                    bool = bool2;
                case 12:
                    e1Var = (e1) aa.c.b(aa.c.c(z1.a, false)).a(eVar, wVar);
                    bool = bool2;
                case 13:
                    t0Var = (t0) aa.c.b(aa.c.c(n1.a, false)).a(eVar, wVar);
                    bool = bool2;
            }
            eVar.s0();
            j0 j0Var = j0.a;
            f0 c = j0.c(eVar, wVar);
            if (str == null) {
                k41.b.B(eVar, "__typename");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (str3 == null) {
                k41.b.B(eVar, "headRefOid");
                throw null;
            }
            if (bool2 == null) {
                k41.b.B(eVar, "viewerCanEditFiles");
                throw null;
            }
            Integer num5 = num2;
            boolean booleanValue = bool2.booleanValue();
            if (str4 == null) {
                k41.b.B(eVar, "baseRefName");
                throw null;
            }
            if (str5 == null) {
                k41.b.B(eVar, "headRefName");
                throw null;
            }
            if (num5 == null) {
                k41.b.B(eVar, "additions");
                throw null;
            }
            Integer num6 = num3;
            int intValue = num5.intValue();
            if (num6 == null) {
                k41.b.B(eVar, "deletions");
                throw null;
            }
            int intValue2 = num6.intValue();
            if (f1Var != null) {
                return new h1(str, str2, str3, booleanValue, str4, str5, intValue, intValue2, u0Var, v0Var, f1Var, p0Var, e1Var, t0Var, c);
            }
            k41.b.B(eVar, "repository");
            throw null;
        }
    }
}
