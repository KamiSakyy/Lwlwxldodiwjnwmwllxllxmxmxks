package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ip {
    public final fp a;
    public final List b;

    public ip(fp fpVar, List list) {
        this.a = fpVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip)) {
            return false;
        }
        ip ipVar = (ip) obj;
        return k71.k.b(this.a, ipVar.a) && k71.k.b(this.b, ipVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "ReleaseAssets(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
