package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ms {
    public final int a;
    public final List b;

    public ms(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms)) {
            return false;
        }
        ms msVar = (ms) obj;
        return this.a == msVar.a && k71.k.b(this.b, msVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return f4.i(this.a, "Mentioned(issueCount=", ", nodes=", ")", this.b);
    }
}
