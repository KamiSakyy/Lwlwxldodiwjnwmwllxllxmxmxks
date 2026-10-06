package b20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 {
    public int a;

    public d1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && this.a == ((d1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("SkippedCheckRuns(totalCount=", this.a, ")");
    }
}
