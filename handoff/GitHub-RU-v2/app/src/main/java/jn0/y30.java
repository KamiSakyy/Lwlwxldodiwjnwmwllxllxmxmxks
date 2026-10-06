package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y30 {
    public String a;
    public ep0.c b;

    public y30(String str, ep0.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y30)) {
            return false;
        }
        y30 y30Var = (y30) obj;
        return k71.k.b(this.a, y30Var.a) && k71.k.b(this.b, y30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Assignable(__typename=" + this.a + ", assignableFragment=" + this.b + ")";
    }
}
