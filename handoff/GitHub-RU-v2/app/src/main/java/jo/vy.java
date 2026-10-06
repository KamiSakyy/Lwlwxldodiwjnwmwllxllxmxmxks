package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vy {
    public final uy a;
    public final List b;

    public vy(uy uyVar, List list) {
        this.a = uyVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy)) {
            return false;
        }
        vy vyVar = (vy) obj;
        return k71.k.b(this.a, vyVar.a) && k71.k.b(this.b, vyVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Watchers(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
