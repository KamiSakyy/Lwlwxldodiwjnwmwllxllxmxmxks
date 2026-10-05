package p01;

import yz0.a2;
import yz0.j3;
import yz0.z1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final j3 a;
    public final z1 b;
    public final String c;
    public final a2 d;

    public c(j3 j3Var, z1 z1Var, String str, a2 a2Var) {
        this.a = j3Var;
        this.b = z1Var;
        this.c = str;
        this.d = a2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c) && k71.k.b(this.d, cVar.d);
    }

    public final int hashCode() {
        j3 j3Var = this.a;
        int hashCode = (j3Var == null ? 0 : j3Var.hashCode()) * 31;
        z1 z1Var = this.b;
        int hashCode2 = (hashCode + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RefComparison(activePullRequest=" + this.a + ", commitOverview=" + this.b + ", lastCommitMessage=" + this.c + ", filesChangedOverview=" + this.d + ")";
    }
}
