package g20;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements aa.h0 {
    public String a;
    public String b;
    public hc0.j2 c;
    public hc0.p2 d;
    public ZonedDateTime e;
    public ZonedDateTime f;
    public Integer g;
    public int h;

    public a(String str, String str2, hc0.j2 j2Var, hc0.p2 p2Var, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, Integer num, int i) {
        this.a = str;
        this.b = str2;
        this.c = j2Var;
        this.d = p2Var;
        this.e = zonedDateTime;
        this.f = zonedDateTime2;
        this.g = num;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && k71.k.b(this.e, aVar.e) && k71.k.b(this.f, aVar.f) && k71.k.b(this.g, aVar.g) && this.h == aVar.h;
    }

    public final int hashCode() {
        String str = this.a;
        int i = com.github.rudroid.copilot.h1.i((str == null ? 0 : str.hashCode()) * 31, this.b, 31);
        hc0.j2 j2Var = this.c;
        int hashCode = (this.d.hashCode() + ((i + (j2Var == null ? 0 : j2Var.hashCode())) * 31)) * 31;
        ZonedDateTime zonedDateTime = this.e;
        int hashCode2 = (hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.f;
        int hashCode3 = (hashCode2 + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        Integer num = this.g;
        return Integer.hashCode(this.h) + ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("CheckStepFragment(externalId=", this.a, ", name=", this.b, ", conclusion=");
        o.append(this.c);
        o.append(", status=");
        o.append(this.d);
        o.append(", startedAt=");
        com.github.rudroid.copilot.h1.B(o, this.e, ", completedAt=", this.f, ", secondsToCompletion=");
        o.append(this.g);
        o.append(", number=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
    public Object O(Object p1) { return null; }
}
