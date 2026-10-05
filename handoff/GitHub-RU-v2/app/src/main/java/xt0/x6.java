package xt0;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pz0.gu;
import pz0.ot;
import pz0.si;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x6 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "url", "id", "headRefOid", "headRepository", "baseRepository", "title", "titleHTML", "createdAt", "viewerCanDeleteHeadRef", "viewerDidAuthor", "viewerCanChangeBaseBranch", "locked", "author", "isReadByViewer", "bodyHtml", "number", "pullRequestState", "changedFiles", "additions", "deletions", "mergeStateStatus", "mergedBy", "mergeCommit", "mergeQueue", "mergeQueueEntry", "reviewDecision", "isDraft", "requiredStatusChecks", "baseRef", "baseRefName", "headRef", "headRefName", "milestone", "reviewRequests", "latestReviews", "latestOpinionatedReviews", "suggestedReviewers", "actionRequiredWorkflowRunCount", "commits", "viewerLatestReview", "viewerCanReopen", "viewerCanMergeAsAdmin", "viewerCanAssign", "viewerCanLabel", "viewerCanUpdateBranch"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x006f. Please report as an issue. */
    public static u5 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Integer num;
        Integer num2;
        Integer num3;
        Boolean bool2;
        Integer num4;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Integer valueOf;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Integer num5;
        Boolean bool11;
        Object obj;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Object obj2;
        Integer valueOf5;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool12 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        t4 t4Var = null;
        n4 n4Var = null;
        String str5 = null;
        String str6 = null;
        ZonedDateTime zonedDateTime = null;
        Boolean bool13 = null;
        Boolean bool14 = null;
        Boolean bool15 = null;
        Integer num6 = null;
        l4 l4Var = null;
        Boolean bool16 = null;
        String str7 = null;
        Integer num7 = null;
        gu guVar = null;
        Integer num8 = null;
        Integer num9 = null;
        Boolean bool17 = null;
        si siVar = null;
        z4 z4Var = null;
        w4 w4Var = null;
        x4 x4Var = null;
        y4 y4Var = null;
        ot otVar = null;
        Integer num10 = null;
        m5 m5Var = null;
        m4 m4Var = null;
        String str8 = null;
        s4 s4Var = null;
        String str9 = null;
        a5 a5Var = null;
        n5 n5Var = null;
        v4 v4Var = null;
        u4 u4Var = null;
        ArrayList arrayList = null;
        Boolean bool18 = null;
        q4 q4Var = null;
        r5 r5Var = null;
        Boolean bool19 = null;
        Boolean bool20 = null;
        Boolean bool21 = null;
        Boolean bool22 = null;
        while (true) {
            Boolean bool23 = bool12;
            switch (eVar.r0(a)) {
                case 0:
                    bool = bool23;
                    str = (String) aa.c.a.a(eVar, wVar);
                    bool12 = bool;
                case 1:
                    bool = bool23;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    bool12 = bool;
                case 2:
                    bool = bool23;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    bool12 = bool;
                case 3:
                    bool = bool23;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    bool12 = bool;
                case 4:
                    bool = bool23;
                    t4Var = (t4) aa.c.b(aa.c.c(e6.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 5:
                    bool = bool23;
                    n4Var = (n4) aa.c.b(aa.c.c(y5.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 6:
                    bool = bool23;
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    bool12 = bool;
                case 7:
                    bool = bool23;
                    str6 = (String) aa.c.a.a(eVar, wVar);
                    bool12 = bool;
                case 8:
                    bool = bool23;
                    pz0.o7.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(pz0.o7.a).a(eVar, wVar);
                    bool12 = bool;
                case 9:
                    bool12 = (Boolean) aa.c.f.a(eVar, wVar);
                case 10:
                    bool = bool23;
                    bool13 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool12 = bool;
                case 11:
                    bool = bool23;
                    bool14 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool12 = bool;
                case 12:
                    bool = bool23;
                    bool15 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool12 = bool;
                case 13:
                    bool = bool23;
                    l4Var = (l4) aa.c.b(aa.c.c(w5.a, true)).a(eVar, wVar);
                    bool12 = bool;
                case 14:
                    bool = bool23;
                    bool16 = (Boolean) aa.c.k.a(eVar, wVar);
                    bool12 = bool;
                case 15:
                    bool = bool23;
                    str7 = (String) aa.c.a.a(eVar, wVar);
                    bool12 = bool;
                case 16:
                    Boolean bool24 = bool13;
                    Boolean bool25 = bool14;
                    Boolean bool26 = bool15;
                    num = num7;
                    num2 = num8;
                    num3 = num9;
                    bool2 = bool17;
                    num4 = num10;
                    bool3 = bool18;
                    bool4 = bool19;
                    bool5 = bool20;
                    bool6 = bool21;
                    bool7 = bool22;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num6 = valueOf;
                    bool12 = bool23;
                    bool13 = bool24;
                    bool14 = bool25;
                    bool15 = bool26;
                    num7 = num;
                    num8 = num2;
                    num9 = num3;
                    bool17 = bool2;
                    num10 = num4;
                    bool18 = bool3;
                    bool19 = bool4;
                    bool20 = bool5;
                    bool21 = bool6;
                    bool22 = bool7;
                case 17:
                    bool8 = bool13;
                    bool9 = bool14;
                    bool10 = bool15;
                    num5 = num6;
                    num = num7;
                    num2 = num8;
                    num3 = num9;
                    bool2 = bool17;
                    num4 = num10;
                    bool3 = bool18;
                    bool4 = bool19;
                    bool5 = bool20;
                    bool6 = bool21;
                    bool7 = bool22;
                    bool11 = bool23;
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
                    bool12 = bool11;
                    bool13 = bool8;
                    bool14 = bool9;
                    bool15 = bool10;
                    num6 = num5;
                    num7 = num;
                    num8 = num2;
                    num9 = num3;
                    bool17 = bool2;
                    num10 = num4;
                    bool18 = bool3;
                    bool19 = bool4;
                    bool20 = bool5;
                    bool21 = bool6;
                    bool22 = bool7;
                case 18:
                    Boolean bool27 = bool13;
                    Boolean bool28 = bool14;
                    Boolean bool29 = bool15;
                    Integer num11 = num6;
                    num2 = num8;
                    num3 = num9;
                    bool2 = bool17;
                    num4 = num10;
                    bool3 = bool18;
                    bool4 = bool19;
                    bool5 = bool20;
                    bool6 = bool21;
                    bool7 = bool22;
                    long nextLong2 = eVar.nextLong();
                    if (nextLong2 > 2147483647L) {
                        while (nextLong2 > 2147483647L) {
                            nextLong2 = jo.f4.c(1, nextLong2, "substring(...)");
                        }
                        valueOf2 = Integer.valueOf((int) nextLong2);
                    } else {
                        valueOf2 = Integer.valueOf((int) nextLong2);
                    }
                    num7 = valueOf2;
                    bool12 = bool23;
                    bool13 = bool27;
                    bool14 = bool28;
                    bool15 = bool29;
                    num6 = num11;
                    num8 = num2;
                    num9 = num3;
                    bool17 = bool2;
                    num10 = num4;
                    bool18 = bool3;
                    bool19 = bool4;
                    bool20 = bool5;
                    bool21 = bool6;
                    bool22 = bool7;
                case 19:
                    Boolean bool30 = bool13;
                    Boolean bool31 = bool14;
                    Boolean bool32 = bool15;
                    Integer num12 = num6;
                    Integer num13 = num7;
                    num3 = num9;
                    bool2 = bool17;
                    num4 = num10;
                    bool3 = bool18;
                    bool4 = bool19;
                    bool5 = bool20;
                    bool6 = bool21;
                    bool7 = bool22;
                    long nextLong3 = eVar.nextLong();
                    if (nextLong3 > 2147483647L) {
                        while (nextLong3 > 2147483647L) {
                            nextLong3 = jo.f4.c(1, nextLong3, "substring(...)");
                        }
                        valueOf3 = Integer.valueOf((int) nextLong3);
                    } else {
                        valueOf3 = Integer.valueOf((int) nextLong3);
                    }
                    num8 = valueOf3;
                    bool12 = bool23;
                    bool13 = bool30;
                    bool14 = bool31;
                    bool15 = bool32;
                    num6 = num12;
                    num7 = num13;
                    num9 = num3;
                    bool17 = bool2;
                    num10 = num4;
                    bool18 = bool3;
                    bool19 = bool4;
                    bool20 = bool5;
                    bool21 = bool6;
                    bool22 = bool7;
                case 20:
                    Boolean bool33 = bool13;
                    Boolean bool34 = bool14;
                    Boolean bool35 = bool15;
                    Integer num14 = num6;
                    Integer num15 = num7;
                    Integer num16 = num8;
                    bool2 = bool17;
                    num4 = num10;
                    bool3 = bool18;
                    bool4 = bool19;
                    bool5 = bool20;
                    bool6 = bool21;
                    bool7 = bool22;
                    long nextLong4 = eVar.nextLong();
                    if (nextLong4 > 2147483647L) {
                        while (nextLong4 > 2147483647L) {
                            nextLong4 = jo.f4.c(1, nextLong4, "substring(...)");
                        }
                        valueOf4 = Integer.valueOf((int) nextLong4);
                    } else {
                        valueOf4 = Integer.valueOf((int) nextLong4);
                    }
                    num9 = valueOf4;
                    bool12 = bool23;
                    bool13 = bool33;
                    bool14 = bool34;
                    bool15 = bool35;
                    num6 = num14;
                    num7 = num15;
                    num8 = num16;
                    bool17 = bool2;
                    num10 = num4;
                    bool18 = bool3;
                    bool19 = bool4;
                    bool20 = bool5;
                    bool21 = bool6;
                    bool22 = bool7;
                case 21:
                    bool8 = bool13;
                    bool9 = bool14;
                    bool10 = bool15;
                    num5 = num6;
                    num = num7;
                    num2 = num8;
                    num3 = num9;
                    bool2 = bool17;
                    num4 = num10;
                    bool3 = bool18;
                    bool4 = bool19;
                    bool5 = bool20;
                    bool6 = bool21;
                    bool7 = bool22;
                    bool11 = bool23;
                    String u2 = eVar.u();
                    k71.k.d(u2);
                    si.Companion.getClass();
                    Iterator it2 = si.v.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (((si) obj2).r.equals(u2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    si siVar2 = (si) obj2;
                    siVar = siVar2 == null ? si.t : siVar2;
                    bool12 = bool11;
                    bool13 = bool8;
                    bool14 = bool9;
                    bool15 = bool10;
                    num6 = num5;
                    num7 = num;
                    num8 = num2;
                    num9 = num3;
                    bool17 = bool2;
                    num10 = num4;
                    bool18 = bool3;
                    bool19 = bool4;
                    bool20 = bool5;
                    bool21 = bool6;
                    bool22 = bool7;
                case 22:
                    bool = bool23;
                    z4Var = (z4) aa.c.b(aa.c.c(k6.a, true)).a(eVar, wVar);
                    bool12 = bool;
                case 23:
                    bool = bool23;
                    w4Var = (w4) aa.c.b(aa.c.c(h6.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 24:
                    bool = bool23;
                    x4Var = (x4) aa.c.b(aa.c.c(i6.a, true)).a(eVar, wVar);
                    bool12 = bool;
                case 25:
                    bool = bool23;
                    y4Var = (y4) aa.c.b(aa.c.c(j6.a, true)).a(eVar, wVar);
                    bool12 = bool;
                case 26:
                    bool = bool23;
                    otVar = (ot) aa.c.b(qz0.b.h).a(eVar, wVar);
                    bool12 = bool;
                case 27:
                    bool = bool23;
                    bool17 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool12 = bool;
                case 28:
                    bool = bool23;
                    m5Var = (m5) aa.c.c(y6.a, false).a(eVar, wVar);
                    bool12 = bool;
                case 29:
                    bool = bool23;
                    m4Var = (m4) aa.c.b(aa.c.c(x5.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 30:
                    bool = bool23;
                    str8 = (String) aa.c.a.a(eVar, wVar);
                    bool12 = bool;
                case 31:
                    bool = bool23;
                    s4Var = (s4) aa.c.b(aa.c.c(d6.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 32:
                    bool = bool23;
                    str9 = (String) aa.c.a.a(eVar, wVar);
                    bool12 = bool;
                case 33:
                    bool = bool23;
                    a5Var = (a5) aa.c.b(aa.c.c(l6.a, true)).a(eVar, wVar);
                    bool12 = bool;
                case 34:
                    bool = bool23;
                    n5Var = (n5) aa.c.b(aa.c.c(z6.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 35:
                    bool = bool23;
                    v4Var = (v4) aa.c.b(aa.c.c(g6.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 36:
                    bool = bool23;
                    u4Var = (u4) aa.c.b(aa.c.c(f6.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 37:
                    bool = bool23;
                    arrayList = aa.c.a(aa.c.b(aa.c.c(c7.a, false))).c(eVar, wVar);
                    bool12 = bool;
                case 38:
                    Boolean bool36 = bool13;
                    Boolean bool37 = bool14;
                    Boolean bool38 = bool15;
                    Integer num17 = num6;
                    Integer num18 = num7;
                    Integer num19 = num8;
                    Integer num20 = num9;
                    Boolean bool39 = bool17;
                    bool3 = bool18;
                    bool4 = bool19;
                    bool5 = bool20;
                    bool6 = bool21;
                    bool7 = bool22;
                    long nextLong5 = eVar.nextLong();
                    if (nextLong5 > 2147483647L) {
                        while (nextLong5 > 2147483647L) {
                            nextLong5 = jo.f4.c(1, nextLong5, "substring(...)");
                        }
                        valueOf5 = Integer.valueOf((int) nextLong5);
                    } else {
                        valueOf5 = Integer.valueOf((int) nextLong5);
                    }
                    num10 = valueOf5;
                    bool12 = bool23;
                    bool13 = bool36;
                    bool14 = bool37;
                    bool15 = bool38;
                    num6 = num17;
                    num7 = num18;
                    num8 = num19;
                    num9 = num20;
                    bool17 = bool39;
                    bool18 = bool3;
                    bool19 = bool4;
                    bool20 = bool5;
                    bool21 = bool6;
                    bool22 = bool7;
                case 39:
                    bool = bool23;
                    q4Var = (q4) aa.c.c(b6.a, false).a(eVar, wVar);
                    bool12 = bool;
                case 40:
                    bool = bool23;
                    r5Var = (r5) aa.c.b(aa.c.c(d7.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 41:
                    bool = bool23;
                    bool18 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool12 = bool;
                case 42:
                    bool = bool23;
                    bool19 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool12 = bool;
                case 43:
                    bool = bool23;
                    bool20 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool12 = bool;
                case 44:
                    bool = bool23;
                    bool21 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool12 = bool;
                case 45:
                    bool = bool23;
                    bool22 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool12 = bool;
            }
            eVar.s0();
            yp0.c c = yp0.e.c(eVar, wVar);
            eVar.s0();
            gu0.f fVar = gu0.f.a;
            gu0.c c2 = gu0.f.c(eVar, wVar);
            eVar.s0();
            gt0.a c3 = gt0.b.c(eVar, wVar);
            eVar.s0();
            ep0.i c4 = ep0.j.c(eVar, wVar);
            eVar.s0();
            cs0.j c5 = cs0.n.c(eVar, wVar);
            eVar.s0();
            is0.e c6 = is0.g.c(eVar, wVar);
            eVar.s0();
            bw0.a c7 = bw0.b.c(eVar, wVar);
            eVar.s0();
            s7 c8 = v7.c(eVar, wVar);
            eVar.s0();
            b c9 = d.c(eVar, wVar);
            if (str == null) {
                k41.b.B(eVar, "__typename");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (str3 == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (str4 == null) {
                k41.b.B(eVar, "headRefOid");
                throw null;
            }
            if (str5 == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (str6 == null) {
                k41.b.B(eVar, "titleHTML");
                throw null;
            }
            if (zonedDateTime == null) {
                k41.b.B(eVar, "createdAt");
                throw null;
            }
            if (bool23 == null) {
                k41.b.B(eVar, "viewerCanDeleteHeadRef");
                throw null;
            }
            Boolean bool40 = bool13;
            boolean booleanValue = bool23.booleanValue();
            if (bool40 == null) {
                k41.b.B(eVar, "viewerDidAuthor");
                throw null;
            }
            Boolean bool41 = bool14;
            boolean booleanValue2 = bool40.booleanValue();
            if (bool41 == null) {
                k41.b.B(eVar, "viewerCanChangeBaseBranch");
                throw null;
            }
            Boolean bool42 = bool15;
            boolean booleanValue3 = bool41.booleanValue();
            if (bool42 == null) {
                k41.b.B(eVar, "locked");
                throw null;
            }
            Integer num21 = num6;
            boolean booleanValue4 = bool42.booleanValue();
            if (str7 == null) {
                k41.b.B(eVar, "bodyHtml");
                throw null;
            }
            if (num21 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Integer num22 = num7;
            int intValue = num21.intValue();
            if (guVar == null) {
                k41.b.B(eVar, "pullRequestState");
                throw null;
            }
            if (num22 == null) {
                k41.b.B(eVar, "changedFiles");
                throw null;
            }
            Integer num23 = num8;
            int intValue2 = num22.intValue();
            if (num23 == null) {
                k41.b.B(eVar, "additions");
                throw null;
            }
            Integer num24 = num9;
            int intValue3 = num23.intValue();
            if (num24 == null) {
                k41.b.B(eVar, "deletions");
                throw null;
            }
            Boolean bool43 = bool17;
            int intValue4 = num24.intValue();
            if (siVar == null) {
                k41.b.B(eVar, "mergeStateStatus");
                throw null;
            }
            if (bool43 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            Integer num25 = num10;
            boolean booleanValue5 = bool43.booleanValue();
            if (m5Var == null) {
                k41.b.B(eVar, "requiredStatusChecks");
                throw null;
            }
            if (str8 == null) {
                k41.b.B(eVar, "baseRefName");
                throw null;
            }
            if (str9 == null) {
                k41.b.B(eVar, "headRefName");
                throw null;
            }
            if (arrayList == null) {
                k41.b.B(eVar, "suggestedReviewers");
                throw null;
            }
            if (num25 == null) {
                k41.b.B(eVar, "actionRequiredWorkflowRunCount");
                throw null;
            }
            Boolean bool44 = bool18;
            int intValue5 = num25.intValue();
            if (q4Var == null) {
                k41.b.B(eVar, "commits");
                throw null;
            }
            if (bool44 == null) {
                k41.b.B(eVar, "viewerCanReopen");
                throw null;
            }
            Boolean bool45 = bool19;
            boolean booleanValue6 = bool44.booleanValue();
            if (bool45 == null) {
                k41.b.B(eVar, "viewerCanMergeAsAdmin");
                throw null;
            }
            Boolean bool46 = bool20;
            boolean booleanValue7 = bool45.booleanValue();
            if (bool46 == null) {
                k41.b.B(eVar, "viewerCanAssign");
                throw null;
            }
            Boolean bool47 = bool21;
            boolean booleanValue8 = bool46.booleanValue();
            if (bool47 == null) {
                k41.b.B(eVar, "viewerCanLabel");
                throw null;
            }
            Boolean bool48 = bool22;
            boolean booleanValue9 = bool47.booleanValue();
            if (bool48 != null) {
                return new u5(str, str2, str3, str4, t4Var, n4Var, str5, str6, zonedDateTime, booleanValue, booleanValue2, booleanValue3, booleanValue4, l4Var, bool16, str7, intValue, guVar, intValue2, intValue3, intValue4, siVar, z4Var, w4Var, x4Var, y4Var, otVar, booleanValue5, m5Var, m4Var, str8, s4Var, str9, a5Var, n5Var, v4Var, u4Var, arrayList, intValue5, q4Var, r5Var, booleanValue6, booleanValue7, booleanValue8, booleanValue9, bool48.booleanValue(), c, c2, c3, c4, c5, c6, c7, c8, c9);
            }
            k41.b.B(eVar, "viewerCanUpdateBranch");
            throw null;
        }
    }
}
