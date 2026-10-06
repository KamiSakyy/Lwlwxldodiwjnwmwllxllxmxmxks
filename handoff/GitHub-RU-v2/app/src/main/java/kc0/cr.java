package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cr {
    public br a;
    public List b;

    public cr(br brVar, List list) {
        this.a = brVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr)) {
            return false;
        }
        cr crVar = (cr) obj;
        return k71.k.b(this.a, crVar.a) && k71.k.b(this.b, crVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Releases(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
