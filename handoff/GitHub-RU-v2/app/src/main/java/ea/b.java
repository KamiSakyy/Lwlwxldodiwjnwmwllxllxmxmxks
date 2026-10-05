package ea;

import com.apollographql.apollo.exception.JsonDataException;
import com.apollographql.apollo.exception.JsonEncodingException;
import e6.w;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import x61.m;

/* loaded from: /home/user/work/p/classes.dex */
public final class b implements e {
    public static final h91.k D;
    public static final h91.k E;
    public static final h91.k F;
    public int[] A;
    public int[] B;
    public int C;

    /* renamed from: r, reason: collision with root package name */
    public final h91.j f22171r;

    /* renamed from: s, reason: collision with root package name */
    public final h91.h f22172s;

    /* renamed from: t, reason: collision with root package name */
    public int f22173t;

    /* renamed from: u, reason: collision with root package name */
    public long f22174u;

    /* renamed from: v, reason: collision with root package name */
    public int f22175v;

    /* renamed from: w, reason: collision with root package name */
    public String f22176w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f22177x;

    /* renamed from: y, reason: collision with root package name */
    public int f22178y;

    /* renamed from: z, reason: collision with root package name */
    public String[] f22179z;

    static {
        h91.k kVar = h91.k.u;
        D = c30.d.b("'\\");
        E = c30.d.b("\"\\");
        F = c30.d.b("{}[]:, \n\t\r/\\;#=");
    }

    public b(h91.j jVar) {
        k71.k.g(jVar, "source");
        this.f22171r = jVar;
        this.f22172s = jVar.a();
        int[] iArr = new int[64];
        iArr[0] = 6;
        this.f22177x = iArr;
        this.f22178y = 1;
        this.f22179z = new String[64];
        this.A = new int[64];
        int[] iArr2 = new int[64];
        iArr2[0] = 0;
        this.B = iArr2;
        this.C = 1;
    }

