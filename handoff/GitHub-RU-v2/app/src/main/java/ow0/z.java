package ow0;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z {
    public int a;
    public List b;

    public z(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.a == zVar.a && k71.k.b(this.b, zVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return f4.i(this.a, "Contexts(totalCount=", ", nodes=", ")", this.b);
    }
}
