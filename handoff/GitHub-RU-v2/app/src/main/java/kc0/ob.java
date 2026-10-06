package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ob implements aaShadow.v0 {
    public rb a;
    public sb b;

    public ob(rb rbVar, sb sbVar) {
        this.a = rbVar;
        this.b = sbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj;
        return k71.k.b(this.a, obVar.a) && k71.k.b(this.b, obVar.b);
    }

    public final int hashCode() {
        rb rbVar = this.a;
        return this.b.hashCode() + ((rbVar == null ? 0 : rbVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Data(repository=" + this.a + ", search=" + this.b + ")";
    }
}
