package m81;

import androidx.compose.foundation.lazy.layout.o1;
import com.google.android.gms.internal.measurement.i4;
import f0.o0;
import java.util.ArrayList;
import k81.xShadow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;

/* loaded from: /home/user/work/p/classes5.dex */
public final class q extends i4 implements l81.i {
    public l81.c b;
    public u c;
    public a7.q d;
    public b21.l e;
    public int f;
    public a81.t g;
    public l81.h h;
    public h i;

    public q(l81.c cVar, u uVar, a7.q qVar, SerialDescriptor serialDescriptor, a81.t tVar) {
        k71.k.g(serialDescriptor, "descriptor");
        this.b = cVar;
        this.c = uVar;
        this.d = qVar;
        this.e = cVar.b;
        this.f = -1;
        this.g = tVar;
        l81.h hVar = cVar.a;
        this.h = hVar;
        this.i = hVar.d ? null : new h(serialDescriptor);
    }

    @Override // j81.a
    public final Object A(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        o1 o1Var = (o1) this.d.c;
        k71.k.g(serialDescriptor, "descriptor");
        k71.k.g(kSerializer, "deserializer");
        boolean z = this.c == u.v && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) o1Var.d;
            int i2 = o1Var.b;
            if (iArr[i2] == -2) {
                ((Object[]) o1Var.c)[i2] = j.a;
            }
        }
        Object A = super.A(serialDescriptor, i, kSerializer, obj);
        if (z) {
            int[] iArr2 = (int[]) o1Var.d;
            int i3 = o1Var.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                o1Var.b = i4;
                if (i4 == ((Object[]) o1Var.c).length) {
                    o1Var.p();
                }
            }
            Object[] objArr = (Object[]) o1Var.c;
            int i5 = o1Var.b;
            objArr[i5] = A;
            ((int[]) o1Var.d)[i5] = -2;
        }
        return A;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte B() {
        a7.q qVar = this.d;
        long l = qVar.l();
        byte b = (byte) l;
        if (l == b) {
            return b;
        }
        a7.q.s(qVar, "Failed to parse byte for input '" + l + '\'', 0, (String) null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short C() {
        a7.q qVar = this.d;
        long l = qVar.l();
        short s = (short) l;
        if (l == s) {
            return s;
        }
        a7.q.s(qVar, "Failed to parse short for input '" + l + '\'', 0, (String) null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float D() {
        a7.q qVar = this.d;
        String n = qVar.n();
        try {
            float parseFloat = Float.parseFloat(n);
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            i.q(qVar, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            a7.q.s(qVar, no.a.i('\'', "Failed to parse type 'float' for input '", n), 0, (String) null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double E() {
        a7.q qVar = this.d;
        String n = qVar.n();
        try {
            double parseDouble = Double.parseDouble(n);
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            i.q(qVar, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            a7.q.s(qVar, no.a.i('\'', "Failed to parse type 'double' for input '", n), 0, (String) null, 6);
            throw null;
        }
    }

    @Override // j81.a
    public final b21.l a() {
        return this.e;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final j81.a b(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        l81.c cVar = this.b;
        u p = i.p(serialDescriptor, cVar);
        a7.q qVar = this.d;
        o1 o1Var = (o1) qVar.c;
        int i = o1Var.b + 1;
        o1Var.b = i;
        if (i == ((Object[]) o1Var.c).length) {
            o1Var.p();
        }
        ((Object[]) o1Var.c)[i] = serialDescriptor;
        qVar.k(p.r);
        if (qVar.G() != 4) {
            int ordinal = p.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new q(cVar, p, qVar, serialDescriptor, this.g) : (this.c == p && cVar.a.d) ? this : new q(cVar, p, qVar, serialDescriptor, this.g);
        }
        a7.q.s(qVar, "Unexpected leading comma", 0, (String) null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean c() {
        boolean z;
        boolean z2;
        a7.q qVar = this.d;
        int M = qVar.M();
        String str = (String) qVar.f;
        if (M == str.length()) {
            a7.q.s(qVar, "EOF", 0, (String) null, 6);
            throw null;
        }
        if (str.charAt(M) == '\"') {
            M++;
            z = true;
        } else {
            z = false;
        }
        int I = qVar.I(M);
        if (I >= str.length() || I == -1) {
            a7.q.s(qVar, "EOF", 0, (String) null, 6);
            throw null;
        }
        int i = I + 1;
        int charAt = str.charAt(I) | ' ';
        if (charAt == 102) {
            qVar.g("alse", i);
            z2 = false;
        } else {
            if (charAt != 116) {
                a7.q.s(qVar, "Expected valid boolean literal prefix, but had '" + qVar.n() + '\'', 0, (String) null, 6);
                throw null;
            }
            qVar.g("rue", i);
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (qVar.b == str.length()) {
            a7.q.s(qVar, "EOF", 0, (String) null, 6);
            throw null;
        }
        if (str.charAt(qVar.b) == '\"') {
            qVar.b++;
            return z2;
        }
        a7.q.s(qVar, "Expected closing quotation mark", 0, (String) null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char d() {
        a7.q qVar = this.d;
        String n = qVar.n();
        if (n.length() == 1) {
            return n.charAt(0);
        }
        a7.q.s(qVar, no.a.i('\'', "Expected single char, but got '", n), 0, (String) null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int e(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "enumDescriptor");
        return i.j(serialDescriptor, this.b, n(), " at path " + ((o1) this.d.c).i());
    }

    @Override // j81.a
    public final void g(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        if (serialDescriptor.f() == 0 && i.k(serialDescriptor, this.b)) {
            while (t(serialDescriptor) != -1) {
            }
        }
        a7.q qVar = this.d;
        if (qVar.N()) {
            i.l(qVar, "");
            throw null;
        }
        qVar.k(this.c.s);
        o1 o1Var = (o1) qVar.c;
        int i = o1Var.b;
        int[] iArr = (int[]) o1Var.d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            o1Var.b = i - 1;
        }
        int i2 = o1Var.b;
        if (i2 != -1) {
            o1Var.b = i2 - 1;
        }
    }

    @Override // l81.i
    public final kotlinx.serialization.json.b k() {
        l81.h hVar = this.b.a;
        l7.d dVar = new l7.d();
        dVar.c = this.d;
        dVar.a = hVar.c;
        return dVar.e();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int l() {
        a7.q qVar = this.d;
        long l = qVar.l();
        int i = (int) l;
        if (l == i) {
            return i;
        }
        a7.q.s(qVar, "Failed to parse int for input '" + l + '\'', 0, (String) null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String n() {
        boolean z = this.h.c;
        a7.q qVar = this.d;
        return z ? qVar.o() : qVar.m();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long o() {
        return this.d.l();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean s() {
        h hVar = this.i;
        return ((hVar != null ? hVar.b : false) || this.d.O(true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x012d, code lost:
    
        r1 = r8.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0131, code lost:
    
        if (r13 >= 64) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0133, code lost:
    
        r1.c |= 1 << r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x013d, code lost:
    
        r2 = (r13 >>> 6) - 1;
        r1 = r1.d;
        r1[r2] = r1[r2] | (1 << (r13 & 63));
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x013a, code lost:
    
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016c, code lost:
    
        r1 = r3.b;
        r5 = (int[]) r3.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0175, code lost:
    
        if (r5[r1] != (-2)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0177, code lost:
    
        r5[r1] = r19;
        r3.b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017d, code lost:
    
        r1 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0181, code lost:
    
        if (r1 == r19) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0183, code lost:
    
        r3.b = r1 + r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0186, code lost:
    
        r1 = t71.p.V(6, r4.subSequence(0, r2.b).toString(), r12);
        r5 = a0.s0.n(r1, "Encountered an unknown key '", r12, "' at offset ", " at path: ");
        r5.append(r3.i());
        r5.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
        r5.append((java.lang.Object) m81.i.m(r1, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bc, code lost:
    
        throw new kotlinx.serialization.json.internal.JsonDecodingException(r5.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // j81.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(SerialDescriptor serialDescriptor) {
        Object r10 = null;
        boolean z;
        boolean z2;
        char c;
        Object r13;
        String H;
        a7.q qVar = this.d;
        o1 o1Var = (o1) qVar.c;
        String str = (String) qVar.f;
        k71.k.g(serialDescriptor, "descriptor");
        u uVar = this.c;
        int ordinal = uVar.ordinal();
        char c2 = ':';
        int i = 0;
        r10 = false;
        boolean z3 = false;
        boolean z4 = true;
        int i2 = -1;
        if (ordinal == 0) {
            boolean N = qVar.N();
            while (true) {
                boolean f = qVar.f();
                h hVar = this.i;
                if (f) {
                    l81.h hVar2 = this.h;
                    boolean z5 = hVar2.c;
                    int i3 = i2;
                    String o = z5 ? qVar.o() : qVar.h();
                    qVar.k(c2);
                    l81.c cVar = this.b;
                    int i4 = i.i(serialDescriptor, cVar, o);
                    if (i4 == -3) {
                        z = z4;
                        z2 = z;
                        N = false;
                    } else {
                        if (!hVar2.f) {
                            break;
                        }
                        boolean k = serialDescriptor.k(i4);
                        SerialDescriptor j = serialDescriptor.j(i4);
                        if (!k || j.c() || !qVar.O(z4)) {
                            z = z4;
                            if (!k71.k.b(j.e(), i81.j.e) || ((j.c() && qVar.O(false)) || (H = qVar.H(z5)) == null)) {
                                break;
                            }
                            int i5 = i.i(j, cVar, H);
                            boolean z6 = (cVar.a.d || !j.c()) ? false : z;
                            if (i5 != -3 || (!k && !z6)) {
                                break;
                            }
                            qVar.m();
                        } else {
                            z = z4;
                        }
                        N = qVar.N();
                        z2 = false;
                    }
                    if (z2) {
                        if (!i.k(serialDescriptor, cVar)) {
                            a81.t tVar = this.g;
                            if (tVar == null || !k71.k.b(tVar.s, o)) {
                                break;
                            }
                            tVar.s = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte G = qVar.G();
                        if (G == 8 || G == 6) {
                            while (true) {
                                byte G2 = qVar.G();
                                z4 = z;
                                if (G2 != z4) {
                                    c = 6;
                                    if (G2 == 8 || G2 == 6) {
                                        r13 = false;
                                        arrayList.add(Byte.valueOf(G2));
                                    } else {
                                        if (G2 == 9) {
                                            if (((Number) x61.m.e0(arrayList)).byteValue() != 8) {
                                                throw i.d(qVar.b, str, "found ] instead of } at path: " + o1Var);
                                            }
                                            x61.m.p0(arrayList);
                                        } else if (G2 == 7) {
                                            if (((Number) x61.m.e0(arrayList)).byteValue() != 6) {
                                                throw i.d(qVar.b, str, "found } instead of ] at path: " + o1Var);
                                            }
                                            x61.m.p0(arrayList);
                                        } else if (G2 == 10) {
                                            a7.q.s(qVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, (String) null, 6);
                                            throw null;
                                        }
                                        c = 6;
                                        r13 = false;
                                    }
                                    qVar.i();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z5) {
                                    qVar.n();
                                } else {
                                    qVar.h();
                                }
                                z = z4;
                            }
                        } else {
                            qVar.n();
                            z4 = z;
                            c = 6;
                            r13 = false;
                        }
                        N = qVar.N();
                        i = r13;
                        i2 = i3;
                        c2 = ':';
                    } else {
                        i2 = i3;
                        z4 = z;
                        c2 = ':';
                        i = 0;
                    }
                } else {
                    int i6 = i;
                    if (N) {
                        i.l(qVar, "object");
                        throw null;
                    }
                    if (hVar != null) {
                        x xVar = hVar.a;
                        o0 o0Var = xVar.b;
                        SerialDescriptor serialDescriptor2 = xVar.a;
                        int f2 = serialDescriptor2.f();
                        while (true) {
                            long j2 = xVar.c;
                            long j3 = -1;
                            if (j2 != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                                xVar.c |= 1 << numberOfTrailingZeros;
                                if (((Boolean) o0Var.s(serialDescriptor2, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i2 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (f2 > 64) {
                                long[] jArr = xVar.d;
                                int length = jArr.length;
                                loop3: while (i6 < length) {
                                    int i7 = i6 + 1;
                                    int i8 = i7 * 64;
                                    long j4 = jArr[i6];
                                    while (j4 != j3) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j4);
                                        j4 |= 1 << numberOfTrailingZeros2;
                                        int i9 = numberOfTrailingZeros2 + i8;
                                        if (((Boolean) o0Var.s(serialDescriptor2, Integer.valueOf(i9))).booleanValue()) {
                                            jArr[i6] = j4;
                                            i2 = i9;
                                            break loop3;
                                        }
                                        j3 = -1;
                                    }
                                    jArr[i6] = j4;
                                    i6 = i7;
                                    j3 = -1;
                                }
                            }
                        }
                    }
                    i2 = -1;
                }
            }
        } else if (ordinal != 2) {
            boolean N2 = qVar.N();
            if (qVar.f()) {
                int i10 = this.f;
                if (i10 != -1 && !N2) {
                    a7.q.s(qVar, "Expected end of the array or comma", 0, (String) null, 6);
                    throw null;
                }
                i2 = i10 + 1;
                this.f = i2;
            } else if (N2) {
                i.l(qVar, "array");
                throw null;
            }
        } else {
            int i11 = this.f;
            Object r4 = i11 % 2 != 0;
            if (r4 != true) {
                qVar.k(':');
            } else if (i11 != -1) {
                z3 = qVar.N();
            }
            if (qVar.f()) {
                if (r4 != false) {
                    if (this.f == -1) {
                        int i12 = qVar.b;
                        if (z3) {
                            a7.q.s(qVar, "Unexpected leading comma", i12, (String) null, 4);
                            throw null;
                        }
                    } else {
                        int i13 = qVar.b;
                        if (!z3) {
                            a7.q.s(qVar, "Expected comma after the key-value pair", i13, (String) null, 4);
                            throw null;
                        }
                    }
                }
                i2 = this.f + 1;
                this.f = i2;
            } else if (z3) {
                i.l(qVar, "object");
                throw null;
            }
        }
        if (uVar != u.v) {
            ((int[]) o1Var.d)[o1Var.b] = i2;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(KSerializer kSerializer) {
        String message;
        l81.c cVar = this.b;
        a7.q qVar = this.d;
        o1 o1Var = (o1) qVar.c;
        k71.k.g(kSerializer, "deserializer");
        try {
        } catch (MissingFieldException e) {
            message = e.getMessage();
            k71.k.d(message);
            if (!t71.p.I(message, "at path", false)) {
            }
        }
        if (!(kSerializer instanceof k81.b)) {
            return kSerializer.deserialize(this);
        }
        String h = i.h(((k81.b) kSerializer).getDescriptor(), cVar);
        String F = qVar.F(h, this.h.c);
        String str = null;
        if (F != null) {
            try {
                KSerializer r = b41.b.r((k81.b) kSerializer, this, F);
                a81.t tVar = new a81.t(6);
                tVar.s = h;
                this.g = tVar;
                return r.deserialize(this);
            } catch (SerializationException e2) {
                String message2 = e2.getMessage();
                k71.k.d(message2);
                String b0 = t71.p.b0(t71.p.o0(message2, '\n'), ".");
                String message3 = e2.getMessage();
                k71.k.d(message3);
                a7.q.s(qVar, b0, 0, t71.p.k0('\n', message3, ""), 2);
                throw null;
            }
        }
        if (!(kSerializer instanceof k81.b)) {
            return kSerializer.deserialize(this);
        }
        String h2 = i.h(((k81.b) kSerializer).getDescriptor(), cVar);
        kotlinx.serialization.json.b k = k();
        String a = ((k81.b) kSerializer).getDescriptor().a();
        if (!(k instanceof kotlinx.serialization.json.c)) {
            throw i.d(-1, k.toString(), "Expected " + k71.xShadow.a(kotlinx.serialization.json.c.class).c() + ", but had " + k71.xShadow.a(k.getClass()).c() + " as the serialized body of " + a + " at element: " + o1Var.i());
        }
        kotlinx.serialization.json.c cVar2 = (kotlinx.serialization.json.c) k;
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar2.get(h2);
        if (bVar != null) {
            kotlinx.serialization.json.d f = l81.j.f(bVar);
            if (!(f instanceof JsonNull)) {
                str = f.a();
            }
        }
        try {
            return i.o(cVar, h2, cVar2, b41.b.r((k81.b) kSerializer, this, str));
        } catch (SerializationException e3) {
            String message4 = e3.getMessage();
            k71.k.d(message4);
            throw i.d(-1, cVar2.toString(), message4);
        }
        message = e.getMessage();
        k71.k.d(message);
        if (!t71.p.I(message, "at path", false)) {
            throw e;
        }
        throw new MissingFieldException(e.r, e.getMessage() + " at path: " + o1Var.i(), e);
    }

    @Override // l81.i
    public final l81.c w() {
        return this.b;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder y(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        return s.a(serialDescriptor) ? new g(this.d, this.b) : this;
    }
    public Object F(Object p1, boolean p2) { return null; }
    public Object H(boolean p1) { return null; }
    public Object I(int p1) { return null; }
    public Object O(boolean p1) { return null; }
    public Object g(Object p1, int p2) { return null; }
    public Object k(char p1) { return null; }
}
