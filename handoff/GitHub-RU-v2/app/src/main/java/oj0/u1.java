package oj0;

import gn0.jr;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "databaseId", "contributorsCount", "defaultBranchRef", "branchInfo", "forkCount", "hasIssuesEnabled", "showActions", "homepageUrl", "isPrivate", "isArchived", "isTemplate", "isFork", "isEmpty", "isInOrganization", "issues", "name", "owner", "pullRequests", "refs", "readme", "repositoryTopics", "url", "shortDescriptionHTML", "descriptionHTML", "description", "viewerCanAdminister", "viewerCanPush", "viewerCanSubscribe", "viewerPermission", "watchers", "licenseInfo", "isDiscussionsEnabled", "discussionsCount", "parent", "releases", "latestRelease", "isViewersFavorite", "viewerHasBlockedContributors", "viewerBlockedByOwner", "mergeQueue"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0067. Please report as an issue. */
    public static f1 c(ea.e eVar, aa.w wVar) {
        Integer num;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Boolean bool11;
        Boolean bool12;
        Integer num2;
        Boolean bool13;
        Boolean bool14;
        Boolean bool15;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num3 = null;
        String str = null;
        String str2 = null;
        Integer num4 = null;
        Integer num5 = null;
        p0 p0Var = null;
        o0 o0Var = null;
        Boolean bool16 = null;
        Boolean bool17 = null;
        Boolean bool18 = null;
        String str3 = null;
        Boolean bool19 = null;
        Boolean bool20 = null;
        Boolean bool21 = null;
        Boolean bool22 = null;
        Boolean bool23 = null;
        Boolean bool24 = null;
        q0 q0Var = null;
        String str4 = null;
        w0 w0Var = null;
        y0 y0Var = null;
        a1 a1Var = null;
        z0 z0Var = null;
        c1 c1Var = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Boolean bool25 = null;
        Boolean bool26 = null;
        Boolean bool27 = null;
        jr jrVar = null;
        e1 e1Var = null;
        s0 s0Var = null;
        Integer num6 = null;
        Boolean bool28 = null;
        x0 x0Var = null;
        b1 b1Var = null;
        r0 r0Var = null;
        Boolean bool29 = null;
        Boolean bool30 = null;
        t0 t0Var = null;
        while (true) {
            Integer num7 = num3;
            switch (eVar.r0(a)) {
                case 0:
                    num = num7;
                    str = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 1:
                    num = num7;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 2:
                    num = num7;
                    num4 = (Integer) aa.c.b(od0.b.a).a(eVar, wVar);
                    num3 = num;
                case 3:
                    Integer num8 = num5;
                    bool = bool16;
                    bool2 = bool17;
                    bool3 = bool18;
                    bool4 = bool19;
                    bool5 = bool20;
                    bool6 = bool21;
                    bool7 = bool22;
                    bool8 = bool23;
                    bool9 = bool24;
                    bool10 = bool25;
                    bool11 = bool26;
                    bool12 = bool27;
                    num2 = num6;
                    bool13 = bool28;
                    bool14 = bool29;
                    bool15 = bool30;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num3 = valueOf;
                    num5 = num8;
                    bool16 = bool;
                    bool17 = bool2;
                    bool18 = bool3;
                    bool19 = bool4;
                    bool20 = bool5;
                    bool21 = bool6;
                    bool22 = bool7;
                    bool23 = bool8;
                    bool24 = bool9;
                    bool25 = bool10;
                    bool26 = bool11;
                    bool27 = bool12;
                    num6 = num2;
                    bool28 = bool13;
                    bool29 = bool14;
                    bool30 = bool15;
                case 4:
                    num = num7;
                    p0Var = (p0) aa.c.b(aa.c.c(h1.a, true)).a(eVar, wVar);
                    num3 = num;
                case 5:
                    num = num7;
                    o0Var = (o0) aa.c.b(aa.c.c(g1.a, true)).a(eVar, wVar);
                    num3 = num;
                case 6:
                    bool = bool16;
                    bool2 = bool17;
                    bool3 = bool18;
                    bool4 = bool19;
                    bool5 = bool20;
                    bool6 = bool21;
                    bool7 = bool22;
                    bool8 = bool23;
                    bool9 = bool24;
                    bool10 = bool25;
                    bool11 = bool26;
                    bool12 = bool27;
                    num2 = num6;
                    bool13 = bool28;
                    bool14 = bool29;
                    bool15 = bool30;
                    long nextLong2 = eVar.nextLong();
                    if (nextLong2 > 2147483647L) {
                        while (nextLong2 > 2147483647L) {
                            nextLong2 = jo.f4.c(1, nextLong2, "substring(...)");
                        }
                        valueOf2 = Integer.valueOf((int) nextLong2);
                    } else {
                        valueOf2 = Integer.valueOf((int) nextLong2);
                    }
                    num5 = valueOf2;
                    num3 = num7;
                    bool16 = bool;
                    bool17 = bool2;
                    bool18 = bool3;
                    bool19 = bool4;
                    bool20 = bool5;
                    bool21 = bool6;
                    bool22 = bool7;
                    bool23 = bool8;
                    bool24 = bool9;
                    bool25 = bool10;
                    bool26 = bool11;
                    bool27 = bool12;
                    num6 = num2;
                    bool28 = bool13;
                    bool29 = bool14;
                    bool30 = bool15;
                case 7:
                    num = num7;
                    bool16 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 8:
                    num = num7;
                    bool17 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 9:
                    num = num7;
                    str3 = (String) aa.c.i.a(eVar, wVar);
                    num3 = num;
                case 10:
                    num = num7;
                    bool18 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 11:
                    num = num7;
                    bool19 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 12:
                    num = num7;
                    bool20 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 13:
                    num = num7;
                    bool21 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 14:
                    num = num7;
                    bool22 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 15:
                    num = num7;
                    bool23 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 16:
                    num = num7;
                    q0Var = (q0) aa.c.c(i1.a, false).a(eVar, wVar);
                    num3 = num;
                case 17:
                    num = num7;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 18:
                    num = num7;
                    w0Var = (w0) aa.c.c(o1.a, true).a(eVar, wVar);
                    num3 = num;
                case 19:
                    num = num7;
                    y0Var = (y0) aa.c.c(q1.a, false).a(eVar, wVar);
                    num3 = num;
                case 20:
                    num = num7;
                    a1Var = (a1) aa.c.b(aa.c.c(s1.a, false)).a(eVar, wVar);
                    num3 = num;
                case 21:
                    num = num7;
                    z0Var = (z0) aa.c.b(aa.c.c(r1.a, false)).a(eVar, wVar);
                    num3 = num;
                case 22:
                    num = num7;
                    c1Var = (c1) aa.c.c(v1.a, false).a(eVar, wVar);
                    num3 = num;
                case 23:
                    num = num7;
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 24:
                    num = num7;
                    str6 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 25:
                    num = num7;
                    str7 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 26:
                    num = num7;
                    str8 = (String) aa.c.i.a(eVar, wVar);
                    num3 = num;
                case 27:
                    num = num7;
                    bool24 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 28:
                    num = num7;
                    bool25 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 29:
                    num = num7;
                    bool26 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 30:
                    num = num7;
                    jrVar = (jr) aa.c.b(hn0.b.h).a(eVar, wVar);
                    num3 = num;
                case 31:
                    num = num7;
                    e1Var = (e1) aa.c.c(x1.a, false).a(eVar, wVar);
                    num3 = num;
                case 32:
                    num = num7;
                    s0Var = (s0) aa.c.b(aa.c.c(k1.a, true)).a(eVar, wVar);
                    num3 = num;
                case 33:
                    num = num7;
                    bool27 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 34:
                    Integer num9 = num5;
                    Boolean bool31 = bool16;
                    Boolean bool32 = bool17;
                    Boolean bool33 = bool18;
                    Boolean bool34 = bool19;
                    Boolean bool35 = bool20;
                    Boolean bool36 = bool21;
                    Boolean bool37 = bool22;
                    Boolean bool38 = bool23;
                    Boolean bool39 = bool24;
                    Boolean bool40 = bool25;
                    Boolean bool41 = bool26;
                    Boolean bool42 = bool27;
                    bool13 = bool28;
                    bool14 = bool29;
                    bool15 = bool30;
                    long nextLong3 = eVar.nextLong();
                    if (nextLong3 > 2147483647L) {
                        while (nextLong3 > 2147483647L) {
                            nextLong3 = jo.f4.c(1, nextLong3, "substring(...)");
                        }
                        valueOf3 = Integer.valueOf((int) nextLong3);
                    } else {
                        valueOf3 = Integer.valueOf((int) nextLong3);
                    }
                    num6 = valueOf3;
                    num3 = num7;
                    num5 = num9;
                    bool16 = bool31;
                    bool17 = bool32;
                    bool18 = bool33;
                    bool19 = bool34;
                    bool20 = bool35;
                    bool21 = bool36;
                    bool22 = bool37;
                    bool23 = bool38;
                    bool24 = bool39;
                    bool25 = bool40;
                    bool26 = bool41;
                    bool27 = bool42;
                    bool28 = bool13;
                    bool29 = bool14;
                    bool30 = bool15;
                case 35:
                    num = num7;
                    x0Var = (x0) aa.c.b(aa.c.c(p1.a, false)).a(eVar, wVar);
                    num3 = num;
                case 36:
                    num = num7;
                    b1Var = (b1) aa.c.c(t1.a, false).a(eVar, wVar);
                    num3 = num;
                case 37:
                    num = num7;
                    r0Var = (r0) aa.c.b(aa.c.c(j1.a, false)).a(eVar, wVar);
                    num3 = num;
                case 38:
                    num = num7;
                    bool28 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 39:
                    num = num7;
                    bool29 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 40:
                    num = num7;
                    bool30 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 41:
                    num = num7;
                    t0Var = (t0) aa.c.b(aa.c.c(l1.a, true)).a(eVar, wVar);
                    num3 = num;
            }
            eVar.s0();
            h c = m.c(eVar, wVar);
            eVar.s0();
            ek0.f fVar = ek0.f.a;
            ek0.b c2 = ek0.f.c(eVar, wVar);
            eVar.s0();
            wk0.u0 c3 = wk0.x0.c(eVar, wVar);
            eVar.s0();
            f4 f4Var = f4.a;
            a4 c4 = f4.c(eVar, wVar);
            eVar.s0();
            t3 t3Var = t3.a;
            q3 c5 = t3.c(eVar, wVar);
            if (str == null) {
                k41.b.B(eVar, "__typename");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (num7 == null) {
                k41.b.B(eVar, "contributorsCount");
                throw null;
            }
            Integer num10 = num5;
            int intValue = num7.intValue();
            if (num10 == null) {
                k41.b.B(eVar, "forkCount");
                throw null;
            }
            Boolean bool43 = bool16;
            int intValue2 = num10.intValue();
            if (bool43 == null) {
                k41.b.B(eVar, "hasIssuesEnabled");
                throw null;
            }
            Boolean bool44 = bool17;
            boolean booleanValue = bool43.booleanValue();
            if (bool44 == null) {
                k41.b.B(eVar, "showActions");
                throw null;
            }
            Boolean bool45 = bool18;
            boolean booleanValue2 = bool44.booleanValue();
            if (bool45 == null) {
                k41.b.B(eVar, "isPrivate");
                throw null;
            }
            Boolean bool46 = bool19;
            boolean booleanValue3 = bool45.booleanValue();
            if (bool46 == null) {
                k41.b.B(eVar, "isArchived");
                throw null;
            }
            Boolean bool47 = bool20;
            boolean booleanValue4 = bool46.booleanValue();
            if (bool47 == null) {
                k41.b.B(eVar, "isTemplate");
                throw null;
            }
            Boolean bool48 = bool21;
            boolean booleanValue5 = bool47.booleanValue();
            if (bool48 == null) {
                k41.b.B(eVar, "isFork");
                throw null;
            }
            Boolean bool49 = bool22;
            boolean booleanValue6 = bool48.booleanValue();
            if (bool49 == null) {
                k41.b.B(eVar, "isEmpty");
                throw null;
            }
            Boolean bool50 = bool23;
            boolean booleanValue7 = bool49.booleanValue();
            if (bool50 == null) {
                k41.b.B(eVar, "isInOrganization");
                throw null;
            }
            Boolean bool51 = bool24;
            boolean booleanValue8 = bool50.booleanValue();
            if (q0Var == null) {
                k41.b.B(eVar, "issues");
                throw null;
            }
            if (str4 == null) {
                k41.b.B(eVar, "name");
                throw null;
            }
            if (w0Var == null) {
                k41.b.B(eVar, "owner");
                throw null;
            }
            if (y0Var == null) {
                k41.b.B(eVar, "pullRequests");
                throw null;
            }
            if (c1Var == null) {
                k41.b.B(eVar, "repositoryTopics");
                throw null;
            }
            if (str5 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (str6 == null) {
                k41.b.B(eVar, "shortDescriptionHTML");
                throw null;
            }
            if (str7 == null) {
                k41.b.B(eVar, "descriptionHTML");
                throw null;
            }
            if (bool51 == null) {
                k41.b.B(eVar, "viewerCanAdminister");
                throw null;
            }
            Boolean bool52 = bool25;
            boolean booleanValue9 = bool51.booleanValue();
            if (bool52 == null) {
                k41.b.B(eVar, "viewerCanPush");
                throw null;
            }
            Boolean bool53 = bool26;
            boolean booleanValue10 = bool52.booleanValue();
            if (bool53 == null) {
                k41.b.B(eVar, "viewerCanSubscribe");
                throw null;
            }
            Boolean bool54 = bool27;
            boolean booleanValue11 = bool53.booleanValue();
            if (e1Var == null) {
                k41.b.B(eVar, "watchers");
                throw null;
            }
            if (bool54 == null) {
                k41.b.B(eVar, "isDiscussionsEnabled");
                throw null;
            }
            Integer num11 = num6;
            boolean booleanValue12 = bool54.booleanValue();
            if (num11 == null) {
                k41.b.B(eVar, "discussionsCount");
                throw null;
            }
            Boolean bool55 = bool28;
            int intValue3 = num11.intValue();
            if (b1Var == null) {
                k41.b.B(eVar, "releases");
                throw null;
            }
            if (bool55 == null) {
                k41.b.B(eVar, "isViewersFavorite");
                throw null;
            }
            Boolean bool56 = bool29;
            boolean booleanValue13 = bool55.booleanValue();
            if (bool56 == null) {
                k41.b.B(eVar, "viewerHasBlockedContributors");
                throw null;
            }
            Boolean bool57 = bool30;
            boolean booleanValue14 = bool56.booleanValue();
            if (bool57 != null) {
                return new f1(str, str2, num4, intValue, p0Var, o0Var, intValue2, booleanValue, booleanValue2, str3, booleanValue3, booleanValue4, booleanValue5, booleanValue6, booleanValue7, booleanValue8, q0Var, str4, w0Var, y0Var, a1Var, z0Var, c1Var, str5, str6, str7, str8, booleanValue9, booleanValue10, booleanValue11, jrVar, e1Var, s0Var, booleanValue12, intValue3, x0Var, b1Var, r0Var, booleanValue13, booleanValue14, bool57.booleanValue(), t0Var, c, c2, c3, c4, c5);
            }
            k41.b.B(eVar, "viewerBlockedByOwner");
            throw null;
        }
    }
}
