package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y6 {
    public int a;
    public int b;

    public y6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return this.a == y6Var.a && this.b == y6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return jo.f4Shadow.h(this.a, this.b, "SubIssuesSummary(total=", ", completed=", ")");
    }
}
