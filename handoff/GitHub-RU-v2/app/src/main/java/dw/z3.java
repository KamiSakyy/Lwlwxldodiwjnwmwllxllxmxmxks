package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z3 {
    public int a;

    public z3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3) && this.a == ((z3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("IssueTypes(totalCount=", this.a, ")");
    }
}
