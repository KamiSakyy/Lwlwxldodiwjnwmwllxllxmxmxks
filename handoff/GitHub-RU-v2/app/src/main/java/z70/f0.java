package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f0 {
    public final String a;
    public final a50.a b;

    public f0(String str, a50.a aVar) {
        k71.k.g(str, "__typename");
        k71.k.g(aVar, "diffLineFragment");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return k71.k.b(this.a, f0Var.a) && k71.k.b(this.b, f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
