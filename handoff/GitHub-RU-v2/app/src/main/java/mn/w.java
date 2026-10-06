package mn;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.WorkflowState;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public static final v Companion = new v();
    public static final w g;
    public final String a;
    public final String b;
    public final WorkflowState c;
    public final Object d;
    public final x01.i e;
    public final boolean f;

    static {
        WorkflowState workflowState = WorkflowState.UNKNOWN__;
        x01.i.Companion.getClass();
        g = new w("", "", workflowState, x61.r.r, x01.i.d, false);
    }

    public w(String str, String str2, WorkflowState workflowState, List list, x01.i iVar, boolean z) {
        k71.k.g(str, "workflowName");
        k71.k.g(str2, "workflowUrl");
        k71.k.g(workflowState, "workflowState");
        this.a = str;
        this.b = str2;
        this.c = workflowState;
        this.d = list;
        this.e = iVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && k71.k.b(this.b, wVar.b) && this.c == wVar.c && this.d.equals(wVar.d) && this.e.equals(wVar.e) && this.f == wVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + h1.h((this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("WorkflowRunsPaged(workflowName=", this.a, ", workflowUrl=", this.b, ", workflowState=");
        o.append(this.c);
        o.append(", workflowRuns=");
        o.append(this.d);
        o.append(", page=");
        o.append(this.e);
        o.append(", hasWorkflowDispatchTrigger=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
