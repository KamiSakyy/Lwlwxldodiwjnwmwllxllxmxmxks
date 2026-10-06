package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mr implements aaShadow.m0 {
    public or a;

    public mr(or orVar) {
        this.a = orVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mr) && k71.k.b(this.a, ((mr) obj).a);
    }

    public final int hashCode() {
        or orVar = this.a;
        if (orVar == null) {
            return 0;
        }
        return orVar.hashCode();
    }

    public final String toString() {
        return "Data(rejectDeployments=" + this.a + ")";
    }
}
