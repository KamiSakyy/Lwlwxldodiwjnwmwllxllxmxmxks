package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f60 {
    public String a;
    public lt.j b;

    public f60(String str, lt.j jVar) {
        this.a = str;
        this.b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f60)) {
            return false;
        }
        f60 f60Var = (f60) obj;
        return k71.k.b(this.a, f60Var.a) && k71.k.b(this.b, f60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LabelableRecord(__typename=" + this.a + ", labelsFragment=" + this.b + ")";
    }
    public f60(String p1, Object p2) {
    }
}
