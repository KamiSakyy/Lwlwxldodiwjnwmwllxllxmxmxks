package xk;

import java.time.LocalDate;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public static final f Companion = new f();
    public static final g c = new g(new qa.c(3, 13), LocalDate.of(2026, 6, 30));
    public final qa.c a;
    public final LocalDate b;

    public g(qa.c cVar, LocalDate localDate) {
        this.a = cVar;
        this.b = localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        LocalDate localDate = this.b;
        return hashCode + (localDate == null ? 0 : localDate.hashCode());
    }

    public final String toString() {
        return "GhesDeprecationData(serverVersion=" + this.a + ", deprecationDate=" + this.b + ")";
    }
    public Object a(Object p1) { return null; }
}
