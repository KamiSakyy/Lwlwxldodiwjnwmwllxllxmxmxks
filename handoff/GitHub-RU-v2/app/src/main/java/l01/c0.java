package l01;

import com.github.rudroid.copilot.h1;
import java.time.LocalDate;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c0 {
    public static final b0 Companion = new b0();
    public static final c0 f = new c0(null, null, null, null, null);
    public final LocalDate a;
    public final String b;
    public final Double c;
    public final String d;
    public final String e;

    public c0(LocalDate localDate, String str, Double d, String str2, String str3) {
        this.a = localDate;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return k71.k.b(this.a, c0Var.a) && k71.k.b(this.b, c0Var.b) && k71.k.b(this.c, c0Var.c) && k71.k.b(this.d, c0Var.d) && k71.k.b(this.e, c0Var.e);
    }

    public final int hashCode() {
        LocalDate localDate = this.a;
        int hashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.c;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProjectFieldValueInput(date=");
        sb.append(this.a);
        sb.append(", iterationId=");
        sb.append(this.b);
        sb.append(", number=");
        sb.append(this.c);
        sb.append(", singleSelectOptionId=");
        sb.append(this.d);
        sb.append(", text=");
        return h1.p(sb, this.e, ")");
    }
}
