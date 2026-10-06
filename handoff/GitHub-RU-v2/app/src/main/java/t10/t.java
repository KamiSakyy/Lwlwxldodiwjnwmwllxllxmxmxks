package t10;

import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t extends h {
    public final ZonedDateTime a;
    public final boolean b;
    public final String c;
    public final k d;
    public final Object e;

    public t(ZonedDateTime zonedDateTime, boolean z, String str, k kVar, List list) {
        k71.k.g(zonedDateTime, "createdAt");
        k71.k.g(str, "identifier");
        this.a = zonedDateTime;
        this.b = z;
        this.c = str;
        this.d = kVar;
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
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.a, tVar.a) && this.b == tVar.b && k71.k.b(this.c, tVar.c) && this.d.equals(tVar.d) && this.e.equals(tVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + h1.i(x.i.e(this.a.hashCode() * 31, 31, this.b), this.c, 31)) * 31);
    }

    public final String toString() {
        return "RepositoryRecommendationFeedItem(createdAt=" + this.a + ", dismissable=" + this.b + ", identifier=" + this.c + ", feedRepository=" + this.d + ", relatedItems=" + this.e + ")";
    }
}
