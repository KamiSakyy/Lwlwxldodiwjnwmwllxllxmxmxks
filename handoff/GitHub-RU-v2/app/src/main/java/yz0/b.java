package yz0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements q3 {
    public static final a Companion = new a();
    public ArrayList a;

    public b(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a.equals(((b) obj).a);
    }

    @Override // yz0.q3
    public final long getId() {
        return 0L;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.g("AddReactionSmiley(allReactions=", ")", this.a);
    }
}
