package xk;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public List a;
    public List b;
    public List c;
    public List d;
    public boolean e;

    public h(List list, List list2, List list3, List list4, boolean z) {
        k71.k.g(list, "navLinks");
        k71.k.g(list2, "pinnedItems");
        k71.k.g(list3, "shortcuts");
        k71.k.g(list4, "recentActivities");
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c) && k71.k.b(this.d, hVar.d) && this.e == hVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + f1.e.c(this.d, f1.e.c(this.c, f1.e.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeData(navLinks=");
        sb.append(this.a);
        sb.append(", pinnedItems=");
        sb.append(this.b);
        sb.append(", shortcuts=");
        sb.append(this.c);
        sb.append(", recentActivities=");
        sb.append(this.d);
        sb.append(", isEmployee=");
        return f4.s(sb, this.e, ")");
    }
}
