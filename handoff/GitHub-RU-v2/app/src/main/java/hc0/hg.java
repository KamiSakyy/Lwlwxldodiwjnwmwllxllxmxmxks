package hc0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hg {
    public final wf a;
    public final yf b;
    public final aa1.b c;
    public final ZonedDateTime d;
    public final aa1.b e;

    public hg(wf wfVar, yf yfVar, aa1.b bVar, ZonedDateTime zonedDateTime, aa1.b bVar2) {
        zf zfVar = ag.Companion;
        bg bgVar = cg.Companion;
        this.a = wfVar;
        this.b = yfVar;
        this.c = bVar;
        this.d = zonedDateTime;
        this.e = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg)) {
            return false;
        }
        hg hgVar = (hg) obj;
        if (this.a != hgVar.a || this.b != hgVar.b) {
            return false;
        }
        zf zfVar = ag.Companion;
        if (!this.c.equals(hgVar.c)) {
            return false;
        }
        bg bgVar = cg.Companion;
        return this.d.equals(hgVar.d) && this.e.equals(hgVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.m0.a(this.d, (cg.r.hashCode() + f1.e.a(this.c, (ag.r.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        ag agVar = ag.r;
        cg cgVar = cg.r;
        StringBuilder sb = new StringBuilder("MobileHydroEvent(action=");
        sb.append(this.a);
        sb.append(", appElement=");
        sb.append(this.b);
        sb.append(", appType=");
        sb.append(agVar);
        sb.append(", context=");
        sb.append(this.c);
        sb.append(", deviceType=");
        sb.append(cgVar);
        sb.append(", performedAt=");
        sb.append(this.d);
        sb.append(", subjectType=");
        return f1.e.k(sb, this.e, ")");
    }

    public Object e;
}
