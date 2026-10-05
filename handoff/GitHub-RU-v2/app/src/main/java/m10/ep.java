package m10;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ep {
    public final on a;
    public final qn b;
    public final aa1.b c;
    public final ZonedDateTime d;
    public final aa1.b e;

    public ep(on onVar, qn qnVar, aa1.b bVar, ZonedDateTime zonedDateTime, aa1.b bVar2) {
        rn rnVar = sn.Companion;
        yo yoVar = zo.Companion;
        this.a = onVar;
        this.b = qnVar;
        this.c = bVar;
        this.d = zonedDateTime;
        this.e = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep)) {
            return false;
        }
        ep epVar = (ep) obj;
        if (this.a != epVar.a || this.b != epVar.b) {
            return false;
        }
        rn rnVar = sn.Companion;
        if (!this.c.equals(epVar.c)) {
            return false;
        }
        yo yoVar = zo.Companion;
        return this.d.equals(epVar.d) && this.e.equals(epVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.m0.a(this.d, (zo.r.hashCode() + f1.e.a(this.c, (sn.r.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        sn snVar = sn.r;
        zo zoVar = zo.r;
        StringBuilder sb = new StringBuilder("MobileHydroEvent(action=");
        sb.append(this.a);
        sb.append(", appElement=");
        sb.append(this.b);
        sb.append(", appType=");
        sb.append(snVar);
        sb.append(", context=");
        sb.append(this.c);
        sb.append(", deviceType=");
        sb.append(zoVar);
        sb.append(", performedAt=");
        sb.append(this.d);
        sb.append(", subjectType=");
        return f1.e.k(sb, this.e, ")");
    }
}
