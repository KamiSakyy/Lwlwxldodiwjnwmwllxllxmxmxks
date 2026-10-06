package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u4 {
    public String a;
    public us.a b;

    public u4(String str, us.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return k71.k.b(this.a, u4Var.a) && k71.k.b(this.b, u4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextFieldFileLine(__typename=" + this.a + ", fileLineFragment=" + this.b + ")";
    }
}
