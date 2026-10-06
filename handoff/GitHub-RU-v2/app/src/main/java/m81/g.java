package m81;

import com.google.android.gms.internal.measurement.i4;
import kotlinx.serialization.descriptors.SerialDescriptor;
import sy.w;
import w61.v;
import w61.y;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g extends i4 {
    public a7.q b;
    public b21.l c;

    public g(a7.q qVar, l81.c cVar) {
        k71.k.g(cVar, "json");
        this.b = qVar;
        this.c = cVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[Catch: IllegalArgumentException -> 0x002e, TryCatch #0 {IllegalArgumentException -> 0x002e, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x001d, B:10:0x0027, B:13:0x002a, B:14:0x002d), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: IllegalArgumentException -> 0x002e, TryCatch #0 {IllegalArgumentException -> 0x002e, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x001d, B:10:0x0027, B:13:0x002a, B:14:0x002d), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte B() {
        w61.r rVar;
        a7.q qVar = this.b;
        String n = qVar.n();
        try {
            k71.k.g(n, "<this>");
            w61.t D = w.D(n);
            if (D != null) {
                int i = D.r;
                if (Integer.compareUnsigned(i, 255) <= 0) {
                    rVar = new w61.r((byte) i);
                    if (rVar == null) {
                        return rVar.r;
                    }
                    t71.w.z(n);
                    throw null;
                }
            }
            rVar = null;
            if (rVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            a7.q.s(qVar, no.a.i('\'', "Failed to parse type 'UByte' for input '", n), 0, (String) null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[Catch: IllegalArgumentException -> 0x002f, TryCatch #0 {IllegalArgumentException -> 0x002f, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x001e, B:10:0x0028, B:13:0x002b, B:14:0x002e), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[Catch: IllegalArgumentException -> 0x002f, TryCatch #0 {IllegalArgumentException -> 0x002f, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x001e, B:10:0x0028, B:13:0x002b, B:14:0x002e), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short C() {
        y yVar;
        a7.q qVar = this.b;
        String n = qVar.n();
        try {
            k71.k.g(n, "<this>");
            w61.t D = w.D(n);
            if (D != null) {
                int i = D.r;
                if (Integer.compareUnsigned(i, 65535) <= 0) {
                    yVar = new y((short) i);
                    if (yVar == null) {
                        return yVar.r;
                    }
                    t71.w.z(n);
                    throw null;
                }
            }
            yVar = null;
            if (yVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            a7.q.s(qVar, no.a.i('\'', "Failed to parse type 'UShort' for input '", n), 0, (String) null, 6);
            throw null;
        }
    }

    public final b21.l a() {
        return this.c;
    }

    public final int l() {
        a7.q qVar = this.b;
        String n = qVar.n();
        try {
            k71.k.g(n, "<this>");
            w61.t D = w.D(n);
            if (D != null) {
                return D.r;
            }
            t71.w.z(n);
            throw null;
        } catch (IllegalArgumentException unused) {
            a7.q.s(qVar, no.a.i('\'', "Failed to parse type 'UInt' for input '", n), 0, (String) null, 6);
            throw null;
        }
    }

    public final long o() {
        a7.q qVar = this.b;
        String n = qVar.n();
        try {
            k71.k.g(n, "<this>");
            v E = w.E(n);
            if (E != null) {
                return E.r;
            }
            t71.w.z(n);
            throw null;
        } catch (IllegalArgumentException unused) {
            a7.q.s(qVar, no.a.i('\'', "Failed to parse type 'ULong' for input '", n), 0, (String) null, 6);
            throw null;
        }
    }

    public final int t(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }
}
