package yz0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f8 {
    public final boolean a;
    public final ArrayList b;
    public final Object c;

    public f8(boolean z, ArrayList arrayList, List list) {
        this.a = z;
        this.b = arrayList;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        return this.a == f8Var.a && this.b.equals(f8Var.b) && this.c.equals(f8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "UserListPayload(userHasCreatedLists=" + this.a + ", suggestedLists=" + this.b + ", userCreatedLists=" + this.c + ")";
    }
}
