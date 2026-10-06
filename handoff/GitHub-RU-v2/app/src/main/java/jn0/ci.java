package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ci {
    public int a;
    public List b;

    public ci(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci)) {
            return false;
        }
        ci ciVar = (ci) obj;
        return this.a == ciVar.a && k71.k.b(this.b, ciVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4Shadow.i(this.a, "Repos(repositoryCount=", ", nodes=", ")", this.b);
    }
}
