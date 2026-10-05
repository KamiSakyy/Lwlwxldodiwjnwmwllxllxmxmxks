package cq;

import java.time.LocalDate;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements aa.h0 {
    public final LocalDate a;
    public final double b;
    public final double c;
    public final double d;
    public final boolean e;
    public final Double f;
    public final Double g;
    public final String h;

    public m(LocalDate localDate, double d, double d2, double d3, boolean z, Double d4, Double d5, String str) {
        this.a = localDate;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = z;
        this.f = d4;
        this.g = d5;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && Double.compare(this.b, mVar.b) == 0 && Double.compare(this.c, mVar.c) == 0 && Double.compare(this.d, mVar.d) == 0 && this.e == mVar.e && k71.k.b(this.f, mVar.f) && k71.k.b(this.g, mVar.g) && k71.k.b(this.h, mVar.h);
    }

    public final int hashCode() {
        LocalDate localDate = this.a;
        int e = x.i.e((Double.hashCode(this.d) + ((Double.hashCode(this.c) + ((Double.hashCode(this.b) + ((localDate == null ? 0 : localDate.hashCode()) * 31)) * 31)) * 31)) * 31, 31, this.e);
        Double d = this.f;
        int hashCode = (e + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.g;
        return this.h.hashCode() + ((hashCode + (d2 != null ? d2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CopilotConsumptiveUser(resetDate=");
        sb.append(this.a);
        sb.append(", freeOverageCount=");
        sb.append(this.b);
        sb.append(", premiumOverageCount=");
        sb.append(this.c);
        sb.append(", entitlement=");
        sb.append(this.d);
        sb.append(", isOveragePermitted=");
        sb.append(this.e);
        sb.append(", freeRemaining=");
        sb.append(this.f);
        sb.append(", premiumRemaining=");
        sb.append(this.g);
        return no.a.q(sb, ", quotaId=", this.h, ")");
    }
}
