package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cd {
    public String a;
    public pz0.l40 b;

    public cd(String str, pz0.l40 l40Var) {
        this.a = str;
        this.b = l40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd)) {
            return false;
        }
        cd cdVar = (cd) obj;
        return k71.k.b(this.a, cdVar.a) && this.b == cdVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EnterpriseSupportContact(link=" + this.a + ", linkType=" + this.b + ")";
    }
}
