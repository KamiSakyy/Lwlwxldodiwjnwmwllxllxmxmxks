package tz0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public class b {
    public Object a;
    public f b;

    public b(List list, f fVar) {
        this.a = list;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PullRequestStatus(statusChecks=" + this.a + ", statusRollup=" + this.b + ")";
    }
}
