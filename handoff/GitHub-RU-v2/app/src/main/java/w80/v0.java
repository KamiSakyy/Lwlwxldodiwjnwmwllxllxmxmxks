package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 {
    public final int a;

    public v0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && this.a == ((v0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("PullRequests(totalCount=", this.a, ")");
    }
}
