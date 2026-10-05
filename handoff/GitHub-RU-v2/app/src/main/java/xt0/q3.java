package xt0;

import pz0.ot;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q3 implements aa.h0 {
    public final String a;
    public final ot b;
    public final Integer c;
    public final String d;

    public q3(String str, ot otVar, Integer num, String str2) {
        this.a = str;
        this.b = otVar;
        this.c = num;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return k71.k.b(this.a, q3Var.a) && this.b == q3Var.b && k71.k.b(this.c, q3Var.c) && k71.k.b(this.d, q3Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ot otVar = this.b;
        int hashCode2 = (hashCode + (otVar == null ? 0 : otVar.hashCode())) * 31;
        Integer num = this.c;
        return this.d.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PullRequestReviewPullRequestData(id=" + this.a + ", reviewDecision=" + this.b + ", totalCommentsCount=" + this.c + ", __typename=" + this.d + ")";
    }
}
