package vn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t {
    public final int a;

    public t(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.a == ((t) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("SkippedCheckRuns(totalCount=", this.a, ")");
    }
}
