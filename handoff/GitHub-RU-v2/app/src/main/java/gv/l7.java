package gv;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import m10.b00;
import m10.jz;
import m10.sa;
import m10.wm;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l7 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "url", "id", "headRefOid", "headRepository", "baseRepository", "title", "titleHTML", "createdAt", "viewerCanDeleteHeadRef", "viewerDidAuthor", "viewerCanChangeBaseBranch", "locked", "author", "isReadByViewer", "bodyHtml", "number", "pullRequestState", "changedFiles", "additions", "deletions", "mergeStateStatus", "mergedBy", "mergeCommit", "mergeQueue", "mergeQueueEntry", "reviewDecision", "isDraft", "requiredStatusChecks", "baseRef", "baseRefName", "headRef", "headRefName", "milestone", "reviewRequests", "latestReviews", "latestOpinionatedReviews", "suggestedReviewerActors", "actionRequiredWorkflowRunCount", "commits", "viewerLatestReview", "viewerCanReopen", "viewerCanMergeAsAdmin", "viewerCanAssign", "viewerCanLabel", "viewerCanUpdateBranch"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x006f. Please report as an issue. */
    public static g6 c(ea.e eVar, aa.w wVar) {
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
        d5 d5Var = null;
        x4 x4Var = null;
        String str5 = null;
        String str6 = null;
        ZonedDateTime zonedDateTime = null;
        Boolean bool13 = null;
        Boolean bool14 = null;
        Boolean bool15 = null;
        Integer num6 = null;
        v4 v4Var = null;
        Boolean bool16 = null;
        String str7 = null;
        Integer num7 = null;
        b00 b00Var = null;
        Integer num8 = null;
        Integer num9 = null;
        Boolean bool17 = null;
        wm wmVar = null;
        j5 j5Var = null;
        g5 g5Var = null;
        h5 h5Var = null;
        i5 i5Var = null;
        jz jzVar = null;
        Integer num10 = null;
        y5 y5Var = null;
        w4 w4Var = null;
        String str8 = null;
        c5 c5Var = null;
        String str9 = null;
        k5 k5Var = null;
        z5 z5Var = null;
        f5 f5Var = null;
        e5 e5Var = null;
        c6 c6Var = null;
        Boolean bool18 = null;
        a5 a5Var = null;
        d6 d6Var = null;
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
                    d5Var = (d5) aa.c.b(aa.c.c(q6.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 5:
                    bool = bool23;
                    x4Var = (x4) aa.c.b(aa.c.c(k6.a, false)).a(eVar, wVar);
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
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
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
                    v4Var = (v4) aa.c.b(aa.c.c(i6.a, true)).a(eVar, wVar);
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
                    b00.Companion.getClass();
                    Iterator it = b00.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((b00) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    b00 b00Var2 = (b00) obj;
                    b00Var = b00Var2 == null ? b00.v : b00Var2;
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
                    wm.Companion.getClass();
                    Iterator it2 = wm.v.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (((wm) obj2).r.equals(u2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    wm wmVar2 = (wm) obj2;
                    wmVar = wmVar2 == null ? wm.t : wmVar2;
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
                    j5Var = (j5) aa.c.b(aa.c.c(w6.a, true)).a(eVar, wVar);
                    bool12 = bool;
                case 23:
                    bool = bool23;
                    g5Var = (g5) aa.c.b(aa.c.c(t6.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 24:
                    bool = bool23;
                    h5Var = (h5) aa.c.b(aa.c.c(u6.a, true)).a(eVar, wVar);
                    bool12 = bool;
                case 25:
                    bool = bool23;
                    i5Var = (i5) aa.c.b(aa.c.c(v6.a, true)).a(eVar, wVar);
                    bool12 = bool;
                case 26:
                    bool = bool23;
                    jzVar = (jz) aa.c.b(n10.b.t).a(eVar, wVar);
                    bool12 = bool;
                case 27:
                    bool = bool23;
                    bool17 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool12 = bool;
                case 28:
                    bool = bool23;
                    y5Var = (y5) aa.c.c(m7.a, false).a(eVar, wVar);
                    bool12 = bool;
                case 29:
                    bool = bool23;
                    w4Var = (w4) aa.c.b(aa.c.c(j6.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 30:
                    bool = bool23;
                    str8 = (String) aa.c.a.a(eVar, wVar);
                    bool12 = bool;
                case 31:
                    bool = bool23;
                    c5Var = (c5) aa.c.b(aa.c.c(p6.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 32:
                    bool = bool23;
                    str9 = (String) aa.c.a.a(eVar, wVar);
                    bool12 = bool;
                case 33:
                    bool = bool23;
                    k5Var = (k5) aa.c.b(aa.c.c(x6.a, true)).a(eVar, wVar);
                    bool12 = bool;
                case 34:
                    bool = bool23;
                    z5Var = (z5) aa.c.b(aa.c.c(n7.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 35:
                    bool = bool23;
                    f5Var = (f5) aa.c.b(aa.c.c(s6.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 36:
                    bool = bool23;
                    e5Var = (e5) aa.c.b(aa.c.c(r6.a, false)).a(eVar, wVar);
                    bool12 = bool;
                case 37:
                    bool = bool23;
                    c6Var = (c6) aa.c.c(q7.a, false).a(eVar, wVar);
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
                    a5Var = (a5) aa.c.c(n6.a, false).a(eVar, wVar);
                    bool12 = bool;
                case 40:
                    bool = bool23;
                    d6Var = (d6) aa.c.b(aa.c.c(r7.a, false)).a(eVar, wVar);
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
            ar.c c = ar.e.c(eVar, wVar);
            eVar.s0();
            pv.f fVar = pv.f.a;
            pv.c c2 = pv.f.c(eVar, wVar);
            eVar.s0();
            pu.a c3 = pu.b.c(eVar, wVar);
            eVar.s0();
            gq.i c4 = gq.k.c(eVar, wVar);
            eVar.s0();
            lt.j c5 = lt.n.c(eVar, wVar);
            eVar.s0();
            rt.e c6 = rt.g.c(eVar, wVar);
            eVar.s0();
            mx.a c7 = mx.b.c(eVar, wVar);
            eVar.s0();
            f8 c8 = h8.c(eVar, wVar);
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
            if (b00Var == null) {
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
            if (wmVar == null) {
                k41.b.B(eVar, "mergeStateStatus");
                throw null;
            }
            if (bool43 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            Integer num25 = num10;
            boolean booleanValue5 = bool43.booleanValue();
            if (y5Var == null) {
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
            if (c6Var == null) {
                k41.b.B(eVar, "suggestedReviewerActors");
                throw null;
            }
            if (num25 == null) {
                k41.b.B(eVar, "actionRequiredWorkflowRunCount");
                throw null;
            }
            Boolean bool44 = bool18;
            int intValue5 = num25.intValue();
            if (a5Var == null) {
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
                return new g6(str, str2, str3, str4, d5Var, x4Var, str5, str6, zonedDateTime, booleanValue, booleanValue2, booleanValue3, booleanValue4, v4Var, bool16, str7, intValue, b00Var, intValue2, intValue3, intValue4, wmVar, j5Var, g5Var, h5Var, i5Var, jzVar, booleanValue5, y5Var, w4Var, str8, c5Var, str9, k5Var, z5Var, f5Var, e5Var, c6Var, intValue5, a5Var, d6Var, booleanValue6, booleanValue7, booleanValue8, booleanValue9, bool48.booleanValue(), c, c2, c3, c4, c5, c6, c7, c8, c9);
            }
            k41.b.B(eVar, "viewerCanUpdateBranch");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, g6 g6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g6Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g6Var.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, g6Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, g6Var.c);
        fVar.z0("headRefOid");
        bVar.b(fVar, wVar, g6Var.d);
        fVar.z0("headRepository");
        aa.c.b(aa.c.c(q6.a, false)).b(fVar, wVar, g6Var.e);
        fVar.z0("baseRepository");
        aa.c.b(aa.c.c(k6.a, false)).b(fVar, wVar, g6Var.f);
        fVar.z0("title");
        bVar.b(fVar, wVar, g6Var.g);
        fVar.z0("titleHTML");
        bVar.b(fVar, wVar, g6Var.h);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, g6Var.i);
        fVar.z0("viewerCanDeleteHeadRef");
        aa.b bVar2 = aa.c.f;
        jo.f4.C(g6Var.j, bVar2, fVar, wVar, "viewerDidAuthor");
        jo.f4.C(g6Var.k, bVar2, fVar, wVar, "viewerCanChangeBaseBranch");
        jo.f4.C(g6Var.l, bVar2, fVar, wVar, "locked");
        jo.f4.C(g6Var.m, bVar2, fVar, wVar, "author");
        aa.c.b(aa.c.c(i6.a, true)).b(fVar, wVar, g6Var.n);
        fVar.z0("isReadByViewer");
        aa.c.k.b(fVar, wVar, g6Var.o);
        fVar.z0("bodyHtml");
        bVar.b(fVar, wVar, g6Var.p);
        fVar.z0("number");
        int i = g6Var.q;
        nn.a aVar = tp.a.a;
        f1.e.A(i, aVar, fVar, wVar, "pullRequestState");
        fVar.I(g6Var.r.r);
        fVar.z0("changedFiles");
        f1.e.A(g6Var.s, aVar, fVar, wVar, "additions");
        f1.e.A(g6Var.t, aVar, fVar, wVar, "deletions");
        f1.e.A(g6Var.u, aVar, fVar, wVar, "mergeStateStatus");
        fVar.I(g6Var.v.r);
        fVar.z0("mergedBy");
        aa.c.b(aa.c.c(w6.a, true)).b(fVar, wVar, g6Var.w);
        fVar.z0("mergeCommit");
        aa.c.b(aa.c.c(t6.a, false)).b(fVar, wVar, g6Var.x);
        fVar.z0("mergeQueue");
        aa.c.b(aa.c.c(u6.a, true)).b(fVar, wVar, g6Var.y);
        fVar.z0("mergeQueueEntry");
        aa.c.b(aa.c.c(v6.a, true)).b(fVar, wVar, g6Var.z);
        fVar.z0("reviewDecision");
        aa.c.b(n10.b.t).b(fVar, wVar, g6Var.A);
        fVar.z0("isDraft");
        jo.f4.C(g6Var.B, bVar2, fVar, wVar, "requiredStatusChecks");
        aa.c.c(m7.a, false).b(fVar, wVar, g6Var.C);
        fVar.z0("baseRef");
        aa.c.b(aa.c.c(j6.a, false)).b(fVar, wVar, g6Var.D);
        fVar.z0("baseRefName");
        bVar.b(fVar, wVar, g6Var.E);
        fVar.z0("headRef");
        aa.c.b(aa.c.c(p6.a, false)).b(fVar, wVar, g6Var.F);
        fVar.z0("headRefName");
        bVar.b(fVar, wVar, g6Var.G);
        fVar.z0("milestone");
        aa.c.b(aa.c.c(x6.a, true)).b(fVar, wVar, g6Var.H);
        fVar.z0("reviewRequests");
        aa.c.b(aa.c.c(n7.a, false)).b(fVar, wVar, g6Var.I);
        fVar.z0("latestReviews");
        aa.c.b(aa.c.c(s6.a, false)).b(fVar, wVar, g6Var.J);
        fVar.z0("latestOpinionatedReviews");
        aa.c.b(aa.c.c(r6.a, false)).b(fVar, wVar, g6Var.K);
        fVar.z0("suggestedReviewerActors");
        aa.c.c(q7.a, false).b(fVar, wVar, g6Var.L);
        fVar.z0("actionRequiredWorkflowRunCount");
        f1.e.A(g6Var.M, aVar, fVar, wVar, "commits");
        aa.c.c(n6.a, false).b(fVar, wVar, g6Var.N);
        fVar.z0("viewerLatestReview");
        aa.c.b(aa.c.c(r7.a, false)).b(fVar, wVar, g6Var.O);
        fVar.z0("viewerCanReopen");
        jo.f4.C(g6Var.P, bVar2, fVar, wVar, "viewerCanMergeAsAdmin");
        jo.f4.C(g6Var.Q, bVar2, fVar, wVar, "viewerCanAssign");
        jo.f4.C(g6Var.R, bVar2, fVar, wVar, "viewerCanLabel");
        jo.f4.C(g6Var.S, bVar2, fVar, wVar, "viewerCanUpdateBranch");
        bVar2.b(fVar, wVar, Boolean.valueOf(g6Var.T));
        List list = ar.e.a;
        ar.e.d(fVar, wVar, g6Var.U);
        pv.f fVar2 = pv.f.a;
        pv.f.d(fVar, wVar, g6Var.V);
        List list2 = pu.b.a;
        pu.b.d(fVar, wVar, g6Var.W);
        List list3 = gq.k.a;
        gq.k.d(fVar, wVar, g6Var.X);
        List list4 = lt.n.a;
        lt.n.d(fVar, wVar, g6Var.Y);
        List list5 = rt.g.a;
        rt.g.d(fVar, wVar, g6Var.Z);
        List list6 = mx.b.a;
        mx.b.d(fVar, wVar, g6Var.a0);
        List list7 = h8.a;
        h8.d(fVar, wVar, g6Var.b0);
        List list8 = d.a;
        d.d(fVar, wVar, g6Var.c0);
    }
}
