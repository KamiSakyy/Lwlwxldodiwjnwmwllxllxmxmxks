package t10;

import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w extends a {
    public ZonedDateTime a;
    public boolean b;
    public String c;
    public com.github.service.models.response.a d;
    public s e;
    public Object f;

    public w(ZonedDateTime zonedDateTime, boolean z, String str, com.github.service.models.response.a aVar, s sVar, List list) {
        k71.k.g(zonedDateTime, "createdAt");
        k71.k.g(str, "identifier");
        this.a = zonedDateTime;
        this.b = z;
        this.c = str;
        this.d = aVar;
        this.e = sVar;
        this.f = list;
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
        return this.f;
    }

    @Override // t10.a
    public final com.github.service.models.response.a d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && this.b == wVar.b && k71.k.b(this.c, wVar.c) && this.d.equals(wVar.d) && this.e.equals(wVar.e) && this.f.equals(wVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + f4Shadow.b(this.d, h1.i(x.i.e(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31)) * 31);
    }

    public final String toString() {
        return "UserFollowedUserRecommendationFeedItem(createdAt=" + this.a + ", dismissable=" + this.b + ", identifier=" + this.c + ", author=" + this.d + ", recommendedUser=" + this.e + ", relatedItems=" + this.f + ")";
    }
}
