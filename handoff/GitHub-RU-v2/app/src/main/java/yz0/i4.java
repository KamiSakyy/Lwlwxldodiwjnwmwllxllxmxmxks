package yz0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i4 {
    public final ArrayList a;
    public final x01.i b;

    public i4(ArrayList arrayList, x01.i iVar) {
        this.a = arrayList;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj;
        return this.a.equals(i4Var.a) && this.b.equals(i4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SavedReplyPaged(replies=" + this.a + ", page=" + this.b + ")";
    }

    public i4(Object... a) {
    }
}
