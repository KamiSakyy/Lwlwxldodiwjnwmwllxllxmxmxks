package vt0;

import xt0.j8;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j {
    public final String a;
    public final j8 b;

    public j(String str, j8 j8Var) {
        this.a = str;
        this.b = j8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnPullRequest(__typename=" + this.a + ", viewerReviewerReviewStateWithRequester=" + this.b + ")";
    }
}
