package vo;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public int a;
    public List b;

    public i(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && k71.k.b(this.b, iVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return f4.i(this.a, "FailedCheckRuns(totalCount=", ", nodes=", ")", this.b);
    }
}
