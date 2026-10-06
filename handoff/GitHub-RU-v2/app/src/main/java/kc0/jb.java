package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jb implements aaShadow.v0 {
    public final kb a;

    public jb(kb kbVar) {
        this.a = kbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jb) && k71.k.b(this.a, ((jb) obj).a);
    }

    public final int hashCode() {
        kb kbVar = this.a;
        if (kbVar == null) {
            return 0;
        }
        return kbVar.hashCode();
    }

    public final String toString() {
        return "Data(organization=" + this.a + ")";
    }
}
