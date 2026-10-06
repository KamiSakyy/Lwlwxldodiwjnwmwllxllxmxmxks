package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bi {
    public int a;
    public List b;

    public bi(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi)) {
            return false;
        }
        bi biVar = (bi) obj;
        return this.a == biVar.a && k71.k.b(this.b, biVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4.i(this.a, "PullRequests(issueCount=", ", nodes=", ")", this.b);
    }
}
