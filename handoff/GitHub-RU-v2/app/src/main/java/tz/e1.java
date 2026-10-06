package tz;

import java.time.LocalDate;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e1 {
    public final String a;
    public final LocalDate b;
    public final b0 c;

    public e1(String str, LocalDate localDate, b0 b0Var) {
        this.a = str;
        this.b = localDate;
        this.c = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return k71.k.b(this.a, e1Var.a) && k71.k.b(this.b, e1Var.b) && k71.k.b(this.c, e1Var.c);
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
