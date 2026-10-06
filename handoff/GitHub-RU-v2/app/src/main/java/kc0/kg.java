package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kg {
    public int a;
    public List b;

    public kg(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg)) {
            return false;
        }
        kg kgVar = (kg) obj;
        return this.a == kgVar.a && k71.k.b(this.b, kgVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4Shadow.i(this.a, "PullRequests(issueCount=", ", nodes=", ")", this.b);
    }
}
