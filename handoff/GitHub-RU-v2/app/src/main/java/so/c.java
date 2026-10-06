package so;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public c(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c) && k71.k.b(this.d, cVar.d) && k71.k.b(this.e, cVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return this.e.hashCode() + h1.i((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Viewer(viewerCopilotAgentCreatesChannel=", this.a, ", viewerCopilotAgentUpdatesChannel=", this.b, ", viewerCopilotAgentLogUpdatesChannel=");
        f1.e.x(o, this.c, ", id=", this.d, ", __typename=");
        return h1.p(o, this.e, ")");
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
}
