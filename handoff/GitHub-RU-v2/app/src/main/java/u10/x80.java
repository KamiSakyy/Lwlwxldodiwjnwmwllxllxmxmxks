package u10;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x80 {
    public ArrayList a;

    public x80(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x80) && this.a.equals(((x80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.g("Week(contributionDays=", ")", this.a);
    }
}
