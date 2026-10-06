package t10;

import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m extends h {
    public ZonedDateTime a;
    public boolean b;
    public String c;
    public r d;
    public Object e;

    public m(ZonedDateTime zonedDateTime, boolean z, String str, r rVar, List list) {
        k71.k.g(zonedDateTime, "createdAt");
        k71.k.g(str, "identifier");
        this.a = zonedDateTime;
        this.b = z;
        this.c = str;
        this.d = rVar;
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
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && this.b == mVar.b && k71.k.b(this.c, mVar.c) && this.d.equals(mVar.d) && this.e.equals(mVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + h1.i(x.i.e(this.a.hashCode() * 31, 31, this.b), this.c, 31)) * 31);
    }

    public final String toString() {
        return "FollowOrganizationRecommendationFeedItem(createdAt=" + this.a + ", dismissable=" + this.b + ", identifier=" + this.c + ", recommendedOrganization=" + this.d + ", relatedItems=" + this.e + ")";
    }
}
