package fp;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x0 {
    public final v0 a;
    public final List b;

    public x0(v0 v0Var, List list) {
        this.a = v0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return k71.k.b(this.a, x0Var.a) && k71.k.b(this.b, x0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "ViewerCopilotAgentTasks(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
