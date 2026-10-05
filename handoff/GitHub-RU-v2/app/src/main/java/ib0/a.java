package ib0;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final e a;

    public a(e eVar) {
        this.a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && k.b(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        e eVar = this.a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String toString() {
        return "ChangeUserStatus(status=" + this.a + ")";
    }
}
