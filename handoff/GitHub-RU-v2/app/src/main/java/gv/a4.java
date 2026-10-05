package gv;

import m10.jz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a4 implements aa.h0 {
    public final String a;
    public final jz b;
    public final Integer c;
    public final String d;

    public a4(String str, jz jzVar, Integer num, String str2) {
        this.a = str;
        this.b = jzVar;
        this.c = num;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return k71.k.b(this.a, a4Var.a) && this.b == a4Var.b && k71.k.b(this.c, a4Var.c) && k71.k.b(this.d, a4Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jz jzVar = this.b;
        int hashCode2 = (hashCode + (jzVar == null ? 0 : jzVar.hashCode())) * 31;
        Integer num = this.c;
        return this.d.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PullRequestReviewPullRequestData(id=" + this.a + ", reviewDecision=" + this.b + ", totalCommentsCount=" + this.c + ", __typename=" + this.d + ")";
    }
}
