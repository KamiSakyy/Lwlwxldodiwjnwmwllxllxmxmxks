package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yz {
    public final String a;
    public final wz b;
    public final xz c;
    public final String d;

    public yz(String str, wz wzVar, xz xzVar, String str2) {
        this.a = str;
        this.b = wzVar;
        this.c = xzVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz)) {
            return false;
        }
        yz yzVar = (yz) obj;
        return k71.k.b(this.a, yzVar.a) && k71.k.b(this.b, yzVar.b) && k71.k.b(this.c, yzVar.c) && k71.k.b(this.d, yzVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wz wzVar = this.b;
        int hashCode2 = (hashCode + (wzVar == null ? 0 : wzVar.hashCode())) * 31;
        xz xzVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (xzVar != null ? xzVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Repository(id=" + this.a + ", gitObject=" + this.b + ", ref=" + this.c + ", __typename=" + this.d + ")";
    }
}
