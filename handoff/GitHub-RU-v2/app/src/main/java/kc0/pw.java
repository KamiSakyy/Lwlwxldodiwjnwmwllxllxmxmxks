package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pw implements aaShadow.v0 {
    public final tw a;

    public pw(tw twVar) {
        this.a = twVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pw) && k71.k.b(this.a, ((pw) obj).a);
    }

    public final int hashCode() {
        tw twVar = this.a;
        if (twVar == null) {
            return 0;
        }
        return twVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
