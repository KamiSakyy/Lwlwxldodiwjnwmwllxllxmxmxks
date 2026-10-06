package fw0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q {
    public final int a;

    public q(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.a == ((q) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("IssueComments(totalCount=", this.a, ")");
    }
}
