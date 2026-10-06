package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v00 {
    public String a;
    public z00 b;

    public v00(String str, z00 z00Var) {
        this.a = str;
        this.b = z00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v00)) {
            return false;
        }
        v00 v00Var = (v00) obj;
        return k71.k.b(this.a, v00Var.a) && k71.k.b(this.b, v00Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        z00 z00Var = this.b;
        return hashCode + (z00Var == null ? 0 : z00Var.hashCode());
    }

    public final String toString() {
        return "OnPullRequest(id=" + this.a + ", timelineItem=" + this.b + ")";
    }
}
