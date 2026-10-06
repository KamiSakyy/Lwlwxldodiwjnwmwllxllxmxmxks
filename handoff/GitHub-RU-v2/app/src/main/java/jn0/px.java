package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class px implements aaShadow.v0 {
    public qx a;
    public String b;
    public String c;

    public px(qx qxVar, String str, String str2) {
        this.a = qxVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px)) {
            return false;
        }
        px pxVar = (px) obj;
        return k71.k.b(this.a, pxVar.a) && k71.k.b(this.b, pxVar.b) && k71.k.b(this.c, pxVar.c);
    }

    public final int hashCode() {
        qx qxVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((qxVar == null ? 0 : qxVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
