package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zm implements aaShadow.v0 {
    public final dn a;

    public zm(dn dnVar) {
        this.a = dnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm) && k71.k.b(this.a, ((zm) obj).a);
    }

    public final int hashCode() {
        dn dnVar = this.a;
        if (dnVar == null) {
            return 0;
        }
        return dnVar.hashCode();
    }

    public final String toString() {
        return "Data(user=" + this.a + ")";
    }
}
