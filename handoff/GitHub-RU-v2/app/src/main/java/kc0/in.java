package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class in implements aaShadow.v0 {
    public mn a;

    public in(mn mnVar) {
        this.a = mnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof in) && k71.k.b(this.a, ((in) obj).a);
    }

    public final int hashCode() {
        mn mnVar = this.a;
        if (mnVar == null) {
            return 0;
        }
        return mnVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
