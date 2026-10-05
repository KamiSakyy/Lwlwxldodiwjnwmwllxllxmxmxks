package q81;

import com.google.android.gms.internal.measurement.i4;
import java.nio.charset.Charset;

/* loaded from: /home/user/work/p/classes5.dex */
public final class x {
    public static w a(String str, q qVar) {
        k71.k.g(str, "<this>");
        Charset charset = t71.a.a;
        if (qVar != null) {
            Charset a = q.a(qVar);
            if (a == null) {
                qVar = i4.g0(qVar + "; charset=utf-8");
            } else {
                charset = a;
            }
        }
        byte[] bytes = str.getBytes(charset);
        k71.k.f(bytes, "getBytes(...)");
        int length = bytes.length;
        r81.e.a(bytes.length, 0, length);
        return new w(qVar, length, bytes);
    }
}
