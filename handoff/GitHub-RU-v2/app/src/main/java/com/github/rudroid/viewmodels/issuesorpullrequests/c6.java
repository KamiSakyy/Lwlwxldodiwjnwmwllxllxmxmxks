package com.github.rudroid.viewmodels.issuesorpullrequests;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c6 {
    public final boolean a;
    public final he.q b;
    public final String c;
    public final String d;

    public c6(boolean z, he.q qVar, String str, String str2) {
        this.a = z;
        this.b = qVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj;
        return this.a == c6Var.a && this.b == c6Var.b && k71.k.b(this.c, c6Var.c) && k71.k.b(this.d, c6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewerReviewBanner(viewerIsAuthor=");
        sb.append(this.a);
        sb.append(", reviewStatus=");
        sb.append(this.b);
        sb.append(", reviewRequesterLogin=");
        return x.i.k(sb, this.c, ", reviewRequesterAvatarUrl=", this.d, ")");
    }
}
