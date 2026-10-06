package pz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dk {
    public final kj a;
    public final mj b;
    public final aa1.b c;
    public final ZonedDateTime d;
    public final aa1.b e;

    public dk(kj kjVar, mj mjVar, aa1.b bVar, ZonedDateTime zonedDateTime, aa1.b bVar2) {
        nj njVar = oj.Companion;
        xj xjVar = yj.Companion;
        this.a = kjVar;
        this.b = mjVar;
        this.c = bVar;
        this.d = zonedDateTime;
        this.e = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk)) {
            return false;
        }
        dk dkVar = (dk) obj;
        if (this.a != dkVar.a || this.b != dkVar.b) {
            return false;
        }
        nj njVar = oj.Companion;
        if (!this.c.equals(dkVar.c)) {
            return false;
        }
        xj xjVar = yj.Companion;
        return this.d.equals(dkVar.d) && this.e.equals(dkVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.m0.a(this.d, (yj.r.hashCode() + f1.e.a(this.c, (oj.r.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        oj ojVar = oj.r;
        yj yjVar = yj.r;
        StringBuilder sb = new StringBuilder("MobileHydroEvent(action=");
        sb.append(this.a);
        sb.append(", appElement=");
        sb.append(this.b);
        sb.append(", appType=");
        sb.append(ojVar);
        sb.append(", context=");
        sb.append(this.c);
        sb.append(", deviceType=");
        sb.append(yjVar);
        sb.append(", performedAt=");
        sb.append(this.d);
        sb.append(", subjectType=");
        return f1.e.k(sb, this.e, ")");
    }

    public Object e;
}
