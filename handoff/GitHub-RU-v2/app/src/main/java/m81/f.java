package m81;

import b21.v;
import com.google.android.gms.internal.measurement.n4;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f extends n4 {
    public final boolean t;

    public f(v vVar, boolean z) {
        super(vVar, (byte) 0);
        this.t = z;
    }

    public final void g(byte b) {
        boolean z = this.t;
        String a = w61.r.a(b);
        if (z) {
            m(a);
        } else {
            k(a);
        }
    }

    public final void i(int i) {
        boolean z = this.t;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            m(unsignedString);
        } else {
            k(unsignedString);
        }
    }

    public final void j(long j) {
        boolean z = this.t;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            m(unsignedString);
        } else {
            k(unsignedString);
        }
    }

    public final void l(short s) {
        if (this.t) {
            m(String.valueOf(s & 65535));
        } else {
            k(String.valueOf(s & 65535));
        }
    }
}
