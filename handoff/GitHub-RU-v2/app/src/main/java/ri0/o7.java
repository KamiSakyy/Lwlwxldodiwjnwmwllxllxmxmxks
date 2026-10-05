package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o7 {
    public final String a;
    public final qf0.a b;

    public o7(String str, qf0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        return k71.k.b(this.a, o7Var.a) && k71.k.b(this.b, o7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
