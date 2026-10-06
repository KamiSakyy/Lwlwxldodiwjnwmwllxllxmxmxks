package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bg {
    public final String a;
    public final wf b;
    public final String c;

    public bg(String str, wf wfVar, String str2) {
        this.a = str;
        this.b = wfVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return k71.k.b(this.a, bgVar.a) && k71.k.b(this.b, bgVar.b) && k71.k.b(this.c, bgVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wf wfVar = this.b;
        return this.c.hashCode() + ((hashCode + (wfVar == null ? 0 : wfVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", gitObject=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
