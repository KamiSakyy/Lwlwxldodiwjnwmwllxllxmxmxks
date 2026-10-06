package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jv implements aaShadow.v0 {
    public final ov a;

    public jv(ov ovVar) {
        this.a = ovVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jv) && k71.k.b(this.a, ((jv) obj).a);
    }

    public final int hashCode() {
        ov ovVar = this.a;
        if (ovVar == null) {
            return 0;
        }
        return ovVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
