package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ae0 {
    public final String a;
    public final nv0.b b;

    public ae0(String str, nv0.b bVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae0)) {
            return false;
        }
        ae0 ae0Var = (ae0) obj;
        return k71.k.b(this.a, ae0Var.a) && k71.k.b(this.b, ae0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subscribable(__typename=" + this.a + ", subscribableFragment=" + this.b + ")";
    }
}
