package x81;

import java.io.IOException;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class q {
    public static int a(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(no.a.j(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
