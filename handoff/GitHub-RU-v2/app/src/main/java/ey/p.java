package ey;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p {
    public final String a;
    public final xx.a b;

    public p(String str, xx.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.a, pVar.a) && k71.k.b(this.b, pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PageInfo(__typename=" + this.a + ", pageInfoFragment=" + this.b + ")";
    }
}
