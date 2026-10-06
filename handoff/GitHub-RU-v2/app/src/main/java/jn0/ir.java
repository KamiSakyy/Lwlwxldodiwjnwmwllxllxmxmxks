package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ir {
    public final hr a;
    public final List b;

    public ir(hr hrVar, List list) {
        this.a = hrVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir)) {
            return false;
        }
        ir irVar = (ir) obj;
        return k71.k.b(this.a, irVar.a) && k71.k.b(this.b, irVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Reactions(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
