package d91;

import androidx.lifecycle.b;
import c30.d;
import h91.k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import sy.d0;
import t71.p;
import w80.t;
import x61.m;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a {
    public static final k b;
    public static final List c;
    public static final a d;
    public final b a;

    static {
        byte[] copyOf = Arrays.copyOf(new byte[]{42}, 1);
        k71.k.f(copyOf, "copyOf(...)");
        b = new k(copyOf);
        c = d0.n("*");
        d = new a(new b(1));
    }

    public a(b bVar) {
        this.a = bVar;
    }

    public static List b(String str) {
        List f0 = p.f0(str, new char[]{'.'}, 6);
        return k71.k.b(m.e0(f0), "") ? m.Q(1, f0) : f0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r2 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        r6 = (h91.k[]) r3.clone();
        r10 = r6.length - 1;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r11 >= r10) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        r6[r11] = d91.a.b;
        r12 = (h91.k) r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r12 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        r12 = w80.t.e(r12, r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r12 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (r12 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        r2 = r2 - 1;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r6 >= r2) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        r7 = (h91.k) r1.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r7 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        r7 = w80.t.e(r7, r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (r7 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
    
        if (r7 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
    
        r1 = t71.p.f0("!".concat(r7), new char[]{'.'}, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011b, code lost:
    
        if (r0.size() != r1.size()) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0127, code lost:
    
        if (((java.lang.String) r1.get(0)).charAt(0) == '!') goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0129, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0134, code lost:
    
        if (((java.lang.String) r1.get(0)).charAt(0) != '!') goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0136, code lost:
    
        r0 = r0.size();
        r1 = r1.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013e, code lost:
    
        r0 = r0 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014a, code lost:
    
        r14 = x61.m.K(b(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0152, code lost:
    
        if (r0 < 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0154, code lost:
    
        if (r0 != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        if ((r14 instanceof s71.d) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015b, code lost:
    
        r14 = ((s71.d) r14).b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0162, code lost:
    
        r14 = new s71.c(r14, r0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016e, code lost:
    
        return s71.j.i0(r14, ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0180, code lost:
    
        throw new java.lang.IllegalArgumentException(a0.s0.i("Requested element count ", r0, " is less than zero.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0140, code lost:
    
        r0 = r0.size();
        r1 = r1.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        if (r9 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e7, code lost:
    
        if (r12 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e9, code lost:
    
        r1 = d91.a.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ec, code lost:
    
        r3 = x61.r.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ee, code lost:
    
        if (r9 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f0, code lost:
    
        r6 = t71.p.f0(r9, new char[]{'.'}, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fa, code lost:
    
        if (r12 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fc, code lost:
    
        r3 = t71.p.f0(r12, new char[]{'.'}, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010c, code lost:
    
        if (r6.size() <= r3.size()) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010e, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0110, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f9, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ca, code lost:
    
        k71.k.m("exceptionBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d0, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00af, code lost:
    
        k71.k.m("bytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00b2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00b3, code lost:
    
        r12 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        String unicode = IDN.toUnicode(str);
        k71.k.d(unicode);
        List b2 = b(unicode);
        b bVar = this.a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) bVar.b;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) bVar.c).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        bVar.w();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        bVar.f = e;
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (((k) bVar.d) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(bVar.g);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) bVar.f);
            throw illegalStateException;
        }
        int size = b2.size();
        k[] kVarArr = new k[size];
        for (int i = 0; i < size; i++) {
            k kVar = k.u;
            kVarArr[i] = d.b((String) b2.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                str2 = null;
                break;
            }
            k kVar2 = (k) bVar.d;
            if (kVar2 == null) {
                k71.k.m("bytes");
                throw null;
            }
            str2 = t.e(kVar2, kVarArr, i2);
            if (str2 != null) {
                break;
            }
            i2++;
        }
    }

}
