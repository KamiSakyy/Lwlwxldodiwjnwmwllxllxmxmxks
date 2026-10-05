package py0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s {
    public final u a;
    public final List b;

    public s(u uVar, List list) {
        this.a = uVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "IssueTypes(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
