package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m6 {
    public String a;
    public String b;

    public m6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        return k71.k.b(this.a, m6Var.a) && k71.k.b(this.b, m6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Owner(id=", this.a, ", login=", this.b, ")");
    }
}
