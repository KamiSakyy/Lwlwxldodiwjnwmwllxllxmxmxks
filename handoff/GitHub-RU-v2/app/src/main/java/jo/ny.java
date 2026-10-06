package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ny {
    public my a;
    public List b;

    public ny(my myVar, List list) {
        this.a = myVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny)) {
            return false;
        }
        ny nyVar = (ny) obj;
        return k71.k.b(this.a, nyVar.a) && k71.k.b(this.b, nyVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Stargazers(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
