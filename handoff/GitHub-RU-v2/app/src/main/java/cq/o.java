package cq;

import java.time.LocalDate;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements aa.h0 {
    public LocalDate a;
    public Boolean b;
    public Double c;

    public o(LocalDate localDate, Boolean bool, Double d) {
        this.a = localDate;
        this.b = bool;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b) && k71.k.b(this.c, oVar.c);
    }

    public final int hashCode() {
        LocalDate localDate = this.a;
        int hashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.c;
        return hashCode2 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        return "CopilotLimitedUser(resetDate=" + this.a + ", hasUsageRemaining=" + this.b + ", quotaPercentageRemaining=" + this.c + ")";
    }
    public Object a = null;
}
