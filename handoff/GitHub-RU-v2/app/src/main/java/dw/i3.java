package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i3 {
    public final String a;
    public final String b;

    public i3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return k71.k.b(this.a, i3Var.a) && k71.k.b(this.b, i3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Owner1(id=", this.a, ", login=", this.b, ")");
    }
}
