package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mc {
    public final oc a;

    public mc(oc ocVar) {
        this.a = ocVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mc) && k71.k.b(this.a, ((mc) obj).a);
    }

    public final int hashCode() {
        oc ocVar = this.a;
        if (ocVar == null) {
            return 0;
        }
        return ocVar.hashCode();
    }

    public final String toString() {
        return "Diff(patch=" + this.a + ")";
    }
}
