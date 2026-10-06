package bx0;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequest$ReviewerReviewState;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.type.IssueState;
import com.google.android.gms.internal.measurement.b4;
import fw0.c1;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m7.y;
import ur0.j0;
import ur0.k0;
import x61.rShadow;
import xt0.t1;
import xt0.u1;
import yz0.b2;
import yz0.d2;
import yz0.e2;
import yz0.f2;
import yz0.m2;
import yz0.n2;
import yz0.o3;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final b2 a(c1 c1Var) {
        String str = c1Var.d;
        Avatar L = y.L(c1Var.g);
        String str2 = c1Var.b;
        String str3 = c1Var.c;
        if (str3 == null) {
            str3 = "";
        }
        return new b2(str, L, str2, str3, false, false, 96);
    }

    public static final m2 b(k0 k0Var, boolean z) {
        k71.k.g(k0Var, "<this>");
        r01.e eVar = IssueState.Companion;
        String str = k0Var.b.r;
        eVar.getClass();
        IssueState b = r01.e.b(str);
        String str2 = k0Var.a;
        String str3 = k0Var.c;
        String str4 = k0Var.d;
        int i = k0Var.e;
        j0 j0Var = k0Var.f;
        return new m2(b, b4.k0(k0Var.g), str2, str3, str4, i, j0Var.b, j0Var.c.b, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, x61.rShadow] */
    public static final List c(is0.e eVar) {
        ArrayList arrayList;
        List<is0.b> list;
        m2 m2Var;
        List<is0.c> list2;
        is0.d dVar = eVar.b;
        ArrayList arrayList2 = null;
        if (dVar == null || (list2 = dVar.a) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (is0.c cVar : list2) {
                String str = cVar != null ? cVar.a : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        x61.rShadow r0 = (x61.rShadow) (rShadow.r);
        if (arrayList == null) {
            arrayList = r0;
        }
        is0.a aVar = eVar.c;
        if (aVar != null && (list = aVar.a) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (is0.b bVar : list) {
                if (bVar != null) {
                    k0 k0Var = bVar.c;
                    m2Var = b(k0Var, arrayList.contains(k0Var.a));
                } else {
                    m2Var = null;
                }
                if (m2Var != null) {
                    arrayList3.add(m2Var);
                }
            }
            arrayList2 = arrayList3;
        }
        return arrayList2 == null ? r0 : arrayList2;
    }

    public static final n2 d(u1 u1Var, boolean z) {
        k71.k.g(u1Var, "<this>");
        o3 o3Var = PullRequestState.Companion;
        String str = u1Var.b.r;
        o3Var.getClass();
        PullRequestState b = o3.b(str);
        boolean z2 = u1Var.f;
        String str2 = u1Var.a;
        String str3 = u1Var.c;
        String str4 = u1Var.d;
        int i = u1Var.e;
        t1 t1Var = u1Var.g;
        return new n2(b, z2, u1Var.h, str2, str3, str4, i, t1Var.b, t1Var.c.b, z);
    }

    public static final e2 e(bv0.a aVar, boolean z) {
        k71.k.g(aVar, "<this>");
        String str = aVar.c;
        String str2 = aVar.d;
        if (str2 == null) {
            str2 = "";
        }
        return new e2(new com.github.service.models.response.a(str, new Avatar(str2, Avatar.Type.Organization), (String) null, false, (String) null, 60), IssueOrPullRequest$ReviewerReviewState.PENDING, aVar.b, f2.b, z, 64);
    }

    public static final e2 f(bv0.b bVar, boolean z, cu0.l lVar) {
        k71.k.g(bVar, "<this>");
        return new e2(new com.github.service.models.response.a(bVar.c, y.L(bVar.d), (String) null, false, (String) null, 60), IssueOrPullRequest$ReviewerReviewState.PENDING, true, bVar.b, f2.d, z, lVar != null ? h(lVar) : null);
    }

    public static final e2 g(cu0.l lVar) {
        IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState;
        cu0.k kVar;
        k71.k.g(lVar, "<this>");
        cu0.g gVar = lVar.d;
        com.github.service.models.response.a aVar = new com.github.service.models.response.a(gVar != null ? gVar.b : "", y.L(gVar != null ? gVar.d : null), (String) null, false, (String) null, 60);
        int ordinal = lVar.e.ordinal();
        if (ordinal == 0) {
            issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.APPROVED;
        } else if (ordinal == 1) {
            issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.CHANGES_REQUESTED;
        } else if (ordinal == 2) {
            issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.COMMENTED;
        } else if (ordinal == 3) {
            issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.DISMISSED;
        } else if (ordinal == 4) {
            issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.PENDING;
        } else {
            if (ordinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.UNKNOWN;
        }
        return new e2(aVar, issueOrPullRequest$ReviewerReviewState, lVar.c, (gVar == null || (kVar = gVar.c) == null) ? lVar.b : kVar.a, f2.d, false, h(lVar));
    }

    public static final d2 h(cu0.l lVar) {
        IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState;
        String str = lVar.b;
        Iterable iterable = lVar.f.a;
        if (iterable == null) {
            iterable = rShadow.r;
        }
        ArrayList S = x61.m.S(iterable);
        ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
        int size = S.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = S.get(i);
            i++;
            arrayList.add(((cu0.i) obj).b);
        }
        int ordinal = lVar.e.ordinal();
        if (ordinal == 0) {
            issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.APPROVED;
        } else if (ordinal == 1) {
            issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.CHANGES_REQUESTED;
        } else if (ordinal == 2) {
            issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.COMMENTED;
        } else if (ordinal == 3) {
            issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.DISMISSED;
        } else if (ordinal == 4) {
            issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.PENDING;
        } else {
            if (ordinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.UNKNOWN;
        }
        if (lVar.g.length() == 0 && lVar.h.a == 0) {
            z = true;
        }
        return new d2(str, arrayList, issueOrPullRequest$ReviewerReviewState, z);
    }
    public static final Object a = null;
}
