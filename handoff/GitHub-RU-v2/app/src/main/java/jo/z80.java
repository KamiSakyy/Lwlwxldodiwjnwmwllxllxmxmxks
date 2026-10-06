package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z80 {
    public String a;
    public d90 b;

    public z80(String str, d90 d90Var) {
        this.a = str;
        this.b = d90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z80)) {
            return false;
        }
        z80 z80Var = (z80) obj;
        return k71.k.b(this.a, z80Var.a) && k71.k.b(this.b, z80Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d90 d90Var = this.b;
        return hashCode + (d90Var == null ? 0 : d90Var.hashCode());
    }

    public final String toString() {
        return "OnPullRequest(id=" + this.a + ", timelineItem=" + this.b + ")";
    }
}
