package py0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p {
    public final String a;
    public final String b;

    public p(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.a, pVar.a) && k71.k.b(this.b, pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("RepositoryIssueTypesParameters(owner=", this.a, ", name=", this.b, ")");
    }
}
