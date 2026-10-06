package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rc0 {
    public String a;
    public ss.a b;

    public rc0(String str, ss.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc0)) {
            return false;
        }
        rc0 rc0Var = (rc0) obj;
        return k71.k.b(this.a, rc0Var.a) && k71.k.b(this.b, rc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Filter(__typename=" + this.a + ", feedFiltersFragment=" + this.b + ")";
    }
}
