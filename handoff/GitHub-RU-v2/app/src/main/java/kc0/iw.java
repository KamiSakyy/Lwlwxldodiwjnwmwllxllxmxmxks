package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class iw {
    public final String a;
    public final gw b;
    public final hw c;
    public final String d;

    public iw(String str, gw gwVar, hw hwVar, String str2) {
        this.a = str;
        this.b = gwVar;
        this.c = hwVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw)) {
            return false;
        }
        iw iwVar = (iw) obj;
        return k71.k.b(this.a, iwVar.a) && k71.k.b(this.b, iwVar.b) && k71.k.b(this.c, iwVar.c) && k71.k.b(this.d, iwVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gw gwVar = this.b;
        int hashCode2 = (hashCode + (gwVar == null ? 0 : gwVar.hashCode())) * 31;
        hw hwVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (hwVar != null ? hwVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Repository(id=" + this.a + ", gitObject=" + this.b + ", ref=" + this.c + ", __typename=" + this.d + ")";
    }
}
