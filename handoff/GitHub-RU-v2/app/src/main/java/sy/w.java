package sy;

import android.graphics.Color;
import android.view.View;
import android.view.ViewParent;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.LegacyProjectWithNumber;
import com.github.service.models.response.ProjectState;
import com.github.service.models.response.SimpleLegacyProject;
import com.github.service.models.response.TimelineItem;
import com.github.service.models.response.discussions.type.DiscussionStateReason;
import com.github.service.models.response.home.NavLinkIdentifier;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.type.DiffLineType;
import gn0.s8;
import hc0.dk;
import hc0.wz;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m10.kk;
import m10.tf0;
import m10.yi;
import m10.zd;
import pz0.g7;
import v8.l0;
import vn0.g2;
import x6.n0;
import x6.p0;
import yz0.a7;
import yz0.b6;
import yz0.c6;
import yz0.c7;
import yz0.h6;
import yz0.k0;
import yz0.n7;
import yz0.o5;
import yz0.o6;
import yz0.o7;
import yz0.p5;
import yz0.q6;
import yz0.r7;
import yz0.t6;
import yz0.u5;
import yz0.u6;
import yz0.x2;
import yz0.z6;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class w {
    public static final wz A(NavLinkIdentifier navLinkIdentifier) {
        k71.k.g(navLinkIdentifier, "<this>");
        switch (ya0.a.a[navLinkIdentifier.ordinal()]) {
            case 1:
                return wz.t;
            case 2:
                return wz.u;
            case 3:
                return wz.v;
            case 4:
                return wz.w;
            case 5:
                return wz.x;
            case 6:
                return wz.y;
            case 7:
                return wz.z;
            case 8:
                return wz.A;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final t10.g B(g7 g7Var) {
        switch (g7Var.ordinal()) {
            case 0:
                return t10.g.r;
            case 1:
            case 7:
            case 9:
            case 11:
                return t10.g.z;
            case 2:
                return t10.g.w;
            case 3:
                return t10.g.y;
            case 4:
                return t10.g.x;
            case 5:
                return t10.g.s;
            case 6:
                return t10.g.v;
            case 8:
                return t10.g.t;
            case 10:
                return t10.g.u;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ProjectState C(dk dkVar) {
        k71.k.g(dkVar, "<this>");
        int ordinal = dkVar.ordinal();
        if (ordinal == 0) {
            return ProjectState.CLOSED;
        }
        if (ordinal == 1) {
            return ProjectState.OPEN;
        }
        if (ordinal == 2) {
            return ProjectState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final w61.t D(String str) {
        int i;
        r.m(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (k71.k.h(charAt, 48) < 0) {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, i3) > 0) {
                if (i3 != 119304647) {
                    return null;
                }
                i3 = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, i3) > 0) {
                    return null;
                }
            }
            int i4 = i2 * 10;
            int i5 = digit + i4;
            if (Integer.compareUnsigned(i5, i4) < 0) {
                return null;
            }
            i++;
            i2 = i5;
        }
        return new w61.t(i2);
    }

    public static final w61.v E(String str) {
        k71.k.g(str, "<this>");
        r.m(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        if (k71.k.h(charAt, 48) < 0) {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long j = 10;
        long j2 = 0;
        long j3 = 512409557603043100L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j2, j3) > 0) {
                if (j3 != 512409557603043100L) {
                    return null;
                }
                j3 = Long.divideUnsigned(-1L, j);
                if (Long.compareUnsigned(j2, j3) > 0) {
                    return null;
                }
            }
            long j4 = j2 * j;
            long j5 = (digit & 4294967295L) + j4;
            if (Long.compareUnsigned(j5, j4) < 0) {
                return null;
            }
            i++;
            j2 = j5;
        }
        return new w61.v(j2);
    }

    public static final LegacyProjectWithNumber a(String str, String str2, t70.a aVar) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        return new LegacyProjectWithNumber(new SimpleLegacyProject(aVar.b, aVar.a, C(aVar.c), (String) null), aVar.d, str, str2);
    }

    public static final u5 b(iq.c cVar) {
        k71.k.g(cVar, "<this>");
        iq.a aVar = cVar.c;
        com.github.service.models.response.a e = l0.e(aVar != null ? aVar.b : null);
        iq.b bVar = cVar.d;
        return new u5(e, l0.e(bVar != null ? bVar.b : null), cVar.e);
    }

    public static final b6 c(yq.n nVar) {
        k.w wVar;
        yq.g gVar;
        IssueOrPullRequestState issueOrPullRequestState;
        ct.c cVar;
        yq.f fVar;
        k71.k.g(nVar, "<this>");
        String str = nVar.b;
        yq.a aVar = nVar.d;
        com.github.service.models.response.a e = l0.e(aVar != null ? aVar.b : null);
        yq.d dVar = nVar.f;
        if (dVar != null && (fVar = dVar.b) != null) {
            String str2 = fVar.a;
            yq.kShadow kVar = fVar.e;
            String str3 = fVar.b;
            String str4 = fVar.c;
            yq.b bVar = fVar.d;
            wVar = new o5(new Avatar(bVar != null ? bVar.b : "", bVar != null ? bVar.a : ""), str2, str3, str4, !kVar.a.equals(str) ? String.format("%s/%s", Arrays.copyOf(new Object[]{kVar.c.b, kVar.b}, 2)) : null);
        } else if (dVar == null || (gVar = dVar.c) == null) {
            wVar = null;
        } else {
            yq.h hVar = nVar.e.b;
            String str5 = hVar != null ? hVar.a.a : null;
            String str6 = gVar.b;
            yq.l lVar = gVar.d;
            String str7 = lVar.b;
            yq.i iVar = lVar.d;
            String str8 = iVar.b;
            int i = gVar.a;
            int ordinal = gVar.c.ordinal();
            if (ordinal == 0) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
            } else if (ordinal == 1) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
            } else if (ordinal == 2) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
            } else {
                if (ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
            }
            wVar = new p5(str, str6, str8, str7, i, issueOrPullRequestState, lVar.c, gVar.e, gVar.f, !lVar.a.equals(str5) ? String.format("%s/%s", Arrays.copyOf(new Object[]{iVar.b, str7}, 2)) : null);
        }
        ZonedDateTime zonedDateTime = nVar.h;
        CloseReason w = w(nVar.c);
        yq.e eVar = nVar.g;
        return new b6(e, wVar, zonedDateTime, w, (eVar == null || (cVar = eVar.c) == null) ? null : c.j(cVar));
    }

    public static final c6 d(cr.c cVar) {
        k71.k.g(cVar, "<this>");
        cr.b bVar = cVar.d;
        com.github.service.models.response.a e = l0.e(bVar != null ? bVar.b : null);
        cr.a aVar = cVar.c;
        return new c6(e, l0.e(aVar != null ? aVar.b : null), cVar.e);
    }

    public static final h6 e(sr.j jVar) {
        int i;
        String str;
        String str2;
        sr.g gVar;
        String str3;
        sr.h hVar;
        sr.f fVar;
        eq.c cVar;
        sr.h hVar2;
        IssueOrPullRequestState issueOrPullRequestState;
        sr.h hVar3;
        boolean z;
        sr.g gVar2;
        yi yiVar;
        sr.g gVar3;
        String str4;
        sr.g gVar4;
        sr.e eVar;
        eq.c cVar2;
        sr.h hVar4;
        k71.k.g(jVar, "<this>");
        sr.i iVar = jVar.e;
        sr.a aVar = jVar.c;
        Boolean bool = null;
        com.github.service.models.response.a e = l0.e(aVar != null ? aVar.b : null);
        String str5 = jVar.b;
        boolean z2 = jVar.d;
        sr.c cVar3 = iVar.b;
        if (cVar3 != null) {
            i = cVar3.b;
        } else {
            sr.d dVar = iVar.c;
            i = dVar != null ? dVar.b : 0;
        }
        String str6 = "";
        if (cVar3 == null || (str = cVar3.c) == null) {
            sr.d dVar2 = iVar.c;
            str = dVar2 != null ? dVar2.c : "";
        }
        if (cVar3 == null || (hVar4 = cVar3.e) == null || (str2 = hVar4.b) == null) {
            sr.d dVar3 = iVar.c;
            str2 = (dVar3 == null || (gVar = dVar3.e) == null) ? "" : gVar.b;
        }
        sr.d dVar4 = iVar.c;
        if (dVar4 == null || (gVar4 = dVar4.e) == null || (eVar = gVar4.d) == null || (cVar2 = eVar.b) == null || (str3 = cVar2.b) == null) {
            str3 = (cVar3 == null || (hVar = cVar3.e) == null || (fVar = hVar.d) == null || (cVar = fVar.b) == null) ? "" : cVar.b;
        }
        if (dVar4 != null && (gVar3 = dVar4.e) != null && (str4 = gVar3.c) != null) {
            str6 = str4;
        } else if (cVar3 != null && (hVar2 = cVar3.e) != null) {
            str6 = hVar2.c;
        }
        if (cVar3 != null) {
            int ordinal = cVar3.d.ordinal();
            if (ordinal == 0) {
                issueOrPullRequestState = IssueOrPullRequestState.ISSUE_CLOSED;
            } else if (ordinal == 1) {
                issueOrPullRequestState = IssueOrPullRequestState.ISSUE_OPEN;
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
            }
        } else if (dVar4 != null) {
            int ordinal2 = dVar4.d.ordinal();
            if (ordinal2 == 0) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
            } else if (ordinal2 == 1) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
            } else if (ordinal2 == 2) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
            } else {
                if (ordinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
            }
        } else {
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        }
        sr.c cVar4 = iVar.b;
        CloseReason w = (cVar4 == null || (yiVar = cVar4.g) == null) ? null : w(yiVar);
        sr.d dVar5 = iVar.c;
        if (dVar5 == null || (gVar2 = dVar5.e) == null) {
            sr.c cVar5 = iVar.b;
            if (cVar5 != null && (hVar3 = cVar5.e) != null) {
                z = hVar3.e;
            }
            boolean b = k71.k.b(bool, Boolean.TRUE);
            sr.d dVar6 = iVar.c;
            return new h6(e, str5, z2, i, str, str2, str3, str6, issueOrPullRequestState, w, b, dVar6 == null && dVar6.f, dVar6 == null && dVar6.g, jVar.f);
        }
        z = gVar2.e;
        bool = Boolean.valueOf(z);
        boolean b2 = k71.k.b(bool, Boolean.TRUE);
        sr.d dVar62 = iVar.c;
        if (dVar62 == null) {
        }
        return new h6(e, str5, z2, i, str, str2, str3, str6, issueOrPullRequestState, w, b2, dVar62 == null && dVar62.f, dVar62 == null && dVar62.g, jVar.f);
    }

    public static final o6 f(et.a aVar) {
        k71.k.g(aVar, "<this>");
        ar.c cVar = aVar.d;
        String str = aVar.b;
        String str2 = cVar.b;
        fz.b bVar = new fz.b(cVar, str, new yz0.d0(str2));
        pv.c cVar2 = aVar.e;
        ArrayList h = w8.s.h(str2, cVar2);
        boolean z = cVar2.c;
        x2 f = k41.b.f(aVar.h);
        ZonedDateTime zonedDateTime = cVar.i;
        pu.a aVar2 = aVar.f;
        return new o6(bVar, h, z, f, zonedDateTime, aVar2.b, aVar2.c);
    }

    public static final q6 g(nt.c cVar) {
        int i;
        k71.k.g(cVar, "<this>");
        jt.a aVar = cVar.d.c;
        nt.a aVar2 = cVar.c;
        com.github.service.models.response.a e = l0.e(aVar2 != null ? aVar2.b : null);
        String C = t71.w.C(aVar.c, " ", " ");
        try {
            String str = aVar.d;
            if (!t71.w.F(str, "#", false)) {
                str = "#".concat(str);
            }
            i = Color.parseColor(str);
        } catch (Exception unused) {
            i = -16777216;
        }
        return new q6(e, C, i, cVar.e);
    }

    public static final t6 h(vt.b bVar) {
        k71.k.g(bVar, "<this>");
        kk kkVar = bVar.d;
        int i = kkVar == null ? -1 : v.a[kkVar.ordinal()];
        TimelineItem.TimelineLockedEvent.Reason reason = i != 1 ? i != 2 ? i != 3 ? i != 4 ? TimelineItem.TimelineLockedEvent.Reason.UNKNOWN : TimelineItem.TimelineLockedEvent.Reason.RESOLVED : TimelineItem.TimelineLockedEvent.Reason.TOO_HEATED : TimelineItem.TimelineLockedEvent.Reason.SPAM : TimelineItem.TimelineLockedEvent.Reason.OFF_TOPIC;
        vt.a aVar = bVar.c;
        return new t6(reason, l0.e(aVar != null ? aVar.b : null), bVar.e);
    }

    public static final u6 i(xt.kShadow kVar) {
        String str;
        String str2;
        xt.h hVar;
        IssueOrPullRequestState issueOrPullRequestState;
        xt.g gVar;
        String str3;
        String str4;
        String str5;
        boolean z;
        String str6;
        IssueOrPullRequestState issueOrPullRequestState2;
        String str7;
        boolean z2;
        xt.f fVar;
        xt.d dVar;
        ct.c cVar;
        xt.h hVar2;
        xt.h hVar3;
        xt.g gVar2;
        xt.g gVar3;
        xt.g gVar4;
        yi yiVar;
        xt.h hVar4;
        xt.g gVar5;
        gw.c cVar2;
        gw.b bVar;
        gw.a aVar;
        eq.c cVar3;
        gw.c cVar4;
        gw.b bVar2;
        k71.k.g(kVar, "<this>");
        xt.b bVar3 = kVar.f;
        String str8 = kVar.b;
        xt.a aVar2 = kVar.c;
        z01.pShadow pVar = null;
        String q = l0.q(aVar2 != null ? aVar2.b : null);
        if (bVar3 == null || (cVar4 = bVar3.d) == null || (bVar2 = cVar4.b) == null || (str = bVar2.c) == null) {
            str = "";
        }
        if (bVar3 == null || (cVar2 = bVar3.d) == null || (bVar = cVar2.b) == null || (aVar = bVar.d) == null || (cVar3 = aVar.b) == null || (str2 = cVar3.b) == null) {
            str2 = "";
        }
        int i = (bVar3 == null || (gVar5 = bVar3.b) == null) ? (bVar3 == null || (hVar = bVar3.c) == null) ? 0 : hVar.c : gVar5.c;
        if (((bVar3 == null || (hVar4 = bVar3.c) == null) ? null : hVar4.e) != null) {
            int ordinal = bVar3.c.e.ordinal();
            if (ordinal == 0) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
            } else if (ordinal == 1) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
            } else if (ordinal == 2) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
            } else {
                if (ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
            }
        } else {
            if (((bVar3 == null || (gVar = bVar3.b) == null) ? null : gVar.e) != null) {
                int ordinal2 = bVar3.b.e.ordinal();
                if (ordinal2 == 0) {
                    issueOrPullRequestState = IssueOrPullRequestState.ISSUE_CLOSED;
                } else if (ordinal2 == 1) {
                    issueOrPullRequestState = IssueOrPullRequestState.ISSUE_OPEN;
                } else {
                    if (ordinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                }
            } else {
                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
            }
        }
        CloseReason w = (bVar3 == null || (gVar4 = bVar3.b) == null || (yiVar = gVar4.f) == null) ? null : w(yiVar);
        if (bVar3 == null || (gVar3 = bVar3.b) == null || (str3 = gVar3.d) == null) {
            str3 = "";
            str4 = str3;
        } else {
            str4 = "";
        }
        String str9 = str;
        String str10 = str2;
        int i2 = i;
        CloseReason closeReason = w;
        boolean z3 = kVar.e;
        if (bVar3 == null || (gVar2 = bVar3.b) == null || (str5 = gVar2.b) == null) {
            str5 = str4;
        }
        if (bVar3 == null || (hVar3 = bVar3.c) == null || !hVar3.f) {
            z = false;
            str6 = str5;
            issueOrPullRequestState2 = issueOrPullRequestState;
            str7 = str3;
            z2 = false;
        } else {
            z = false;
            issueOrPullRequestState2 = issueOrPullRequestState;
            str7 = str3;
            str6 = str5;
            z2 = true;
        }
        ZonedDateTime zonedDateTime = kVar.d;
        if (bVar3 != null && (hVar2 = bVar3.c) != null && hVar2.g) {
            z = true;
        }
        xt.c cVar5 = kVar.g;
        if (cVar5 != null && (fVar = cVar5.b) != null && (dVar = fVar.a) != null && (cVar = dVar.c) != null) {
            pVar = c.j(cVar);
        }
        return new u6(str8, q, str9, str10, i2, issueOrPullRequestState2, closeReason, str7, z3, str6, z2, z, zonedDateTime, pVar);
    }

    public static final z6 j(jv.d dVar) {
        String str;
        String str2;
        k71.k.g(dVar, "<this>");
        jv.b bVar = dVar.c;
        String str3 = bVar.b;
        String str4 = bVar.d;
        jv.a aVar = bVar.e;
        String str5 = "";
        if (aVar == null || (str = aVar.b) == null) {
            str = "";
        }
        if (aVar != null && (str2 = aVar.a) != null) {
            str5 = str2;
        }
        return new z6(str3, str4, new Avatar(str, str5), bVar.f);
    }

    public static final a7 k(lv.c cVar) {
        TimelineItem.TimelinePullRequestReview.ReviewState reviewState;
        k71.k.g(cVar, "<this>");
        String str = cVar.i.a;
        boolean z = cVar.d;
        int i = cVar.g.b;
        ar.c cVar2 = cVar.j;
        String str2 = cVar.e;
        String str3 = cVar2.b;
        fz.b bVar = new fz.b(cVar2, str2, new k0(str3));
        pv.c cVar3 = cVar.k;
        ArrayList h = w8.s.h(str3, cVar3);
        boolean z2 = cVar3.c;
        int ordinal = cVar.f.ordinal();
        if (ordinal == 0) {
            reviewState = TimelineItem.TimelinePullRequestReview.ReviewState.APPROVED;
        } else if (ordinal == 1) {
            reviewState = TimelineItem.TimelinePullRequestReview.ReviewState.CHANGES_REQUESTED;
        } else if (ordinal == 2) {
            reviewState = TimelineItem.TimelinePullRequestReview.ReviewState.COMMENTED;
        } else if (ordinal == 3) {
            reviewState = TimelineItem.TimelinePullRequestReview.ReviewState.DISMISSED;
        } else if (ordinal == 4) {
            reviewState = TimelineItem.TimelinePullRequestReview.ReviewState.PENDING;
        } else {
            if (ordinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            reviewState = TimelineItem.TimelinePullRequestReview.ReviewState.UNKNOWN;
        }
        TimelineItem.TimelinePullRequestReview.ReviewState reviewState2 = reviewState;
        ZonedDateTime zonedDateTime = cVar.c;
        if (zonedDateTime == null) {
            zonedDateTime = cVar.h;
        }
        pu.a aVar = cVar.l;
        return new a7(str, z, i, bVar, h, z2, reviewState2, zonedDateTime, aVar.b, aVar.c);
    }

    public static final c7 l(tv.f fVar) {
        String str;
        String str2;
        String str3;
        k71.k.g(fVar, "<this>");
        tv.a aVar = fVar.d;
        com.github.service.models.response.a e = l0.e(aVar != null ? aVar.b : null);
        tv.b bVar = fVar.f;
        String str4 = "";
        if (bVar == null || (str = bVar.d) == null) {
            str = "";
        }
        if (bVar == null || (str2 = bVar.b) == null) {
            str2 = "";
        }
        boolean z = fVar.c;
        tv.c cVar = fVar.e;
        eq.c cVar2 = cVar.d.b;
        if (cVar2 != null && (str3 = cVar2.b) != null) {
            str4 = str3;
        }
        return new c7(e, str, str2, z, str4, cVar.c, cVar.b, cVar.e, fVar.g);
    }

    public static final n7 m(ex.c cVar) {
        k71.k.g(cVar, "<this>");
        ex.a aVar = cVar.c;
        com.github.service.models.response.a e = l0.e(aVar != null ? aVar.b : null);
        ex.b bVar = cVar.d;
        return new n7(e, l0.e(bVar != null ? bVar.b : null), cVar.e);
    }

    public static final o7 n(gx.c cVar) {
        int i;
        k71.k.g(cVar, "<this>");
        jt.a aVar = cVar.d.c;
        gx.a aVar2 = cVar.c;
        com.github.service.models.response.a e = l0.e(aVar2 != null ? aVar2.b : null);
        String C = t71.w.C(aVar.c, " ", " ");
        try {
            String str = aVar.d;
            if (!t71.w.F(str, "#", false)) {
                str = "#".concat(str);
            }
            i = Color.parseColor(str);
        } catch (Exception unused) {
            i = -16777216;
        }
        return new o7(e, C, i, cVar.e);
    }

    public static final r7 o(tx.c cVar) {
        k71.k.g(cVar, "<this>");
        String str = cVar.b;
        tx.a aVar = cVar.c;
        String q = l0.q(aVar != null ? aVar.b : null);
        tx.b bVar = cVar.d;
        return new r7(str, q, l0.q(bVar != null ? bVar.c : null), cVar.e != tf0.t, cVar.f);
    }

    public static final mn.p p(g2 g2Var) {
        k71.k.g(g2Var, "<this>");
        mn.oShadow oVar = mn.p.Companion;
        List list = g2Var.a;
        String str = g2Var.e;
        String str2 = g2Var.b;
        boolean z = g2Var.c;
        String str3 = g2Var.f;
        mn.q valueOf = mn.q.valueOf(g2Var.d.name());
        oVar.getClass();
        return mn.o.a(list, str2, z, str3, valueOf, str);
    }

    public static u q(int i) {
        if (i != 0 && i == 1) {
            return new u31.e();
        }
        return new u31.l();
    }

    public static String r(Class cls) {
        LinkedHashMap linkedHashMap = p0.b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            n0 annotation = cls.getAnnotation(n0.class);
            str = annotation != null ? annotation.value() : null;
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, str);
        }
        k71.k.d(str);
        return str;
    }

    public static w61.h s(w61.i iVar, j71.a aVar) {
        w61.xShadow xVar = w61.x.a;
        int ordinal = iVar.ordinal();
        if (ordinal == 0) {
            return new w61.p(aVar);
        }
        if (ordinal == 1) {
            w61.oShadow oVar = new w61.o();
            oVar.r = aVar;
            oVar.s = xVar;
            return oVar;
        }
        if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        w61.b0 b0Var = new w61.b0();
        b0Var.r = aVar;
        b0Var.s = xVar;
        return b0Var;
    }

    public static w61.p t(j71.a aVar) {
        k71.k.g(aVar, "initializer");
        return new w61.p(aVar);
    }

    public static void u(View view, u31.j jVar) {
        m31.a aVar = jVar.s.c;
        if (aVar == null || !aVar.a) {
            return;
        }
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += ((View) parent).getElevation();
        }
        u31.h hVar = jVar.s;
        if (hVar.m != f) {
            hVar.m = f;
            jVar.x();
        }
    }

    public static final NavLinkIdentifier v(wz wzVar) {
        switch (wzVar.ordinal()) {
            case 0:
                return NavLinkIdentifier.DISCUSSIONS;
            case 1:
                return NavLinkIdentifier.ISSUES;
            case 2:
                return NavLinkIdentifier.ORGANIZATIONS;
            case 3:
                return NavLinkIdentifier.PROJECTS;
            case 4:
                return NavLinkIdentifier.PULL_REQUESTS;
            case 5:
                return NavLinkIdentifier.REPOSITORIES;
            case 6:
                return NavLinkIdentifier.STARRED;
            case 7:
                return NavLinkIdentifier.UNKNOWN__;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final CloseReason w(yi yiVar) {
        int i = yiVar == null ? -1 : v.b[yiVar.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return CloseReason.Completed;
        }
        if (i == 2) {
            return CloseReason.NotPlanned;
        }
        if (i == 3) {
            return CloseReason.Duplicate;
        }
        if (i == 4 || i == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final f01.e x(gv.i iVar) {
        gv.g gVar = iVar.c;
        if (gVar != null) {
            return new f01.d(gVar.b, gVar.c, gVar.d, gVar.e);
        }
        gv.e eVar = iVar.b;
        if (eVar != null) {
            return new f01.a(eVar.b, eVar.c, eVar.d);
        }
        gv.h hVar = iVar.d;
        if (hVar == null) {
            return iVar.e != null ? new f01.b() : new f01.b();
        }
        return new f01.c(hVar.f, hVar.g, hVar.b, hVar.c, hVar.d, hVar.e);
    }

    public static final DiscussionStateReason y(zd zdVar) {
        k71.k.g(zdVar, "<this>");
        int ordinal = zdVar.ordinal();
        if (ordinal == 0) {
            return DiscussionStateReason.DUPLICATE;
        }
        if (ordinal == 1) {
            return DiscussionStateReason.OUTDATED;
        }
        if (ordinal == 2) {
            return DiscussionStateReason.REOPENED;
        }
        if (ordinal == 3) {
            return DiscussionStateReason.RESOLVED;
        }
        if (ordinal == 4) {
            return DiscussionStateReason.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final DiffLineType z(s8 s8Var) {
        int ordinal = s8Var.ordinal();
        if (ordinal == 0) {
            return DiffLineType.ADDITION;
        }
        if (ordinal == 1) {
            return DiffLineType.CONTEXT;
        }
        if (ordinal == 2) {
            return DiffLineType.DELETION;
        }
        if (ordinal == 3) {
            return DiffLineType.HUNK;
        }
        if (ordinal == 4) {
            return DiffLineType.INJECTED_CONTEXT;
        }
        if (ordinal == 5) {
            return DiffLineType.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }
}
