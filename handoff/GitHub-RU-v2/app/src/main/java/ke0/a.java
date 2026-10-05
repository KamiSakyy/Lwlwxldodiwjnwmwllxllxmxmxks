package ke0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import jo.f4;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements h0 {
    public final String a;
    public final String b;
    public final ZonedDateTime c;
    public final String d;
    public final String e;

    public a(String str, String str2, String str3, String str4, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && k.b(this.d, aVar.d) && k.b(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.i(m0.a(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("AutomaticBaseChangedEventFields(__typename=", this.a, ", id=", this.b, ", createdAt=");
        f4.A(", oldBase=", this.d, ", newBase=", o, this.c);
        return h1.p(o, this.e, ")");
    }
}
