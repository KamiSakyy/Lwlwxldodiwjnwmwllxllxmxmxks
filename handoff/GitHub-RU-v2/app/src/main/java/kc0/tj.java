package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tj implements aa.v0 {
    public final ak a;

    public tj(ak akVar) {
        this.a = akVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tj) && k71.k.b(this.a, ((tj) obj).a);
    }

    public final int hashCode() {
        ak akVar = this.a;
        if (akVar == null) {
            return 0;
        }
        return akVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
