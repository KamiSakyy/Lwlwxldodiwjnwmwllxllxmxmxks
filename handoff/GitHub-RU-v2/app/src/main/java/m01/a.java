package m01;

import a0.s0;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final boolean a;
    public final int b;
    public final boolean c;

    public a(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + s0.b(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewerReviewerReviewStatus(viewerIsAuthor=");
        sb.append(this.a);
        sb.append(", pendingReviewCommentsCount=");
        sb.append(this.b);
        sb.append(", viewerIsRequestedAsReviewer=");
        return f4.s(sb, this.c, ")");
    }
}
