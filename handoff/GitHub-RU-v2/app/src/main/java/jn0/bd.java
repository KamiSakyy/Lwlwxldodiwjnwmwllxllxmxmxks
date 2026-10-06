package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bd implements aaShadow.v0 {
    public cd a;
    public String b;
    public String c;

    public bd(cd cdVar, String str, String str2) {
        this.a = cdVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return k71.k.b(this.a, bdVar.a) && k71.k.b(this.b, bdVar.b) && k71.k.b(this.c, bdVar.c);
    }

    public final int hashCode() {
        cd cdVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((cdVar == null ? 0 : cdVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(enterpriseSupportContact=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
