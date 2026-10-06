package yz0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a3 {
    public int a;
    public ArrayList b;

    public a3(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return this.a == a3Var.a && this.b.equals(a3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NotificationFilters(inboxCount=" + this.a + ", customFilters=" + this.b + ")";
    }

    public a3(Object... a) {
    }
}
