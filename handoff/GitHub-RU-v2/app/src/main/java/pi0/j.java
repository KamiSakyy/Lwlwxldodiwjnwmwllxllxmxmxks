package pi0;

import ri0.r8;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j {
    public final String a;
    public final r8 b;

    public j(String str, r8 r8Var) {
        this.a = str;
        this.b = r8Var;
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
