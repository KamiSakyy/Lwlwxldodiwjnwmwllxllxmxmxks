package rc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e1 {
    public final int a;

    public e1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && this.a == ((e1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("SuccessfulCheckRuns(totalCount=", this.a, ")");
    }
}
