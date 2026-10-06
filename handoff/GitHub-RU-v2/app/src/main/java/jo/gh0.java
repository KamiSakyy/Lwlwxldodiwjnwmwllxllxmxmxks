package jo;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gh0 {
    public ArrayList a;

    public gh0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh0) && this.a.equals(((gh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.g("ContributionCalendar(weeks=", ")", this.a);
    }
}
