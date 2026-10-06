package w50;

import a0.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final int a;

    public g(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.a == ((g) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return s0.i("ClosedByPullRequestsReferences(totalCount=", this.a, ")");
    }
}
