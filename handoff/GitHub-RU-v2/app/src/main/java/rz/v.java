package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v {
    public String a;
    public w b;

    public v(String str, w wVar) {
        this.a = str;
        this.b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnProjectV2Owner(id=" + this.a + ", projectsV2=" + this.b + ")";
    }
}
