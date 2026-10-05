package t10;

import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends a {
    public final ZonedDateTime a;
    public final boolean b;
    public final String c;
    public final com.github.service.models.response.a d;
    public final e e;
    public final String f;
    public final Object g;

    public b(ZonedDateTime zonedDateTime, boolean z, String str, com.github.service.models.response.a aVar, e eVar, String str2, List list) {
        k71.k.g(zonedDateTime, "createdAt");
        k71.k.g(str, "identifier");
        this.a = zonedDateTime;
        this.b = z;
        this.c = str;
        this.d = aVar;
        this.e = eVar;
        this.f = str2;
        this.g = list;
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
        return this.g;
    }

    @Override // t10.a
    public final com.github.service.models.response.a d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && this.b == bVar.b && k71.k.b(this.c, bVar.c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && k71.k.b(this.f, bVar.f) && this.g.equals(bVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + f4.b(this.d, h1.i(x.i.e(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31)) * 31;
        String str = this.f;
        return this.g.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "CreatedDiscussionFeedItem(createdAt=" + this.a + ", dismissable=" + this.b + ", identifier=" + this.c + ", author=" + this.d + ", discussion=" + this.e + ", previewImageUrl=" + this.f + ", relatedItems=" + this.g + ")";
    }
}
