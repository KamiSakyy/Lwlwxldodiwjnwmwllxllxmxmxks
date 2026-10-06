package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j00 {
    public String a;
    public yd0.c b;

    public j00(String str, yd0.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j00)) {
            return false;
        }
        j00 j00Var = (j00) obj;
        return k71.k.b(this.a, j00Var.a) && k71.k.b(this.b, j00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Assignable(__typename=" + this.a + ", assignableFragment=" + this.b + ")";
    }
}
