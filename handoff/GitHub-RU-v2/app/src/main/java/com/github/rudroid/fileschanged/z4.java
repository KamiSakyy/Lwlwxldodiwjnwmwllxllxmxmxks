package com.github.rudroid.fileschanged;

import com.github.rudroid.fileschanged.p4;
import com.github.service.models.response.type.PullRequestReviewEvent;

/* loaded from: /home/user/work/p/classes.dex */
public final class z4 {
    public static final a Companion = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final z4 f13641d;

    /* renamed from: a, reason: collision with root package name */
    public com.github.rudroid.utilities.ui.g1 f13642a;

    /* renamed from: b, reason: collision with root package name */
    public PullRequestReviewEvent f13643b;

    /* renamed from: c, reason: collision with root package name */
    public String f13644c;

    public static final class a {
    }

    static {
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        f13641d = new z4(new com.github.rudroid.utilities.ui.h0(p4.a.f13435a), PullRequestReviewEvent.COMMENT, "");
    }

    public z4(com.github.rudroid.utilities.ui.g1 g1Var, PullRequestReviewEvent pullRequestReviewEvent, String str) {
        k71.k.g(pullRequestReviewEvent, "selectedReviewOption");
        this.f13642a = g1Var;
        this.f13643b = pullRequestReviewEvent;
        this.f13644c = str;
    }

    public static z4 a(z4 z4Var, com.github.rudroid.utilities.ui.g1 g1Var, PullRequestReviewEvent pullRequestReviewEvent, String str, int i) {
        if ((i & 2) != 0) {
            pullRequestReviewEvent = z4Var.f13643b;
        }
        if ((i & 4) != 0) {
            str = z4Var.f13644c;
        }
        z4Var.getClass();
        k71.k.g(pullRequestReviewEvent, "selectedReviewOption");
        k71.k.g(str, "reviewMessage");
        return new z4(g1Var, pullRequestReviewEvent, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj;
        return k71.k.b(this.f13642a, z4Var.f13642a) && this.f13643b == z4Var.f13643b && k71.k.b(this.f13644c, z4Var.f13644c);
    }

    public final int hashCode() {
        return this.f13644c.hashCode() + ((this.f13643b.hashCode() + (this.f13642a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubmitReviewUiModel(submitButtonState=");
        sb2.append(this.f13642a);
        sb2.append(", selectedReviewOption=");
        sb2.append(this.f13643b);
        sb2.append(", reviewMessage=");
        return com.github.rudroid.copilot.h1.p(sb2, this.f13644c, ")");
    }
}
