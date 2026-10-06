package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uo {
    public int a;
    public List b;

    public uo(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        return this.a == uoVar.a && k71.k.b(this.b, uoVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4.i(this.a, "Comments(totalCount=", ", nodes=", ")", this.b);
    }
}
