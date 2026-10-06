package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e90 {
    public String a;
    public y80 b;

    public e90(String str, y80 y80Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = y80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e90)) {
            return false;
        }
        e90 e90Var = (e90) obj;
        return k71.k.b(this.a, e90Var.a) && k71.k.b(this.b, e90Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        y80 y80Var = this.b;
        return hashCode + (y80Var == null ? 0 : y80Var.a.hashCode());
    }

    public final String toString() {
        return "TimelineItem(__typename=" + this.a + ", onNode=" + this.b + ")";
    }
}
