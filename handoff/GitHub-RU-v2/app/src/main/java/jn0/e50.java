package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e50 {
    public String a;
    public String b;

    public e50(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e50)) {
            return false;
        }
        e50 e50Var = (e50) obj;
        return k71.k.b(this.a, e50Var.a) && k71.k.b(this.b, e50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("SpokenLanguage(name=", this.a, ", code=", this.b, ")");
    }
}
