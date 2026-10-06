package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dk0 {
    public String a;
    public xx.a b;

    public dk0(String str, xx.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk0)) {
            return false;
        }
        dk0 dk0Var = (dk0) obj;
        return k71.k.b(this.a, dk0Var.a) && k71.k.b(this.b, dk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PageInfo(__typename=" + this.a + ", pageInfoFragment=" + this.b + ")";
    }
    public dk0(String p1, Object p2) {
    }
}
