package g01;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final ArrayList a;
    public final boolean b;

    public a(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HomeRecentActivityData(recentActivities=" + this.a + ", isEmployee=" + this.b + ")";
    }
}
