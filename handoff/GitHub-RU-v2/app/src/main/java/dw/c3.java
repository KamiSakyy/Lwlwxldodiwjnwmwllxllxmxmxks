package dw;

import java.util.List;
import m10.n40;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "databaseId", "contributorsCount", "defaultBranchRef", "branchInfo", "forkCount", "hasIssuesEnabled", "showActions", "homepageUrl", "isPrivate", "isArchived", "isTemplate", "isFork", "forkingAllowed", "isEmpty", "isInOrganization", "issues", "name", "owner", "pullRequests", "refs", "readme", "repositoryTopics", "url", "shortDescriptionHTML", "descriptionHTML", "description", "viewerCanAdminister", "viewerCanPush", "viewerCanSubscribe", "viewerPermission", "watchers", "licenseInfo", "isDiscussionsEnabled", "discussionsCount", "parent", "releases", "latestRelease", "isViewersFavorite", "viewerHasBlockedContributors", "viewerBlockedByOwner", "mergeQueue", "projectsV2", "forks", "isCopilotAgentEnabled"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x006f. Please report as an issue. */
    public static k2 c(ea.e eVar, aa.w wVar) {
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
        Boolean bool13;
        Integer num2;
        Boolean bool14;
        Boolean bool15;
        Boolean bool16;
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
        r1 r1Var = null;
        q1 q1Var = null;
        Boolean bool17 = null;
        Boolean bool18 = null;
        Boolean bool19 = null;
        String str3 = null;
        Boolean bool20 = null;
        Boolean bool21 = null;
        Boolean bool22 = null;
        Boolean bool23 = null;
        Boolean bool24 = null;
        Boolean bool25 = null;
        Boolean bool26 = null;
        t1 t1Var = null;
        String str4 = null;
        a2 a2Var = null;
        d2 d2Var = null;
        f2 f2Var = null;
        e2 e2Var = null;
        h2 h2Var = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Boolean bool27 = null;
        Boolean bool28 = null;
        Boolean bool29 = null;
        n40 n40Var = null;
        j2 j2Var = null;
        v1 v1Var = null;
        Integer num6 = null;
        Boolean bool30 = null;
        b2 b2Var = null;
        g2 g2Var = null;
        u1 u1Var = null;
        Boolean bool31 = null;
        Boolean bool32 = null;
        w1 w1Var = null;
        c2 c2Var = null;
        s1 s1Var = null;
        Boolean bool33 = null;
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
                    num4 = (Integer) aa.c.b(tp.a.a).a(eVar, wVar);
                    num3 = num;
                case 3:
                    Integer num8 = num5;
                    bool = bool17;
                    bool2 = bool18;
                    bool3 = bool19;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    bool9 = bool25;
                    bool10 = bool26;
                    bool11 = bool27;
                    bool12 = bool28;
                    bool13 = bool29;
                    num2 = num6;
                    bool14 = bool30;
                    bool15 = bool31;
                    bool16 = bool32;
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
                    bool17 = bool;
                    bool18 = bool2;
                    bool19 = bool3;
                    bool20 = bool4;
                    bool21 = bool5;
                    bool22 = bool6;
                    bool23 = bool7;
                    bool24 = bool8;
                    bool25 = bool9;
                    bool26 = bool10;
                    bool27 = bool11;
                    bool28 = bool12;
                    bool29 = bool13;
                    num6 = num2;
                    bool30 = bool14;
                    bool31 = bool15;
                    bool32 = bool16;
                case 4:
                    num = num7;
                    r1Var = (r1) aa.c.b(aa.c.c(m2.a, true)).a(eVar, wVar);
                    num3 = num;
                case 5:
                    num = num7;
                    q1Var = (q1) aa.c.b(aa.c.c(l2.a, true)).a(eVar, wVar);
                    num3 = num;
                case 6:
                    bool = bool17;
                    bool2 = bool18;
                    bool3 = bool19;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    bool9 = bool25;
                    bool10 = bool26;
                    bool11 = bool27;
                    bool12 = bool28;
                    bool13 = bool29;
                    num2 = num6;
                    bool14 = bool30;
                    bool15 = bool31;
                    bool16 = bool32;
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
                    bool17 = bool;
                    bool18 = bool2;
                    bool19 = bool3;
                    bool20 = bool4;
                    bool21 = bool5;
                    bool22 = bool6;
                    bool23 = bool7;
                    bool24 = bool8;
                    bool25 = bool9;
                    bool26 = bool10;
                    bool27 = bool11;
                    bool28 = bool12;
                    bool29 = bool13;
                    num6 = num2;
                    bool30 = bool14;
                    bool31 = bool15;
                    bool32 = bool16;
                case 7:
                    num = num7;
                    bool17 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 8:
                    num = num7;
                    bool18 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 9:
                    num = num7;
                    str3 = (String) aa.c.i.a(eVar, wVar);
                    num3 = num;
                case 10:
                    num = num7;
                    bool19 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 11:
                    num = num7;
                    bool20 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 12:
                    num = num7;
                    bool21 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 13:
                    num = num7;
                    bool22 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 14:
                    num = num7;
                    bool23 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 15:
                    num = num7;
                    bool24 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 16:
                    num = num7;
                    bool25 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 17:
                    num = num7;
                    t1Var = (t1) aa.c.c(o2.a, false).a(eVar, wVar);
                    num3 = num;
                case 18:
                    num = num7;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 19:
                    num = num7;
                    a2Var = (a2) aa.c.c(v2.a, true).a(eVar, wVar);
                    num3 = num;
                case 20:
                    num = num7;
                    d2Var = (d2) aa.c.c(y2.a, false).a(eVar, wVar);
                    num3 = num;
                case 21:
                    num = num7;
                    f2Var = (f2) aa.c.b(aa.c.c(a3.a, false)).a(eVar, wVar);
                    num3 = num;
                case 22:
                    num = num7;
                    e2Var = (e2) aa.c.b(aa.c.c(z2.a, false)).a(eVar, wVar);
                    num3 = num;
                case 23:
                    num = num7;
                    h2Var = (h2) aa.c.c(d3.a, false).a(eVar, wVar);
                    num3 = num;
                case 24:
                    num = num7;
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 25:
                    num = num7;
                    str6 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 26:
                    num = num7;
                    str7 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 27:
                    num = num7;
                    str8 = (String) aa.c.i.a(eVar, wVar);
                    num3 = num;
                case 28:
                    num = num7;
                    bool26 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 29:
                    num = num7;
                    bool27 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 30:
                    num = num7;
                    bool28 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 31:
                    num = num7;
                    n40Var = (n40) aa.c.b(n10.b.A).a(eVar, wVar);
                    num3 = num;
                case 32:
                    num = num7;
                    j2Var = (j2) aa.c.c(f3.a, false).a(eVar, wVar);
                    num3 = num;
                case 33:
                    num = num7;
                    v1Var = (v1) aa.c.b(aa.c.c(q2.a, true)).a(eVar, wVar);
                    num3 = num;
                case 34:
                    num = num7;
                    bool29 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 35:
                    Integer num9 = num5;
                    Boolean bool34 = bool17;
                    Boolean bool35 = bool18;
                    Boolean bool36 = bool19;
                    Boolean bool37 = bool20;
                    Boolean bool38 = bool21;
                    Boolean bool39 = bool22;
                    Boolean bool40 = bool23;
                    Boolean bool41 = bool24;
                    Boolean bool42 = bool25;
                    Boolean bool43 = bool26;
                    Boolean bool44 = bool27;
                    Boolean bool45 = bool28;
                    Boolean bool46 = bool29;
                    bool14 = bool30;
                    bool15 = bool31;
                    bool16 = bool32;
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
                    bool17 = bool34;
                    bool18 = bool35;
                    bool19 = bool36;
                    bool20 = bool37;
                    bool21 = bool38;
                    bool22 = bool39;
                    bool23 = bool40;
                    bool24 = bool41;
                    bool25 = bool42;
                    bool26 = bool43;
                    bool27 = bool44;
                    bool28 = bool45;
                    bool29 = bool46;
                    bool30 = bool14;
                    bool31 = bool15;
                    bool32 = bool16;
                case 36:
                    num = num7;
                    b2Var = (b2) aa.c.b(aa.c.c(w2.a, false)).a(eVar, wVar);
                    num3 = num;
                case 37:
                    num = num7;
                    g2Var = (g2) aa.c.c(b3.a, false).a(eVar, wVar);
                    num3 = num;
                case 38:
                    num = num7;
                    u1Var = (u1) aa.c.b(aa.c.c(p2.a, false)).a(eVar, wVar);
                    num3 = num;
                case 39:
                    num = num7;
                    bool30 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 40:
                    num = num7;
                    bool31 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 41:
                    num = num7;
                    bool32 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 42:
                    num = num7;
                    w1Var = (w1) aa.c.b(aa.c.c(r2.a, true)).a(eVar, wVar);
                    num3 = num;
                case 43:
                    num = num7;
                    c2Var = (c2) aa.c.c(x2.a, false).a(eVar, wVar);
                    num3 = num;
                case 44:
                    num = num7;
                    s1Var = (s1) aa.c.c(n2.a, false).a(eVar, wVar);
                    num3 = num;
                case 45:
                    num = num7;
                    bool33 = (Boolean) aa.c.k.a(eVar, wVar);
                    num3 = num;
            }
            eVar.s0();
            o c = t.c(eVar, wVar);
            eVar.s0();
            yw.f fVar = yw.f.a;
            yw.b c2 = yw.f.c(eVar, wVar);
            eVar.s0();
            qx.u0 c3 = qx.x0.c(eVar, wVar);
            eVar.s0();
            p7 p7Var = p7.a;
            k7 c4 = p7.c(eVar, wVar);
            eVar.s0();
            r5 r5Var = r5.a;
            o5 c5 = r5.c(eVar, wVar);
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
            Boolean bool47 = bool17;
            int intValue2 = num10.intValue();
            if (bool47 == null) {
                k41.b.B(eVar, "hasIssuesEnabled");
                throw null;
            }
            Boolean bool48 = bool18;
            boolean booleanValue = bool47.booleanValue();
            if (bool48 == null) {
                k41.b.B(eVar, "showActions");
                throw null;
            }
            Boolean bool49 = bool19;
            boolean booleanValue2 = bool48.booleanValue();
            if (bool49 == null) {
                k41.b.B(eVar, "isPrivate");
                throw null;
            }
            Boolean bool50 = bool20;
            boolean booleanValue3 = bool49.booleanValue();
            if (bool50 == null) {
                k41.b.B(eVar, "isArchived");
                throw null;
            }
            Boolean bool51 = bool21;
            boolean booleanValue4 = bool50.booleanValue();
            if (bool51 == null) {
                k41.b.B(eVar, "isTemplate");
                throw null;
            }
            Boolean bool52 = bool22;
            boolean booleanValue5 = bool51.booleanValue();
            if (bool52 == null) {
                k41.b.B(eVar, "isFork");
                throw null;
            }
            Boolean bool53 = bool23;
            boolean booleanValue6 = bool52.booleanValue();
            if (bool53 == null) {
                k41.b.B(eVar, "forkingAllowed");
                throw null;
            }
            Boolean bool54 = bool24;
            boolean booleanValue7 = bool53.booleanValue();
            if (bool54 == null) {
                k41.b.B(eVar, "isEmpty");
                throw null;
            }
            Boolean bool55 = bool25;
            boolean booleanValue8 = bool54.booleanValue();
            if (bool55 == null) {
                k41.b.B(eVar, "isInOrganization");
                throw null;
            }
            Boolean bool56 = bool26;
            boolean booleanValue9 = bool55.booleanValue();
            if (t1Var == null) {
                k41.b.B(eVar, "issues");
                throw null;
            }
            if (str4 == null) {
                k41.b.B(eVar, "name");
                throw null;
            }
            if (a2Var == null) {
                k41.b.B(eVar, "owner");
                throw null;
            }
            if (d2Var == null) {
                k41.b.B(eVar, "pullRequests");
                throw null;
            }
            if (h2Var == null) {
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
            if (bool56 == null) {
                k41.b.B(eVar, "viewerCanAdminister");
                throw null;
            }
            Boolean bool57 = bool27;
            boolean booleanValue10 = bool56.booleanValue();
            if (bool57 == null) {
                k41.b.B(eVar, "viewerCanPush");
                throw null;
            }
            Boolean bool58 = bool28;
            boolean booleanValue11 = bool57.booleanValue();
            if (bool58 == null) {
                k41.b.B(eVar, "viewerCanSubscribe");
                throw null;
            }
            Boolean bool59 = bool29;
            boolean booleanValue12 = bool58.booleanValue();
            if (j2Var == null) {
                k41.b.B(eVar, "watchers");
                throw null;
            }
            if (bool59 == null) {
                k41.b.B(eVar, "isDiscussionsEnabled");
                throw null;
            }
            Integer num11 = num6;
            boolean booleanValue13 = bool59.booleanValue();
            if (num11 == null) {
                k41.b.B(eVar, "discussionsCount");
                throw null;
            }
            Boolean bool60 = bool30;
            int intValue3 = num11.intValue();
            if (g2Var == null) {
                k41.b.B(eVar, "releases");
                throw null;
            }
            if (bool60 == null) {
                k41.b.B(eVar, "isViewersFavorite");
                throw null;
            }
            Boolean bool61 = bool31;
            boolean booleanValue14 = bool60.booleanValue();
            if (bool61 == null) {
                k41.b.B(eVar, "viewerHasBlockedContributors");
                throw null;
            }
            Boolean bool62 = bool32;
            boolean booleanValue15 = bool61.booleanValue();
            if (bool62 == null) {
                k41.b.B(eVar, "viewerBlockedByOwner");
                throw null;
            }
            boolean booleanValue16 = bool62.booleanValue();
            if (c2Var == null) {
                k41.b.B(eVar, "projectsV2");
                throw null;
            }
            if (s1Var != null) {
                return new k2(str, str2, num4, intValue, r1Var, q1Var, intValue2, booleanValue, booleanValue2, str3, booleanValue3, booleanValue4, booleanValue5, booleanValue6, booleanValue7, booleanValue8, booleanValue9, t1Var, str4, a2Var, d2Var, f2Var, e2Var, h2Var, str5, str6, str7, str8, booleanValue10, booleanValue11, booleanValue12, n40Var, j2Var, v1Var, booleanValue13, intValue3, b2Var, g2Var, u1Var, booleanValue14, booleanValue15, booleanValue16, w1Var, c2Var, s1Var, bool33, c, c2, c3, c4, c5);
            }
            k41.b.B(eVar, "forks");
            throw null;
        }
    }
}
