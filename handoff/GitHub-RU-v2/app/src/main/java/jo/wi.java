package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wi {
    public final int a;
    public final List b;

    public wi(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi)) {
            return false;
        }
        wi wiVar = (wi) obj;
        return this.a == wiVar.a && k71.k.b(this.b, wiVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return f4.i(this.a, "Organizations(userCount=", ", nodes=", ")", this.b);
    }
}
