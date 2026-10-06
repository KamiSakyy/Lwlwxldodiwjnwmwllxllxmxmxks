package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hf {
    public final int a;
    public final List b;

    public hf(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf)) {
            return false;
        }
        hf hfVar = (hf) obj;
        return this.a == hfVar.a && k71.k.b(this.b, hfVar.b);
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
