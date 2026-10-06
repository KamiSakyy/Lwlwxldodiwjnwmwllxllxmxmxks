package m00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o {
    public final String a;
    public final String b;

    public o(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("RepositoryIssueTypesParameters(owner=", this.a, ", name=", this.b, ")");
    }
}
