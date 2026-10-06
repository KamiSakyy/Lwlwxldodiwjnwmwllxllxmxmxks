package ur0;

import pz0.bf;
import pz0.df;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p0 implements aa.h0 {
    public final String a;
    public final bf b;
    public final df c;
    public final boolean d;
    public final o0 e;
    public final String f;

    public p0(String str, bf bfVar, df dfVar, boolean z, o0 o0Var, String str2) {
        this.a = str;
        this.b = bfVar;
        this.c = dfVar;
        this.d = z;
        this.e = o0Var;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return k71.k.b(this.a, p0Var.a) && this.b == p0Var.b && this.c == p0Var.c && this.d == p0Var.d && k71.k.b(this.e, p0Var.e) && k71.k.b(this.f, p0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        df dfVar = this.c;
        int e = x.i.e((hashCode + (dfVar == null ? 0 : dfVar.hashCode())) * 31, 31, this.d);
        o0 o0Var = this.e;
        return this.f.hashCode() + ((e + (o0Var != null ? o0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "UpdateIssueStateFragment(id=" + this.a + ", state=" + this.b + ", stateReason=" + this.c + ", viewerCanReopen=" + this.d + ", parent=" + this.e + ", __typename=" + this.f + ")";
    }
}
