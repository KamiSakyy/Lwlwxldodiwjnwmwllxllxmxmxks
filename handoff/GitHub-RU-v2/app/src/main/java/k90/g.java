package k90;

import a0.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public g(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b) && this.c == gVar.c && k71.k.b(this.d, gVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.d.hashCode() + x.i.e((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return com.github.rudroid.m0.l(s0.o("OnOrganization(name=", this.a, ", descriptionHTML=", this.b, ", viewerIsFollowing="), this.c, ", id=", this.d, ")");
    }
}
