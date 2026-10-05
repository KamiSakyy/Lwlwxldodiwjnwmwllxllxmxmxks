package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w80 {
    public final e90 a;
    public final String b;

    public w80(e90 e90Var, String str) {
        this.a = e90Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w80)) {
            return false;
        }
        w80 w80Var = (w80) obj;
        return k71.k.b(this.a, w80Var.a) && k71.k.b(this.b, w80Var.b);
    }

    public final int hashCode() {
        e90 e90Var = this.a;
        return this.b.hashCode() + ((e90Var == null ? 0 : e90Var.hashCode()) * 31);
    }

    public final String toString() {
        return "OnIssue(timelineItem=" + this.a + ", id=" + this.b + ")";
    }
}
