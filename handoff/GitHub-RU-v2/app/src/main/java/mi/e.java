package mi;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public int a;
    public String b;

    public e(String str, int i) {
        k.g(str, "text");
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && k.b(this.b, eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LogLine(lineNumber=" + this.a + ", text=" + this.b + ")";
    }
}
