package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gf {
    public int a;
    public List b;

    public gf(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf)) {
            return false;
        }
        gf gfVar = (gf) obj;
        return this.a == gfVar.a && k71.k.b(this.b, gfVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4Shadow.i(this.a, "Organizations(userCount=", ", nodes=", ")", this.b);
    }
}
