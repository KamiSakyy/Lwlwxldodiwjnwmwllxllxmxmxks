package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a80 {
    public final String a;
    public final m90.b b;

    public a80(String str, m90.b bVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a80)) {
            return false;
        }
        a80 a80Var = (a80) obj;
        return k71.k.b(this.a, a80Var.a) && k71.k.b(this.b, a80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subscribable(__typename=" + this.a + ", subscribableFragment=" + this.b + ")";
    }
}
