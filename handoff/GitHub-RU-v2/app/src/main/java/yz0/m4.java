package yz0;

import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m4 extends o.b {
    public String t;
    public String u;
    public CheckStatusState v;
    public CheckConclusionState w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(String str, String str2, CheckStatusState checkStatusState, CheckConclusionState checkConclusionState) {
        super(str, false);
        k71.k.g(checkStatusState, "status");
        this.t = str;
        this.u = str2;
        this.v = checkStatusState;
        this.w = checkConclusionState;
    }

    public final String c() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj;
        return k71.k.b(this.t, m4Var.t) && k71.k.b(this.u, m4Var.u) && this.v == m4Var.v && this.w == m4Var.w;
    }

    public final int hashCode() {
        int hashCode = (this.v.hashCode() + com.github.rudroid.copilot.h1.i(this.t.hashCode() * 31, this.u, 31)) * 31;
        CheckConclusionState checkConclusionState = this.w;
        return hashCode + (checkConclusionState == null ? 0 : checkConclusionState.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("CheckSuite(id=", this.t, ", url=", this.u, ", status=");
        o.append(this.v);
        o.append(", conclusion=");
        o.append(this.w);
        o.append(")");
        return o.toString();
    }
}
