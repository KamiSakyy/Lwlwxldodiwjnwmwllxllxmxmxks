package pm;

import com.github.rudroid.common.f;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.k;
import x61.n;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final a Companion = new a();
    public static final LocalTime e;
    public static final LocalTime f;
    public static final c g;
    public static final c h;
    public final List a;
    public final LocalTime b;
    public final LocalTime c;
    public final boolean d;

    static {
        LocalTime of = LocalTime.of(9, 0);
        k.f(of, "of(...)");
        e = of;
        LocalTime of2 = LocalTime.of(17, 0);
        k.f(of2, "of(...)");
        f = of2;
        f.Companion.getClass();
        List list = f.s;
        ArrayList arrayList = new ArrayList(n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b((f) it.next(), "", e, f));
        }
        c cVar = new c(r.r, e, f, false);
        g = cVar;
        h = a(cVar, arrayList, null, null, false, 14);
    }

    public c(List list, LocalTime localTime, LocalTime localTime2, boolean z) {
        k.g(localTime, "startTime");
        k.g(localTime2, "endTime");
        this.a = list;
        this.b = localTime;
        this.c = localTime2;
        this.d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static c a(c cVar, ArrayList arrayList, LocalTime localTime, LocalTime localTime2, boolean z, int i) {
        ArrayList arrayList2 = arrayList;
        if ((i & 1) != 0) {
            arrayList2 = cVar.a;
        }
        if ((i & 2) != 0) {
            localTime = cVar.b;
        }
        if ((i & 4) != 0) {
            localTime2 = cVar.c;
        }
        if ((i & 8) != 0) {
            z = cVar.d;
        }
        cVar.getClass();
        k.g(localTime, "startTime");
        k.g(localTime2, "endTime");
        return new c(arrayList2, localTime, localTime2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && this.d == cVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SchedulesData(pushNotificationSchedules=" + this.a + ", startTime=" + this.b + ", endTime=" + this.c + ", enabled=" + this.d + ")";
    }
}