    public final String A(h91.k kVar) {
        StringBuilder sb2 = null;
        while (true) {
            long q10 = this.f22171r.q(kVar);
            if (q10 == -1) {
                N("Unterminated string");
                throw null;
            }
            h91.h hVar = this.f22172s;
            if (hVar.F(q10) != 92) {
                if (sb2 == null) {
                    String i02 = hVar.i0(q10, t71.a.f32104a);
                    hVar.readByte();
                    return i02;
                }
                sb2.append(hVar.i0(q10, t71.a.f32104a));
                hVar.readByte();
                String sb3 = sb2.toString();
                k71.k.d(sb3);
                return sb3;
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(hVar.i0(q10, t71.a.f32104a));
            hVar.readByte();
            sb2.append(K());
        }
    }

    @Override // ea.e
    public final void B() {
        int i = 0;
        do {
            int i10 = this.f22173t;
            Integer valueOf = Integer.valueOf(i10);
            if (i10 == 0) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : f();
            h91.h hVar = this.f22172s;
            switch (intValue) {
                case 1:
                    F(3);
                    i++;
                    break;
                case 2:
                    this.f22178y--;
                    i--;
                    break;
                case 3:
                    F(1);
                    i++;
                    break;
                case 4:
                    this.f22178y--;
                    i--;
                    break;
                case 8:
                case w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                    M(D);
                    break;
                case 9:
                case 13:
                    M(E);
                    break;
                case 10:
                case 14:
                    long q10 = this.f22171r.q(F);
                    if (q10 == -1) {
                        q10 = hVar.s;
                    }
                    hVar.skip(q10);
                    break;
                case 16:
                    hVar.skip(this.f22175v);
                    break;
            }
            this.f22173t = 0;
        } while (i != 0);
        int[] iArr = this.A;
        int i11 = this.f22178y - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f22179z[i11] = "null";
    }

    public final String E() {
        long q10 = this.f22171r.q(F);
        h91.h hVar = this.f22172s;
        if (q10 == -1) {
            return hVar.o0();
        }
        hVar.getClass();
        return hVar.i0(q10, t71.a.f32104a);
    }

    public final void F(int i) {
        int i10 = this.f22178y;
        int[] iArr = this.f22177x;
        if (i10 == iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            k71.k.f(copyOf, "copyOf(...)");
            this.f22177x = copyOf;
            String[] strArr = this.f22179z;
            Object[] copyOf2 = Arrays.copyOf(strArr, strArr.length * 2);
            k71.k.f(copyOf2, "copyOf(...)");
            this.f22179z = (String[]) copyOf2;
            int[] iArr2 = this.A;
            int[] copyOf3 = Arrays.copyOf(iArr2, iArr2.length * 2);
            k71.k.f(copyOf3, "copyOf(...)");
            this.A = copyOf3;
            int[] iArr3 = this.B;
            int[] copyOf4 = Arrays.copyOf(iArr3, iArr3.length * 2);
            k71.k.f(copyOf4, "copyOf(...)");
            this.B = copyOf4;
        }
        int[] iArr4 = this.f22177x;
        int i11 = this.f22178y;
        this.f22178y = i11 + 1;
        iArr4[i11] = i;
    }

    public final char K() {
        int i;
        h91.j jVar = this.f22171r;
        if (!jVar.request(1L)) {
            N("Unterminated escape sequence");
            throw null;
        }
        h91.h hVar = this.f22172s;
        char readByte = (char) hVar.readByte();
        if (readByte == '\n' || readByte == '\"' || readByte == '\'' || readByte == '/' || readByte == '\\') {
            return readByte;
        }
        if (readByte == 'b') {
            return '\b';
        }
        if (readByte == 'f') {
            return '\f';
        }
        if (readByte == 'n') {
            return '\n';
        }
        if (readByte == 'r') {
            return '\r';
        }
        if (readByte == 't') {
            return '\t';
        }
        if (readByte != 'u') {
            N("Invalid escape sequence: \\" + readByte);
            throw null;
        }
        if (!jVar.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + h());
        }
        char c10 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            byte F2 = hVar.F(i10);
            char c11 = (char) (c10 << 4);
            if (F2 >= 48 && F2 <= 57) {
                i = F2 - 48;
            } else if (F2 >= 97 && F2 <= 102) {
                i = F2 - 87;
            } else {
                if (F2 < 65 || F2 > 70) {
                    N("\\u".concat(hVar.i0(4L, t71.a.f32104a)));
                    throw null;
                }
                i = F2 - 55;
            }
            c10 = (char) (c11 + i);
        }
        hVar.skip(4L);
        return c10;
    }

    public final void M(h91.k kVar) {
        while (true) {
            long q10 = this.f22171r.q(kVar);
            if (q10 == -1) {
                N("Unterminated string");
                throw null;
            }
            h91.h hVar = this.f22172s;
            if (hVar.F(q10) != 92) {
                hVar.skip(q10 + 1);
                return;
            } else {
                hVar.skip(q10 + 1);
                K();
            }
        }
    }

    public final void N(String str) {
        throw new JsonEncodingException(str + " at path " + h());
    }

    @Override // ea.e
    public final String c0() {
        String A;
        Integer valueOf = Integer.valueOf(this.f22173t);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : f()) {
            case w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                A = A(D);
                break;
            case 13:
                A = A(E);
                break;
            case 14:
                A = E();
                break;
            default:
                throw new JsonDataException("Expected a name but was " + peek() + " at path " + m());
        }
        this.f22173t = 0;
        this.f22179z[this.f22178y - 1] = A;
        return A;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f22173t = 0;
        this.f22177x[0] = 8;
        this.f22178y = 1;
        this.f22172s.r();
        this.f22171r.close();
    }

    @Override // ea.e
    public final e e() {
        Integer valueOf = Integer.valueOf(this.f22173t);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : f()) != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + peek() + " at path " + m());
        }
        int i = this.f22178y;
        int i10 = i - 1;
        this.f22178y = i10;
        this.f22179z[i10] = null;
        int[] iArr = this.A;
        int i11 = i - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f22173t = 0;
        this.C--;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0217, code lost:
    
        if (r4 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x021a, code lost:
    
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x021b, code lost:
    
        r22.f22174u = r6;
        r15.skip(r13);
        r11 = 15;
        r22.f22173t = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0225, code lost:
    
        if (r1 == 2) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0228, code lost:
    
        if (r1 == 4) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x022b, code lost:
    
        if (r1 != 7) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x022d, code lost:
    
        r22.f22175v = r2;
        r11 = 16;
        r22.f22173t = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a3, code lost:
    
        if (r1 != 6) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e4, code lost:
    
        if (r(r11) != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x020b, code lost:
    
        if (r1 != 2) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x020d, code lost:
    
        if (r8 == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0213, code lost:
    
        if (r6 != Long.MIN_VALUE) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0215, code lost:
    
        if (r4 == false) goto L180;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0164 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f() {
        String str;
        String str2;
        long j10;
        String str3;
        byte F2;
        char c10;
        int[] iArr = this.f22177x;
        int i = this.f22178y - 1;
        int i10 = iArr[i];
        String str4 = "Malformed JSON";
        int i11 = 0;
        h91.h hVar = this.f22172s;
        switch (i10) {
            case 1:
                iArr[i] = 2;
                break;
            case 2:
                int t10 = t(true);
                hVar.readByte();
                char c11 = (char) t10;
                if (c11 != ',') {
                    if (c11 == ']') {
                        this.f22173t = 4;
                        return 4;
                    }
                    N("Unterminated array");
                    throw null;
                }
                break;
            case 3:
            case 5:
                iArr[i] = 4;
                if (i10 == 5) {
                    int t11 = t(true);
                    hVar.readByte();
                    char c12 = (char) t11;
                    if (c12 != ',') {
                        if (c12 == '}') {
                            this.f22173t = 2;
                            return 2;
                        }
                        N("Unterminated object");
                        throw null;
                    }
                }
                char t12 = (char) t(true);
                if (t12 == '\"') {
                    hVar.readByte();
                    this.f22173t = 13;
                    return 13;
                }
                if (t12 != '}') {
                    N("Unexpected character: " + t12);
                    throw null;
                }
                if (i10 == 5) {
                    N("Expected name");
                    throw null;
                }
                hVar.readByte();
                this.f22173t = 2;
                return 2;
            case 4:
                iArr[i] = 5;
                int t13 = t(true);
                hVar.readByte();
                if (((char) t13) != ':') {
                    N("Expected ':'");
                    throw null;
                }
                break;
            case 6:
                iArr[i] = 7;
                break;
            case 7:
                if (t(false) == -1) {
                    this.f22173t = 17;
                    return 17;
                }
                N("Malformed JSON");
                throw null;
            default:
                if (i10 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                break;
        }
        char t14 = (char) t(true);
        if (t14 == '\"') {
            hVar.readByte();
            this.f22173t = 9;
            return 9;
        }
        if (t14 == '\'' || t14 == ',' || t14 == ';') {
            N("Unexpected value");
            throw null;
        }
        if (t14 == '[') {
            hVar.readByte();
            this.f22173t = 3;
            return 3;
        }
        if (t14 == ']') {
            if (i10 != 1) {
                N("Unexpected value");
                throw null;
            }
            hVar.readByte();
            this.f22173t = 4;
            return 4;
        }
        if (t14 == '{') {
            hVar.readByte();
            this.f22173t = 1;
            return 1;
        }
        byte F3 = hVar.F(0L);
        h91.j jVar = this.f22171r;
        if (F3 == 116 || F3 == 84) {
            str = "true";
            str2 = "TRUE";
            j10 = 0;
            i11 = 5;
        } else if (F3 == 102 || F3 == 70) {
            str = "false";
            str2 = "FALSE";
            j10 = 0;
            i11 = 6;
        } else {
            if (F3 != 110 && F3 != 78) {
                j10 = 0;
                str3 = "Malformed JSON";
                if (i11 == 0) {
                    return i11;
                }
                boolean z10 = true;
                long j11 = j10;
                char c13 = 0;
                int i12 = 0;
                boolean z11 = false;
                while (true) {
                    long j12 = i12;
                    if (jVar.request(j12 + 1)) {
                        byte F4 = hVar.F(j12);
                        char c14 = (char) F4;
                        if (c14 == '+') {
                            c10 = 6;
                            if (c13 != 5) {
                            }
                            c13 = c10;
                            i12++;
                        } else if (c14 == 'E' || c14 == 'e') {
                            if (c13 == 2 || c13 == 4) {
                                c13 = 5;
                                i12++;
                            }
                        } else if (c14 == '-') {
                            c10 = 6;
                            if (c13 != 0) {
                                if (c13 != 5) {
                                }
                                c13 = c10;
                                i12++;
                            } else {
                                c13 = 1;
                                z11 = true;
                                i12++;
                            }
                        } else if (c14 != '.') {
                            if (F4 >= 48 && F4 <= 57) {
                                if (c13 == 0 || c13 == 1) {
                                    j11 = -(F4 - 48);
                                    c13 = 2;
                                } else if (c13 != 2) {
                                    if (c13 != 3) {
                                        if (c13 == 5) {
                                        }
                                        c13 = 7;
                                    } else {
                                        c13 = 4;
                                    }
                                } else if (j11 != j10) {
                                    long j13 = (10 * j11) - (F4 - 48);
                                    z10 = (z10 && ((j11 > (-922337203685477580L) ? 1 : (j11 == (-922337203685477580L) ? 0 : -1)) > 0)) || (j11 == -922337203685477580L && j13 < j11);
                                    j11 = j13;
                                }
                                i12++;
                            }
                        } else if (c13 == 2) {
                            c13 = 3;
                            i12++;
                        }
                    }
                }
                int i13 = 0;
                if (i13 != 0) {
                    return i13;
                }
                if (r((char) hVar.F(j10))) {
                    N(str3);
                    throw null;
                }
                N("Expected value");
                throw null;
            }
            str = "null";
            str2 = "NULL";
            j10 = 0;
            i11 = 7;
        }
        int length = str.length();
        int i14 = 1;
        while (true) {
            if (i14 < length) {
                str3 = str4;
                long j14 = i14;
                if (jVar.request(j14 + 1) && ((F2 = hVar.F(j14)) == ((byte) str.charAt(i14)) || F2 == ((byte) str2.charAt(i14)))) {
                    i14++;
                    str4 = str3;
                }
            } else {
                str3 = str4;
                long j15 = length;
                if (!jVar.request(j15 + 1) || !r((char) hVar.F(j15))) {
                    hVar.skip(j15);
                    this.f22173t = i11;
                }
            }
        }
        i11 = 0;
        if (i11 == 0) {
        }
    }

    @Override // ea.e
    public final void g0() {
        int i = this.f22173t;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : f()) == 7) {
            this.f22173t = 0;
            int[] iArr = this.A;
            int i10 = this.f22178y - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new JsonDataException("Expected null but was " + peek() + " at path " + m());
    }

    @Override // ea.e
    public final ArrayList h() {
        String str;
        int i = this.f22178y;
        int[] iArr = this.f22177x;
        String[] strArr = this.f22179z;
        int[] iArr2 = this.A;
        k71.k.g(iArr, "stack");
        k71.k.g(strArr, "pathNames");
        k71.k.g(iArr2, "pathIndices");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = iArr[i10];
            if (i11 == 1 || i11 == 2) {
                arrayList.add(Integer.valueOf(iArr2[i10]));
            } else if ((i11 == 3 || i11 == 4 || i11 == 5) && (str = strArr[i10]) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // ea.e
    public final boolean hasNext() {
        Integer valueOf = Integer.valueOf(this.f22173t);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : f();
        return (intValue == 2 || intValue == 4) ? false : true;
    }

    @Override // ea.e
    public final e j() {
        Integer valueOf = Integer.valueOf(this.f22173t);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : f()) != 1) {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + peek() + " at path " + m());
        }
        F(3);
        this.f22173t = 0;
        int i = this.C;
        this.C = i + 1;
        this.B[i] = 0;
        return this;
    }

    @Override // ea.e
    public final e k() {
        Integer valueOf = Integer.valueOf(this.f22173t);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : f()) != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + peek() + " at path " + m());
        }
        int i = this.f22178y;
        this.f22178y = i - 1;
        int[] iArr = this.A;
        int i10 = i - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f22173t = 0;
        return this;
    }

    public final String m() {
        return m.c0(h(), ".", (String) null, (String) null, 0, (j71.c) null, 62);
    }

    @Override // ea.e
    public final e n() {
        Integer valueOf = Integer.valueOf(this.f22173t);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : f()) == 3) {
            F(1);
            this.A[this.f22178y - 1] = 0;
            this.f22173t = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + peek() + " at path " + m());
    }

    @Override // ea.e
    public final boolean nextBoolean() {
        Integer valueOf = Integer.valueOf(this.f22173t);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : f();
        if (intValue == 5) {
            this.f22173t = 0;
            int[] iArr = this.A;
            int i = this.f22178y - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (intValue == 6) {
            this.f22173t = 0;
            int[] iArr2 = this.A;
            int i10 = this.f22178y - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + peek() + " at path " + m());
    }

    @Override // ea.e
    public final double nextDouble() {
        Integer valueOf = Integer.valueOf(this.f22173t);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : f();
        if (intValue == 15) {
            this.f22173t = 0;
            int[] iArr = this.A;
            int i = this.f22178y - 1;
            iArr[i] = iArr[i] + 1;
            return this.f22174u;
        }
        if (intValue == 16) {
            long j10 = this.f22175v;
            h91.h hVar = this.f22172s;
            hVar.getClass();
            this.f22176w = hVar.i0(j10, t71.a.f32104a);
        } else if (intValue == 9) {
            this.f22176w = A(E);
        } else if (intValue == 8) {
            this.f22176w = A(D);
        } else if (intValue == 10) {
            this.f22176w = E();
        } else if (intValue != 11) {
            throw new JsonDataException("Expected a double but was " + peek() + " at path " + m());
        }
        this.f22173t = 11;
        try {
            String str = this.f22176w;
            k71.k.d(str);
            double parseDouble = Double.parseDouble(str);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + m());
            }
            this.f22176w = null;
            this.f22173t = 0;
            int[] iArr2 = this.A;
            int i10 = this.f22178y - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f22176w + " at path " + m());
        }
    }

    @Override // ea.e
    public final int nextInt() {
        int i = this.f22173t;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : f();
        if (intValue == 15) {
            long j10 = this.f22174u;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f22173t = 0;
                int[] iArr = this.A;
                int i11 = this.f22178y - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new JsonDataException("Expected an int but was " + this.f22174u + " at path " + h());
        }
        if (intValue == 16) {
            long j11 = this.f22175v;
            h91.h hVar = this.f22172s;
            hVar.getClass();
            this.f22176w = hVar.i0(j11, t71.a.f32104a);
        } else if (intValue == 9 || intValue == 8) {
            String A = A(intValue == 9 ? E : D);
            this.f22176w = A;
            try {
                int parseInt = Integer.parseInt(A);
                this.f22173t = 0;
                int[] iArr2 = this.A;
                int i12 = this.f22178y - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            throw new JsonDataException("Expected an int but was " + peek() + " at path " + m());
        }
        this.f22173t = 11;
        try {
            String str = this.f22176w;
            k71.k.d(str);
            double parseDouble = Double.parseDouble(str);
            int i13 = (int) parseDouble;
            if (i13 != parseDouble) {
                throw new JsonDataException("Expected an int but was " + this.f22176w + " at path " + m());
            }
            this.f22176w = null;
            this.f22173t = 0;
            int[] iArr3 = this.A;
            int i14 = this.f22178y - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return i13;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f22176w + " at path " + m());
        }
    }

    @Override // ea.e
    public final long nextLong() {
        Integer valueOf = Integer.valueOf(this.f22173t);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : f();
        if (intValue == 15) {
            this.f22173t = 0;
            int[] iArr = this.A;
            int i = this.f22178y - 1;
            iArr[i] = iArr[i] + 1;
            return this.f22174u;
        }
        if (intValue == 16) {
            long j10 = this.f22175v;
            h91.h hVar = this.f22172s;
            hVar.getClass();
            this.f22176w = hVar.i0(j10, t71.a.f32104a);
        } else if (intValue == 9 || intValue == 8) {
            String A = A(intValue == 9 ? E : D);
            this.f22176w = A;
            try {
                long parseLong = Long.parseLong(A);
                this.f22173t = 0;
                int[] iArr2 = this.A;
                int i10 = this.f22178y - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            throw new JsonDataException("Expected a long but was " + peek() + " at path " + m());
        }
        this.f22173t = 11;
        try {
            String str = this.f22176w;
            k71.k.d(str);
            double parseDouble = Double.parseDouble(str);
            long j11 = (long) parseDouble;
            if (j11 != parseDouble) {
                throw new JsonDataException("Expected a long but was " + this.f22176w + " at path " + m());
            }
            this.f22176w = null;
            this.f22173t = 0;
            int[] iArr3 = this.A;
            int i11 = this.f22178y - 1;
            iArr3[i11] = iArr3[i11] + 1;
            return j11;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f22176w + " at path " + m());
        }
    }

    @Override // ea.e
    public final d peek() {
        Integer valueOf = Integer.valueOf(this.f22173t);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : f()) {
            case 1:
                return d.f22183t;
            case 2:
                return d.f22184u;
            case 3:
                return d.f22181r;
            case 4:
                return d.f22182s;
            case 5:
            case 6:
                return d.f22189z;
            case 7:
                return d.A;
            case 8:
            case 9:
            case 10:
            case w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return d.f22186w;
            case w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
                return d.f22185v;
            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                return d.f22188y;
            case 16:
                return d.f22187x;
            case 17:
                return d.B;
            default:
                throw new AssertionError();
        }
    }

    @Override // ea.e
    public final c q0() {
        String u8 = u();
        k71.k.d(u8);
        return new c(u8);
    }

    public final boolean r(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        N("Unexpected character: " + c10);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        B();
     */
    @Override // ea.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r0(List list) {
        k71.k.g(list, "names");
        if (list.isEmpty()) {
            return -1;
        }
        while (hasNext()) {
            String c02 = c0();
            int i = this.B[this.C - 1];
            if (k71.k.b(list.get(i), c02)) {
                int[] iArr = this.B;
                int i10 = this.C;
                iArr[i10 - 1] = i + 1;
                if (iArr[i10 - 1] == list.size()) {
                    this.B[this.C - 1] = 0;
                }
                return i;
            }
            int i11 = i;
            do {
                i11++;
                if (i11 == list.size()) {
                    i11 = 0;
                }
                if (i11 == i) {
                    break;
                }
            } while (!k71.k.b(list.get(i11), c02));
            int[] iArr2 = this.B;
            int i12 = this.C;
            iArr2[i12 - 1] = i11 + 1;
            if (iArr2[i12 - 1] == list.size()) {
                this.B[this.C - 1] = 0;
            }
            return i11;
        }
        return -1;
    }

    @Override // ea.e
    public final void s0() {
        throw new IllegalStateException("BufferedSourceJsonReader cannot rewind.");
    }

    public final int t(boolean z10) {
        int i = 0;
        while (true) {
            long j10 = i;
            h91.j jVar = this.f22171r;
            if (!jVar.request(j10 + 1)) {
                if (z10) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            i++;
            h91.h hVar = this.f22172s;
            byte F2 = hVar.F(j10);
            if (F2 != 9 && F2 != 10 && F2 != 13 && F2 != 32) {
                hVar.skip(i - 1);
                if (F2 == 35) {
                    N("Malformed JSON");
                    throw null;
                }
                if (F2 != 47 || !jVar.request(2L)) {
                    return F2;
                }
                N("Malformed JSON");
                throw null;
            }
        }
    }

    @Override // ea.e
    public final String u() {
        Integer valueOf = Integer.valueOf(this.f22173t);
        String str = null;
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : f();
        if (intValue == 15) {
            str = String.valueOf(this.f22174u);
        } else if (intValue != 16) {
            switch (intValue) {
                case 8:
                    str = A(D);
                    break;
                case 9:
                    str = A(E);
                    break;
                case 10:
                    str = E();
                    break;
                case w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    String str2 = this.f22176w;
                    if (str2 != null) {
                        this.f22176w = null;
                        str = str2;
                        break;
                    }
                    break;
                default:
                    throw new JsonDataException("Expected a string but was " + peek() + " at path " + m());
            }
        } else {
            long j10 = this.f22175v;
            h91.h hVar = this.f22172s;
            hVar.getClass();
            str = hVar.i0(j10, t71.a.f32104a);
        }
        this.f22173t = 0;
        int[] iArr = this.A;
        int i = this.f22178y - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }
}
