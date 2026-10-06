package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a10 {
    public String a;
    public u00 b;

    public a10(String str, u00 u00Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = u00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a10)) {
            return false;
        }
        a10 a10Var = (a10) obj;
        return k71.k.b(this.a, a10Var.a) && k71.k.b(this.b, a10Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u00 u00Var = this.b;
        return hashCode + (u00Var == null ? 0 : u00Var.a.hashCode());
    }

    public final String toString() {
        return "TimelineItem(__typename=" + this.a + ", onNode=" + this.b + ")";
    }
}
