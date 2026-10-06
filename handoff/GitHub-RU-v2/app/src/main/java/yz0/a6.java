package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a6 extends s7 {
    public String a;
    public String b;
    public String c;
    public ZonedDateTime d;

    public a6(String str, String str2, String str3, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "actorDisplayName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj;
        return k71.k.b(this.a, a6Var.a) && k71.k.b(this.b, a6Var.b) && k71.k.b(this.c, a6Var.c) && k71.k.b(this.d, a6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("TimelineBaseRefChangedEvent(actorDisplayName=", this.a, ", newName=", this.b, ", oldName=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a {
        public a() {
        }
    }
}
