package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bz {
    public String a;
    public vy b;
    public String c;

    public bz(String str, vy vyVar, String str2) {
        this.a = str;
        this.b = vyVar;
        this.c = str2;
    }

    public static bz a(bz bzVar, vy vyVar) {
        String str = bzVar.a;
        String str2 = bzVar.c;
        bzVar.getClass();
        return new bz(str, vyVar, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return false;
        }
        bz bzVar = (bz) obj;
        return k71.k.b(this.a, bzVar.a) && k71.k.b(this.b, bzVar.b) && k71.k.b(this.c, bzVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vy vyVar = this.b;
        return this.c.hashCode() + ((hashCode + (vyVar == null ? 0 : vyVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", comparison=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
