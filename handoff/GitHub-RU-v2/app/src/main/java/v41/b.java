package v41;

import java.io.File;
import y41.b0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public final b0 a;
    public final String b;
    public final File c;

    public b(b0 b0Var, String str, File file) {
        this.a = b0Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.b = str;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
