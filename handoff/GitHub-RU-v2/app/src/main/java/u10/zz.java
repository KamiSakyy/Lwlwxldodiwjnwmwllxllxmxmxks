package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zz {
    public xz a;
    public List b;

    public zz(xz xzVar, List list) {
        this.a = xzVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz)) {
            return false;
        }
        zz zzVar = (zz) obj;
        return k71.k.b(this.a, zzVar.a) && k71.k.b(this.b, zzVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "StarredRepositories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
