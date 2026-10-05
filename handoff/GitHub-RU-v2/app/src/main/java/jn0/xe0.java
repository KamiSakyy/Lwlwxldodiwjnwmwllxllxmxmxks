package jn0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xe0 {
    public final ArrayList a;

    public xe0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xe0) && this.a.equals(((xe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.g("Week(contributionDays=", ")", this.a);
    }
}
