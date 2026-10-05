package va0;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequest;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.type.IssueState;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import t.a0;
import t.q;
import w50.d0;
import w50.e0;
import x61.r;
import yz0.d2;
import yz0.e2;
import yz0.f2;
import yz0.m2;
import yz0.n2;
import yz0.o3;
import z70.s1;
import z70.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final m2 a(e0 e0Var, boolean z) {
        k71.k.g(e0Var, "<this>");
        r01.e eVar = IssueState.Companion;
        String str = e0Var.b.r;
        eVar.getClass();
        IssueState b = r01.e.b(str);
        String str2 = e0Var.a;
        String str3 = e0Var.c;
        String str4 = e0Var.d;
        int i = e0Var.e;
        d0 d0Var = e0Var.f;
        return new m2(b, a0.N(e0Var.g), str2, str3, str4, i, d0Var.b, d0Var.c.b, z);
    }

    public static final n2 b(t1 t1Var, boolean z) {
        k71.k.g(t1Var, "<this>");
        o3 o3Var = PullRequestState.Companion;
        String str = t1Var.b.r;
        o3Var.getClass();
        PullRequestState b = o3.b(str);
        boolean z2 = t1Var.f;
        String str2 = t1Var.a;
        String str3 = t1Var.c;
        String str4 = t1Var.d;
        int i = t1Var.e;
        s1 s1Var = t1Var.g;
        return new n2(b, z2, false, str2, str3, str4, i, s1Var.b, s1Var.c.b, z);
    }

    public static final e2 c(c90.a aVar, boolean z) {
        k71.k.g(aVar, "<this>");
        String str = aVar.c;
        String str2 = aVar.d;
        if (str2 == null) {
            str2 = "";
        }
        return new e2(new com.github.service.models.response.a(str, new Avatar(str2, Avatar.Type.Organization), (String) null, false, (String) null, 60), IssueOrPullRequest.ReviewerReviewState.PENDING, aVar.b, f2.b, z, 64);
    }

    public static final e2 d(c90.b bVar, boolean z, e80.l lVar) {
        k71.k.g(bVar, "<this>");
        return new e2(new com.github.service.models.response.a(bVar.c, q.q(bVar.d), (String) null, false, (String) null, 60), IssueOrPullRequest.ReviewerReviewState.PENDING, true, bVar.b, f2.d, z, lVar != null ? f(lVar) : null);
    }

    public static final e2 e(e80.l lVar) {
        IssueOrPullRequest.ReviewerReviewState reviewerReviewState;
        e80.k kVar;
        k71.k.g(lVar, "<this>");
        e80.g gVar = lVar.d;
        com.github.service.models.response.a aVar = new com.github.service.models.response.a(gVar != null ? gVar.b : "", q.q(gVar != null ? gVar.d : null), (String) null, false, (String) null, 60);
        int ordinal = lVar.e.ordinal();
        if (ordinal == 0) {
            reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.APPROVED;
        } else if (ordinal == 1) {
            reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.CHANGES_REQUESTED;
        } else if (ordinal == 2) {
            reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.COMMENTED;
        } else if (ordinal == 3) {
            reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.DISMISSED;
        } else if (ordinal == 4) {
            reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.PENDING;
        } else {
            if (ordinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.UNKNOWN;
        }
        return new e2(aVar, reviewerReviewState, lVar.c, (gVar == null || (kVar = gVar.c) == null) ? lVar.b : kVar.a, f2.d, false, f(lVar));
    }

    public static final d2 f(e80.l lVar) {
        IssueOrPullRequest.ReviewerReviewState reviewerReviewState;
        String str = lVar.b;
        r rVar = lVar.f.a;
        if (rVar == null) {
            rVar = r.r;
        }
        ArrayList S = x61.m.S(rVar);
        ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
        int size = S.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = S.get(i);
            i++;
            arrayList.add(((e80.i) obj).b);
        }
        int ordinal = lVar.e.ordinal();
        if (ordinal == 0) {
            reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.APPROVED;
        } else if (ordinal == 1) {
            reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.CHANGES_REQUESTED;
        } else if (ordinal == 2) {
            reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.COMMENTED;
        } else if (ordinal == 3) {
            reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.DISMISSED;
        } else if (ordinal == 4) {
            reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.PENDING;
        } else {
            if (ordinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.UNKNOWN;
        }
        if (lVar.g.length() == 0 && lVar.h.a == 0) {
            z = true;
        }
        return new d2(str, arrayList, reviewerReviewState, z);
    }
}
