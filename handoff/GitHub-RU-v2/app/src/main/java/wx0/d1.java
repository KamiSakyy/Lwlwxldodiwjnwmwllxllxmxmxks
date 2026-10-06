package wx0;

import java.time.LocalDate;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d1 {
    public final String a;
    public final LocalDate b;
    public final a0 c;

    public d1(String str, LocalDate localDate, a0 a0Var) {
        this.a = str;
        this.b = localDate;
        this.c = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return k71.k.b(this.a, d1Var.a) && k71.k.b(this.b, d1Var.b) && k71.k.b(this.c, d1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        LocalDate localDate = this.b;
        return this.c.hashCode() + ((hashCode + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }

    public final String toString() {
        return "OnProjectV2ItemFieldDateValue(id=" + this.a + ", date=" + this.b + ", field=" + this.c + ")";
    }
}
