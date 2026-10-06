package u10;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s80 {
    public ArrayList a;

    public s80(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s80) && this.a.equals(((s80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.g("ContributionCalendar(weeks=", ")", this.a);
    }
}
