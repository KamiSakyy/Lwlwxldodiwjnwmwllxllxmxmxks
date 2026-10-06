package g20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public final int a;

    public u(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.a == ((u) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("SuccessfulCheckRuns(totalCount=", this.a, ")");
    }
    public Object b = null;
    public Object k = null;
}
