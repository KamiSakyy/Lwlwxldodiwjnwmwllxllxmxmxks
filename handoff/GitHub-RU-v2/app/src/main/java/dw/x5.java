package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x5 {
    public int a;

    public x5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x5) && this.a == ((x5) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("ClosedByPullRequestsReferences(totalCount=", this.a, ")");
    }
}
