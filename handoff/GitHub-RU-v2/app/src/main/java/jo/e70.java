package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e70 {
    public String a;
    public String b;

    public e70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e70)) {
            return false;
        }
        e70 e70Var = (e70) obj;
        return k71.k.b(this.a, e70Var.a) && k71.k.b(this.b, e70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("SpokenLanguage(name=", this.a, ", code=", this.b, ")");
    }
}
