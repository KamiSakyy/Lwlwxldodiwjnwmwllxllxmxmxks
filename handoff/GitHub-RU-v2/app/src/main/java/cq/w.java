package cq;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w implements aa.h0 {
    public final u a;
    public final ZonedDateTime b;
    public final boolean c;
    public final String d;
    public final String e;
    public final v f;

    public w(u uVar, ZonedDateTime zonedDateTime, boolean z, String str, String str2, v vVar) {
        this.a = uVar;
        this.b = zonedDateTime;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && k71.k.b(this.b, wVar.b) && this.c == wVar.c && k71.k.b(this.d, wVar.d) && k71.k.b(this.e, wVar.e) && k71.k.b(this.f, wVar.f);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), this.d, 31);
        String str = this.e;
        return this.f.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreatedDiscussionFeedItemFragmentNoRelatedItems(actor=");
        sb.append(this.a);
        sb.append(", createdAt=");
        sb.append(this.b);
        sb.append(", dismissable=");
        com.github.rudroid.m0.z(sb, this.c, ", identifier=", this.d, ", previewImageUrl=");
        sb.append(this.e);
        sb.append(", discussion=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
    public Object e(Object p1) { return null; }
}
