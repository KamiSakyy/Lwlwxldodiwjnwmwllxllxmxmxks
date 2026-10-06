package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s00 {
    public a10 a;
    public String b;

    public s00(a10 a10Var, String str) {
        this.a = a10Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s00)) {
            return false;
        }
        s00 s00Var = (s00) obj;
        return k71.k.b(this.a, s00Var.a) && k71.k.b(this.b, s00Var.b);
    }

    public final int hashCode() {
        a10 a10Var = this.a;
        return this.b.hashCode() + ((a10Var == null ? 0 : a10Var.hashCode()) * 31);
    }

    public final String toString() {
        return "OnIssue(timelineItem=" + this.a + ", id=" + this.b + ")";
    }
}
