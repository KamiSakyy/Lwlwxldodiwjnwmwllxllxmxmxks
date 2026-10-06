package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zm implements aaShadow.m0 {
    public final an a;

    public zm(an anVar) {
        this.a = anVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm) && k71.k.b(this.a, ((zm) obj).a);
    }

    public final int hashCode() {
        an anVar = this.a;
        if (anVar == null) {
            return 0;
        }
        return anVar.hashCode();
    }

    public final String toString() {
        return "Data(minimizeComment=" + this.a + ")";
    }
}
