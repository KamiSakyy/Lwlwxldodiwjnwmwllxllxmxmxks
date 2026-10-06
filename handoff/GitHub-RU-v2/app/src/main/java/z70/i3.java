package z70;

import hc0.nl;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i3 implements aa.h0 {
    public String a;
    public nl b;
    public Integer c;
    public String d;

    public i3(String str, nl nlVar, Integer num, String str2) {
        this.a = str;
        this.b = nlVar;
        this.c = num;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return k71.k.b(this.a, i3Var.a) && this.b == i3Var.b && k71.k.b(this.c, i3Var.c) && k71.k.b(this.d, i3Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        nl nlVar = this.b;
        int hashCode2 = (hashCode + (nlVar == null ? 0 : nlVar.hashCode())) * 31;
        Integer num = this.c;
        return this.d.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PullRequestReviewPullRequestData(id=" + this.a + ", reviewDecision=" + this.b + ", totalCommentsCount=" + this.c + ", __typename=" + this.d + ")";
    }
}
