package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r2 {
    public final String a;
    public final String b;

    public r2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return k71.k.b(this.a, r2Var.a) && k71.k.b(this.b, r2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("HeadRepositoryOwner(id=", this.a, ", login=", this.b, ")");
    }
}
