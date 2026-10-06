package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f40 {
    public final String a;
    public final String b;

    public f40(String str, String str2) {
        k71.k.g(str, "name");
        k71.k.g(str2, "owner");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f40)) {
            return false;
        }
        f40 f40Var = (f40) obj;
        return k71.k.b(this.a, f40Var.a) && k71.k.b(this.b, f40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("RepositoryNameWithOwner(name=", this.a, ", owner=", this.b, ")");
    }
}
