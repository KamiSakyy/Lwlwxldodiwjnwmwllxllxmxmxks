package w30;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements h0 {
    public final String a;
    public final String b;
    public final a c;
    public final ZonedDateTime d;
    public final String e;
    public final String f;

    public b(String str, String str2, a aVar, ZonedDateTime zonedDateTime, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = zonedDateTime;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && k.b(this.d, bVar.d) && k.b(this.e, bVar.e) && k.b(this.f, bVar.f);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        return this.f.hashCode() + h1.i(m0.a(this.d, (i + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("BaseRefChangedEventFields(__typename=", this.a, ", id=", this.b, ", actor=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(", currentRefName=");
        return i.k(o, this.e, ", previousRefName=", this.f, ")");
    }
}
