package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x5 {
    public Integer a;
    public boolean b;
    public boolean c;

    public x5(Integer num, boolean z, boolean z2) {
        this.a = num;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj;
        return k71.k.b(this.a, x5Var.a) && this.b == x5Var.b && this.c == x5Var.c;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Boolean.hashCode(this.c) + x.i.e((num == null ? 0 : num.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RefUpdateRule(recommendedApprovingReviewCount=");
        sb.append(this.a);
        sb.append(", requiresCodeOwnerReviews=");
        sb.append(this.b);
        sb.append(", viewerAllowedToDismissReviews=");
        return jo.f4Shadow.s(sb, this.c, ")");
    }
}
