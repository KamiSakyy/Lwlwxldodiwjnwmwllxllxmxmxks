package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "headRefOid", "viewerCanEditFiles", "baseRefName", "headRefName", "additions", "deletions", "headRepository", "headRepositoryOwner", "repository", "diff", "pendingReviews", "files"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002e. Please report as an issue. */
    public static x0 c(ea.e eVar, aa.w wVar) {
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
        k0 k0Var = null;
        l0 l0Var = null;
        v0 v0Var = null;
        f0 f0Var = null;
        u0 u0Var = null;
        j0 j0Var = null;
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
                    k0Var = (k0) aa.c.b(aa.c.c(f1.a, false)).a(eVar, wVar);
                    bool = bool2;
                case 9:
                    l0Var = (l0) aa.c.b(aa.c.c(g1.a, false)).a(eVar, wVar);
                    bool = bool2;
                case 10:
                    v0Var = (v0) aa.c.c(q1.a, true).a(eVar, wVar);
                    bool = bool2;
                case 11:
                    f0Var = (f0) aa.c.b(aa.c.c(z0.a, false)).a(eVar, wVar);
                    bool = bool2;
                case 12:
                    u0Var = (u0) aa.c.b(aa.c.c(p1.a, false)).a(eVar, wVar);
                    bool = bool2;
                case 13:
                    j0Var = (j0) aa.c.b(aa.c.c(d1.a, false)).a(eVar, wVar);
                    bool = bool2;
            }
            eVar.s0();
            z zVar = z.a;
            v c = z.c(eVar, wVar);
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
            if (v0Var != null) {
                return new x0(str, str2, str3, booleanValue, str4, str5, intValue, intValue2, k0Var, l0Var, v0Var, f0Var, u0Var, j0Var, c);
            }
            k41.b.B(eVar, "repository");
            throw null;
        }
    }
}
