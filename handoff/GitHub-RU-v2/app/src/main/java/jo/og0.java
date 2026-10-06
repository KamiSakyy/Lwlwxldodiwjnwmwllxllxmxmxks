package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class og0 {
    public String a;
    public yw.b b;

    public og0(String str, yw.b bVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og0)) {
            return false;
        }
        og0 og0Var = (og0) obj;
        return k71.k.b(this.a, og0Var.a) && k71.k.b(this.b, og0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subscribable(__typename=" + this.a + ", subscribableFragment=" + this.b + ")";
    }
    public og0(String p1, Object p2) {
    }
}
