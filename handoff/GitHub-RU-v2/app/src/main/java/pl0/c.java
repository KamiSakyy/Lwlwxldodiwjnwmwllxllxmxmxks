package pl0;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequest$ReviewerReviewState;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.type.IssueState;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import mg0.f0;
import mg0.g0;
import ri0.t1;
import ri0.u1;
import x61.r;
import yz0.d2;
import yz0.e2;
import yz0.f2;
import yz0.m2;
import yz0.n2;
import yz0.o3;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final m2 a(g0 g0Var, boolean z) {
        k71.k.g(g0Var, "<this>");
        r01.e eVar = IssueState.Companion;
        String str = g0Var.b.r;
        eVar.getClass();
        IssueState b = r01.e.b(str);
        String str2 = g0Var.a;
        String str3 = g0Var.c;
        String str4 = g0Var.d;
        int i = g0Var.e;
        f0 f0Var = g0Var.f;
        return new m2(b, b31.b.d0(g0Var.g), str2, str3, str4, i, f0Var.b, f0Var.c.b, z);
    }

    public static final n2 b(u1 u1Var, boolean z) {
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

    public static final e2 c(uj0.a aVar, boolean z) {
        k71.k.g(aVar, "<this>");
        String str = aVar.c;
        String str2 = aVar.d;
        if (str2 == null) {
            str2 = "";
        }
        return new e2(new com.github.service.models.response.a(str, new Avatar(str2, Avatar.Type.Organization), (String) null, false, (String) null, 60), IssueOrPullRequest$ReviewerReviewState.PENDING, aVar.b, f2.b, z, 64);
    }

    public static final e2 d(uj0.b bVar, boolean z, wi0.l lVar) {
        k71.k.g(bVar, "<this>");
        return new e2(new com.github.service.models.response.a(bVar.c, b41.b.O(bVar.d), (String) null, false, (String) null, 60), IssueOrPullRequest$ReviewerReviewState.PENDING, true, bVar.b, f2.d, z, lVar != null ? f(lVar) : null);
    }

    public static final e2 e(wi0.l lVar) {
        IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState;
        wi0.k kVar;
        k71.k.g(lVar, "<this>");
        wi0.g gVar = lVar.d;
        com.github.service.models.response.a aVar = new com.github.service.models.response.a(gVar != null ? gVar.b : "", b41.b.O(gVar != null ? gVar.d : null), (String) null, false, (String) null, 60);
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
        return new e2(aVar, issueOrPullRequest$ReviewerReviewState, lVar.c, (gVar == null || (kVar = gVar.c) == null) ? lVar.b : kVar.a, f2.d, false, f(lVar));
    }

    public static final d2 f(wi0.l lVar) {
        IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState;
        String str = lVar.b;
        Iterable iterable = lVar.f.a;
        if (iterable == null) {
            iterable = r.r;
        }
        ArrayList S = x61.m.S(iterable);
        ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
        int size = S.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = S.get(i);
            i++;
            arrayList.add(((wi0.i) obj).b);
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
