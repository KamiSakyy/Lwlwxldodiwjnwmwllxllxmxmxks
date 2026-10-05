package xn;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 {
    public final x0 a;
    public final ArrayList b;

    public y0(x0 x0Var, ArrayList arrayList) {
        this.a = x0Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.a.equals(y0Var.a) && this.b.equals(y0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CopilotAgentTaskDetail(task=" + this.a + ", sessions=" + this.b + ")";
    }
}
