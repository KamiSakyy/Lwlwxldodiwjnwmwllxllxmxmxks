package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hy {
    public final String a;
    public final String b;

    public hy(String str, String str2) {
        k71.k.g(str, "name");
        k71.k.g(str2, "owner");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy)) {
            return false;
        }
        hy hyVar = (hy) obj;
        return k71.k.b(this.a, hyVar.a) && k71.k.b(this.b, hyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("RepositoryNameWithOwner(name=", this.a, ", owner=", this.b, ")");
    }
}
