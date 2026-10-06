package sr;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements h0 {
    public final String a;
    public final String b;
    public final a c;
    public final boolean d;
    public final i e;
    public final ZonedDateTime f;

    public j(String str, String str2, a aVar, boolean z, i iVar, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = z;
        this.e = iVar;
        this.f = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b) && k71.k.b(this.c, jVar.c) && this.d == jVar.d && k71.k.b(this.e, jVar.e) && k71.k.b(this.f, jVar.f);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + x.i.e((i + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("CrossReferencedEventFields(__typename=", this.a, ", id=", this.b, ", actor=");
        o.append(this.c);
        o.append(", isCrossRepository=");
        o.append(this.d);
        o.append(", source=");
        o.append(this.e);
        o.append(", createdAt=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
