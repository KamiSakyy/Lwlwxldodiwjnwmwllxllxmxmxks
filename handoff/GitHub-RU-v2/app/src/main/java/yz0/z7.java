package yz0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z7 {
    public final ArrayList a;
    public final ArrayList b;
    public final com.github.service.models.response.a c;
    public final String d;

    public z7(ArrayList arrayList, ArrayList arrayList2, com.github.service.models.response.a aVar, String str) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = aVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj;
        return this.a.equals(z7Var.a) && this.b.equals(z7Var.b) && this.c.equals(z7Var.c) && k71.k.b(this.d, z7Var.d);
    }

    public final int hashCode() {
        int b = jo.f4.b(this.c, no.a.b(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "UpdatePullRequestReviewers(reviewers=" + this.a + ", eventItems=" + this.b + ", actor=" + this.c + ", repoOwner=" + this.d + ")";
    }
}
