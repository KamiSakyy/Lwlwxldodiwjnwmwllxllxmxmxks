package com.github.rudroid.fileschanged;

import com.github.rudroid.fileschanged.p4;
import com.github.rudroid.utilities.ui.g1;
import com.github.service.models.response.type.PullRequestReviewEvent;

/* loaded from: /home/user/work/p/classes.dex */
public final class a5 extends androidx.lifecycle.k1 {
    public static final a Companion = new a();

    /* renamed from: s, reason: collision with root package name */
    public androidx.lifecycle.a1 f13083s;

    /* renamed from: t, reason: collision with root package name */
    public zk.d f13084t;

    /* renamed from: u, reason: collision with root package name */
    public zk.q1 f13085u;

    /* renamed from: v, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f13086v;

    /* renamed from: w, reason: collision with root package name */
    public y71.y1 f13087w;

    /* renamed from: x, reason: collision with root package name */
    public y71.i1 f13088x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13089y;

    public static final class a {
    }

    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13090a;

        static {
            int[] iArr = new int[PullRequestReviewEvent.values().length];
            try {
                iArr[PullRequestReviewEvent.COMMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PullRequestReviewEvent.REQUEST_CHANGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13090a = iArr;
        }
    }

    public a5(androidx.lifecycle.a1 a1Var, zk.d dVar, zk.q1 q1Var, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(dVar, "addReviewUseCase");
        k71.k.g(q1Var, "submitReviewUseCase");
        k71.k.g(cVar, "accountHolder");
        this.f13083s = a1Var;
        this.f13084t = dVar;
        this.f13085u = q1Var;
        this.f13086v = cVar;
        z4.Companion.getClass();
        z4 z4Var = z4.f13641d;
        String str = (String) a1Var.a("EXTRA_DRAFT_MESSAGE");
        str = str == null ? "" : str;
        g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
        String str2 = (String) a1Var.a("EXTRA_DRAFT_MESSAGE");
        p4 Q = Q(str2 != null ? str2 : "", z4Var.f13643b);
        aVar.getClass();
        y71.y1 c10 = y71.n1.c(z4.a(z4Var, new com.github.rudroid.utilities.ui.h0(Q), null, str, 2));
        this.f13087w = c10;
        this.f13088x = new y71.i1(c10);
        Boolean bool = (Boolean) a1Var.a("EXTRA_HAS_PENDING_REVIEW");
        this.f13089y = bool != null ? bool.booleanValue() : false;
    }

    public final String P() {
        String str = (String) this.f13083s.a("EXTRA_PR_ID");
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Pull request ID is not set");
    }

    public final p4 Q(String str, PullRequestReviewEvent pullRequestReviewEvent) {
        int i = b.f13090a[pullRequestReviewEvent.ordinal()];
        if ((i == 1 || i == 2) && t71.p.T(str)) {
            Integer num = (Integer) this.f13083s.a("EXTRA_PENDING_COMMENTS");
            if ((num != null ? num.intValue() : 0) <= 0) {
                return p4.a.f13435a;
            }
        }
        return p4.b.f13436a;
    }

    public final boolean R() {
        Boolean bool = (Boolean) this.f13083s.a("EXTRA_IS_AUTHOR");
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Is author is not set");
    }
}
