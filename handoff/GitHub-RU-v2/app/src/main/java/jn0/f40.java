package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f40 {
    public final String a;
    public final cs0.j b;

    public f40(String str, cs0.j jVar) {
        this.a = str;
        this.b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f40)) {
            return false;
        }
        f40 f40Var = (f40) obj;
        return k71.k.b(this.a, f40Var.a) && k71.k.b(this.b, f40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LabelableRecord(__typename=" + this.a + ", labelsFragment=" + this.b + ")";
    }
}
