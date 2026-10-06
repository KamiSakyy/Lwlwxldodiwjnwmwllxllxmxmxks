package mn;

import com.github.rudroid.copilot.h1;
import com.github.service.models.response.type.StatusState;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public final String a;
    public final StatusState b;
    public final m c;
    public final Object d;
    public final h e;

    public i(String str, StatusState statusState, m mVar, List list, h hVar) {
        k71.k.g(str, "commitId");
        k71.k.g(statusState, "statusState");
        this.a = str;
        this.b = statusState;
        this.c = mVar;
        this.d = list;
        this.e = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && this.b == iVar.b && this.c.equals(iVar.c) && this.d.equals(iVar.d) && this.e.equals(iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.h((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31);
    }

    public final String toString() {
        return "ActionChecksSummary(commitId=" + this.a + ", statusState=" + this.b + ", jobStatusCount=" + this.c + ", statusContexts=" + this.d + ", checkSuites=" + this.e + ")";
    }
}
