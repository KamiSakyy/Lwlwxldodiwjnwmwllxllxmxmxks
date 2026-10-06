package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g7 {
    public String a;
    public wq0.a b;

    public g7(String str, wq0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7)) {
            return false;
        }
        g7 g7Var = (g7) obj;
        return k71.k.b(this.a, g7Var.a) && k71.k.b(this.b, g7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
