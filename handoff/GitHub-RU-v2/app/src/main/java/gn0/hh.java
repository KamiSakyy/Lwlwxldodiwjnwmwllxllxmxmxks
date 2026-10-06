package gn0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hh {
    public final wg a;
    public final yg b;
    public final aa1.b c;
    public final ZonedDateTime d;
    public final aa1.b e;

    public hh(wg wgVar, yg ygVar, aa1.b bVar, ZonedDateTime zonedDateTime, aa1.b bVar2) {
        zg zgVar = ah.Companion;
        bh bhVar = ch.Companion;
        this.a = wgVar;
        this.b = ygVar;
        this.c = bVar;
        this.d = zonedDateTime;
        this.e = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh)) {
            return false;
        }
        hh hhVar = (hh) obj;
        if (this.a != hhVar.a || this.b != hhVar.b) {
            return false;
        }
        zg zgVar = ah.Companion;
        if (!this.c.equals(hhVar.c)) {
            return false;
        }
        bh bhVar = ch.Companion;
        return this.d.equals(hhVar.d) && this.e.equals(hhVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.m0.a(this.d, (ch.r.hashCode() + f1.e.a(this.c, (ah.r.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        ah ahVar = ah.r;
        ch chVar = ch.r;
        StringBuilder sb = new StringBuilder("MobileHydroEvent(action=");
        sb.append(this.a);
        sb.append(", appElement=");
        sb.append(this.b);
        sb.append(", appType=");
        sb.append(ahVar);
        sb.append(", context=");
        sb.append(this.c);
        sb.append(", deviceType=");
        sb.append(chVar);
        sb.append(", performedAt=");
        sb.append(this.d);
        sb.append(", subjectType=");
        return f1.e.k(sb, this.e, ")");
    }

    public Object e;
}
