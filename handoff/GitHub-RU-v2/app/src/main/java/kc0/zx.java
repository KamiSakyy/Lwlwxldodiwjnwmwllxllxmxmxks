package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zx {
    public String a;
    public ni0.d b;

    public zx(String str, ni0.d dVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx)) {
            return false;
        }
        zx zxVar = (zx) obj;
        return k71.k.b(this.a, zxVar.a) && k71.k.b(this.b, zxVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ni0.d dVar = this.b;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "Owner(__typename=" + this.a + ", projectOwnerFragment=" + this.b + ")";
    }
}
