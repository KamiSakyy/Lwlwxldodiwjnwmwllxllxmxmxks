package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ig {
    public final String a;
    public final fg b;
    public final String c;

    public ig(String str, fg fgVar, String str2) {
        this.a = str;
        this.b = fgVar;
        this.c = str2;
    }

    public static ig a(ig igVar, fg fgVar) {
        String str = igVar.a;
        String str2 = igVar.c;
        igVar.getClass();
        return new ig(str, fgVar, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig)) {
            return false;
        }
        ig igVar = (ig) obj;
        return k71.k.b(this.a, igVar.a) && k71.k.b(this.b, igVar.b) && k71.k.b(this.c, igVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fg fgVar = this.b;
        return this.c.hashCode() + ((hashCode + (fgVar == null ? 0 : fgVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", issueOrPullRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
