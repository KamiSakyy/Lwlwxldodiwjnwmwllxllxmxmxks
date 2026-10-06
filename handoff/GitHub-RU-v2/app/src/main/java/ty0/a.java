package ty0;

import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public String a;
    public String b;

    public a(String str, String str2) {
        k.g(str, "ownerLogin");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return i.g("RepositoryOwnerRepositoriesParameters(ownerLogin=", this.a, ", query=", this.b, ")");
    }
}
