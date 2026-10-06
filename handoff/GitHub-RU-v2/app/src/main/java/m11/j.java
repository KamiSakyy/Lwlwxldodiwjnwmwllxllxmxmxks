package m11;

import android.util.Base64;
import com.github.rudroid.copilot.h1;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j {
    public String a;
    public byte[] b;
    public j11.d c;

    public j(String str, byte[] bArr, j11.d dVar) {
        this.a = str;
        this.b = bArr;
        this.c = dVar;
    }

    public static l51.h a() {
        l51.h hVar = new l51.h(1);
        hVar.u = j11.d.r;
        return hVar;
    }

    public final j b(j11.d dVar) {
        l51.h a = a();
        a.J(this.a);
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        a.u = dVar;
        a.t = this.b;
        return a.i();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.a.equals(jVar.a) && Arrays.equals(this.b, jVar.b) && this.c.equals(jVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return h1.p(sb, encodeToString, ")");
    }
}
