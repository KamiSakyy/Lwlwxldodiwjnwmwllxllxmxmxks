package kc0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sa0 {
    public ArrayList a;

    public sa0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa0) && this.a.equals(((sa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.g("ContributionCalendar(weeks=", ")", this.a);
    }
}
