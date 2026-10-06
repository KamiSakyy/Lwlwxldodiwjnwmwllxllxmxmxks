package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y50 {
    public String a;
    public gq.c b;

    public y50(String str, gq.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y50)) {
            return false;
        }
        y50 y50Var = (y50) obj;
        return k71.k.b(this.a, y50Var.a) && k71.k.b(this.b, y50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Assignable(__typename=" + this.a + ", assignableFragment=" + this.b + ")";
    }
}
