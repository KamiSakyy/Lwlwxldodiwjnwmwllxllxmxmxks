package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s70 {
    public v70 a;
    public String b;

    public s70(v70 v70Var, String str) {
        this.a = v70Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s70)) {
            return false;
        }
        s70 s70Var = (s70) obj;
        return k71.k.b(this.a, s70Var.a) && k71.k.b(this.b, s70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnUser(starredRepositories=" + this.a + ", id=" + this.b + ")";
    }
}
