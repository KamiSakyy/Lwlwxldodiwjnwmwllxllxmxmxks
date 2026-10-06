package c11;

import a0.s0;
import com.github.rudroid.copilot.h1;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements f {
    public String a;
    public String b;
    public Object c;

    public d(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c.equals(dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ResolvedWorkflowRun(workflowRunId=", this.a, ", checkSuiteId=", this.b, ", matchingPullRequestIds=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
