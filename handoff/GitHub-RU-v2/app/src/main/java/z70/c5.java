package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c5 {
    public final Integer a;
    public final boolean b;
    public final boolean c;

    public c5(Integer num, boolean z, boolean z2) {
        this.a = num;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return k71.k.b(this.a, c5Var.a) && this.b == c5Var.b && this.c == c5Var.c;
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
