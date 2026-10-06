package m01;

import a0.s0;
import k71.k;
import yz0.q8;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public final boolean a;
    public final int b;
    public final q8 c;

    public b(boolean z, int i, q8 q8Var) {
        this.a = z;
        this.b = i;
        this.c = q8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && k.b(this.c, bVar.c);
    }

    public final int hashCode() {
        int b = s0.b(this.b, Boolean.hashCode(this.a) * 31, 31);
        q8 q8Var = this.c;
        return b + (q8Var == null ? 0 : q8Var.hashCode());
    }

    public final String toString() {
        return "ViewerReviewerReviewStatusRequestedBy(viewerIsAuthor=" + this.a + ", pendingReviewCommentsCount=" + this.b + ", viewerLatestReviewRequest=" + this.c + ")";
    }
}
