package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q00 {
    public final String a;
    public final sg0.j b;

    public q00(String str, sg0.j jVar) {
        this.a = str;
        this.b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q00)) {
            return false;
        }
        q00 q00Var = (q00) obj;
        return k71.k.b(this.a, q00Var.a) && k71.k.b(this.b, q00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LabelableRecord(__typename=" + this.a + ", labelsFragment=" + this.b + ")";
    }
}
