package hc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xp {
    public String a;
    public String b;

    public xp(String str, String str2) {
        k71.k.g(str, "name");
        k71.k.g(str2, "owner");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp)) {
            return false;
        }
        xp xpVar = (xp) obj;
        return k71.k.b(this.a, xpVar.a) && k71.k.b(this.b, xpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("RepositoryNameWithOwner(name=", this.a, ", owner=", this.b, ")");
    }
}
