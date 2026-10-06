package ly;

import aa.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w implements m0 {
    public y a;

    public w(y yVar) {
        this.a = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && k71.k.b(this.a, ((w) obj).a);
    }

    public final int hashCode() {
        y yVar = this.a;
        if (yVar == null) {
            return 0;
        }
        return yVar.hashCode();
    }

    public final String toString() {
        return "Data(updateUserList=" + this.a + ")";
    }
}
