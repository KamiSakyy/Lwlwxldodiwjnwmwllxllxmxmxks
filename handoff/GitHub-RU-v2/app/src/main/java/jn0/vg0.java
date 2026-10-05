package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vg0 {
    public final String a;
    public final mw0.a b;

    public vg0(String str, mw0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg0)) {
            return false;
        }
        vg0 vg0Var = (vg0) obj;
        return k71.k.b(this.a, vg0Var.a) && k71.k.b(this.b, vg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PageInfo(__typename=" + this.a + ", pageInfoFragment=" + this.b + ")";
    }
}
