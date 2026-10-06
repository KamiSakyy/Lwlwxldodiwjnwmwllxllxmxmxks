package pi;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements p {
    public final String a;
    public final ZonedDateTime b;

    public o(String str, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b);
    }

    @Override // pi.p
    public final String getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Timestamp(text=" + this.a + ", value=" + this.b + ")";
    }
}
