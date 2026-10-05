package jn0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class se0 {
    public final ArrayList a;

    public se0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se0) && this.a.equals(((se0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.g("ContributionCalendar(weeks=", ")", this.a);
    }
}
