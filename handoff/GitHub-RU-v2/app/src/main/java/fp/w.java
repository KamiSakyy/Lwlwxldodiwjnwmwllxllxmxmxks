package fp;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public v a;
    public List b;

    public w(v vVar, List list) {
        this.a = vVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && k71.k.b(this.b, wVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "RepositoryAgentTasks(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
