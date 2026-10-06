package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y20 {
    public String a;
    public s20 b;

    public y20(String str, s20 s20Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = s20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y20)) {
            return false;
        }
        y20 y20Var = (y20) obj;
        return k71.k.b(this.a, y20Var.a) && k71.k.b(this.b, y20Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s20 s20Var = this.b;
        return hashCode + (s20Var == null ? 0 : s20Var.a.hashCode());
    }

    public final String toString() {
        return "TimelineItem(__typename=" + this.a + ", onNode=" + this.b + ")";
    }
}
