package v41;

import java.io.IOException;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public s a;
    public h b;

    public i(s sVar, b51.d dVar) {
        this.a = sVar;
        this.b = new h(dVar);
    }

    public final void a(String str) {
        h hVar = this.b;
        synchronized (hVar) {
            if (!Objects.equals(hVar.b, str)) {
                b51.d dVar = hVar.a;
                String str2 = hVar.c;
                if (str != null && str2 != null) {
                    try {
                        dVar.f(str, "aqs.".concat(str2)).createNewFile();
                    } catch (IOException unused) {
                    }
                }
                hVar.b = str;
            }
        }
    }
    public Object j(Object p1) { return null; }
    public Object k(Object p1) { return null; }
}
