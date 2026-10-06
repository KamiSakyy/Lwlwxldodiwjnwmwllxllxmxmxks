package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l8 {
    public String a;
    public String b;

    public l8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8)) {
            return false;
        }
        l8 l8Var = (l8) obj;
        return k71.k.b(this.a, l8Var.a) && k71.k.b(this.b, l8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Owner(id=", this.a, ", login=", this.b, ")");
    }
}
