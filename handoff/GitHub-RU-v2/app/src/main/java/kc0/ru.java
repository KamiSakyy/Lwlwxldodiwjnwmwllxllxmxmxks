package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ru {
    public vu a;
    public String b;

    public ru(vu vuVar, String str) {
        this.a = vuVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru)) {
            return false;
        }
        ru ruVar = (ru) obj;
        return k71.k.b(this.a, ruVar.a) && k71.k.b(this.b, ruVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnUser(repositories=" + this.a + ", id=" + this.b + ")";
    }
}
