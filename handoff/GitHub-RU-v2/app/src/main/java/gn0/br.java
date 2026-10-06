package gn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class br {
    public String a;
    public String b;

    public br(String str, String str2) {
        k71.k.g(str, "name");
        k71.k.g(str2, "owner");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br)) {
            return false;
        }
        br brVar = (br) obj;
        return k71.k.b(this.a, brVar.a) && k71.k.b(this.b, brVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("RepositoryNameWithOwner(name=", this.a, ", owner=", this.b, ")");
    }
}
