package pm;

import com.github.rudroid.common.f;
import java.time.LocalTime;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public String a;
    public f b;
    public LocalTime c;
    public LocalTime d;

    public b(f fVar, String str, LocalTime localTime, LocalTime localTime2) {
        k.g(str, "id");
        k.g(fVar, "day");
        k.g(localTime, "startsAt");
        k.g(localTime2, "endsAt");
        this.a = str;
        this.b = fVar;
        this.c = localTime;
        this.d = localTime2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && this.b == bVar.b && k.b(this.c, bVar.c) && k.b(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DaySchedule(id=" + this.a + ", day=" + this.b + ", startsAt=" + this.c + ", endsAt=" + this.d + ")";
    }
}
