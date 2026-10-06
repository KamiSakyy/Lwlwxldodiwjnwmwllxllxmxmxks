package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t5 {
    public final String a;
    public final mw0.a b;

    public t5(String str, mw0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return k71.k.b(this.a, t5Var.a) && k71.k.b(this.b, t5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PageInfo(__typename=" + this.a + ", pageInfoFragment=" + this.b + ")";
    }
}
