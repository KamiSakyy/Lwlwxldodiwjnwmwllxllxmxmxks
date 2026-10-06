package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class az {
    public zy a;
    public List b;

    public az(zy zyVar, List list) {
        this.a = zyVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        return k71.k.b(this.a, azVar.a) && k71.k.b(this.b, azVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Patches(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
