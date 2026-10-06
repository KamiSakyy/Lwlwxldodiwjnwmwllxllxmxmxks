package fu;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import k71.k;
import m10.gn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements h0 {
    public final String a;
    public final String b;
    public final String c;
    public final gn d;
    public final double e;
    public final ZonedDateTime f;

    public a(String str, String str2, String str3, gn gnVar, double d, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gnVar;
        this.e = d;
        this.f = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && this.d == aVar.d && Double.compare(this.e, aVar.e) == 0 && k.b(this.f, aVar.f);
    }

    public final int hashCode() {
        int hashCode = (Double.hashCode(this.e) + ((this.d.hashCode() + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31)) * 31;
        ZonedDateTime zonedDateTime = this.f;
        return hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("MilestoneFragment(__typename=", this.a, ", id=", this.b, ", title=");
        o.append(this.c);
        o.append(", state=");
        o.append(this.d);
        o.append(", progressPercentage=");
        o.append(this.e);
        o.append(", dueOn=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
