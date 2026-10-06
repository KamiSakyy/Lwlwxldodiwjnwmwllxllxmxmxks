package mn;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.WorkflowState;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public String a;
    public String b;
    public ZonedDateTime c;
    public int d;
    public WorkflowState e;

    public n(String str, String str2, ZonedDateTime zonedDateTime, int i, WorkflowState workflowState) {
        k71.k.g(str, "id");
        k71.k.g(str2, "name");
        k71.k.g(workflowState, "state");
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
        this.d = i;
        this.e = workflowState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b) && k71.k.b(this.c, nVar.c) && this.d == nVar.d && this.e == nVar.e;
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        ZonedDateTime zonedDateTime = this.c;
        return this.e.hashCode() + s0.b(this.d, (i + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Workflow(id=", this.a, ", name=", this.b, ", lastRunCreatedAt=");
        o.append(this.c);
        o.append(", totalRuns=");
        o.append(this.d);
        o.append(", state=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
