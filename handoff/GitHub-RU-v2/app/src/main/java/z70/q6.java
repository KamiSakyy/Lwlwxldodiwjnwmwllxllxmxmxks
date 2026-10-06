package z70;

import hc0.ff;
import hc0.fm;
import hc0.nl;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class q6 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "url", "id", "headRefOid", "headRepository", "baseRepository", "title", "titleHTML", "createdAt", "viewerCanDeleteHeadRef", "viewerDidAuthor", "locked", "author", "isReadByViewer", "bodyHtml", "number", "pullRequestState", "changedFiles", "additions", "deletions", "mergeStateStatus", "mergedBy", "mergeCommit", "reviewDecision", "isDraft", "requiredStatusChecks", "baseRef", "baseRefName", "headRef", "headRefName", "milestone", "projectCards", "reviewRequests", "latestReviews", "latestOpinionatedReviews", "suggestedReviewers", "actionRequiredWorkflowRunCount", "commits", "viewerLatestReview", "viewerCanReopen", "viewerCanMergeAsAdmin", "viewerCanAssign", "viewerCanLabel"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0069. Please report as an issue. */
    public static l5 c(ea.e eVar, aa.w wVar) {
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
        Integer valueOf;
        Boolean bool7;
        Boolean bool8;
        Integer num5;
        Boolean bool9;
        Object obj;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Object obj2;
        Integer valueOf5;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool10 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        j4 j4Var = null;
        c4 c4Var = null;
        String str5 = null;
        String str6 = null;
        ZonedDateTime zonedDateTime = null;
        Boolean bool11 = null;
        Boolean bool12 = null;
        Integer num6 = null;
        a4 a4Var = null;
        Boolean bool13 = null;
        String str7 = null;
        Integer num7 = null;
        fm fmVar = null;
        Integer num8 = null;
        Integer num9 = null;
        Boolean bool14 = null;
        ff ffVar = null;
        n4 n4Var = null;
        m4 m4Var = null;
        nl nlVar = null;
        Integer num10 = null;
        d5 d5Var = null;
        b4 b4Var = null;
        String str8 = null;
        i4 i4Var = null;
        String str9 = null;
        o4 o4Var = null;
        a5 a5Var = null;
        e5 e5Var = null;
        l4 l4Var = null;
        k4 k4Var = null;
        ArrayList arrayList = null;
        Boolean bool15 = null;
        g4 g4Var = null;
        i5 i5Var = null;
        Boolean bool16 = null;
        Boolean bool17 = null;
        Boolean bool18 = null;
        while (true) {
            Boolean bool19 = bool10;
            switch (eVar.r0(a)) {
                case 0:
                    bool = bool19;
                    str = (String) aa.c.a.a(eVar, wVar);
                    bool10 = bool;
                case 1:
                    bool = bool19;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    bool10 = bool;
                case 2:
                    bool = bool19;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    bool10 = bool;
                case 3:
                    bool = bool19;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    bool10 = bool;
                case 4:
                    bool = bool19;
                    j4Var = (j4) aa.c.b(aa.c.c(w5.a, false)).a(eVar, wVar);
                    bool10 = bool;
                case 5:
                    bool = bool19;
                    c4Var = (c4) aa.c.b(aa.c.c(p5.a, false)).a(eVar, wVar);
                    bool10 = bool;
                case 6:
                    bool = bool19;
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    bool10 = bool;
                case 7:
                    bool = bool19;
                    str6 = (String) aa.c.a.a(eVar, wVar);
                    bool10 = bool;
                case 8:
                    bool = bool19;
                    hc0.h6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(hc0.h6.a).a(eVar, wVar);
                    bool10 = bool;
                case 9:
                    bool10 = (Boolean) aa.c.f.a(eVar, wVar);
                case 10:
                    bool = bool19;
                    bool11 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool10 = bool;
                case 11:
                    bool = bool19;
                    bool12 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool10 = bool;
                case 12:
                    bool = bool19;
                    a4Var = (a4) aa.c.b(aa.c.c(n5.a, true)).a(eVar, wVar);
                    bool10 = bool;
                case 13:
                    bool = bool19;
                    bool13 = (Boolean) aa.c.k.a(eVar, wVar);
                    bool10 = bool;
                case 14:
                    bool = bool19;
                    str7 = (String) aa.c.a.a(eVar, wVar);
                    bool10 = bool;
                case 15:
                    Boolean bool20 = bool11;
                    Boolean bool21 = bool12;
                    num = num7;
                    num2 = num8;
                    num3 = num9;
                    bool2 = bool14;
                    num4 = num10;
                    bool3 = bool15;
                    bool4 = bool16;
                    bool5 = bool17;
                    bool6 = bool18;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num6 = valueOf;
                    bool10 = bool19;
                    bool11 = bool20;
                    bool12 = bool21;
                    num7 = num;
                    num8 = num2;
                    num9 = num3;
                    bool14 = bool2;
                    num10 = num4;
                    bool15 = bool3;
                    bool16 = bool4;
                    bool17 = bool5;
                    bool18 = bool6;
                case 16:
                    bool7 = bool11;
                    bool8 = bool12;
                    num5 = num6;
                    num = num7;
                    num2 = num8;
                    num3 = num9;
                    bool2 = bool14;
                    num4 = num10;
                    bool3 = bool15;
                    bool4 = bool16;
                    bool5 = bool17;
                    bool6 = bool18;
                    bool9 = bool19;
                    String u = eVar.u();
                    k71.k.d(u);
                    fm.Companion.getClass();
                    Iterator it = fm.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((fm) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    fm fmVar2 = (fm) obj;
                    fmVar = fmVar2 == null ? fm.v : fmVar2;
                    bool10 = bool9;
                    bool11 = bool7;
                    bool12 = bool8;
                    num6 = num5;
                    num7 = num;
                    num8 = num2;
                    num9 = num3;
                    bool14 = bool2;
                    num10 = num4;
                    bool15 = bool3;
                    bool16 = bool4;
                    bool17 = bool5;
                    bool18 = bool6;
                case 17:
                    Boolean bool22 = bool11;
                    Boolean bool23 = bool12;
                    Integer num11 = num6;
                    num2 = num8;
                    num3 = num9;
                    bool2 = bool14;
                    num4 = num10;
                    bool3 = bool15;
                    bool4 = bool16;
                    bool5 = bool17;
                    bool6 = bool18;
                    long nextLong2 = eVar.nextLong();
                    if (nextLong2 > 2147483647L) {
                        while (nextLong2 > 2147483647L) {
                            nextLong2 = jo.f4Shadow.c(1, nextLong2, "substring(...)");
                        }
                        valueOf2 = Integer.valueOf((int) nextLong2);
                    } else {
                        valueOf2 = Integer.valueOf((int) nextLong2);
                    }
                    num7 = valueOf2;
                    bool10 = bool19;
                    bool11 = bool22;
                    bool12 = bool23;
                    num6 = num11;
                    num8 = num2;
                    num9 = num3;
                    bool14 = bool2;
                    num10 = num4;
                    bool15 = bool3;
                    bool16 = bool4;
                    bool17 = bool5;
                    bool18 = bool6;
                case 18:
                    Boolean bool24 = bool11;
                    Boolean bool25 = bool12;
                    Integer num12 = num6;
                    Integer num13 = num7;
                    num3 = num9;
                    bool2 = bool14;
                    num4 = num10;
                    bool3 = bool15;
                    bool4 = bool16;
                    bool5 = bool17;
                    bool6 = bool18;
                    long nextLong3 = eVar.nextLong();
                    if (nextLong3 > 2147483647L) {
                        while (nextLong3 > 2147483647L) {
                            nextLong3 = jo.f4Shadow.c(1, nextLong3, "substring(...)");
                        }
                        valueOf3 = Integer.valueOf((int) nextLong3);
                    } else {
                        valueOf3 = Integer.valueOf((int) nextLong3);
                    }
                    num8 = valueOf3;
                    bool10 = bool19;
                    bool11 = bool24;
                    bool12 = bool25;
                    num6 = num12;
                    num7 = num13;
                    num9 = num3;
                    bool14 = bool2;
                    num10 = num4;
                    bool15 = bool3;
                    bool16 = bool4;
                    bool17 = bool5;
                    bool18 = bool6;
                case 19:
                    Boolean bool26 = bool11;
                    Boolean bool27 = bool12;
                    Integer num14 = num6;
                    Integer num15 = num7;
                    Integer num16 = num8;
                    bool2 = bool14;
                    num4 = num10;
                    bool3 = bool15;
                    bool4 = bool16;
                    bool5 = bool17;
                    bool6 = bool18;
                    long nextLong4 = eVar.nextLong();
                    if (nextLong4 > 2147483647L) {
                        while (nextLong4 > 2147483647L) {
                            nextLong4 = jo.f4Shadow.c(1, nextLong4, "substring(...)");
                        }
                        valueOf4 = Integer.valueOf((int) nextLong4);
                    } else {
                        valueOf4 = Integer.valueOf((int) nextLong4);
                    }
                    num9 = valueOf4;
                    bool10 = bool19;
                    bool11 = bool26;
                    bool12 = bool27;
                    num6 = num14;
                    num7 = num15;
                    num8 = num16;
                    bool14 = bool2;
                    num10 = num4;
                    bool15 = bool3;
                    bool16 = bool4;
                    bool17 = bool5;
                    bool18 = bool6;
                case 20:
                    bool7 = bool11;
                    bool8 = bool12;
                    num5 = num6;
                    num = num7;
                    num2 = num8;
                    num3 = num9;
                    bool2 = bool14;
                    num4 = num10;
                    bool3 = bool15;
                    bool4 = bool16;
                    bool5 = bool17;
                    bool6 = bool18;
                    bool9 = bool19;
                    String u2 = eVar.u();
                    k71.k.d(u2);
                    ff.Companion.getClass();
                    Iterator it2 = ff.w.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (((ff) obj2).r.equals(u2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    ff ffVar2 = (ff) obj2;
                    ffVar = ffVar2 == null ? ff.u : ffVar2;
                    bool10 = bool9;
                    bool11 = bool7;
                    bool12 = bool8;
                    num6 = num5;
                    num7 = num;
                    num8 = num2;
                    num9 = num3;
                    bool14 = bool2;
                    num10 = num4;
                    bool15 = bool3;
                    bool16 = bool4;
                    bool17 = bool5;
                    bool18 = bool6;
                case 21:
                    bool = bool19;
                    n4Var = (n4) aa.c.b(aa.c.c(a6.a, true)).a(eVar, wVar);
                    bool10 = bool;
                case 22:
                    bool = bool19;
                    m4Var = (m4) aa.c.b(aa.c.c(z5.a, false)).a(eVar, wVar);
                    bool10 = bool;
                case 23:
                    bool = bool19;
                    nlVar = (nl) aa.c.b(ic0.b.b).a(eVar, wVar);
                    bool10 = bool;
                case 24:
                    bool = bool19;
                    bool14 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool10 = bool;
                case 25:
                    bool = bool19;
                    d5Var = (d5) aa.c.c(r6.a, false).a(eVar, wVar);
                    bool10 = bool;
                case 26:
                    bool = bool19;
                    b4Var = (b4) aa.c.b(aa.c.c(o5.a, false)).a(eVar, wVar);
                    bool10 = bool;
                case 27:
                    bool = bool19;
                    str8 = (String) aa.c.a.a(eVar, wVar);
                    bool10 = bool;
                case 28:
                    bool = bool19;
                    i4Var = (i4) aa.c.b(aa.c.c(v5.a, false)).a(eVar, wVar);
                    bool10 = bool;
                case 29:
                    bool = bool19;
                    str9 = (String) aa.c.a.a(eVar, wVar);
                    bool10 = bool;
                case 30:
                    bool = bool19;
                    o4Var = (o4) aa.c.b(aa.c.c(b6.a, true)).a(eVar, wVar);
                    bool10 = bool;
                case 31:
                    bool = bool19;
                    a5Var = (a5) aa.c.c(n6.a, false).a(eVar, wVar);
                    bool10 = bool;
                case 32:
                    bool = bool19;
                    e5Var = (e5) aa.c.b(aa.c.c(s6.a, false)).a(eVar, wVar);
                    bool10 = bool;
                case 33:
                    bool = bool19;
                    l4Var = (l4) aa.c.b(aa.c.c(y5.a, false)).a(eVar, wVar);
                    bool10 = bool;
                case 34:
                    bool = bool19;
                    k4Var = (k4) aa.c.b(aa.c.c(x5.a, false)).a(eVar, wVar);
                    bool10 = bool;
                case 35:
                    bool = bool19;
                    arrayList = aa.c.a(aa.c.b(aa.c.c(v6.a, false))).c(eVar, wVar);
                    bool10 = bool;
                case 36:
                    Boolean bool28 = bool11;
                    Boolean bool29 = bool12;
                    Integer num17 = num6;
                    Integer num18 = num7;
                    Integer num19 = num8;
                    Integer num20 = num9;
                    Boolean bool30 = bool14;
                    bool3 = bool15;
                    bool4 = bool16;
                    bool5 = bool17;
                    bool6 = bool18;
                    long nextLong5 = eVar.nextLong();
                    if (nextLong5 > 2147483647L) {
                        while (nextLong5 > 2147483647L) {
                            nextLong5 = jo.f4Shadow.c(1, nextLong5, "substring(...)");
                        }
                        valueOf5 = Integer.valueOf((int) nextLong5);
                    } else {
                        valueOf5 = Integer.valueOf((int) nextLong5);
                    }
                    num10 = valueOf5;
                    bool10 = bool19;
                    bool11 = bool28;
                    bool12 = bool29;
                    num6 = num17;
                    num7 = num18;
                    num8 = num19;
                    num9 = num20;
                    bool14 = bool30;
                    bool15 = bool3;
                    bool16 = bool4;
                    bool17 = bool5;
                    bool18 = bool6;
                case 37:
                    bool = bool19;
                    g4Var = (g4) aa.c.c(t5.a, false).a(eVar, wVar);
                    bool10 = bool;
                case 38:
                    bool = bool19;
                    i5Var = (i5) aa.c.b(aa.c.c(w6.a, false)).a(eVar, wVar);
                    bool10 = bool;
                case 39:
                    bool = bool19;
                    bool15 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool10 = bool;
                case 40:
                    bool = bool19;
                    bool16 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool10 = bool;
                case 41:
                    bool = bool19;
                    bool17 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool10 = bool;
                case 42:
                    bool = bool19;
                    bool18 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool10 = bool;
            }
            eVar.s0();
            c40.c c = c40.e.c(eVar, wVar);
            eVar.s0();
            i80.e eVar2 = i80.e.a;
            i80.c c2 = i80.e.c(eVar, wVar);
            eVar.s0();
            g70.a c3 = g70.b.c(eVar, wVar);
            eVar.s0();
            i30.i c4 = i30.j.c(eVar, wVar);
            eVar.s0();
            c60.j c5 = c60.n.c(eVar, wVar);
            eVar.s0();
            i60.e c6 = i60.g.c(eVar, wVar);
            eVar.s0();
            aa0.a c7 = aa0.b.c(eVar, wVar);
            eVar.s0();
            l7 c8 = o7.c(eVar, wVar);
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
            if (bool19 == null) {
                k41.b.B(eVar, "viewerCanDeleteHeadRef");
                throw null;
            }
            Boolean bool31 = bool11;
            boolean booleanValue = bool19.booleanValue();
            if (bool31 == null) {
                k41.b.B(eVar, "viewerDidAuthor");
                throw null;
            }
            Boolean bool32 = bool12;
            boolean booleanValue2 = bool31.booleanValue();
            if (bool32 == null) {
                k41.b.B(eVar, "locked");
                throw null;
            }
            Integer num21 = num6;
            boolean booleanValue3 = bool32.booleanValue();
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
            if (fmVar == null) {
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
            Boolean bool33 = bool14;
            int intValue4 = num24.intValue();
            if (ffVar == null) {
                k41.b.B(eVar, "mergeStateStatus");
                throw null;
            }
            if (bool33 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            Integer num25 = num10;
            boolean booleanValue4 = bool33.booleanValue();
            if (d5Var == null) {
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
            if (a5Var == null) {
                k41.b.B(eVar, "projectCards");
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
            Boolean bool34 = bool15;
            int intValue5 = num25.intValue();
            if (g4Var == null) {
                k41.b.B(eVar, "commits");
                throw null;
            }
            if (bool34 == null) {
                k41.b.B(eVar, "viewerCanReopen");
                throw null;
            }
            Boolean bool35 = bool16;
            boolean booleanValue5 = bool34.booleanValue();
            if (bool35 == null) {
                k41.b.B(eVar, "viewerCanMergeAsAdmin");
                throw null;
            }
            Boolean bool36 = bool17;
            boolean booleanValue6 = bool35.booleanValue();
            if (bool36 == null) {
                k41.b.B(eVar, "viewerCanAssign");
                throw null;
            }
            Boolean bool37 = bool18;
            boolean booleanValue7 = bool36.booleanValue();
            if (bool37 != null) {
                return new l5(str, str2, str3, str4, j4Var, c4Var, str5, str6, zonedDateTime, booleanValue, booleanValue2, booleanValue3, a4Var, bool13, str7, intValue, fmVar, intValue2, intValue3, intValue4, ffVar, n4Var, m4Var, nlVar, booleanValue4, d5Var, b4Var, str8, i4Var, str9, o4Var, a5Var, e5Var, l4Var, k4Var, arrayList, intValue5, g4Var, i5Var, booleanValue5, booleanValue6, booleanValue7, bool37.booleanValue(), c, c2, c3, c4, c5, c6, c7, c8, c9);
            }
            k41.b.B(eVar, "viewerCanLabel");
            throw null;
        }
    }
}
