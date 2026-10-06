package sy;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequest;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.type.IssueState;
import ct.p0;
import ct.q0;
import gv.d2;
import gv.e2;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m10.rz;
import qx.c1;
import yz0.b2;
import yz0.f2;
import yz0.m2;
import yz0.n2;
import yz0.o3;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final b2 a(c1 c1Var) {
        k71.k.g(c1Var, "<this>");
        String str = c1Var.d;
        Avatar A = w8.s.A(c1Var.g);
        String str2 = c1Var.b;
        String str3 = c1Var.c;
        if (str3 == null) {
            str3 = "";
        }
        return new b2(str, A, str2, str3, false, false, 32);
    }

    public static final m2 b(q0 q0Var, boolean z) {
        k71.k.g(q0Var, "<this>");
        r01.e eVar = IssueState.Companion;
        String str = q0Var.b.r;
        eVar.getClass();
        IssueState b = r01.e.b(str);
        String str2 = q0Var.a;
        String str3 = q0Var.c;
        String str4 = q0Var.d;
        int i = q0Var.e;
        p0 p0Var = q0Var.f;
        return new m2(b, w.w(q0Var.g), str2, str3, str4, i, p0Var.b, p0Var.c.b, z);
    }

    public static final List c(rt.e eVar) {
        ArrayList arrayList;
        List<rt.b> list;
        m2 m2Var;
        List<rt.c> list2;
        rt.d dVar = eVar.b;
        ArrayList arrayList2 = null;
        if (dVar == null || (list2 = dVar.a) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (rt.c cVar : list2) {
                String str = cVar != null ? cVar.a : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        ArrayList arrayList3 = x61.r.r;
        if (arrayList == null) {
            arrayList = arrayList3;
        }
        rt.a aVar = eVar.c;
        if (aVar != null && (list = aVar.a) != null) {
            ArrayList arrayList4 = new ArrayList();
            for (rt.b bVar : list) {
                if (bVar != null) {
                    q0 q0Var = bVar.c;
                    m2Var = b(q0Var, arrayList.contains(q0Var.a));
                } else {
                    m2Var = null;
                }
                if (m2Var != null) {
                    arrayList4.add(m2Var);
                }
            }
            arrayList2 = arrayList4;
        }
        return arrayList2 == null ? arrayList3 : arrayList2;
    }

    public static final n2 d(e2 e2Var, boolean z) {
        k71.k.g(e2Var, "<this>");
        o3 o3Var = PullRequestState.Companion;
        String str = e2Var.b.r;
        o3Var.getClass();
        PullRequestState b = o3.b(str);
        boolean z2 = e2Var.f;
        String str2 = e2Var.a;
        String str3 = e2Var.c;
        String str4 = e2Var.d;
        int i = e2Var.e;
        d2 d2Var = e2Var.g;
        return new n2(b, z2, e2Var.h, str2, str3, str4, i, d2Var.b, d2Var.c.b, z);
    }

    public static final yz0.e2 e(kw.a aVar, boolean z, lv.m mVar) {
        k71.k.g(aVar, "<this>");
        return new yz0.e2(new com.github.service.models.response.a(aVar.c, w8.s.A(aVar.g), aVar.d, aVar.e, aVar.f, 16), IssueOrPullRequest.ReviewerReviewState.PENDING, true, aVar.b, f2.a, z, mVar != null ? i(mVar) : null);
    }

    public static final yz0.e2 f(kw.b bVar, boolean z) {
        k71.k.g(bVar, "<this>");
        String str = bVar.c;
        String str2 = bVar.d;
        if (str2 == null) {
            str2 = "";
        }
        return new yz0.e2(new com.github.service.models.response.a(str, new Avatar(str2, Avatar.Type.Organization), (String) null, false, (String) null, 60), IssueOrPullRequest.ReviewerReviewState.PENDING, bVar.b, f2.b, z, 64);
    }

    public static final yz0.e2 g(kw.c cVar, boolean z, lv.m mVar) {
        k71.k.g(cVar, "<this>");
        return new yz0.e2(new com.github.service.models.response.a(cVar.c, w8.s.A(cVar.d), (String) null, false, (String) null, 60), IssueOrPullRequest.ReviewerReviewState.PENDING, true, cVar.b, f2.d, z, mVar != null ? i(mVar) : null);
    }

    public static final yz0.e2 h(lv.m mVar) {
        IssueOrPullRequest.ReviewerReviewState reviewerReviewState;
        IssueOrPullRequest.ReviewerReviewState reviewerReviewState2;
        IssueOrPullRequest.ReviewerReviewState reviewerReviewState3;
        f2 f2Var = f2.d;
        k71.k.g(mVar, "<this>");
        rz rzVar = mVar.e;
        lv.g gVar = mVar.d;
        if ((gVar != null ? gVar.c : null) != null) {
            com.github.service.models.response.a aVar = new com.github.service.models.response.a(gVar.b, w8.s.A(gVar.e), (String) null, false, (String) null, 60);
            int ordinal = rzVar.ordinal();
            if (ordinal == 0) {
                reviewerReviewState3 = IssueOrPullRequest.ReviewerReviewState.APPROVED;
            } else if (ordinal == 1) {
                reviewerReviewState3 = IssueOrPullRequest.ReviewerReviewState.CHANGES_REQUESTED;
            } else if (ordinal == 2) {
                reviewerReviewState3 = IssueOrPullRequest.ReviewerReviewState.COMMENTED;
            } else if (ordinal == 3) {
                reviewerReviewState3 = IssueOrPullRequest.ReviewerReviewState.DISMISSED;
            } else if (ordinal == 4) {
                reviewerReviewState3 = IssueOrPullRequest.ReviewerReviewState.PENDING;
            } else {
                if (ordinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                reviewerReviewState3 = IssueOrPullRequest.ReviewerReviewState.UNKNOWN;
            }
            return new yz0.e2(aVar, reviewerReviewState3, mVar.c, gVar.c.a, f2Var, false, i(mVar));
        }
        if ((gVar != null ? gVar.d : null) == null) {
            com.github.service.models.response.a aVar2 = new com.github.service.models.response.a(gVar != null ? gVar.b : "", w8.s.A(gVar != null ? gVar.e : null), (String) null, false, (String) null, 60);
            int ordinal2 = rzVar.ordinal();
            if (ordinal2 == 0) {
                reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.APPROVED;
            } else if (ordinal2 == 1) {
                reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.CHANGES_REQUESTED;
            } else if (ordinal2 == 2) {
                reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.COMMENTED;
            } else if (ordinal2 == 3) {
                reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.DISMISSED;
            } else if (ordinal2 == 4) {
                reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.PENDING;
            } else {
                if (ordinal2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.UNKNOWN;
            }
            return new yz0.e2(aVar2, reviewerReviewState, mVar.c, mVar.b, f2Var, false, i(mVar));
        }
        String str = gVar.b;
        lv.kShadow kVar = gVar.d;
        com.github.service.models.response.a aVar3 = new com.github.service.models.response.a(str, w8.s.A(gVar.e), kVar.b, kVar.c, kVar.d, 16);
        int ordinal3 = rzVar.ordinal();
        if (ordinal3 == 0) {
            reviewerReviewState2 = IssueOrPullRequest.ReviewerReviewState.APPROVED;
        } else if (ordinal3 == 1) {
            reviewerReviewState2 = IssueOrPullRequest.ReviewerReviewState.CHANGES_REQUESTED;
        } else if (ordinal3 == 2) {
            reviewerReviewState2 = IssueOrPullRequest.ReviewerReviewState.COMMENTED;
        } else if (ordinal3 == 3) {
            reviewerReviewState2 = IssueOrPullRequest.ReviewerReviewState.DISMISSED;
        } else if (ordinal3 == 4) {
            reviewerReviewState2 = IssueOrPullRequest.ReviewerReviewState.PENDING;
        } else {
            if (ordinal3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            reviewerReviewState2 = IssueOrPullRequest.ReviewerReviewState.UNKNOWN;
        }
        return new yz0.e2(aVar3, reviewerReviewState2, mVar.c, kVar.a, f2.a, false, i(mVar));
    }

    public static final yz0.d2 i(lv.m mVar) {
        IssueOrPullRequest.ReviewerReviewState reviewerReviewState;
        String str = mVar.b;
        x61.r rVar = mVar.f.a;
        if (rVar == null) {
            rVar = x61.r.r;
        }
        ArrayList S = x61.m.S(rVar);
        ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
        int size = S.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = S.get(i);
            i++;
            arrayList.add(((lv.i) obj).b);
        }
        int ordinal = mVar.e.ordinal();
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
        if (mVar.g.length() == 0 && mVar.h.a == 0) {
            z = true;
        }
        return new yz0.d2(str, arrayList, reviewerReviewState, z);
    }

    public static final z01.p j(ct.c cVar) {
        k71.k.g(cVar, "<this>");
        String str = cVar.a;
        String str2 = cVar.b;
        int i = cVar.d;
        ct.b bVar = cVar.c;
        return new z01.p(str, str2, bVar.a.b, bVar.b, i, i21.a.O(cVar.e), w.w(cVar.f), bVar.c);
    }
}
