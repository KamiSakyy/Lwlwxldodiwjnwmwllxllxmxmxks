package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c6 {
    public int a;
    public int b;

    public c6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj;
        return this.a == c6Var.a && this.b == c6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return jo.f4.h(this.a, this.b, "SubIssuesSummary(total=", ", completed=", ")");
    }
}
