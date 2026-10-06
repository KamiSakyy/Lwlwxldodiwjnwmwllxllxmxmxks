package ea0;

import hc0.rb;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public rb a;
    public ZonedDateTime b;
    public o c;
    public p d;

    public w(rb rbVar, ZonedDateTime zonedDateTime, o oVar, p pVar) {
        this.a = rbVar;
        this.b = zonedDateTime;
        this.c = oVar;
        this.d = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.a == wVar.a && k71.k.b(this.b, wVar.b) && k71.k.b(this.c, wVar.c) && k71.k.b(this.d, wVar.d);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31);
        o oVar = this.c;
        return this.d.hashCode() + ((a + (oVar == null ? 0 : oVar.hashCode())) * 31);
    }

    public final String toString() {
        return "RecentInteraction(interaction=" + this.a + ", occurredAt=" + this.b + ", commenter=" + this.c + ", interactable=" + this.d + ")";
    }
    public Object e(Object p1) { return null; }
}
