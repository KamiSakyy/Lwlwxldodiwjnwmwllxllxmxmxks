package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hr {
    public final int a;
    public final List b;

    public hr(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr)) {
            return false;
        }
        hr hrVar = (hr) obj;
        return this.a == hrVar.a && k71.k.b(this.b, hrVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return f4.i(this.a, "Commits(totalCount=", ", nodes=", ")", this.b);
    }
}
