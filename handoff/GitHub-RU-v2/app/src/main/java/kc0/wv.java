package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wv {
    public qv a;
    public String b;
    public String c;

    public wv(qv qvVar, String str, String str2) {
        this.a = qvVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv)) {
            return false;
        }
        wv wvVar = (wv) obj;
        return k71.k.b(this.a, wvVar.a) && k71.k.b(this.b, wvVar.b) && k71.k.b(this.c, wvVar.c);
    }

    public final int hashCode() {
        qv qvVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((qvVar == null ? 0 : qvVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(author=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
