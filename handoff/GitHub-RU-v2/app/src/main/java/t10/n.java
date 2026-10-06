package t10;

import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n extends h {
    public ZonedDateTime a;
    public boolean b;
    public String c;
    public s d;
    public Object e;

    public n(ZonedDateTime zonedDateTime, boolean z, String str, s sVar, List list) {
        k71.k.g(zonedDateTime, "createdAt");
        k71.k.g(str, "identifier");
        this.a = zonedDateTime;
        this.b = z;
        this.c = str;
        this.d = sVar;
        this.e = list;
    }

    @Override // t10.h
    public final ZonedDateTime a() {
        return this.a;
    }

    @Override // t10.h
    public final String b() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // t10.h
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && this.b == nVar.b && k71.k.b(this.c, nVar.c) && this.d.equals(nVar.d) && this.e.equals(nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + h1.i(x.i.e(this.a.hashCode() * 31, 31, this.b), this.c, 31)) * 31);
    }

    public final String toString() {
        return "FollowUserRecommendationFeedItem(createdAt=" + this.a + ", dismissable=" + this.b + ", identifier=" + this.c + ", recommendedUser=" + this.d + ", relatedItems=" + this.e + ")";
    }
}
