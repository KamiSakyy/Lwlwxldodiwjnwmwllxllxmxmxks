package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f2 {
    public final String a;
    public final String b;

    public f2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return k71.k.b(this.a, f2Var.a) && k71.k.b(this.b, f2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("HeadRepositoryOwner(id=", this.a, ", login=", this.b, ")");
    }
}
