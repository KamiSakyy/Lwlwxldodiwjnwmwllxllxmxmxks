package vo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public final int a;

    public s(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.a == ((s) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("RunningCheckRuns(totalCount=", this.a, ")");
    }
}
