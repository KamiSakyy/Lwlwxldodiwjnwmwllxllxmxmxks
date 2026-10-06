package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p5 {
    public Integer a;
    public boolean b;
    public boolean c;

    public p5(Integer num, boolean z, boolean z2) {
        this.a = num;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj;
        return k71.k.b(this.a, p5Var.a) && this.b == p5Var.b && this.c == p5Var.c;
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
        return jo.f4.s(sb, this.c, ")");
    }
}
