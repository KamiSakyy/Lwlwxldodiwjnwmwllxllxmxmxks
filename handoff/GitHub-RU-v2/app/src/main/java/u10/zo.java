package u10;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zo {
    public final String a;
    public final String b;
    public final so c;
    public final ZonedDateTime d;
    public final ZonedDateTime e;
    public final String f;
    public final y60.a g;

    public zo(String str, String str2, so soVar, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str3, y60.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = soVar;
        this.d = zonedDateTime;
        this.e = zonedDateTime2;
        this.f = str3;
        this.g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo)) {
            return false;
        }
        zo zoVar = (zo) obj;
        return k71.k.b(this.a, zoVar.a) && k71.k.b(this.b, zoVar.b) && k71.k.b(this.c, zoVar.c) && k71.k.b(this.d, zoVar.d) && k71.k.b(this.e, zoVar.e) && k71.k.b(this.f, zoVar.f) && k71.k.b(this.g, zoVar.g);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        so soVar = this.c;
        int a = com.github.rudroid.m0.a(this.d, (i + (soVar == null ? 0 : soVar.hashCode())) * 31, 31);
        ZonedDateTime zonedDateTime = this.e;
        return this.g.hashCode() + com.github.rudroid.copilot.h1.i((a + (zonedDateTime != null ? zonedDateTime.hashCode() : 0)) * 31, this.f, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", id=", this.b, ", author=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(", lastEditedAt=");
        jo.f4.A(", body=", this.f, ", minimizableCommentFragment=", o, this.e);
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
