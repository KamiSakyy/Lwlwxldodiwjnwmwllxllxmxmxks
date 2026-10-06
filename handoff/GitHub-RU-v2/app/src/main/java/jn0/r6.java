package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r6 {
    public String a;
    public wq0.a b;

    public r6(String str, wq0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj;
        return k71.k.b(this.a, r6Var.a) && k71.k.b(this.b, r6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
