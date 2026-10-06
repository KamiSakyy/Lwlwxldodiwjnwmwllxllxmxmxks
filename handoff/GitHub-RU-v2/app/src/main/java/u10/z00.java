package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z00 {
    public String a;
    public t00 b;
    public w00 c;

    public z00(String str, t00 t00Var, w00 w00Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = t00Var;
        this.c = w00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z00)) {
            return false;
        }
        z00 z00Var = (z00) obj;
        return k71.k.b(this.a, z00Var.a) && k71.k.b(this.b, z00Var.b) && k71.k.b(this.c, z00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t00 t00Var = this.b;
        int hashCode2 = (hashCode + (t00Var == null ? 0 : t00Var.a.hashCode())) * 31;
        w00 w00Var = this.c;
        return hashCode2 + (w00Var != null ? w00Var.hashCode() : 0);
    }

    public final String toString() {
        return "TimelineItem1(__typename=" + this.a + ", onNode=" + this.b + ", onPullRequestReviewThread=" + this.c + ")";
    }
}
