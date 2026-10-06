package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m8 {
    public final String a;
    public final String b;

    public m8(String str, String str2) {
        k71.k.g(str2, "contentHTML");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8)) {
            return false;
        }
        m8 m8Var = (m8) obj;
        return k71.k.b(this.a, m8Var.a) && k71.k.b(this.b, m8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Readme(path=", this.a, ", contentHTML=", this.b, ")");
    }
}
