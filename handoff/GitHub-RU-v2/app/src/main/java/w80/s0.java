package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 {
    public String a;
    public String b;

    public s0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return k71.k.b(this.a, s0Var.a) && k71.k.b(this.b, s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Owner1(id=", this.a, ", login=", this.b, ")");
    }
}
