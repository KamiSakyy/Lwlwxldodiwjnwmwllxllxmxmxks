package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class aa0 {
    public final String a;
    public final ek0.b b;

    public aa0(String str, ek0.b bVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa0)) {
            return false;
        }
        aa0 aa0Var = (aa0) obj;
        return k71.k.b(this.a, aa0Var.a) && k71.k.b(this.b, aa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subscribable(__typename=" + this.a + ", subscribableFragment=" + this.b + ")";
    }
}
