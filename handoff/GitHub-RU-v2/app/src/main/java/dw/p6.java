package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p6 {
    public final String a;
    public final xx.a b;

    public p6(String str, xx.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        return k71.k.b(this.a, p6Var.a) && k71.k.b(this.b, p6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PageInfo(__typename=" + this.a + ", pageInfoFragment=" + this.b + ")";
    }
}
