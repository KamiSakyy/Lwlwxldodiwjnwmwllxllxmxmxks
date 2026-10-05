package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 {
    public final String a;
    public final String b;

    public k0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return k71.k.b(this.a, k0Var.a) && k71.k.b(this.b, k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("HeadRepositoryOwner(id=", this.a, ", login=", this.b, ")");
    }
}
