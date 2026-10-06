package a70;

import aa.h0;
import com.github.rudroid.copilot.h1;
import hc0.j6;
import java.time.LocalTime;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements h0 {
    public final j6 a;
    public final String b;
    public final LocalTime c;
    public final LocalTime d;
    public final String e;

    public a(j6 j6Var, String str, LocalTime localTime, LocalTime localTime2, String str2) {
        this.a = j6Var;
        this.b = str;
        this.c = localTime;
        this.d = localTime2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && k.b(this.d, aVar.d) && k.b(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushNotificationSchedulesFragment(day=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", startTime=");
        sb.append(this.c);
        sb.append(", endTime=");
        sb.append(this.d);
        sb.append(", __typename=");
        return h1.p(sb, this.e, ")");
    }
}
