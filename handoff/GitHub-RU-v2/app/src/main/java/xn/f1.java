package xn;

import java.time.LocalDate;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1 {
    public LocalDate a;
    public Boolean b;
    public Double c;
    public boolean d;
    public double e;

    public f1(LocalDate localDate, Boolean bool, Double d, boolean z, double d2) {
        this.a = localDate;
        this.b = bool;
        this.c = d;
        this.d = z;
        this.e = d2;
    }

    public static f1 a(f1 f1Var, Boolean bool, Double d, boolean z, double d2, int i) {
        Boolean bool2 = bool;
        LocalDate localDate = f1Var.a;
        if ((i & 2) != 0) {
            bool2 = f1Var.b;
        }
        if ((i & 4) != 0) {
            d = f1Var.c;
        }
        if ((i & 8) != 0) {
            z = f1Var.d;
        }
        if ((i & 16) != 0) {
            d2 = f1Var.e;
        }
        double d3 = d2;
        f1Var.getClass();
        boolean z2 = z;
        return new f1(localDate, bool2, d, z2, d3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return k71.k.b(this.a, f1Var.a) && k71.k.b(this.b, f1Var.b) && k71.k.b(this.c, f1Var.c) && this.d == f1Var.d && Double.compare(this.e, f1Var.e) == 0;
    }

    public final int hashCode() {
        LocalDate localDate = this.a;
        int hashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.c;
        return Double.hashCode(this.e) + x.i.e((hashCode2 + (d != null ? d.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        return "CopilotConsumptiveInfo(resetDate=" + this.a + ", hasRemainingChatQuota=" + this.b + ", chatRemainingQuotaPercentage=" + this.c + ", overageChargeEnabled=" + this.d + ", currentOverageCount=" + this.e + ")";
    }
}
