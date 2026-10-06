package wc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j {
    public int a;

    public j(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.a == ((j) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("NeutralCheckRuns(totalCount=", this.a, ")");
    }
}
