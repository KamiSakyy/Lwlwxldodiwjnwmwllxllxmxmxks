package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z5 implements g6 {
    public static final int[] j = new int[0];
    public static final Unsafe k = p6.l();
    public int[] a;
    public Object[] b;
    public int c;
    public int d;
    public s4 e;
    public int[] f;
    public int g;
    public int h;
    public e5 i;

    public z5(int[] iArr, Object[] objArr, int i, int i2, s4 s4Var, int[] iArr2, int i3, int i4, e5 e5Var, e5 e5Var2) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = e5Var;
        this.e = s4Var;
    }

    public static int F(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof g5) {
            return ((g5) obj).e();
        }
        return true;
    }

    public static int k(long j2, Object obj) {
        return ((Integer) p6.j(j2, obj)).intValue();
    }

    public static long l(long j2, Object obj) {
        return ((Long) p6.j(j2, obj)).longValue();
    }

    public static final int s(byte[] bArr, int i, int i2, r6 r6Var, Class cls, androidx.glance.appwidget.protobuf.d dVar) {
        r6 r6Var2 = r6.t;
        switch (r6Var.ordinal()) {
            case 0:
                int i3 = i + 8;
                dVar.c = Double.valueOf(Double.longBitsToDouble(k41.b.k0(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                dVar.c = Float.valueOf(Float.intBitsToFloat(k41.b.j0(i, bArr)));
                return i4;
            case 2:
            case 3:
                int i0 = k41.b.i0(bArr, i, dVar);
                dVar.c = Long.valueOf(dVar.b);
                return i0;
            case 4:
            case 12:
            case 13:
                int d0 = k41.b.d0(bArr, i, dVar);
                dVar.c = Integer.valueOf(dVar.a);
                return d0;
            case 5:
            case 15:
                int i5 = i + 8;
                dVar.c = Long.valueOf(k41.b.k0(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                dVar.c = Integer.valueOf(k41.b.j0(i, bArr));
                return i6;
            case 7:
                int i02 = k41.b.i0(bArr, i, dVar);
                dVar.c = Boolean.valueOf(dVar.b != 0);
                return i02;
            case 8:
                return k41.b.l0(bArr, i, dVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                g6 a = d6.c.a(cls);
                g5 c = a.c();
                int n0 = k41.b.n0(c, a, bArr, i, i2, dVar);
                a.i(c);
                dVar.c = c;
                return n0;
            case 11:
                return k41.b.m0(bArr, i, dVar);
            case 16:
                int d02 = k41.b.d0(bArr, i, dVar);
                dVar.c = Integer.valueOf(m71.a.n0(dVar.a));
                return d02;
            case 17:
                int i03 = k41.b.i0(bArr, i, dVar);
                dVar.c = Long.valueOf(m71.a.o0(dVar.b));
                return i03;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z5 u(f6 f6Var, e5 e5Var, e5 e5Var2) {
        int i;
        int charAt;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i12;
        char charAt5;
        int i13;
        char charAt6;
        int i14;
        char charAt7;
        int i15;
        char charAt8;
        int i16;
        char charAt9;
        int i17;
        int i18;
        Object[] objArr;
        int i19;
        Class<?> cls;
        int objectFieldOffset;
        int i20;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Field v;
        char charAt10;
        int i27;
        int i28;
        int i29;
        int i30;
        Object obj;
        Field v2;
        Object obj2;
        Field v3;
        int i32;
        char charAt11;
        int i33;
        char charAt12;
        int i34;
        char charAt13;
        int i35;
        char charAt14;
        if (!(f6Var instanceof f6)) {
            f6Var.getClass();
            throw new ClassCastException();
        }
        String str = f6Var.b;
        int length = str.length();
        int i36 = 55296;
        if (str.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i = i37 + 1;
                if (str.charAt(i37) < 55296) {
                    break;
                }
                i37 = i;
            }
        } else {
            i = 1;
        }
        int i38 = i + 1;
        int charAt15 = str.charAt(i);
        if (charAt15 >= 55296) {
            int i39 = charAt15 & 8191;
            int i40 = 13;
            while (true) {
                i35 = i38 + 1;
                charAt14 = str.charAt(i38);
                if (charAt14 < 55296) {
                    break;
                }
                i39 |= (charAt14 & 8191) << i40;
                i40 += 13;
                i38 = i35;
            }
            charAt15 = i39 | (charAt14 << i40);
            i38 = i35;
        }
        if (charAt15 == 0) {
            i4 = 0;
            i6 = 0;
            charAt = 0;
            i3 = 0;
            i5 = 0;
            i7 = 0;
            iArr = j;
            i2 = 0;
        } else {
            int i42 = i38 + 1;
            int charAt16 = str.charAt(i38);
            if (charAt16 >= 55296) {
                int i43 = charAt16 & 8191;
                int i44 = 13;
                while (true) {
                    i16 = i42 + 1;
                    charAt9 = str.charAt(i42);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i43 |= (charAt9 & 8191) << i44;
                    i44 += 13;
                    i42 = i16;
                }
                charAt16 = i43 | (charAt9 << i44);
                i42 = i16;
            }
            int i45 = i42 + 1;
            int charAt17 = str.charAt(i42);
            if (charAt17 >= 55296) {
                int i46 = charAt17 & 8191;
                int i47 = 13;
                while (true) {
                    i15 = i45 + 1;
                    charAt8 = str.charAt(i45);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i46 |= (charAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i15;
                }
                charAt17 = i46 | (charAt8 << i47);
                i45 = i15;
            }
            int i48 = i45 + 1;
            int charAt18 = str.charAt(i45);
            if (charAt18 >= 55296) {
                int i49 = charAt18 & 8191;
                int i50 = 13;
                while (true) {
                    i14 = i48 + 1;
                    charAt7 = str.charAt(i48);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i49 |= (charAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i14;
                }
                charAt18 = i49 | (charAt7 << i50);
                i48 = i14;
            }
            int i52 = i48 + 1;
            int charAt19 = str.charAt(i48);
            if (charAt19 >= 55296) {
                int i53 = charAt19 & 8191;
                int i54 = 13;
                while (true) {
                    i13 = i52 + 1;
                    charAt6 = str.charAt(i52);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i53 |= (charAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i13;
                }
                charAt19 = i53 | (charAt6 << i54);
                i52 = i13;
            }
            int i55 = i52 + 1;
            charAt = str.charAt(i52);
            if (charAt >= 55296) {
                int i56 = charAt & 8191;
                int i57 = 13;
                while (true) {
                    i12 = i55 + 1;
                    charAt5 = str.charAt(i55);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i56 |= (charAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i12;
                }
                charAt = i56 | (charAt5 << i57);
                i55 = i12;
            }
            int i58 = i55 + 1;
            int charAt20 = str.charAt(i55);
            if (charAt20 >= 55296) {
                int i59 = charAt20 & 8191;
                int i60 = 13;
                while (true) {
                    i10 = i58 + 1;
                    charAt4 = str.charAt(i58);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i59 |= (charAt4 & 8191) << i60;
                    i60 += 13;
                    i58 = i10;
                }
                charAt20 = i59 | (charAt4 << i60);
                i58 = i10;
            }
            int i62 = i58 + 1;
            int charAt21 = str.charAt(i58);
            if (charAt21 >= 55296) {
                int i63 = charAt21 & 8191;
                int i64 = 13;
                while (true) {
                    i9 = i62 + 1;
                    charAt3 = str.charAt(i62);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i63 |= (charAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i9;
                }
                charAt21 = i63 | (charAt3 << i64);
                i62 = i9;
            }
            int i65 = i62 + 1;
            int charAt22 = str.charAt(i62);
            if (charAt22 >= 55296) {
                int i66 = charAt22 & 8191;
                int i67 = 13;
                while (true) {
                    i8 = i65 + 1;
                    charAt2 = str.charAt(i65);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i66 |= (charAt2 & 8191) << i67;
                    i67 += 13;
                    i65 = i8;
                }
                charAt22 = i66 | (charAt2 << i67);
                i65 = i8;
            }
            int i68 = charAt16 + charAt16 + charAt17;
            i2 = charAt16;
            i38 = i65;
            iArr = new int[charAt22 + charAt20 + charAt21];
            int i69 = charAt20;
            i3 = charAt18;
            i4 = i69;
            i5 = charAt19;
            i6 = i68;
            i7 = charAt22;
        }
        Unsafe unsafe = k;
        Object[] objArr2 = f6Var.c;
        Class<?> cls2 = f6Var.a.getClass();
        int i70 = i7 + i4;
        int i72 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[i72];
        int i73 = i70;
        int i74 = i7;
        int i75 = 0;
        int i76 = 0;
        while (i38 < length) {
            int i77 = i38 + 1;
            int charAt23 = str.charAt(i38);
            if (charAt23 >= i36) {
                int i78 = charAt23 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i34 = i79 + 1;
                    charAt13 = str.charAt(i79);
                    i17 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i78 |= (charAt13 & 8191) << i80;
                    i80 += 13;
                    i79 = i34;
                    length = i17;
                }
                charAt23 = i78 | (charAt13 << i80);
                i18 = i34;
            } else {
                i17 = length;
                i18 = i77;
            }
            int i81 = i18 + 1;
            int charAt24 = str.charAt(i18);
            Object[] objArr4 = objArr2;
            char c = 55296;
            if (charAt24 >= 55296) {
                int i82 = charAt24 & 8191;
                int i83 = 13;
                while (true) {
                    i33 = i81 + 1;
                    charAt12 = str.charAt(i81);
                    if (charAt12 < c) {
                        break;
                    }
                    i82 |= (charAt12 & 8191) << i83;
                    i83 += 13;
                    i81 = i33;
                    c = 55296;
                }
                charAt24 = i82 | (charAt12 << i83);
                i81 = i33;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i75] = i76;
                i75++;
            }
            int i84 = charAt24 & 255;
            int i85 = charAt23;
            int i86 = charAt24 & 2048;
            if (i84 >= 51) {
                int i87 = i81 + 1;
                int charAt25 = str.charAt(i81);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i88 = charAt25 & 8191;
                    int i89 = i87;
                    int i90 = 13;
                    while (true) {
                        i32 = i89 + 1;
                        charAt11 = str.charAt(i89);
                        if (charAt11 < c2) {
                            break;
                        }
                        i88 |= (charAt11 & 8191) << i90;
                        i90 += 13;
                        i89 = i32;
                        c2 = 55296;
                    }
                    charAt25 = i88 | (charAt11 << i90);
                    i28 = i32;
                } else {
                    i28 = i87;
                }
                int i91 = i28;
                int i92 = i84 - 51;
                int i93 = charAt25;
                if (i92 == 9 || i92 == 17) {
                    i29 = i6 + 1;
                    int i94 = i76 / 3;
                    objArr3[i94 + i94 + 1] = objArr4[i6];
                } else {
                    if (i92 == 12) {
                        if (f6Var.a() == 1 || i86 != 0) {
                            i29 = i6 + 1;
                            int i95 = i76 / 3;
                            objArr3[i95 + i95 + 1] = objArr4[i6];
                        } else {
                            i30 = 0;
                            int i96 = i93 + i93;
                            i86 = i30;
                            obj = objArr4[i96];
                            if (obj instanceof Field) {
                                v2 = (Field) obj;
                            } else {
                                v2 = v(cls2, (String) obj);
                                objArr4[i96] = v2;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(v2);
                            int i97 = i96 + 1;
                            obj2 = objArr4[i97];
                            if (obj2 instanceof Field) {
                                v3 = (Field) obj2;
                            } else {
                                v3 = v(cls2, (String) obj2);
                                objArr4[i97] = v3;
                            }
                            i23 = i91;
                            i26 = objectFieldOffset2;
                            i22 = 55296;
                            objArr = objArr3;
                            i19 = i2;
                            cls = cls2;
                            i25 = 0;
                            i20 = (int) unsafe.objectFieldOffset(v3);
                        }
                    }
                    i30 = i86;
                    int i962 = i93 + i93;
                    i86 = i30;
                    obj = objArr4[i962];
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(v2);
                    int i972 = i962 + 1;
                    obj2 = objArr4[i972];
                    if (obj2 instanceof Field) {
                    }
                    i23 = i91;
                    i26 = objectFieldOffset22;
                    i22 = 55296;
                    objArr = objArr3;
                    i19 = i2;
                    cls = cls2;
                    i25 = 0;
                    i20 = (int) unsafe.objectFieldOffset(v3);
                }
                i6 = i29;
                i30 = i86;
                int i9622 = i93 + i93;
                i86 = i30;
                obj = objArr4[i9622];
                if (obj instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(v2);
                int i9722 = i9622 + 1;
                obj2 = objArr4[i9722];
                if (obj2 instanceof Field) {
                }
                i23 = i91;
                i26 = objectFieldOffset222;
                i22 = 55296;
                objArr = objArr3;
                i19 = i2;
                cls = cls2;
                i25 = 0;
                i20 = (int) unsafe.objectFieldOffset(v3);
            } else {
                int i98 = i6 + 1;
                Field v4 = v(cls2, (String) objArr4[i6]);
                objArr = objArr3;
                if (i84 == 9 || i84 == 17) {
                    i19 = i2;
                    int i99 = i76 / 3;
                    objArr[i99 + i99 + 1] = v4.getType();
                } else {
                    if (i84 == 27) {
                        i19 = i2;
                        i27 = 1;
                        i6 += 2;
                    } else if (i84 == 49) {
                        i6 += 2;
                        i19 = i2;
                        i27 = 1;
                    } else {
                        if (i84 == 12 || i84 == 30 || i84 == 44) {
                            i19 = i2;
                            if (f6Var.a() == 1 || i86 != 0) {
                                i6 += 2;
                                int i100 = i76 / 3;
                                objArr[i100 + i100 + 1] = objArr4[i98];
                                cls = cls2;
                            } else {
                                cls = cls2;
                                i6 = i98;
                                i86 = 0;
                            }
                        } else if (i84 == 50) {
                            int i101 = i6 + 2;
                            int i102 = i74 + 1;
                            iArr[i74] = i76;
                            int i103 = i76 / 3;
                            int i104 = i103 + i103;
                            objArr[i104] = objArr4[i98];
                            if (i86 != 0) {
                                i6 += 3;
                                objArr[i104 + 1] = objArr4[i101];
                                cls = cls2;
                                i74 = i102;
                            } else {
                                i6 = i101;
                                cls = cls2;
                                i74 = i102;
                                i86 = 0;
                            }
                            i19 = i2;
                        } else {
                            i19 = i2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(v4);
                        i20 = 1048575;
                        if ((charAt24 & 4096) != 0 || i84 > 17) {
                            i22 = 55296;
                            i23 = i81;
                            i24 = 0;
                        } else {
                            int i105 = i81 + 1;
                            int charAt26 = str.charAt(i81);
                            if (charAt26 >= 55296) {
                                int i106 = charAt26 & 8191;
                                int i107 = 13;
                                while (true) {
                                    i23 = i105 + 1;
                                    charAt10 = str.charAt(i105);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i106 |= (charAt10 & 8191) << i107;
                                    i107 += 13;
                                    i105 = i23;
                                }
                                charAt26 = i106 | (charAt10 << i107);
                            } else {
                                i23 = i105;
                            }
                            int i108 = (charAt26 / 32) + i19 + i19;
                            Object obj3 = objArr4[i108];
                            if (obj3 instanceof Field) {
                                v = (Field) obj3;
                            } else {
                                v = v(cls, (String) obj3);
                                objArr4[i108] = v;
                            }
                            i24 = charAt26 % 32;
                            i20 = (int) unsafe.objectFieldOffset(v);
                            i22 = 55296;
                        }
                        if (i84 >= 18 && i84 <= 49) {
                            iArr[i73] = objectFieldOffset;
                            i73++;
                        }
                        i25 = i24;
                        i26 = objectFieldOffset;
                    }
                    int i109 = i76 / 3;
                    objArr[i109 + i109 + i27] = objArr4[i98];
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(v4);
                    i20 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i22 = 55296;
                    i23 = i81;
                    i24 = 0;
                    if (i84 >= 18) {
                        iArr[i73] = objectFieldOffset;
                        i73++;
                    }
                    i25 = i24;
                    i26 = objectFieldOffset;
                }
                cls = cls2;
                i6 = i98;
                objectFieldOffset = (int) unsafe.objectFieldOffset(v4);
                i20 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i22 = 55296;
                i23 = i81;
                i24 = 0;
                if (i84 >= 18) {
                }
                i25 = i24;
                i26 = objectFieldOffset;
            }
            int i110 = i86;
            int i111 = i76 + 1;
            iArr2[i76] = i85;
            int i112 = i76 + 2;
            String str2 = str;
            iArr2[i111] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i110 != 0 ? Integer.MIN_VALUE : 0) | (i84 << 20) | i26;
            i76 += 3;
            iArr2[i112] = (i25 << 20) | i20;
            cls2 = cls;
            objArr2 = objArr4;
            i36 = i22;
            length = i17;
            objArr3 = objArr;
            i2 = i19;
            i38 = i23;
            str = str2;
        }
        return new z5(iArr2, objArr3, i3, i5, f6Var.a, iArr, i7, i70, e5Var, e5Var2);
    }

    public static Field v(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            f1.e.x(sb, "Field ", str, " for ", name);
            throw new RuntimeException(com.github.rudroid.copilot.h1.p(sb, " not found. Known fields are ", arrays), e);
        }
    }

    public final Object A(int i, Object obj) {
        g6 y = y(i);
        int E = E(i) & 1048575;
        if (!o(i, obj)) {
            return y.c();
        }
        Object object = k.getObject(obj, E);
        if (a(object)) {
            return object;
        }
        g5 c = y.c();
        if (object != null) {
            y.d(c, object);
        }
        return c;
    }

    public final void B(int i, Object obj, Object obj2) {
        k.putObject(obj, E(i) & 1048575, obj2);
        p(i, obj);
    }

    public final Object C(int i, Object obj, int i2) {
        g6 y = y(i2);
        if (!q(i, obj, i2)) {
            return y.c();
        }
        Object object = k.getObject(obj, E(i2) & 1048575);
        if (a(object)) {
            return object;
        }
        g5 c = y.c();
        if (object != null) {
            y.d(c, object);
        }
        return c;
    }

    public final void D(Object obj, int i, Object obj2, int i2) {
        k.putObject(obj, E(i2) & 1048575, obj2);
        p6.g(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int E(int i) {
        return this.a[i + 1];
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final boolean b(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.g) {
            int i7 = this.f[i5];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int E = E(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i12 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = k.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i13 = i4;
                i = i6;
                i2 = i7;
                i3 = i13;
            }
            if ((268435456 & E) == 0 || n(obj, i2, i, i3, i12)) {
                int F = F(E);
                if (F == 9 || F == 17) {
                    if (n(obj, i2, i, i3, i12) && !y(i2).b(p6.j(E & 1048575, obj))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (F != 27) {
                        if (F == 60 || F == 68) {
                            if (q(i8, obj, i2) && !y(i2).b(p6.j(E & 1048575, obj))) {
                            }
                            i5++;
                            i6 = i;
                            i4 = i3;
                        } else if (F != 49) {
                            if (F != 50) {
                                continue;
                            } else {
                                v5 v5Var = (v5) p6.j(E & 1048575, obj);
                                if (v5Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i14 = i2 / 3;
                                    if (((r6) ((u5) this.b[i14 + i14]).a.b).r == s6.z) {
                                        g6 g6Var = null;
                                        for (Object obj2 : v5Var.values()) {
                                            if (g6Var == null) {
                                                g6Var = d6.c.a(obj2.getClass());
                                            }
                                            if (!g6Var.b(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i5++;
                            i6 = i;
                            i4 = i3;
                        }
                    }
                    List list = (List) p6.j(E & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        g6 y = y(i2);
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            if (y.b(list.get(i15))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final g5 c() {
        return (g5) ((g5) this.e).o(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.g6
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!a(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                h6.b(obj, obj2);
                return;
            }
            int E = E(i);
            int i2 = E & 1048575;
            int F = F(E);
            int i3 = iArr[i];
            long j2 = i2;
            switch (F) {
                case 0:
                    if (o(i, obj2)) {
                        o6 o6Var = p6.c;
                        obj3 = obj;
                        o6Var.g(obj3, j2, o6Var.f(j2, obj2));
                        p(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (o(i, obj2)) {
                        o6 o6Var2 = p6.c;
                        o6Var2.e(obj, j2, o6Var2.d(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (o(i, obj2)) {
                        p6.i(obj, j2, p6.h(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (o(i, obj2)) {
                        p6.i(obj, j2, p6.h(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (o(i, obj2)) {
                        p6.g(p6.f(j2, obj2), j2, obj);
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (o(i, obj2)) {
                        p6.i(obj, j2, p6.h(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (o(i, obj2)) {
                        p6.g(p6.f(j2, obj2), j2, obj);
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (o(i, obj2)) {
                        o6 o6Var3 = p6.c;
                        o6Var3.c(obj, j2, o6Var3.b(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (o(i, obj2)) {
                        p6.k(j2, obj, p6.j(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (o(i, obj2)) {
                        p6.k(j2, obj, p6.j(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (o(i, obj2)) {
                        p6.g(p6.f(j2, obj2), j2, obj);
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (o(i, obj2)) {
                        p6.g(p6.f(j2, obj2), j2, obj);
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (o(i, obj2)) {
                        p6.g(p6.f(j2, obj2), j2, obj);
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (o(i, obj2)) {
                        p6.i(obj, j2, p6.h(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (o(i, obj2)) {
                        p6.g(p6.f(j2, obj2), j2, obj);
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (o(i, obj2)) {
                        p6.i(obj, j2, p6.h(j2, obj2));
                        p(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    m5 m5Var = (m5) p6.j(j2, obj);
                    m5 m5Var2 = (m5) p6.j(j2, obj2);
                    int size = m5Var.size();
                    int size2 = m5Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((t4) m5Var).r) {
                            m5Var = m5Var.E(size2 + size);
                        }
                        m5Var.addAll(m5Var2);
                    }
                    if (size > 0) {
                        m5Var2 = m5Var;
                    }
                    p6.k(j2, obj, m5Var2);
                    obj3 = obj;
                    break;
                case 50:
                    e5 e5Var = h6.a;
                    p6.k(j2, obj, e5.c(p6.j(j2, obj), p6.j(j2, obj2)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (q(i3, obj2, i)) {
                        p6.k(j2, obj, p6.j(j2, obj2));
                        p6.g(i3, iArr[i + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    x(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i3, obj2, i)) {
                        p6.k(j2, obj, p6.j(j2, obj2));
                        p6.g(i3, iArr[i + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    x(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final int e(s4 s4Var) {
        int i;
        int s0;
        int b0;
        int i2;
        int i3;
        int b;
        int s02;
        int size;
        int r;
        int s03;
        int s04;
        int s05;
        int i4;
        int s06;
        int b02;
        z5 z5Var = this;
        s4 s4Var2 = s4Var;
        Unsafe unsafe = k;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = z5Var.a;
            if (i7 >= iArr.length) {
                return ((g5) s4Var).zzc.c() + i9;
            }
            int E = z5Var.E(i7);
            int F = F(E);
            int i10 = iArr[i7];
            int i12 = iArr[i7 + 2];
            int i13 = i12 & i5;
            if (F <= 17) {
                if (i13 != i6) {
                    i8 = i13 == i5 ? 0 : unsafe.getInt(s4Var2, i13);
                    i6 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = 0;
            }
            int i14 = E & i5;
            if (F >= c5.s.r) {
                c5.t.getClass();
            }
            long j2 = i14;
            switch (F) {
                case 0:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.e(i10 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.e(i10 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        long j3 = unsafe.getLong(s4Var2, j2);
                        s0 = y4.s0(i10 << 3);
                        b0 = y4.b0(j3);
                        i2 = b0 + s0;
                        i9 += i2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        long j4 = unsafe.getLong(s4Var2, j2);
                        s0 = y4.s0(i10 << 3);
                        b0 = y4.b0(j4);
                        i2 = b0 + s0;
                        i9 += i2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        long j5 = unsafe.getInt(s4Var2, j2);
                        s0 = y4.s0(i10 << 3);
                        b0 = y4.b0(j5);
                        i2 = b0 + s0;
                        i9 += i2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.e(i10 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.e(i10 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.e(i10 << 3, 1, i9);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        int i15 = i10 << 3;
                        Object object = unsafe.getObject(s4Var2, j2);
                        if (object instanceof x4) {
                            int s07 = y4.s0(i15);
                            int d = ((x4) object).d();
                            i9 = com.github.rudroid.copilot.h1.f(d, d, s07, i9);
                            break;
                        } else {
                            s0 = y4.s0(i15);
                            b0 = y4.c0((String) object);
                            i2 = b0 + s0;
                            i9 += i2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(s4Var2, j2);
                        g6 y = z5Var.y(i7);
                        e5 e5Var = h6.a;
                        int s08 = y4.s0(i10 << 3);
                        int b2 = ((s4) object2).b(y);
                        i9 = com.github.rudroid.copilot.h1.f(b2, b2, s08, i9);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        x4 x4Var = (x4) unsafe.getObject(s4Var2, j2);
                        int s09 = y4.s0(i10 << 3);
                        int d2 = x4Var.d();
                        i9 = com.github.rudroid.copilot.h1.f(d2, d2, s09, i9);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.e(unsafe.getInt(s4Var2, j2), y4.s0(i10 << 3), i9);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        long j6 = unsafe.getInt(s4Var2, j2);
                        s0 = y4.s0(i10 << 3);
                        b0 = y4.b0(j6);
                        i2 = b0 + s0;
                        i9 += i2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.e(i10 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.e(i10 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        int i16 = unsafe.getInt(s4Var2, j2);
                        i9 = com.github.rudroid.copilot.h1.e((i16 >> 31) ^ (i16 + i16), y4.s0(i10 << 3), i9);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        long j7 = unsafe.getLong(s4Var2, j2);
                        s0 = y4.s0(i10 << 3);
                        b0 = y4.b0((j7 >> 63) ^ (j7 + j7));
                        i2 = b0 + s0;
                        i9 += i2;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (z5Var.n(s4Var2, i7, i6, i8, i)) {
                        s4 s4Var3 = (s4) unsafe.getObject(s4Var2, j2);
                        g6 y2 = z5Var.y(i7);
                        int s010 = y4.s0(i10 << 3);
                        i3 = s010 + s010;
                        b = s4Var3.b(y2);
                        i2 = b + i3;
                        i9 += i2;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i2 = h6.y(i10, (List) unsafe.getObject(s4Var2, j2));
                    i9 += i2;
                    break;
                case 19:
                    i2 = h6.x(i10, (List) unsafe.getObject(s4Var2, j2));
                    i9 += i2;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var2 = h6.a;
                    if (list.size() != 0) {
                        s02 = (y4.s0(i10 << 3) * list.size()) + h6.q(list);
                        i9 += s02;
                        break;
                    }
                    s02 = 0;
                    i9 += s02;
                case 21:
                    List list2 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var3 = h6.a;
                    size = list2.size();
                    if (size != 0) {
                        r = h6.r(list2);
                        s03 = y4.s0(i10 << 3);
                        s04 = (s03 * size) + r;
                        i9 += s04;
                        break;
                    }
                    s04 = 0;
                    i9 += s04;
                case 22:
                    List list3 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var4 = h6.a;
                    size = list3.size();
                    if (size != 0) {
                        r = h6.u(list3);
                        s03 = y4.s0(i10 << 3);
                        s04 = (s03 * size) + r;
                        i9 += s04;
                        break;
                    }
                    s04 = 0;
                    i9 += s04;
                case 23:
                    i2 = h6.y(i10, (List) unsafe.getObject(s4Var2, j2));
                    i9 += i2;
                    break;
                case 24:
                    i2 = h6.x(i10, (List) unsafe.getObject(s4Var2, j2));
                    i9 += i2;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var5 = h6.a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        s02 = (y4.s0(i10 << 3) + 1) * size2;
                        i9 += s02;
                        break;
                    }
                    s02 = 0;
                    i9 += s02;
                case 26:
                    List list5 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var6 = h6.a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        s04 = y4.s0(i10 << 3) * size3;
                        for (int i17 = 0; i17 < size3; i17++) {
                            Object obj = list5.get(i17);
                            if (obj instanceof x4) {
                                int d3 = ((x4) obj).d();
                                s04 = com.github.rudroid.copilot.h1.e(d3, d3, s04);
                            } else {
                                s04 = y4.c0((String) obj) + s04;
                            }
                        }
                        i9 += s04;
                        break;
                    }
                    s04 = 0;
                    i9 += s04;
                case 27:
                    List list6 = (List) unsafe.getObject(s4Var2, j2);
                    g6 y3 = z5Var.y(i7);
                    e5 e5Var7 = h6.a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        s05 = 0;
                    } else {
                        s05 = y4.s0(i10 << 3) * size4;
                        for (int i18 = 0; i18 < size4; i18++) {
                            int b3 = ((s4) list6.get(i18)).b(y3);
                            s05 = com.github.rudroid.copilot.h1.e(b3, b3, s05);
                        }
                    }
                    i9 += s05;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var8 = h6.a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        s04 = y4.s0(i10 << 3) * size5;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int d4 = ((x4) list7.get(i19)).d();
                            s04 = com.github.rudroid.copilot.h1.e(d4, d4, s04);
                        }
                        i9 += s04;
                        break;
                    }
                    s04 = 0;
                    i9 += s04;
                case 29:
                    List list8 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var9 = h6.a;
                    size = list8.size();
                    if (size != 0) {
                        r = h6.v(list8);
                        s03 = y4.s0(i10 << 3);
                        s04 = (s03 * size) + r;
                        i9 += s04;
                        break;
                    }
                    s04 = 0;
                    i9 += s04;
                case 30:
                    List list9 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var10 = h6.a;
                    size = list9.size();
                    if (size != 0) {
                        r = h6.t(list9);
                        s03 = y4.s0(i10 << 3);
                        s04 = (s03 * size) + r;
                        i9 += s04;
                        break;
                    }
                    s04 = 0;
                    i9 += s04;
                case 31:
                    i2 = h6.x(i10, (List) unsafe.getObject(s4Var2, j2));
                    i9 += i2;
                    break;
                case 32:
                    i2 = h6.y(i10, (List) unsafe.getObject(s4Var2, j2));
                    i9 += i2;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var11 = h6.a;
                    size = list10.size();
                    if (size != 0) {
                        r = h6.w(list10);
                        s03 = y4.s0(i10 << 3);
                        s04 = (s03 * size) + r;
                        i9 += s04;
                        break;
                    }
                    s04 = 0;
                    i9 += s04;
                case 34:
                    List list11 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var12 = h6.a;
                    size = list11.size();
                    if (size != 0) {
                        r = h6.s(list11);
                        s03 = y4.s0(i10 << 3);
                        s04 = (s03 * size) + r;
                        i9 += s04;
                        break;
                    }
                    s04 = 0;
                    i9 += s04;
                case 35:
                    List list12 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var13 = h6.a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i9 = com.github.rudroid.copilot.h1.f(size6, y4.s0(i10 << 3), size6, i9);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var14 = h6.a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i9 = com.github.rudroid.copilot.h1.f(size7, y4.s0(i10 << 3), size7, i9);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int q = h6.q((List) unsafe.getObject(s4Var2, j2));
                    if (q > 0) {
                        i9 = com.github.rudroid.copilot.h1.f(q, y4.s0(i10 << 3), q, i9);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int r2 = h6.r((List) unsafe.getObject(s4Var2, j2));
                    if (r2 > 0) {
                        i9 = com.github.rudroid.copilot.h1.f(r2, y4.s0(i10 << 3), r2, i9);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int u = h6.u((List) unsafe.getObject(s4Var2, j2));
                    if (u > 0) {
                        i9 = com.github.rudroid.copilot.h1.f(u, y4.s0(i10 << 3), u, i9);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var15 = h6.a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i9 = com.github.rudroid.copilot.h1.f(size8, y4.s0(i10 << 3), size8, i9);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var16 = h6.a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i9 = com.github.rudroid.copilot.h1.f(size9, y4.s0(i10 << 3), size9, i9);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var17 = h6.a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i9 = com.github.rudroid.copilot.h1.f(size10, y4.s0(i10 << 3), size10, i9);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int v = h6.v((List) unsafe.getObject(s4Var2, j2));
                    if (v > 0) {
                        i9 = com.github.rudroid.copilot.h1.f(v, y4.s0(i10 << 3), v, i9);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int t = h6.t((List) unsafe.getObject(s4Var2, j2));
                    if (t > 0) {
                        i9 = com.github.rudroid.copilot.h1.f(t, y4.s0(i10 << 3), t, i9);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var18 = h6.a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i9 = com.github.rudroid.copilot.h1.f(size11, y4.s0(i10 << 3), size11, i9);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(s4Var2, j2);
                    e5 e5Var19 = h6.a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i9 = com.github.rudroid.copilot.h1.f(size12, y4.s0(i10 << 3), size12, i9);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int w = h6.w((List) unsafe.getObject(s4Var2, j2));
                    if (w > 0) {
                        i9 = com.github.rudroid.copilot.h1.f(w, y4.s0(i10 << 3), w, i9);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int s = h6.s((List) unsafe.getObject(s4Var2, j2));
                    if (s > 0) {
                        i9 = com.github.rudroid.copilot.h1.f(s, y4.s0(i10 << 3), s, i9);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(s4Var2, j2);
                    g6 y4 = z5Var.y(i7);
                    e5 e5Var20 = h6.a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i20 = 0; i20 < size13; i20++) {
                            s4 s4Var4 = (s4) list19.get(i20);
                            int s011 = y4.s0(i10 << 3);
                            i4 += s4Var4.b(y4) + s011 + s011;
                        }
                    }
                    i9 += i4;
                    break;
                case 50:
                    int i22 = i7 / 3;
                    v5 v5Var = (v5) unsafe.getObject(s4Var2, j2);
                    u5 u5Var = (u5) z5Var.b[i22 + i22];
                    if (!v5Var.isEmpty()) {
                        s04 = 0;
                        for (Map.Entry entry : v5Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            t tVar = u5Var.a;
                            int s012 = y4.s0(i10 << 3);
                            int b4 = u5.b(tVar, key, value);
                            s04 = com.github.rudroid.copilot.h1.f(b4, b4, s012, s04);
                        }
                        i9 += s04;
                        break;
                    }
                    s04 = 0;
                    i9 += s04;
                case 51:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.e(i10 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.e(i10 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        long l = l(j2, s4Var2);
                        s06 = y4.s0(i10 << 3);
                        b02 = y4.b0(l);
                        i9 += b02 + s06;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        long l2 = l(j2, s4Var2);
                        s06 = y4.s0(i10 << 3);
                        b02 = y4.b0(l2);
                        i9 += b02 + s06;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        long k2 = k(j2, s4Var2);
                        s06 = y4.s0(i10 << 3);
                        b02 = y4.b0(k2);
                        i9 += b02 + s06;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.e(i10 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.e(i10 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.e(i10 << 3, 1, i9);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        int i23 = i10 << 3;
                        Object object3 = unsafe.getObject(s4Var2, j2);
                        if (object3 instanceof x4) {
                            int s013 = y4.s0(i23);
                            int d5 = ((x4) object3).d();
                            i9 = com.github.rudroid.copilot.h1.f(d5, d5, s013, i9);
                            break;
                        } else {
                            s06 = y4.s0(i23);
                            b02 = y4.c0((String) object3);
                            i9 += b02 + s06;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        Object object4 = unsafe.getObject(s4Var2, j2);
                        g6 y5 = z5Var.y(i7);
                        e5 e5Var21 = h6.a;
                        int s014 = y4.s0(i10 << 3);
                        int b5 = ((s4) object4).b(y5);
                        i9 = com.github.rudroid.copilot.h1.f(b5, b5, s014, i9);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        x4 x4Var2 = (x4) unsafe.getObject(s4Var2, j2);
                        int s015 = y4.s0(i10 << 3);
                        int d6 = x4Var2.d();
                        i9 = com.github.rudroid.copilot.h1.f(d6, d6, s015, i9);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.e(k(j2, s4Var2), y4.s0(i10 << 3), i9);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        long k3 = k(j2, s4Var2);
                        s06 = y4.s0(i10 << 3);
                        b02 = y4.b0(k3);
                        i9 += b02 + s06;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.e(i10 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.e(i10 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        int k4 = k(j2, s4Var2);
                        i9 = com.github.rudroid.copilot.h1.e((k4 >> 31) ^ (k4 + k4), y4.s0(i10 << 3), i9);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        long l3 = l(j2, s4Var2);
                        s06 = y4.s0(i10 << 3);
                        b02 = y4.b0((l3 >> 63) ^ (l3 + l3));
                        i9 += b02 + s06;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (z5Var.q(i10, s4Var2, i7)) {
                        s4 s4Var5 = (s4) unsafe.getObject(s4Var2, j2);
                        g6 y6 = z5Var.y(i7);
                        int s016 = y4.s0(i10 << 3);
                        i3 = s016 + s016;
                        b = s4Var5.b(y6);
                        i2 = b + i3;
                        i9 += i2;
                        break;
                    } else {
                        break;
                    }
            }
            i7 += 3;
            z5Var = this;
            s4Var2 = s4Var;
            i5 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final void f(Object obj, byte[] bArr, int i, int i2, androidx.glance.appwidget.protobuf.d dVar) {
        t(obj, bArr, i, i2, 0, dVar);
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final void g(Object obj, t5 t5Var) {
        int i;
        z5 z5Var = this;
        Unsafe unsafe = k;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (true) {
            int[] iArr = z5Var.a;
            if (i3 >= iArr.length) {
                ((g5) obj).zzc.b(t5Var);
                return;
            }
            int E = z5Var.E(i3);
            int F = F(E);
            int i6 = iArr[i3];
            if (F <= 17) {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & i2;
                if (i8 != i5) {
                    i4 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j2 = E & i2;
            switch (F) {
                case 0:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        ((y4) t5Var.r).i0(i6, Double.doubleToRawLongBits(p6.c.f(j2, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        ((y4) t5Var.r).g0(i6, Float.floatToRawIntBits(p6.c.d(j2, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        ((y4) t5Var.r).h0(i6, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        ((y4) t5Var.r).h0(i6, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        ((y4) t5Var.r).e0(i6, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        ((y4) t5Var.r).i0(i6, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        ((y4) t5Var.r).g0(i6, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        boolean b = p6.c.b(j2, obj);
                        y4 y4Var = (y4) t5Var.r;
                        y4Var.m0(i6 << 3);
                        y4Var.k0(b ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            y4 y4Var2 = (y4) t5Var.r;
                            y4Var2.m0((i6 << 3) | 2);
                            y4Var2.r0((String) object);
                            break;
                        } else {
                            y4 y4Var3 = (y4) t5Var.r;
                            y4Var3.m0((i6 << 3) | 2);
                            y4Var3.j0((x4) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        t5Var.d(i6, unsafe.getObject(obj, j2), z5Var.y(i3));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        x4 x4Var = (x4) unsafe.getObject(obj, j2);
                        y4 y4Var4 = (y4) t5Var.r;
                        y4Var4.m0((i6 << 3) | 2);
                        y4Var4.j0(x4Var);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        ((y4) t5Var.r).f0(i6, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        ((y4) t5Var.r).e0(i6, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        ((y4) t5Var.r).g0(i6, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        ((y4) t5Var.r).i0(i6, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        int i9 = unsafe.getInt(obj, j2);
                        ((y4) t5Var.r).f0(i6, (i9 >> 31) ^ (i9 + i9));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        long j3 = unsafe.getLong(obj, j2);
                        ((y4) t5Var.r).h0(i6, (j3 >> 63) ^ (j3 + j3));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (z5Var.n(obj, i3, i5, i4, i)) {
                        t5Var.e(i6, unsafe.getObject(obj, j2), z5Var.y(i3));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    h6.c(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, false);
                    break;
                case 19:
                    h6.d(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, false);
                    break;
                case 20:
                    h6.e(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, false);
                    break;
                case 21:
                    h6.f(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, false);
                    break;
                case 22:
                    h6.j(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, false);
                    break;
                case 23:
                    h6.h(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, false);
                    break;
                case 24:
                    h6.m(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, false);
                    break;
                case 25:
                    h6.p(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, false);
                    break;
                case 26:
                    int i10 = iArr[i3];
                    List list = (List) unsafe.getObject(obj, j2);
                    e5 e5Var = h6.a;
                    if (list != null && !list.isEmpty()) {
                        t5Var.getClass();
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            y4 y4Var5 = (y4) t5Var.r;
                            String str = (String) list.get(i12);
                            y4Var5.m0((i10 << 3) | 2);
                            y4Var5.r0(str);
                        }
                        break;
                    }
                    break;
                case 27:
                    int i13 = iArr[i3];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    g6 y = z5Var.y(i3);
                    e5 e5Var2 = h6.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            t5Var.d(i13, list2.get(i14), y);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i15 = iArr[i3];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    e5 e5Var3 = h6.a;
                    if (list3 != null && !list3.isEmpty()) {
                        t5Var.getClass();
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            y4 y4Var6 = (y4) t5Var.r;
                            x4 x4Var2 = (x4) list3.get(i16);
                            y4Var6.m0((i15 << 3) | 2);
                            y4Var6.j0(x4Var2);
                        }
                        break;
                    }
                    break;
                case 29:
                    h6.k(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, false);
                    break;
                case 30:
                    h6.o(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, false);
                    break;
                case 31:
                    h6.n(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, false);
                    break;
                case 32:
                    h6.i(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, false);
                    break;
                case 33:
                    h6.l(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, false);
                    break;
                case 34:
                    h6.g(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, false);
                    break;
                case 35:
                    h6.c(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, true);
                    break;
                case 36:
                    h6.d(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, true);
                    break;
                case 37:
                    h6.e(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, true);
                    break;
                case 38:
                    h6.f(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, true);
                    break;
                case 39:
                    h6.j(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, true);
                    break;
                case 40:
                    h6.h(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, true);
                    break;
                case 41:
                    h6.m(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, true);
                    break;
                case 42:
                    h6.p(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, true);
                    break;
                case 43:
                    h6.k(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, true);
                    break;
                case 44:
                    h6.o(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, true);
                    break;
                case 45:
                    h6.n(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, true);
                    break;
                case 46:
                    h6.i(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, true);
                    break;
                case 47:
                    h6.l(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, true);
                    break;
                case 48:
                    h6.g(iArr[i3], (List) unsafe.getObject(obj, j2), t5Var, true);
                    break;
                case 49:
                    int i17 = iArr[i3];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    g6 y2 = z5Var.y(i3);
                    e5 e5Var4 = h6.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            t5Var.e(i17, list4.get(i18), y2);
                        }
                        break;
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    if (object2 != null) {
                        int i19 = i3 / 3;
                        t tVar = ((u5) z5Var.b[i19 + i19]).a;
                        t5Var.getClass();
                        for (Map.Entry entry : ((v5) object2).entrySet()) {
                            y4 y4Var7 = (y4) t5Var.r;
                            y4Var7.d0(i6, 2);
                            y4Var7.m0(u5.b(tVar, entry.getKey(), entry.getValue()));
                            u5.a(y4Var7, tVar, entry.getKey(), entry.getValue());
                        }
                        break;
                    } else {
                        break;
                    }
                case 51:
                    if (z5Var.q(i6, obj, i3)) {
                        ((y4) t5Var.r).i0(i6, Double.doubleToRawLongBits(((Double) p6.j(j2, obj)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (z5Var.q(i6, obj, i3)) {
                        ((y4) t5Var.r).g0(i6, Float.floatToRawIntBits(((Float) p6.j(j2, obj)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (z5Var.q(i6, obj, i3)) {
                        ((y4) t5Var.r).h0(i6, l(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (z5Var.q(i6, obj, i3)) {
                        ((y4) t5Var.r).h0(i6, l(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (z5Var.q(i6, obj, i3)) {
                        ((y4) t5Var.r).e0(i6, k(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (z5Var.q(i6, obj, i3)) {
                        ((y4) t5Var.r).i0(i6, l(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (z5Var.q(i6, obj, i3)) {
                        ((y4) t5Var.r).g0(i6, k(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (z5Var.q(i6, obj, i3)) {
                        boolean booleanValue = ((Boolean) p6.j(j2, obj)).booleanValue();
                        y4 y4Var8 = (y4) t5Var.r;
                        y4Var8.m0(i6 << 3);
                        y4Var8.k0(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (z5Var.q(i6, obj, i3)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            y4 y4Var9 = (y4) t5Var.r;
                            y4Var9.m0((i6 << 3) | 2);
                            y4Var9.r0((String) object3);
                            break;
                        } else {
                            y4 y4Var10 = (y4) t5Var.r;
                            y4Var10.m0((i6 << 3) | 2);
                            y4Var10.j0((x4) object3);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (z5Var.q(i6, obj, i3)) {
                        t5Var.d(i6, unsafe.getObject(obj, j2), z5Var.y(i3));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (z5Var.q(i6, obj, i3)) {
                        x4 x4Var3 = (x4) unsafe.getObject(obj, j2);
                        y4 y4Var11 = (y4) t5Var.r;
                        y4Var11.m0((i6 << 3) | 2);
                        y4Var11.j0(x4Var3);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (z5Var.q(i6, obj, i3)) {
                        ((y4) t5Var.r).f0(i6, k(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (z5Var.q(i6, obj, i3)) {
                        ((y4) t5Var.r).e0(i6, k(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (z5Var.q(i6, obj, i3)) {
                        ((y4) t5Var.r).g0(i6, k(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (z5Var.q(i6, obj, i3)) {
                        ((y4) t5Var.r).i0(i6, l(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (z5Var.q(i6, obj, i3)) {
                        int k2 = k(j2, obj);
                        ((y4) t5Var.r).f0(i6, (k2 >> 31) ^ (k2 + k2));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (z5Var.q(i6, obj, i3)) {
                        long l = l(j2, obj);
                        ((y4) t5Var.r).h0(i6, (l >> 63) ^ (l + l));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (z5Var.q(i6, obj, i3)) {
                        t5Var.e(i6, unsafe.getObject(obj, j2), z5Var.y(i3));
                        break;
                    } else {
                        break;
                    }
            }
            i3 += 3;
            i2 = 1048575;
            z5Var = this;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final boolean h(g5 g5Var, g5 g5Var2) {
        boolean a;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int E = E(i);
                long j2 = E & 1048575;
                switch (F(E)) {
                    case 0:
                        if (!m(g5Var, g5Var2, i)) {
                            break;
                        } else {
                            o6 o6Var = p6.c;
                            if (Double.doubleToLongBits(o6Var.f(j2, g5Var)) != Double.doubleToLongBits(o6Var.f(j2, g5Var2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!m(g5Var, g5Var2, i)) {
                            break;
                        } else {
                            o6 o6Var2 = p6.c;
                            if (Float.floatToIntBits(o6Var2.d(j2, g5Var)) != Float.floatToIntBits(o6Var2.d(j2, g5Var2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (m(g5Var, g5Var2, i) && p6.h(j2, g5Var) == p6.h(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (m(g5Var, g5Var2, i) && p6.h(j2, g5Var) == p6.h(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (m(g5Var, g5Var2, i) && p6.f(j2, g5Var) == p6.f(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (m(g5Var, g5Var2, i) && p6.h(j2, g5Var) == p6.h(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (m(g5Var, g5Var2, i) && p6.f(j2, g5Var) == p6.f(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!m(g5Var, g5Var2, i)) {
                            break;
                        } else {
                            o6 o6Var3 = p6.c;
                            if (o6Var3.b(j2, g5Var) != o6Var3.b(j2, g5Var2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (m(g5Var, g5Var2, i) && h6.a(p6.j(j2, g5Var), p6.j(j2, g5Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (m(g5Var, g5Var2, i) && h6.a(p6.j(j2, g5Var), p6.j(j2, g5Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (m(g5Var, g5Var2, i) && h6.a(p6.j(j2, g5Var), p6.j(j2, g5Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (m(g5Var, g5Var2, i) && p6.f(j2, g5Var) == p6.f(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (m(g5Var, g5Var2, i) && p6.f(j2, g5Var) == p6.f(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (m(g5Var, g5Var2, i) && p6.f(j2, g5Var) == p6.f(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (m(g5Var, g5Var2, i) && p6.h(j2, g5Var) == p6.h(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (m(g5Var, g5Var2, i) && p6.f(j2, g5Var) == p6.f(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (m(g5Var, g5Var2, i) && p6.h(j2, g5Var) == p6.h(j2, g5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (m(g5Var, g5Var2, i) && h6.a(p6.j(j2, g5Var), p6.j(j2, g5Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        a = h6.a(p6.j(j2, g5Var), p6.j(j2, g5Var2));
                        break;
                    case 50:
                        a = h6.a(p6.j(j2, g5Var), p6.j(j2, g5Var2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j3 = iArr[i + 2] & 1048575;
                        if (p6.f(j3, g5Var) == p6.f(j3, g5Var2) && h6.a(p6.j(j2, g5Var), p6.j(j2, g5Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (a) {
                    i += 3;
                }
            } else if (g5Var.zzc.equals(g5Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final void i(Object obj) {
        if (!a(obj)) {
            return;
        }
        if (obj instanceof g5) {
            g5 g5Var = (g5) obj;
            g5Var.j();
            g5Var.zza = 0;
            g5Var.f();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.i.getClass();
                k6 k6Var = ((g5) obj).zzc;
                if (k6Var.e) {
                    k6Var.e = false;
                    return;
                }
                return;
            }
            int E = E(i);
            int i2 = 1048575 & E;
            int F = F(E);
            long j2 = i2;
            if (F != 9) {
                if (F != 60 && F != 68) {
                    switch (F) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            t4 t4Var = (t4) ((m5) p6.j(j2, obj));
                            if (!t4Var.r) {
                                break;
                            } else {
                                t4Var.r = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = k;
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((v5) object).r = false;
                                unsafe.putObject(obj, j2, object);
                                break;
                            }
                    }
                } else if (q(iArr[i], obj, i)) {
                    y(i).i(k.getObject(obj, j2));
                }
                i += 3;
            }
            if (o(i, obj)) {
                y(i).i(k.getObject(obj, j2));
            }
            i += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    @Override // com.google.android.gms.internal.measurement.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(g5 g5Var) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                return g5Var.zzc.hashCode() + (i6 * 53);
            }
            int E = E(i5);
            int i7 = 1048575 & E;
            int F = F(E);
            int i8 = iArr[i5];
            long j2 = i7;
            int i9 = 1237;
            int i10 = 37;
            switch (F) {
                case 0:
                    i = i6 * 53;
                    doubleToLongBits = Double.doubleToLongBits(p6.c.f(j2, g5Var));
                    Charset charset = n5.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    floatToIntBits = Float.floatToIntBits(p6.c.d(j2, g5Var));
                    i6 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    doubleToLongBits = p6.h(j2, g5Var);
                    Charset charset2 = n5.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    doubleToLongBits = p6.h(j2, g5Var);
                    Charset charset3 = n5.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    floatToIntBits = p6.f(j2, g5Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    doubleToLongBits = p6.h(j2, g5Var);
                    Charset charset4 = n5.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    floatToIntBits = p6.f(j2, g5Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean b = p6.c.b(j2, g5Var);
                    Charset charset5 = n5.a;
                    break;
                case 8:
                    i2 = i6 * 53;
                    floatToIntBits = ((String) p6.j(j2, g5Var)).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object j3 = p6.j(j2, g5Var);
                    if (j3 != null) {
                        i10 = j3.hashCode();
                    }
                    i6 = i4 + i10;
                    break;
                case 10:
                    i2 = i6 * 53;
                    floatToIntBits = p6.j(j2, g5Var).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    floatToIntBits = p6.f(j2, g5Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    floatToIntBits = p6.f(j2, g5Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    floatToIntBits = p6.f(j2, g5Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    doubleToLongBits = p6.h(j2, g5Var);
                    Charset charset6 = n5.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    floatToIntBits = p6.f(j2, g5Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    doubleToLongBits = p6.h(j2, g5Var);
                    Charset charset7 = n5.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object j4 = p6.j(j2, g5Var);
                    if (j4 != null) {
                        i10 = j4.hashCode();
                    }
                    i6 = i4 + i10;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i6 * 53;
                    floatToIntBits = p6.j(j2, g5Var).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    floatToIntBits = p6.j(j2, g5Var).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 51:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) p6.j(j2, g5Var)).doubleValue());
                        Charset charset8 = n5.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) p6.j(j2, g5Var)).floatValue());
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 53:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = l(j2, g5Var);
                        Charset charset9 = n5.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = l(j2, g5Var);
                        Charset charset10 = n5.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = k(j2, g5Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 56:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = l(j2, g5Var);
                        Charset charset11 = n5.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = k(j2, g5Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 58:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i3 = i6 * 53;
                        boolean booleanValue = ((Boolean) p6.j(j2, g5Var)).booleanValue();
                        Charset charset12 = n5.a;
                        break;
                    }
                case 59:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ((String) p6.j(j2, g5Var)).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 60:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p6.j(j2, g5Var).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 61:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p6.j(j2, g5Var).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 62:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = k(j2, g5Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 63:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = k(j2, g5Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 64:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = k(j2, g5Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 65:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = l(j2, g5Var);
                        Charset charset13 = n5.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = k(j2, g5Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 67:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = l(j2, g5Var);
                        Charset charset14 = n5.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!q(i8, g5Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = p6.j(j2, g5Var).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
            }
            i5 += 3;
        }
    }

    public final boolean m(g5 g5Var, g5 g5Var2, int i) {
        return o(i, g5Var) == o(i, g5Var2);
    }

    public final boolean n(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? o(i, obj) : (i3 & i4) != 0;
    }

    public final boolean o(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 == 1048575) {
            int E = E(i);
            long j3 = E & 1048575;
            switch (F(E)) {
                case 0:
                    if (Double.doubleToRawLongBits(p6.c.f(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(p6.c.d(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (p6.h(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (p6.h(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (p6.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (p6.h(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (p6.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return p6.c.b(j3, obj);
                case 8:
                    Object j4 = p6.j(j3, obj);
                    if (j4 instanceof String) {
                        if (((String) j4).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(j4 instanceof x4)) {
                            throw new IllegalArgumentException();
                        }
                        if (x4.t.equals(j4)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (p6.j(j3, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (x4.t.equals(p6.j(j3, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (p6.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (p6.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (p6.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (p6.h(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (p6.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (p6.h(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (p6.j(j3, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & p6.f(j2, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void p(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        p6.g((1 << (i2 >>> 20)) | p6.f(j2, obj), j2, obj);
    }

    public final boolean q(int i, Object obj, int i2) {
        return p6.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final int r(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x1099, code lost:
    
        if (r15 != r11) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x10a1, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmr(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0fb2, code lost:
    
        if (r8 == 1048575) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0fb4, code lost:
    
        r0.putInt(r3, r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0fb8, code lost:
    
        r0 = r12.g;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0fbe, code lost:
    
        if (r0 >= r12.h) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0fc0, code lost:
    
        r2 = r12.f[r0];
        r4 = r9[r2];
        r7 = com.google.android.gms.internal.measurement.p6.j(r12.E(r2) & 1048575, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0fd4, code lost:
    
        if (r7 == null) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0fd6, code lost:
    
        r8 = r12.z(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0fda, code lost:
    
        if (r8 == null) goto L739;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0fdc, code lost:
    
        r2 = r2 / 3;
        r2 = ((com.google.android.gms.internal.measurement.u5) r17[r2 + r2]).a;
        r7 = ((com.google.android.gms.internal.measurement.v5) r7).entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0ff3, code lost:
    
        if (r7.hasNext() == false) goto L740;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0ff5, code lost:
    
        r9 = (java.util.Map.Entry) r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x1009, code lost:
    
        if (r8.a(((java.lang.Integer) r9.getValue()).intValue()) != false) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x106c, code lost:
    
        r3 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x100b, code lost:
    
        if (r1 != null) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x00f8, code lost:
    
        r6 = r43;
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x00fb, code lost:
    
        r4 = r10;
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x00fd, code lost:
    
        r10 = r13;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x100d, code lost:
    
        r12.getClass();
        r1 = (com.google.android.gms.internal.measurement.g5) r3;
        r13 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x1015, code lost:
    
        if (r13 != r10) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x0179, code lost:
    
        r4 = r3;
        r3 = r2;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x1017, code lost:
    
        r13 = com.google.android.gms.internal.measurement.k6.a();
        r1.zzc = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x101d, code lost:
    
        r1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x101e, code lost:
    
        r13 = com.google.android.gms.internal.measurement.u5.b(r2, r9.getKey(), r9.getValue());
        r14 = com.google.android.gms.internal.measurement.x4.t;
        r14 = new byte[r13];
        r18 = r0;
        r0 = new com.google.android.gms.internal.measurement.y4(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x1035, code lost:
    
        com.google.android.gms.internal.measurement.u5.a(r0, r2, r9.getKey(), r9.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x1043, code lost:
    
        if ((r13 - r0.d) != 0) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x1045, code lost:
    
        r1.d((r4 << 3) | 2, new com.google.android.gms.internal.measurement.x4(r14));
        r7.remove();
        r3 = r40;
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x1064, code lost:
    
        throw new java.lang.IllegalStateException("Did not write as much data as expected.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x1065, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x106b, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x1074, code lost:
    
        r0 = r0 + 1;
        r3 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x1080, code lost:
    
        if (r1 == null) goto L627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x1082, code lost:
    
        ((com.google.android.gms.internal.measurement.g5) r40).zzc = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x1088, code lost:
    
        if (r11 != 0) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x108a, code lost:
    
        if (r5 != r6) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x1094, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmr(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x109b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x1095, code lost:
    
        r10 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x1097, code lost:
    
        if (r5 > r6) goto L636;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0f7c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0f4a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0f5f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0b3e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0b51 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0f68 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(Object obj, byte[] bArr, int i, int i2, int i3, androidx.glance.appwidget.protobuf.d dVar) {
        z5 z5Var;
        Unsafe unsafe;
        String str;
        k6 k6Var;
        Object[] objArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i12;
        int i13;
        Object obj2;
        androidx.glance.appwidget.protobuf.d dVar2;
        byte[] bArr2;
        k6 k6Var2;
        Unsafe unsafe2;
        Object obj3;
        int i14;
        int i15;
        int i16;
        int i17;
        byte[] bArr3;
        androidx.glance.appwidget.protobuf.d dVar3;
        int i18;
        int i19;
        Unsafe unsafe3;
        byte[] bArr4;
        androidx.glance.appwidget.protobuf.d dVar4;
        Object obj4;
        Unsafe unsafe4;
        byte[] bArr5;
        androidx.glance.appwidget.protobuf.d dVar5;
        int i20;
        Unsafe unsafe5;
        int i22;
        byte[] bArr6;
        k6 k6Var3;
        androidx.glance.appwidget.protobuf.d dVar6;
        int i23;
        int i0;
        int i24;
        androidx.glance.appwidget.protobuf.d dVar7;
        int i25;
        int q0;
        int i26;
        int i27;
        int d0;
        androidx.glance.appwidget.protobuf.d dVar8;
        int i28;
        int i29;
        int p0;
        int i30;
        int i32;
        m5 m5Var;
        int i33;
        int i34;
        int i35;
        byte[] bArr7;
        androidx.glance.appwidget.protobuf.d dVar9;
        int i36;
        int i37;
        int d02;
        int i38;
        int i39;
        int i40;
        k6 k6Var4;
        byte[] bArr8;
        androidx.glance.appwidget.protobuf.d dVar10;
        String str2;
        int i42;
        Object obj5;
        androidx.glance.appwidget.protobuf.d dVar11;
        Object obj6;
        byte[] bArr9;
        int i43;
        int i44;
        byte[] bArr10;
        androidx.glance.appwidget.protobuf.d dVar12;
        int i45;
        z5 z5Var2 = this;
        Object obj7 = obj;
        byte[] bArr11 = bArr;
        int i46 = i2;
        androidx.glance.appwidget.protobuf.d dVar13 = dVar;
        if (!a(obj7)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        Unsafe unsafe6 = k;
        int i47 = i;
        int i48 = -1;
        int i49 = 0;
        int i50 = 1048575;
        int i52 = 0;
        int i53 = 0;
        while (true) {
            int i54 = 1048575;
            while (true) {
                Object[] objArr2 = z5Var2.b;
                e5 e5Var = z5Var2.i;
                k6 k6Var5 = k6.f;
                int i55 = i49;
                int[] iArr = z5Var2.a;
                if (i47 < i46) {
                    int i56 = i47 + 1;
                    int i57 = bArr11[i47];
                    if (i57 < 0) {
                        i56 = k41.b.g0(i57, bArr11, i56, dVar13);
                        i57 = dVar13.a;
                    }
                    int i58 = i56;
                    i53 = i57;
                    i6 = i53 >>> 3;
                    int i59 = z5Var2.d;
                    int i60 = z5Var2.c;
                    if (i6 > i48) {
                        i8 = (i6 < i60 || i6 > i59) ? -1 : z5Var2.r(i6, i55 / 3);
                        i7 = 0;
                    } else if (i6 < i60 || i6 > i59) {
                        i7 = 0;
                        i8 = -1;
                    } else {
                        i7 = 0;
                        i8 = z5Var2.r(i6, 0);
                    }
                    if (i8 == -1) {
                        unsafe = unsafe6;
                        i9 = i7;
                        str = "Failed to parse the message.";
                        i10 = i6;
                        objArr = objArr2;
                        i12 = i53;
                        i13 = i58;
                        obj2 = obj7;
                        dVar2 = dVar13;
                        i5 = i50;
                        k6Var = k6Var5;
                        bArr2 = bArr;
                    } else {
                        int i62 = i53 & 7;
                        int i63 = iArr[i8 + 1];
                        int F = F(i63);
                        objArr = objArr2;
                        long j2 = i63 & i54;
                        if (F <= 17) {
                            int i64 = iArr[i8 + 2];
                            int i65 = 1 << (i64 >>> 20);
                            int i66 = i64 & i54;
                            if (i66 != i50) {
                                int i67 = i54;
                                if (i50 != i67) {
                                    unsafe6.putInt(obj7, i50, i52);
                                    i67 = 1048575;
                                }
                                i52 = i66 == i67 ? 0 : unsafe6.getInt(obj7, i66);
                            } else {
                                i66 = i50;
                            }
                            switch (F) {
                                case 0:
                                    z5Var2 = this;
                                    unsafe3 = unsafe6;
                                    i14 = i8;
                                    i15 = i66;
                                    i16 = i52;
                                    i17 = i58;
                                    bArr4 = bArr;
                                    i18 = i53;
                                    dVar4 = dVar;
                                    if (i62 == 1) {
                                        i52 = i16 | i65;
                                        p6.c.g(obj7, j2, Double.longBitsToDouble(k41.b.k0(i17, bArr4)));
                                        i50 = i15;
                                        i46 = i2;
                                        i49 = i14;
                                        i47 = i17 + 8;
                                        break;
                                    }
                                    obj4 = obj7;
                                    i5 = i15;
                                    i9 = i14;
                                    i13 = i17;
                                    str = "Failed to parse the message.";
                                    k6Var = k6Var5;
                                    unsafe = unsafe3;
                                    bArr2 = bArr4;
                                    dVar2 = dVar4;
                                    i10 = i6;
                                    i52 = i16;
                                    i12 = i18;
                                    i4 = i3;
                                    obj2 = obj4;
                                    if (i12 != i4 && i4 != 0) {
                                        z5Var = this;
                                        i46 = i2;
                                        i47 = i13;
                                        obj7 = obj2;
                                        i53 = i12;
                                        break;
                                    } else {
                                        g5 g5Var = (g5) obj2;
                                        k6Var2 = g5Var.zzc;
                                        if (k6Var2 == k6Var) {
                                            k6Var2 = k6.a();
                                            g5Var.zzc = k6Var2;
                                        }
                                        int i68 = i12;
                                        int s0 = k41.b.s0(i68, bArr2, i13, i2, k6Var2, dVar2);
                                        dVar13 = dVar;
                                        i46 = i2;
                                        i50 = i5;
                                        obj7 = obj2;
                                        i49 = i9;
                                        i54 = 1048575;
                                        i48 = i10;
                                        i53 = i68;
                                        i47 = s0;
                                        z5Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                case 1:
                                    z5Var2 = this;
                                    unsafe3 = unsafe6;
                                    i14 = i8;
                                    i15 = i66;
                                    i16 = i52;
                                    i17 = i58;
                                    bArr4 = bArr;
                                    i18 = i53;
                                    dVar4 = dVar;
                                    if (i62 == 5) {
                                        i52 = i16 | i65;
                                        p6.c.e(obj7, j2, Float.intBitsToFloat(k41.b.j0(i17, bArr4)));
                                        i50 = i15;
                                        i46 = i2;
                                        i49 = i14;
                                        i47 = i17 + 4;
                                        break;
                                    }
                                    obj4 = obj7;
                                    i5 = i15;
                                    i9 = i14;
                                    i13 = i17;
                                    str = "Failed to parse the message.";
                                    k6Var = k6Var5;
                                    unsafe = unsafe3;
                                    bArr2 = bArr4;
                                    dVar2 = dVar4;
                                    i10 = i6;
                                    i52 = i16;
                                    i12 = i18;
                                    i4 = i3;
                                    obj2 = obj4;
                                    if (i12 != i4) {
                                    }
                                    g5 g5Var2 = (g5) obj2;
                                    k6Var2 = g5Var2.zzc;
                                    if (k6Var2 == k6Var) {
                                    }
                                    int i682 = i12;
                                    int s02 = k41.b.s0(i682, bArr2, i13, i2, k6Var2, dVar2);
                                    dVar13 = dVar;
                                    i46 = i2;
                                    i50 = i5;
                                    obj7 = obj2;
                                    i49 = i9;
                                    i54 = 1048575;
                                    i48 = i10;
                                    i53 = i682;
                                    i47 = s02;
                                    z5Var2 = this;
                                    bArr11 = bArr;
                                    unsafe6 = unsafe;
                                    break;
                                case 2:
                                case 3:
                                    z5Var2 = this;
                                    i14 = i8;
                                    i15 = i66;
                                    i16 = i52;
                                    i17 = i58;
                                    bArr4 = bArr;
                                    i18 = i53;
                                    dVar4 = dVar;
                                    if (i62 == 0) {
                                        i52 = i16 | i65;
                                        int i02 = k41.b.i0(bArr4, i17, dVar4);
                                        unsafe6.putLong(obj7, j2, dVar4.b);
                                        i50 = i15;
                                        i46 = i2;
                                        i49 = i14;
                                        i47 = i02;
                                        break;
                                    }
                                    unsafe3 = unsafe6;
                                    obj4 = obj7;
                                    i5 = i15;
                                    i9 = i14;
                                    i13 = i17;
                                    str = "Failed to parse the message.";
                                    k6Var = k6Var5;
                                    unsafe = unsafe3;
                                    bArr2 = bArr4;
                                    dVar2 = dVar4;
                                    i10 = i6;
                                    i52 = i16;
                                    i12 = i18;
                                    i4 = i3;
                                    obj2 = obj4;
                                    if (i12 != i4) {
                                    }
                                    g5 g5Var22 = (g5) obj2;
                                    k6Var2 = g5Var22.zzc;
                                    if (k6Var2 == k6Var) {
                                    }
                                    int i6822 = i12;
                                    int s022 = k41.b.s0(i6822, bArr2, i13, i2, k6Var2, dVar2);
                                    dVar13 = dVar;
                                    i46 = i2;
                                    i50 = i5;
                                    obj7 = obj2;
                                    i49 = i9;
                                    i54 = 1048575;
                                    i48 = i10;
                                    i53 = i6822;
                                    i47 = s022;
                                    z5Var2 = this;
                                    bArr11 = bArr;
                                    unsafe6 = unsafe;
                                    break;
                                case 4:
                                case 11:
                                    z5Var2 = this;
                                    i14 = i8;
                                    i15 = i66;
                                    i16 = i52;
                                    i17 = i58;
                                    bArr4 = bArr;
                                    i18 = i53;
                                    dVar4 = dVar;
                                    if (i62 == 0) {
                                        i52 = i16 | i65;
                                        i47 = k41.b.d0(bArr4, i17, dVar4);
                                        unsafe6.putInt(obj7, j2, dVar4.a);
                                        i50 = i15;
                                        i46 = i2;
                                        i49 = i14;
                                        break;
                                    }
                                    unsafe3 = unsafe6;
                                    obj4 = obj7;
                                    i5 = i15;
                                    i9 = i14;
                                    i13 = i17;
                                    str = "Failed to parse the message.";
                                    k6Var = k6Var5;
                                    unsafe = unsafe3;
                                    bArr2 = bArr4;
                                    dVar2 = dVar4;
                                    i10 = i6;
                                    i52 = i16;
                                    i12 = i18;
                                    i4 = i3;
                                    obj2 = obj4;
                                    if (i12 != i4) {
                                    }
                                    g5 g5Var222 = (g5) obj2;
                                    k6Var2 = g5Var222.zzc;
                                    if (k6Var2 == k6Var) {
                                    }
                                    int i68222 = i12;
                                    int s0222 = k41.b.s0(i68222, bArr2, i13, i2, k6Var2, dVar2);
                                    dVar13 = dVar;
                                    i46 = i2;
                                    i50 = i5;
                                    obj7 = obj2;
                                    i49 = i9;
                                    i54 = 1048575;
                                    i48 = i10;
                                    i53 = i68222;
                                    i47 = s0222;
                                    z5Var2 = this;
                                    bArr11 = bArr;
                                    unsafe6 = unsafe;
                                    break;
                                case 5:
                                case 14:
                                    z5Var2 = this;
                                    unsafe2 = unsafe6;
                                    obj3 = obj7;
                                    i14 = i8;
                                    i15 = i66;
                                    i16 = i52;
                                    i17 = i58;
                                    bArr3 = bArr;
                                    dVar3 = dVar;
                                    i18 = i53;
                                    if (i62 == 1) {
                                        long k0 = k41.b.k0(i17, bArr3);
                                        obj7 = obj3;
                                        unsafe6 = unsafe2;
                                        unsafe6.putLong(obj7, j2, k0);
                                        i50 = i15;
                                        i46 = i2;
                                        i47 = i17 + 8;
                                        i52 = i16 | i65;
                                        bArr11 = bArr3;
                                        dVar13 = dVar3;
                                        i48 = i6;
                                        i53 = i18;
                                        i54 = 1048575;
                                        i49 = i14;
                                    } else {
                                        bArr4 = bArr3;
                                        dVar4 = dVar3;
                                        unsafe3 = unsafe2;
                                        obj4 = obj3;
                                        i5 = i15;
                                        i9 = i14;
                                        i13 = i17;
                                        str = "Failed to parse the message.";
                                        k6Var = k6Var5;
                                        unsafe = unsafe3;
                                        bArr2 = bArr4;
                                        dVar2 = dVar4;
                                        i10 = i6;
                                        i52 = i16;
                                        i12 = i18;
                                        i4 = i3;
                                        obj2 = obj4;
                                        if (i12 != i4) {
                                        }
                                        g5 g5Var2222 = (g5) obj2;
                                        k6Var2 = g5Var2222.zzc;
                                        if (k6Var2 == k6Var) {
                                        }
                                        int i682222 = i12;
                                        int s02222 = k41.b.s0(i682222, bArr2, i13, i2, k6Var2, dVar2);
                                        dVar13 = dVar;
                                        i46 = i2;
                                        i50 = i5;
                                        obj7 = obj2;
                                        i49 = i9;
                                        i54 = 1048575;
                                        i48 = i10;
                                        i53 = i682222;
                                        i47 = s02222;
                                        z5Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                    break;
                                case 6:
                                case 13:
                                    z5Var2 = this;
                                    unsafe2 = unsafe6;
                                    obj3 = obj7;
                                    i14 = i8;
                                    i15 = i66;
                                    i16 = i52;
                                    i17 = i58;
                                    bArr3 = bArr;
                                    dVar3 = dVar;
                                    i18 = i53;
                                    if (i62 == 5) {
                                        unsafe2.putInt(obj3, j2, k41.b.j0(i17, bArr3));
                                        i49 = i14;
                                        i47 = i17 + 4;
                                        i52 = i16 | i65;
                                        i48 = i6;
                                        i53 = i18;
                                        i54 = 1048575;
                                        bArr11 = bArr3;
                                        dVar13 = dVar3;
                                        unsafe6 = unsafe2;
                                        obj7 = obj3;
                                        i50 = i15;
                                        i46 = i2;
                                    } else {
                                        bArr4 = bArr3;
                                        dVar4 = dVar3;
                                        unsafe3 = unsafe2;
                                        obj4 = obj3;
                                        i5 = i15;
                                        i9 = i14;
                                        i13 = i17;
                                        str = "Failed to parse the message.";
                                        k6Var = k6Var5;
                                        unsafe = unsafe3;
                                        bArr2 = bArr4;
                                        dVar2 = dVar4;
                                        i10 = i6;
                                        i52 = i16;
                                        i12 = i18;
                                        i4 = i3;
                                        obj2 = obj4;
                                        if (i12 != i4) {
                                        }
                                        g5 g5Var22222 = (g5) obj2;
                                        k6Var2 = g5Var22222.zzc;
                                        if (k6Var2 == k6Var) {
                                        }
                                        int i6822222 = i12;
                                        int s022222 = k41.b.s0(i6822222, bArr2, i13, i2, k6Var2, dVar2);
                                        dVar13 = dVar;
                                        i46 = i2;
                                        i50 = i5;
                                        obj7 = obj2;
                                        i49 = i9;
                                        i54 = 1048575;
                                        i48 = i10;
                                        i53 = i6822222;
                                        i47 = s022222;
                                        z5Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                    break;
                                case 7:
                                    z5Var2 = this;
                                    unsafe2 = unsafe6;
                                    obj3 = obj7;
                                    i14 = i8;
                                    i15 = i66;
                                    i16 = i52;
                                    i17 = i58;
                                    bArr3 = bArr;
                                    dVar3 = dVar;
                                    i18 = i53;
                                    if (i62 == 0) {
                                        int i69 = i16 | i65;
                                        i47 = k41.b.i0(bArr3, i17, dVar3);
                                        p6.c.c(obj3, j2, dVar3.b != 0);
                                        i49 = i14;
                                        dVar13 = dVar3;
                                        i52 = i69;
                                        obj7 = obj3;
                                        i48 = i6;
                                        i53 = i18;
                                        i54 = 1048575;
                                        i50 = i15;
                                        bArr11 = bArr3;
                                        unsafe6 = unsafe2;
                                        i46 = i2;
                                    } else {
                                        bArr4 = bArr3;
                                        dVar4 = dVar3;
                                        unsafe3 = unsafe2;
                                        obj4 = obj3;
                                        i5 = i15;
                                        i9 = i14;
                                        i13 = i17;
                                        str = "Failed to parse the message.";
                                        k6Var = k6Var5;
                                        unsafe = unsafe3;
                                        bArr2 = bArr4;
                                        dVar2 = dVar4;
                                        i10 = i6;
                                        i52 = i16;
                                        i12 = i18;
                                        i4 = i3;
                                        obj2 = obj4;
                                        if (i12 != i4) {
                                        }
                                        g5 g5Var222222 = (g5) obj2;
                                        k6Var2 = g5Var222222.zzc;
                                        if (k6Var2 == k6Var) {
                                        }
                                        int i68222222 = i12;
                                        int s0222222 = k41.b.s0(i68222222, bArr2, i13, i2, k6Var2, dVar2);
                                        dVar13 = dVar;
                                        i46 = i2;
                                        i50 = i5;
                                        obj7 = obj2;
                                        i49 = i9;
                                        i54 = 1048575;
                                        i48 = i10;
                                        i53 = i68222222;
                                        i47 = s0222222;
                                        z5Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                    break;
                                case 8:
                                    z5Var2 = this;
                                    unsafe2 = unsafe6;
                                    obj3 = obj7;
                                    i14 = i8;
                                    i15 = i66;
                                    i16 = i52;
                                    i17 = i58;
                                    bArr3 = bArr;
                                    dVar3 = dVar;
                                    i18 = i53;
                                    if (i62 == 2) {
                                        if ((i63 & 536870912) != 0) {
                                            i47 = k41.b.l0(bArr3, i17, dVar3);
                                            i19 = i16 | i65;
                                        } else {
                                            int d03 = k41.b.d0(bArr3, i17, dVar3);
                                            int i70 = dVar3.a;
                                            if (i70 < 0) {
                                                throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            i19 = i16 | i65;
                                            if (i70 == 0) {
                                                dVar3.c = "";
                                            } else {
                                                dVar3.c = new String(bArr3, d03, i70, n5.a);
                                                d03 += i70;
                                            }
                                            i47 = d03;
                                        }
                                        unsafe2.putObject(obj3, j2, dVar3.c);
                                        i49 = i14;
                                        bArr11 = bArr3;
                                        unsafe6 = unsafe2;
                                        i52 = i19;
                                        i48 = i6;
                                        i53 = i18;
                                        i54 = 1048575;
                                        i46 = i2;
                                        dVar13 = dVar3;
                                        obj7 = obj3;
                                        i50 = i15;
                                    } else {
                                        bArr4 = bArr3;
                                        dVar4 = dVar3;
                                        unsafe3 = unsafe2;
                                        obj4 = obj3;
                                        i5 = i15;
                                        i9 = i14;
                                        i13 = i17;
                                        str = "Failed to parse the message.";
                                        k6Var = k6Var5;
                                        unsafe = unsafe3;
                                        bArr2 = bArr4;
                                        dVar2 = dVar4;
                                        i10 = i6;
                                        i52 = i16;
                                        i12 = i18;
                                        i4 = i3;
                                        obj2 = obj4;
                                        if (i12 != i4) {
                                        }
                                        g5 g5Var2222222 = (g5) obj2;
                                        k6Var2 = g5Var2222222.zzc;
                                        if (k6Var2 == k6Var) {
                                        }
                                        int i682222222 = i12;
                                        int s02222222 = k41.b.s0(i682222222, bArr2, i13, i2, k6Var2, dVar2);
                                        dVar13 = dVar;
                                        i46 = i2;
                                        i50 = i5;
                                        obj7 = obj2;
                                        i49 = i9;
                                        i54 = 1048575;
                                        i48 = i10;
                                        i53 = i682222222;
                                        i47 = s02222222;
                                        z5Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                    break;
                                case 9:
                                    Object obj8 = obj7;
                                    Unsafe unsafe7 = unsafe6;
                                    z5Var2 = this;
                                    i14 = i8;
                                    i17 = i58;
                                    if (i62 == 2) {
                                        i52 |= i65;
                                        Object A = z5Var2.A(i14, obj8);
                                        dVar13 = dVar;
                                        i46 = i2;
                                        i47 = k41.b.n0(A, z5Var2.y(i14), bArr, i17, i46, dVar13);
                                        z5Var2.B(i14, obj8, A);
                                        i49 = i14;
                                        bArr11 = bArr;
                                        obj7 = obj8;
                                        unsafe6 = unsafe7;
                                        break;
                                    } else {
                                        obj3 = obj8;
                                        unsafe3 = unsafe7;
                                        i15 = i66;
                                        i16 = i52;
                                        i18 = i53;
                                        bArr4 = bArr;
                                        dVar4 = dVar;
                                        obj4 = obj3;
                                        i5 = i15;
                                        i9 = i14;
                                        i13 = i17;
                                        str = "Failed to parse the message.";
                                        k6Var = k6Var5;
                                        unsafe = unsafe3;
                                        bArr2 = bArr4;
                                        dVar2 = dVar4;
                                        i10 = i6;
                                        i52 = i16;
                                        i12 = i18;
                                        i4 = i3;
                                        obj2 = obj4;
                                        if (i12 != i4) {
                                        }
                                        g5 g5Var22222222 = (g5) obj2;
                                        k6Var2 = g5Var22222222.zzc;
                                        if (k6Var2 == k6Var) {
                                        }
                                        int i6822222222 = i12;
                                        int s022222222 = k41.b.s0(i6822222222, bArr2, i13, i2, k6Var2, dVar2);
                                        dVar13 = dVar;
                                        i46 = i2;
                                        i50 = i5;
                                        obj7 = obj2;
                                        i49 = i9;
                                        i54 = 1048575;
                                        i48 = i10;
                                        i53 = i6822222222;
                                        i47 = s022222222;
                                        z5Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                    break;
                                case 10:
                                    Object obj9 = obj7;
                                    unsafe4 = unsafe6;
                                    obj4 = obj9;
                                    z5Var2 = this;
                                    bArr5 = bArr;
                                    dVar5 = dVar;
                                    i14 = i8;
                                    i17 = i58;
                                    if (i62 == 2) {
                                        i52 |= i65;
                                        i47 = k41.b.m0(bArr5, i17, dVar5);
                                        unsafe4.putObject(obj4, j2, dVar5.c);
                                        break;
                                    }
                                    i15 = i66;
                                    i16 = i52;
                                    i18 = i53;
                                    bArr4 = bArr5;
                                    dVar4 = dVar5;
                                    unsafe3 = unsafe4;
                                    i5 = i15;
                                    i9 = i14;
                                    i13 = i17;
                                    str = "Failed to parse the message.";
                                    k6Var = k6Var5;
                                    unsafe = unsafe3;
                                    bArr2 = bArr4;
                                    dVar2 = dVar4;
                                    i10 = i6;
                                    i52 = i16;
                                    i12 = i18;
                                    i4 = i3;
                                    obj2 = obj4;
                                    if (i12 != i4) {
                                    }
                                    g5 g5Var222222222 = (g5) obj2;
                                    k6Var2 = g5Var222222222.zzc;
                                    if (k6Var2 == k6Var) {
                                    }
                                    int i68222222222 = i12;
                                    int s0222222222 = k41.b.s0(i68222222222, bArr2, i13, i2, k6Var2, dVar2);
                                    dVar13 = dVar;
                                    i46 = i2;
                                    i50 = i5;
                                    obj7 = obj2;
                                    i49 = i9;
                                    i54 = 1048575;
                                    i48 = i10;
                                    i53 = i68222222222;
                                    i47 = s0222222222;
                                    z5Var2 = this;
                                    bArr11 = bArr;
                                    unsafe6 = unsafe;
                                    break;
                                case 12:
                                    Object obj10 = obj7;
                                    unsafe4 = unsafe6;
                                    obj4 = obj10;
                                    z5Var2 = this;
                                    bArr5 = bArr;
                                    dVar5 = dVar;
                                    i14 = i8;
                                    i17 = i58;
                                    if (i62 == 0) {
                                        i47 = k41.b.d0(bArr5, i17, dVar5);
                                        int i72 = dVar5.a;
                                        j5 z = z5Var2.z(i14);
                                        if ((i63 & Integer.MIN_VALUE) != 0 && z != null && !z.a(i72)) {
                                            g5 g5Var3 = (g5) obj4;
                                            k6 k6Var6 = g5Var3.zzc;
                                            if (k6Var6 == k6Var5) {
                                                k6Var6 = k6.a();
                                                g5Var3.zzc = k6Var6;
                                            }
                                            k6Var6.d(i53, Long.valueOf(i72));
                                            break;
                                        } else {
                                            i52 |= i65;
                                            unsafe4.putInt(obj4, j2, i72);
                                            break;
                                        }
                                    }
                                    i15 = i66;
                                    i16 = i52;
                                    i18 = i53;
                                    bArr4 = bArr5;
                                    dVar4 = dVar5;
                                    unsafe3 = unsafe4;
                                    i5 = i15;
                                    i9 = i14;
                                    i13 = i17;
                                    str = "Failed to parse the message.";
                                    k6Var = k6Var5;
                                    unsafe = unsafe3;
                                    bArr2 = bArr4;
                                    dVar2 = dVar4;
                                    i10 = i6;
                                    i52 = i16;
                                    i12 = i18;
                                    i4 = i3;
                                    obj2 = obj4;
                                    if (i12 != i4) {
                                    }
                                    g5 g5Var2222222222 = (g5) obj2;
                                    k6Var2 = g5Var2222222222.zzc;
                                    if (k6Var2 == k6Var) {
                                    }
                                    int i682222222222 = i12;
                                    int s02222222222 = k41.b.s0(i682222222222, bArr2, i13, i2, k6Var2, dVar2);
                                    dVar13 = dVar;
                                    i46 = i2;
                                    i50 = i5;
                                    obj7 = obj2;
                                    i49 = i9;
                                    i54 = 1048575;
                                    i48 = i10;
                                    i53 = i682222222222;
                                    i47 = s02222222222;
                                    z5Var2 = this;
                                    bArr11 = bArr;
                                    unsafe6 = unsafe;
                                    break;
                                case 15:
                                    Object obj11 = obj7;
                                    unsafe4 = unsafe6;
                                    obj4 = obj11;
                                    z5Var2 = this;
                                    bArr5 = bArr;
                                    dVar5 = dVar;
                                    i14 = i8;
                                    i17 = i58;
                                    if (i62 == 0) {
                                        i52 |= i65;
                                        i47 = k41.b.d0(bArr5, i17, dVar5);
                                        unsafe4.putInt(obj4, j2, m71.a.n0(dVar5.a));
                                        break;
                                    }
                                    i15 = i66;
                                    i16 = i52;
                                    i18 = i53;
                                    bArr4 = bArr5;
                                    dVar4 = dVar5;
                                    unsafe3 = unsafe4;
                                    i5 = i15;
                                    i9 = i14;
                                    i13 = i17;
                                    str = "Failed to parse the message.";
                                    k6Var = k6Var5;
                                    unsafe = unsafe3;
                                    bArr2 = bArr4;
                                    dVar2 = dVar4;
                                    i10 = i6;
                                    i52 = i16;
                                    i12 = i18;
                                    i4 = i3;
                                    obj2 = obj4;
                                    if (i12 != i4) {
                                    }
                                    g5 g5Var22222222222 = (g5) obj2;
                                    k6Var2 = g5Var22222222222.zzc;
                                    if (k6Var2 == k6Var) {
                                    }
                                    int i6822222222222 = i12;
                                    int s022222222222 = k41.b.s0(i6822222222222, bArr2, i13, i2, k6Var2, dVar2);
                                    dVar13 = dVar;
                                    i46 = i2;
                                    i50 = i5;
                                    obj7 = obj2;
                                    i49 = i9;
                                    i54 = 1048575;
                                    i48 = i10;
                                    i53 = i6822222222222;
                                    i47 = s022222222222;
                                    z5Var2 = this;
                                    bArr11 = bArr;
                                    unsafe6 = unsafe;
                                    break;
                                case 16:
                                    z5Var2 = this;
                                    bArr5 = bArr;
                                    dVar5 = dVar;
                                    i14 = i8;
                                    i17 = i58;
                                    if (i62 == 0) {
                                        i52 |= i65;
                                        int i03 = k41.b.i0(bArr5, i17, dVar5);
                                        unsafe6.putLong(obj7, j2, m71.a.o0(dVar5.b));
                                        obj7 = obj7;
                                        unsafe6 = unsafe6;
                                        i46 = i2;
                                        i49 = i14;
                                        i47 = i03;
                                        break;
                                    } else {
                                        Object obj12 = obj7;
                                        unsafe4 = unsafe6;
                                        obj4 = obj12;
                                        i15 = i66;
                                        i16 = i52;
                                        i18 = i53;
                                        bArr4 = bArr5;
                                        dVar4 = dVar5;
                                        unsafe3 = unsafe4;
                                        i5 = i15;
                                        i9 = i14;
                                        i13 = i17;
                                        str = "Failed to parse the message.";
                                        k6Var = k6Var5;
                                        unsafe = unsafe3;
                                        bArr2 = bArr4;
                                        dVar2 = dVar4;
                                        i10 = i6;
                                        i52 = i16;
                                        i12 = i18;
                                        i4 = i3;
                                        obj2 = obj4;
                                        if (i12 != i4) {
                                        }
                                        g5 g5Var222222222222 = (g5) obj2;
                                        k6Var2 = g5Var222222222222.zzc;
                                        if (k6Var2 == k6Var) {
                                        }
                                        int i68222222222222 = i12;
                                        int s0222222222222 = k41.b.s0(i68222222222222, bArr2, i13, i2, k6Var2, dVar2);
                                        dVar13 = dVar;
                                        i46 = i2;
                                        i50 = i5;
                                        obj7 = obj2;
                                        i49 = i9;
                                        i54 = 1048575;
                                        i48 = i10;
                                        i53 = i68222222222222;
                                        i47 = s0222222222222;
                                        z5Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                    break;
                                default:
                                    if (i62 == 3) {
                                        i52 |= i65;
                                        z5Var2 = this;
                                        Object A2 = z5Var2.A(i8, obj7);
                                        i14 = i8;
                                        i47 = k41.b.o0(A2, z5Var2.y(i14), bArr, i58, i2, (i6 << 3) | 4, dVar);
                                        dVar5 = dVar;
                                        bArr5 = bArr;
                                        z5Var2.B(i14, obj7, A2);
                                        break;
                                    } else {
                                        i14 = i8;
                                        i17 = i58;
                                        unsafe3 = unsafe6;
                                        obj4 = obj7;
                                        i15 = i66;
                                        i16 = i52;
                                        i18 = i53;
                                        bArr4 = bArr;
                                        dVar4 = dVar;
                                        i5 = i15;
                                        i9 = i14;
                                        i13 = i17;
                                        str = "Failed to parse the message.";
                                        k6Var = k6Var5;
                                        unsafe = unsafe3;
                                        bArr2 = bArr4;
                                        dVar2 = dVar4;
                                        i10 = i6;
                                        i52 = i16;
                                        i12 = i18;
                                        i4 = i3;
                                        obj2 = obj4;
                                        if (i12 != i4) {
                                        }
                                        g5 g5Var2222222222222 = (g5) obj2;
                                        k6Var2 = g5Var2222222222222.zzc;
                                        if (k6Var2 == k6Var) {
                                        }
                                        int i682222222222222 = i12;
                                        int s02222222222222 = k41.b.s0(i682222222222222, bArr2, i13, i2, k6Var2, dVar2);
                                        dVar13 = dVar;
                                        i46 = i2;
                                        i50 = i5;
                                        obj7 = obj2;
                                        i49 = i9;
                                        i54 = 1048575;
                                        i48 = i10;
                                        i53 = i682222222222222;
                                        i47 = s02222222222222;
                                        z5Var2 = this;
                                        bArr11 = bArr;
                                        unsafe6 = unsafe;
                                    }
                                    break;
                            }
                        } else {
                            Object obj13 = obj7;
                            Unsafe unsafe8 = unsafe6;
                            int i73 = i8;
                            int i74 = i52;
                            i15 = i50;
                            if (F != 27) {
                                obj2 = obj13;
                                if (F <= 49) {
                                    String str3 = "Failed to parse the message.";
                                    long j3 = i63;
                                    m5 m5Var2 = (m5) unsafe8.getObject(obj2, j2);
                                    if (!((t4) m5Var2).r) {
                                        int size = m5Var2.size();
                                        m5Var2 = m5Var2.E(size + size);
                                        unsafe8.putObject(obj2, j2, m5Var2);
                                    }
                                    m5 m5Var3 = m5Var2;
                                    switch (F) {
                                        case 18:
                                        case 35:
                                            i20 = i2;
                                            unsafe5 = unsafe8;
                                            i12 = i53;
                                            i22 = i58;
                                            bArr6 = bArr;
                                            str = str3;
                                            k6Var3 = k6Var5;
                                            dVar6 = dVar;
                                            i23 = i73;
                                            if (i62 != 2) {
                                                if (i62 == 1) {
                                                    if (m5Var3 != null) {
                                                        throw new ClassCastException();
                                                    }
                                                    Double.longBitsToDouble(k41.b.k0(i22, bArr6));
                                                    throw null;
                                                }
                                                i47 = i22;
                                                if (i47 == i22) {
                                                    k6 k6Var7 = k6Var3;
                                                    i9 = i23;
                                                    k6Var = k6Var7;
                                                    i5 = i15;
                                                    bArr2 = bArr6;
                                                    i13 = i47;
                                                    dVar2 = dVar6;
                                                    i10 = i6;
                                                    unsafe = unsafe5;
                                                    i52 = i74;
                                                    break;
                                                } else {
                                                    z5Var2 = this;
                                                    bArr11 = bArr6;
                                                    i46 = i20;
                                                    dVar13 = dVar6;
                                                    obj7 = obj2;
                                                    i48 = i6;
                                                    unsafe6 = unsafe5;
                                                    i52 = i74;
                                                    i54 = 1048575;
                                                    i53 = i12;
                                                    i49 = i23;
                                                    break;
                                                }
                                            } else {
                                                if (m5Var3 != null) {
                                                    throw new ClassCastException();
                                                }
                                                if (k41.b.d0(bArr6, i22, dVar6) + dVar6.a > bArr6.length) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                throw null;
                                            }
                                        case 19:
                                        case 36:
                                            i20 = i2;
                                            unsafe5 = unsafe8;
                                            i12 = i53;
                                            i22 = i58;
                                            bArr6 = bArr;
                                            str = str3;
                                            k6Var3 = k6Var5;
                                            dVar6 = dVar;
                                            i23 = i73;
                                            if (i62 == 2) {
                                                if (m5Var3 != null) {
                                                    throw new ClassCastException();
                                                }
                                                if (k41.b.d0(bArr6, i22, dVar6) + dVar6.a > bArr6.length) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                throw null;
                                            }
                                            if (i62 == 5) {
                                                if (m5Var3 != null) {
                                                    throw new ClassCastException();
                                                }
                                                Float.intBitsToFloat(k41.b.j0(i22, bArr6));
                                                throw null;
                                            }
                                            i47 = i22;
                                            if (i47 == i22) {
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            i20 = i2;
                                            unsafe5 = unsafe8;
                                            i12 = i53;
                                            i22 = i58;
                                            bArr6 = bArr;
                                            str = str3;
                                            k6Var3 = k6Var5;
                                            dVar6 = dVar;
                                            i23 = i73;
                                            if (i62 == 2) {
                                                s5 s5Var = (s5) m5Var3;
                                                i0 = k41.b.d0(bArr6, i22, dVar6);
                                                int i75 = dVar6.a + i0;
                                                while (i0 < i75) {
                                                    i0 = k41.b.i0(bArr6, i0, dVar6);
                                                    s5Var.e(dVar6.b);
                                                }
                                                if (i0 != i75) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i62 == 0) {
                                                    s5 s5Var2 = (s5) m5Var3;
                                                    i0 = k41.b.i0(bArr6, i22, dVar6);
                                                    s5Var2.e(dVar6.b);
                                                    while (i0 < i20) {
                                                        int d04 = k41.b.d0(bArr6, i0, dVar6);
                                                        if (i12 == dVar6.a) {
                                                            i0 = k41.b.i0(bArr6, d04, dVar6);
                                                            s5Var2.e(dVar6.b);
                                                        }
                                                    }
                                                }
                                                i47 = i22;
                                                if (i47 == i22) {
                                                }
                                            }
                                            i47 = i0;
                                            if (i47 == i22) {
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            i24 = i2;
                                            dVar7 = dVar;
                                            unsafe5 = unsafe8;
                                            i12 = i53;
                                            i25 = i58;
                                            bArr6 = bArr;
                                            str = str3;
                                            k6Var3 = k6Var5;
                                            i23 = i73;
                                            if (i62 == 2) {
                                                q0 = k41.b.q0(bArr6, i25, m5Var3, dVar7);
                                                i47 = q0;
                                                i20 = i24;
                                                dVar6 = dVar7;
                                                i22 = i25;
                                                if (i47 == i22) {
                                                }
                                            } else {
                                                if (i62 == 0) {
                                                    i0 = k41.b.p0(i12, bArr6, i25, i24, m5Var3, dVar7);
                                                    i22 = i25;
                                                    dVar6 = dVar7;
                                                    i20 = i24;
                                                    i47 = i0;
                                                    if (i47 == i22) {
                                                    }
                                                }
                                                i20 = i24;
                                                dVar6 = dVar7;
                                                i22 = i25;
                                                i47 = i22;
                                                if (i47 == i22) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i24 = i2;
                                            dVar7 = dVar;
                                            unsafe5 = unsafe8;
                                            i12 = i53;
                                            i25 = i58;
                                            bArr6 = bArr;
                                            str = str3;
                                            k6Var3 = k6Var5;
                                            i23 = i73;
                                            if (i62 == 2) {
                                                s5 s5Var3 = (s5) m5Var3;
                                                int d05 = k41.b.d0(bArr6, i25, dVar7);
                                                int i76 = dVar7.a;
                                                int i77 = d05 + i76;
                                                if (i77 > bArr6.length) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                int i78 = (i76 / 8) + s5Var3.t;
                                                int length = s5Var3.s.length;
                                                if (i78 <= length) {
                                                    i26 = d05;
                                                } else if (length != 0) {
                                                    while (length < i78) {
                                                        length = com.github.rudroid.copilot.h1.g(length, 3, 2, 1, 10);
                                                        d05 = d05;
                                                    }
                                                    i26 = d05;
                                                    s5Var3.s = Arrays.copyOf(s5Var3.s, length);
                                                } else {
                                                    i26 = d05;
                                                    s5Var3.s = new long[Math.max(i78, 10)];
                                                }
                                                q0 = i26;
                                                while (q0 < i77) {
                                                    s5Var3.e(k41.b.k0(q0, bArr6));
                                                    q0 += 8;
                                                }
                                                if (q0 != i77) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i47 = q0;
                                                i20 = i24;
                                                dVar6 = dVar7;
                                                i22 = i25;
                                                if (i47 == i22) {
                                                }
                                            } else {
                                                if (i62 == 1) {
                                                    i47 = i25 + 8;
                                                    s5 s5Var4 = (s5) m5Var3;
                                                    s5Var4.e(k41.b.k0(i25, bArr6));
                                                    while (i47 < i24) {
                                                        int d06 = k41.b.d0(bArr6, i47, dVar7);
                                                        if (i12 == dVar7.a) {
                                                            s5Var4.e(k41.b.k0(d06, bArr6));
                                                            i47 = d06 + 8;
                                                        } else {
                                                            i20 = i24;
                                                            dVar6 = dVar7;
                                                            i22 = i25;
                                                            if (i47 == i22) {
                                                            }
                                                        }
                                                    }
                                                    i20 = i24;
                                                    dVar6 = dVar7;
                                                    i22 = i25;
                                                    if (i47 == i22) {
                                                    }
                                                }
                                                i20 = i24;
                                                dVar6 = dVar7;
                                                i22 = i25;
                                                i47 = i22;
                                                if (i47 == i22) {
                                                }
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            i24 = i2;
                                            dVar7 = dVar;
                                            unsafe5 = unsafe8;
                                            i12 = i53;
                                            i25 = i58;
                                            bArr6 = bArr;
                                            str = str3;
                                            k6Var3 = k6Var5;
                                            i23 = i73;
                                            if (i62 == 2) {
                                                h5 h5Var = (h5) m5Var3;
                                                int d07 = k41.b.d0(bArr6, i25, dVar7);
                                                int i79 = dVar7.a;
                                                int i80 = d07 + i79;
                                                if (i80 > bArr6.length) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                int i81 = (i79 / 4) + h5Var.t;
                                                int length2 = h5Var.s.length;
                                                if (i81 <= length2) {
                                                    i27 = d07;
                                                } else if (length2 != 0) {
                                                    while (length2 < i81) {
                                                        length2 = com.github.rudroid.copilot.h1.g(length2, 3, 2, 1, 10);
                                                        d07 = d07;
                                                    }
                                                    i27 = d07;
                                                    h5Var.s = Arrays.copyOf(h5Var.s, length2);
                                                } else {
                                                    i27 = d07;
                                                    h5Var.s = new int[Math.max(i81, 10)];
                                                }
                                                int i82 = i27;
                                                while (i82 < i80) {
                                                    h5Var.e(k41.b.j0(i82, bArr6));
                                                    i82 += 4;
                                                }
                                                if (i82 != i80) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i47 = i82;
                                            } else {
                                                if (i62 == 5) {
                                                    i47 = i25 + 4;
                                                    h5 h5Var2 = (h5) m5Var3;
                                                    h5Var2.e(k41.b.j0(i25, bArr6));
                                                    while (i47 < i24) {
                                                        int d08 = k41.b.d0(bArr6, i47, dVar7);
                                                        if (i12 == dVar7.a) {
                                                            h5Var2.e(k41.b.j0(d08, bArr6));
                                                            i47 = d08 + 4;
                                                        }
                                                    }
                                                }
                                                i20 = i24;
                                                dVar6 = dVar7;
                                                i22 = i25;
                                                i47 = i22;
                                                if (i47 == i22) {
                                                }
                                            }
                                            i20 = i24;
                                            dVar6 = dVar7;
                                            i22 = i25;
                                            if (i47 == i22) {
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            i24 = i2;
                                            dVar7 = dVar;
                                            unsafe5 = unsafe8;
                                            i12 = i53;
                                            i25 = i58;
                                            bArr6 = bArr;
                                            str = str3;
                                            k6Var3 = k6Var5;
                                            i23 = i73;
                                            if (i62 != 2) {
                                                if (i62 == 0) {
                                                    if (m5Var3 != null) {
                                                        throw new ClassCastException();
                                                    }
                                                    k41.b.i0(bArr6, i25, dVar7);
                                                    throw null;
                                                }
                                                i20 = i24;
                                                dVar6 = dVar7;
                                                i22 = i25;
                                                i47 = i22;
                                                if (i47 == i22) {
                                                }
                                            } else {
                                                if (m5Var3 != null) {
                                                    throw new ClassCastException();
                                                }
                                                d0 = k41.b.d0(bArr6, i25, dVar7);
                                                int i83 = dVar7.a + d0;
                                                if (d0 < i83) {
                                                    k41.b.i0(bArr6, d0, dVar7);
                                                    throw null;
                                                }
                                                if (d0 != i83) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i47 = d0;
                                                i20 = i24;
                                                dVar6 = dVar7;
                                                i22 = i25;
                                                if (i47 == i22) {
                                                }
                                            }
                                            break;
                                        case 26:
                                            i24 = i2;
                                            dVar7 = dVar;
                                            unsafe5 = unsafe8;
                                            i12 = i53;
                                            i25 = i58;
                                            bArr6 = bArr;
                                            str = str3;
                                            i23 = i73;
                                            if (i62 != 2) {
                                                k6Var3 = k6Var5;
                                                i20 = i24;
                                                dVar6 = dVar7;
                                                i22 = i25;
                                                i47 = i22;
                                                if (i47 == i22) {
                                                }
                                            } else if ((j3 & 536870912) == 0) {
                                                int d09 = k41.b.d0(bArr6, i25, dVar7);
                                                int i84 = dVar7.a;
                                                if (i84 < 0) {
                                                    throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i84 == 0) {
                                                    m5Var3.add("");
                                                } else {
                                                    m5Var3.add(new String(bArr6, d09, i84, n5.a));
                                                    d09 += i84;
                                                }
                                                while (d09 < i24) {
                                                    int d010 = k41.b.d0(bArr6, d09, dVar7);
                                                    if (i12 == dVar7.a) {
                                                        d09 = k41.b.d0(bArr6, d010, dVar7);
                                                        int i85 = dVar7.a;
                                                        if (i85 < 0) {
                                                            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i85 == 0) {
                                                            m5Var3.add("");
                                                        } else {
                                                            m5Var3.add(new String(bArr6, d09, i85, n5.a));
                                                            d09 += i85;
                                                        }
                                                    } else {
                                                        i47 = d09;
                                                        i20 = i24;
                                                        k6Var3 = k6Var5;
                                                        i22 = i25;
                                                        dVar6 = dVar7;
                                                        if (i47 == i22) {
                                                        }
                                                    }
                                                }
                                                i47 = d09;
                                                i20 = i24;
                                                k6Var3 = k6Var5;
                                                i22 = i25;
                                                dVar6 = dVar7;
                                                if (i47 == i22) {
                                                }
                                            } else {
                                                d0 = k41.b.d0(bArr6, i25, dVar7);
                                                int i86 = dVar7.a;
                                                if (i86 < 0) {
                                                    throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i86 == 0) {
                                                    m5Var3.add("");
                                                    k6Var3 = k6Var5;
                                                } else {
                                                    int i87 = d0 + i86;
                                                    if (!q6.a(bArr6, d0, i87)) {
                                                        throw new zzmr("Protocol message had invalid UTF-8.");
                                                    }
                                                    k6Var3 = k6Var5;
                                                    m5Var3.add(new String(bArr6, d0, i86, n5.a));
                                                    d0 = i87;
                                                }
                                                while (d0 < i24) {
                                                    int d011 = k41.b.d0(bArr6, d0, dVar7);
                                                    if (i12 == dVar7.a) {
                                                        d0 = k41.b.d0(bArr6, d011, dVar7);
                                                        int i88 = dVar7.a;
                                                        if (i88 < 0) {
                                                            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i88 == 0) {
                                                            m5Var3.add("");
                                                        } else {
                                                            int i89 = d0 + i88;
                                                            if (!q6.a(bArr6, d0, i89)) {
                                                                throw new zzmr("Protocol message had invalid UTF-8.");
                                                            }
                                                            m5Var3.add(new String(bArr6, d0, i88, n5.a));
                                                            d0 = i89;
                                                        }
                                                    } else {
                                                        i47 = d0;
                                                        i20 = i24;
                                                        dVar6 = dVar7;
                                                        i22 = i25;
                                                        if (i47 == i22) {
                                                        }
                                                    }
                                                }
                                                i47 = d0;
                                                i20 = i24;
                                                dVar6 = dVar7;
                                                i22 = i25;
                                                if (i47 == i22) {
                                                }
                                            }
                                            break;
                                        case 27:
                                            unsafe5 = unsafe8;
                                            str = str3;
                                            if (i62 == 2) {
                                                i23 = i73;
                                                dVar7 = dVar;
                                                i47 = k41.b.r0(y(i23), i53, bArr, i58, i2, m5Var3, dVar7);
                                                i22 = i58;
                                                i12 = i53;
                                                bArr6 = bArr;
                                                i20 = i2;
                                                k6Var3 = k6Var5;
                                                dVar6 = dVar7;
                                                if (i47 == i22) {
                                                }
                                            } else {
                                                i25 = i58;
                                                i23 = i73;
                                                i12 = i53;
                                                bArr6 = bArr;
                                                i20 = i2;
                                                k6Var3 = k6Var5;
                                                dVar6 = dVar;
                                                i22 = i25;
                                                i47 = i22;
                                                if (i47 == i22) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            dVar8 = dVar;
                                            unsafe5 = unsafe8;
                                            i28 = i73;
                                            str = str3;
                                            if (i62 == 2) {
                                                int d012 = k41.b.d0(bArr, i58, dVar8);
                                                int i90 = dVar8.a;
                                                if (i90 < 0) {
                                                    throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i90 > bArr.length - d012) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i90 == 0) {
                                                    m5Var3.add(x4.t);
                                                } else {
                                                    m5Var3.add(x4.e(bArr, d012, i90));
                                                    d012 += i90;
                                                }
                                                while (d012 < i2) {
                                                    int d013 = k41.b.d0(bArr, d012, dVar8);
                                                    if (i53 == dVar8.a) {
                                                        d012 = k41.b.d0(bArr, d013, dVar8);
                                                        int i91 = dVar8.a;
                                                        if (i91 < 0) {
                                                            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i91 > bArr.length - d012) {
                                                            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i91 == 0) {
                                                            m5Var3.add(x4.t);
                                                        } else {
                                                            m5Var3.add(x4.e(bArr, d012, i91));
                                                            d012 += i91;
                                                        }
                                                    } else {
                                                        bArr6 = bArr;
                                                        i22 = i58;
                                                        i12 = i53;
                                                        i47 = d012;
                                                        i20 = i2;
                                                        i23 = i28;
                                                        k6Var3 = k6Var5;
                                                        dVar6 = dVar8;
                                                        if (i47 == i22) {
                                                        }
                                                    }
                                                }
                                                bArr6 = bArr;
                                                i22 = i58;
                                                i12 = i53;
                                                i47 = d012;
                                                i20 = i2;
                                                i23 = i28;
                                                k6Var3 = k6Var5;
                                                dVar6 = dVar8;
                                                if (i47 == i22) {
                                                }
                                            } else {
                                                bArr6 = bArr;
                                                i22 = i58;
                                                i12 = i53;
                                                i20 = i2;
                                                i23 = i28;
                                                k6Var3 = k6Var5;
                                                dVar6 = dVar8;
                                                i47 = i22;
                                                if (i47 == i22) {
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            byte[] bArr12 = bArr;
                                            i29 = i2;
                                            unsafe5 = unsafe8;
                                            if (i62 == 2) {
                                                int q02 = k41.b.q0(bArr12, i58, m5Var3, dVar);
                                                m5Var = m5Var3;
                                                i32 = i58;
                                                p0 = q02;
                                                i30 = i53;
                                            } else if (i62 == 0) {
                                                p0 = k41.b.p0(i53, bArr12, i58, i29, m5Var3, dVar);
                                                i30 = i53;
                                                bArr12 = bArr12;
                                                i32 = i58;
                                                m5Var = m5Var3;
                                                i29 = i29;
                                            } else {
                                                str = str3;
                                                i23 = i73;
                                                i12 = i53;
                                                k6Var3 = k6Var5;
                                                bArr6 = bArr12;
                                                dVar6 = dVar;
                                                i22 = i58;
                                                i20 = i29;
                                                i47 = i22;
                                                if (i47 == i22) {
                                                }
                                            }
                                            dVar8 = dVar;
                                            j5 z2 = z5Var2.z(i73);
                                            e5 e5Var2 = h6.a;
                                            if (z2 == null) {
                                                i28 = i73;
                                                i33 = p0;
                                                str = str3;
                                            } else if (m5Var != null) {
                                                int size2 = m5Var.size();
                                                int i92 = 0;
                                                int i93 = 0;
                                                k6 k6Var8 = null;
                                                while (i92 < size2) {
                                                    int i94 = p0;
                                                    Integer num = (Integer) m5Var.get(i92);
                                                    String str4 = str3;
                                                    int intValue = num.intValue();
                                                    if (z2.a(intValue)) {
                                                        if (i92 != i93) {
                                                            m5Var.set(i93, num);
                                                        }
                                                        i93++;
                                                        i35 = i73;
                                                        i34 = i92;
                                                    } else {
                                                        if (k6Var8 == null) {
                                                            e5Var.getClass();
                                                            g5 g5Var4 = (g5) obj2;
                                                            i34 = i92;
                                                            k6 k6Var9 = g5Var4.zzc;
                                                            if (k6Var9 == k6Var5) {
                                                                k6Var9 = k6.a();
                                                                g5Var4.zzc = k6Var9;
                                                            }
                                                            k6Var8 = k6Var9;
                                                        } else {
                                                            i34 = i92;
                                                        }
                                                        i35 = i73;
                                                        k6 k6Var10 = k6Var8;
                                                        k6Var10.d(i6 << 3, Long.valueOf(intValue));
                                                        k6Var8 = k6Var10;
                                                    }
                                                    i92 = i34 + 1;
                                                    p0 = i94;
                                                    str3 = str4;
                                                    i73 = i35;
                                                }
                                                i28 = i73;
                                                i33 = p0;
                                                str = str3;
                                                if (i93 != size2) {
                                                    m5Var.subList(i93, size2).clear();
                                                }
                                            } else {
                                                i28 = i73;
                                                i33 = p0;
                                                str = str3;
                                                Iterator it = m5Var.iterator();
                                                k6 k6Var11 = null;
                                                while (it.hasNext()) {
                                                    int intValue2 = ((Integer) it.next()).intValue();
                                                    if (!z2.a(intValue2)) {
                                                        if (k6Var11 == null) {
                                                            e5Var.getClass();
                                                            g5 g5Var5 = (g5) obj2;
                                                            k6 k6Var12 = g5Var5.zzc;
                                                            if (k6Var12 == k6Var5) {
                                                                k6Var12 = k6.a();
                                                                g5Var5.zzc = k6Var12;
                                                            }
                                                            k6Var11 = k6Var12;
                                                        }
                                                        k6Var11.d(i6 << 3, Long.valueOf(intValue2));
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            int i95 = i30;
                                            bArr6 = bArr12;
                                            i22 = i32;
                                            i12 = i95;
                                            i20 = i29;
                                            i47 = i33;
                                            i23 = i28;
                                            k6Var3 = k6Var5;
                                            dVar6 = dVar8;
                                            if (i47 == i22) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            bArr7 = bArr;
                                            i29 = i2;
                                            dVar9 = dVar;
                                            unsafe5 = unsafe8;
                                            i36 = i53;
                                            i37 = i58;
                                            if (i62 == 2) {
                                                h5 h5Var3 = (h5) m5Var3;
                                                d02 = k41.b.d0(bArr7, i37, dVar9);
                                                int i96 = dVar9.a + d02;
                                                while (d02 < i96) {
                                                    d02 = k41.b.d0(bArr7, d02, dVar9);
                                                    h5Var3.e(m71.a.n0(dVar9.a));
                                                }
                                                if (d02 != i96) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i62 == 0) {
                                                    h5 h5Var4 = (h5) m5Var3;
                                                    d02 = k41.b.d0(bArr7, i37, dVar9);
                                                    h5Var4.e(m71.a.n0(dVar9.a));
                                                    while (d02 < i29) {
                                                        int d014 = k41.b.d0(bArr7, d02, dVar9);
                                                        if (i36 == dVar9.a) {
                                                            d02 = k41.b.d0(bArr7, d014, dVar9);
                                                            h5Var4.e(m71.a.n0(dVar9.a));
                                                        }
                                                    }
                                                }
                                                bArr6 = bArr7;
                                                i22 = i37;
                                                str = str3;
                                                k6Var3 = k6Var5;
                                                i12 = i36;
                                                i23 = i73;
                                                dVar6 = dVar9;
                                                i20 = i29;
                                                i47 = i22;
                                                if (i47 == i22) {
                                                }
                                            }
                                            i47 = d02;
                                            str = str3;
                                            k6Var3 = k6Var5;
                                            i12 = i36;
                                            i23 = i73;
                                            bArr6 = bArr7;
                                            dVar6 = dVar9;
                                            i22 = i37;
                                            i20 = i29;
                                            if (i47 == i22) {
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            bArr7 = bArr;
                                            i29 = i2;
                                            dVar9 = dVar;
                                            Unsafe unsafe9 = unsafe8;
                                            i36 = i53;
                                            i37 = i58;
                                            if (i62 == 2) {
                                                s5 s5Var5 = (s5) m5Var3;
                                                d02 = k41.b.d0(bArr7, i37, dVar9);
                                                int i97 = dVar9.a + d02;
                                                while (d02 < i97) {
                                                    d02 = k41.b.i0(bArr7, d02, dVar9);
                                                    s5Var5.e(m71.a.o0(dVar9.b));
                                                    unsafe9 = unsafe9;
                                                }
                                                unsafe5 = unsafe9;
                                                if (d02 != i97) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                unsafe5 = unsafe9;
                                                if (i62 == 0) {
                                                    s5 s5Var6 = (s5) m5Var3;
                                                    d02 = k41.b.i0(bArr7, i37, dVar9);
                                                    s5Var6.e(m71.a.o0(dVar9.b));
                                                    while (d02 < i29) {
                                                        int d015 = k41.b.d0(bArr7, d02, dVar9);
                                                        if (i36 == dVar9.a) {
                                                            d02 = k41.b.i0(bArr7, d015, dVar9);
                                                            s5Var6.e(m71.a.o0(dVar9.b));
                                                        }
                                                    }
                                                }
                                                bArr6 = bArr7;
                                                i22 = i37;
                                                str = str3;
                                                k6Var3 = k6Var5;
                                                i12 = i36;
                                                i23 = i73;
                                                dVar6 = dVar9;
                                                i20 = i29;
                                                i47 = i22;
                                                if (i47 == i22) {
                                                }
                                            }
                                            i47 = d02;
                                            str = str3;
                                            k6Var3 = k6Var5;
                                            i12 = i36;
                                            i23 = i73;
                                            bArr6 = bArr7;
                                            dVar6 = dVar9;
                                            i22 = i37;
                                            i20 = i29;
                                            if (i47 == i22) {
                                            }
                                            break;
                                        default:
                                            if (i62 == 3) {
                                                int i98 = (i53 & (-8)) | 4;
                                                g6 y = z5Var2.y(i73);
                                                g5 c = y.c();
                                                byte[] bArr13 = bArr;
                                                i29 = i2;
                                                int i99 = i58;
                                                int o0 = k41.b.o0(c, y, bArr13, i99, i29, i98, dVar);
                                                int i100 = i98;
                                                androidx.glance.appwidget.protobuf.d dVar14 = dVar;
                                                y.i(c);
                                                dVar14.c = c;
                                                m5Var3.add(c);
                                                while (true) {
                                                    if (o0 < i29) {
                                                        int i101 = i99;
                                                        int d016 = k41.b.d0(bArr13, o0, dVar14);
                                                        if (i53 == dVar14.a) {
                                                            int i102 = i100;
                                                            g5 c2 = y.c();
                                                            o0 = k41.b.o0(c2, y, bArr13, d016, i29, i102, dVar);
                                                            byte[] bArr14 = bArr13;
                                                            g6 g6Var = y;
                                                            dVar14 = dVar;
                                                            g6Var.i(c2);
                                                            dVar14.c = c2;
                                                            m5Var3.add(c2);
                                                            bArr13 = bArr14;
                                                            i100 = i102;
                                                            y = g6Var;
                                                            i99 = i101;
                                                        } else {
                                                            i38 = i101;
                                                        }
                                                    } else {
                                                        i38 = i99;
                                                    }
                                                }
                                                bArr6 = bArr13;
                                                i22 = i38;
                                                str = str3;
                                                k6Var3 = k6Var5;
                                                i12 = i53;
                                                unsafe5 = unsafe8;
                                                i47 = o0;
                                                i23 = i73;
                                                dVar6 = dVar14;
                                                i20 = i29;
                                                if (i47 == i22) {
                                                }
                                            } else {
                                                i20 = i2;
                                                unsafe5 = unsafe8;
                                                i12 = i53;
                                                i22 = i58;
                                                bArr6 = bArr;
                                                str = str3;
                                                k6Var3 = k6Var5;
                                                dVar6 = dVar;
                                                i23 = i73;
                                                i47 = i22;
                                                if (i47 == i22) {
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    str = "Failed to parse the message.";
                                    i12 = i53;
                                    i39 = i73;
                                    unsafe = unsafe8;
                                    i40 = i58;
                                    byte[] bArr15 = bArr;
                                    k6Var4 = k6Var5;
                                    androidx.glance.appwidget.protobuf.d dVar15 = dVar;
                                    if (F != 50) {
                                        long j4 = iArr[i39 + 2] & 1048575;
                                        switch (F) {
                                            case 51:
                                                i9 = i39;
                                                k6Var = k6Var4;
                                                bArr2 = bArr;
                                                dVar2 = dVar;
                                                i43 = i40;
                                                str = str;
                                                i10 = i6;
                                                if (i62 == 1) {
                                                    i44 = i43 + 8;
                                                    unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(k41.b.k0(i43, bArr2))));
                                                    unsafe.putInt(obj2, j4, i10);
                                                    i47 = i44;
                                                    if (i47 != i43) {
                                                        i5 = i15;
                                                        i4 = i3;
                                                        i13 = i47;
                                                        break;
                                                    } else {
                                                        i50 = i15;
                                                        i46 = i2;
                                                        unsafe6 = unsafe;
                                                        i48 = i10;
                                                        bArr11 = bArr2;
                                                        i52 = i74;
                                                        i54 = 1048575;
                                                        z5Var2 = this;
                                                        dVar13 = dVar2;
                                                        obj7 = obj2;
                                                        i53 = i12;
                                                        i49 = i9;
                                                    }
                                                }
                                                i47 = i43;
                                                if (i47 != i43) {
                                                }
                                            case 52:
                                                i9 = i39;
                                                k6Var = k6Var4;
                                                bArr2 = bArr;
                                                dVar2 = dVar;
                                                i43 = i40;
                                                str = str;
                                                i10 = i6;
                                                if (i62 == 5) {
                                                    i44 = i43 + 4;
                                                    unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(k41.b.j0(i43, bArr2))));
                                                    unsafe.putInt(obj2, j4, i10);
                                                    i47 = i44;
                                                    if (i47 != i43) {
                                                    }
                                                }
                                                i47 = i43;
                                                if (i47 != i43) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                i9 = i39;
                                                k6Var = k6Var4;
                                                bArr2 = bArr;
                                                dVar2 = dVar;
                                                i43 = i40;
                                                str = str;
                                                i10 = i6;
                                                if (i62 == 0) {
                                                    i44 = k41.b.i0(bArr2, i43, dVar2);
                                                    unsafe.putObject(obj2, j2, Long.valueOf(dVar2.b));
                                                    unsafe.putInt(obj2, j4, i10);
                                                    i47 = i44;
                                                    if (i47 != i43) {
                                                    }
                                                }
                                                i47 = i43;
                                                if (i47 != i43) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                i9 = i39;
                                                k6Var = k6Var4;
                                                bArr2 = bArr;
                                                dVar2 = dVar;
                                                i43 = i40;
                                                str = str;
                                                i10 = i6;
                                                if (i62 == 0) {
                                                    i44 = k41.b.d0(bArr2, i43, dVar2);
                                                    unsafe.putObject(obj2, j2, Integer.valueOf(dVar2.a));
                                                    unsafe.putInt(obj2, j4, i10);
                                                    i47 = i44;
                                                    if (i47 != i43) {
                                                    }
                                                }
                                                i47 = i43;
                                                if (i47 != i43) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                i9 = i39;
                                                k6Var = k6Var4;
                                                bArr2 = bArr;
                                                dVar2 = dVar;
                                                i43 = i40;
                                                str = str;
                                                i10 = i6;
                                                if (i62 == 1) {
                                                    i44 = i43 + 8;
                                                    unsafe.putObject(obj2, j2, Long.valueOf(k41.b.k0(i43, bArr2)));
                                                    unsafe.putInt(obj2, j4, i10);
                                                    i47 = i44;
                                                    if (i47 != i43) {
                                                    }
                                                }
                                                i47 = i43;
                                                if (i47 != i43) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                i9 = i39;
                                                k6Var = k6Var4;
                                                bArr2 = bArr;
                                                dVar2 = dVar;
                                                i43 = i40;
                                                str = str;
                                                i10 = i6;
                                                if (i62 == 5) {
                                                    i44 = i43 + 4;
                                                    unsafe.putObject(obj2, j2, Integer.valueOf(k41.b.j0(i43, bArr2)));
                                                    unsafe.putInt(obj2, j4, i10);
                                                    i47 = i44;
                                                    if (i47 != i43) {
                                                    }
                                                }
                                                i47 = i43;
                                                if (i47 != i43) {
                                                }
                                                break;
                                            case 58:
                                                i9 = i39;
                                                k6Var = k6Var4;
                                                bArr2 = bArr;
                                                dVar2 = dVar;
                                                i43 = i40;
                                                str = str;
                                                i10 = i6;
                                                if (i62 == 0) {
                                                    i44 = k41.b.i0(bArr2, i43, dVar2);
                                                    unsafe.putObject(obj2, j2, Boolean.valueOf(dVar2.b != 0));
                                                    unsafe.putInt(obj2, j4, i10);
                                                    i47 = i44;
                                                    if (i47 != i43) {
                                                    }
                                                }
                                                i47 = i43;
                                                if (i47 != i43) {
                                                }
                                                break;
                                            case 59:
                                                i43 = i40;
                                                i10 = i6;
                                                i9 = i39;
                                                k6Var = k6Var4;
                                                bArr2 = bArr;
                                                dVar2 = dVar;
                                                str = str;
                                                if (i62 == 2) {
                                                    int d017 = k41.b.d0(bArr2, i43, dVar2);
                                                    int i103 = dVar2.a;
                                                    if (i103 == 0) {
                                                        unsafe.putObject(obj2, j2, "");
                                                    } else {
                                                        int i104 = d017 + i103;
                                                        if ((i63 & 536870912) != 0 && !q6.a(bArr2, d017, i104)) {
                                                            throw new zzmr("Protocol message had invalid UTF-8.");
                                                        }
                                                        unsafe.putObject(obj2, j2, new String(bArr2, d017, i103, n5.a));
                                                        d017 = i104;
                                                    }
                                                    unsafe.putInt(obj2, j4, i10);
                                                    i47 = d017;
                                                    if (i47 != i43) {
                                                    }
                                                }
                                                i47 = i43;
                                                if (i47 != i43) {
                                                }
                                                break;
                                            case 60:
                                                i43 = i40;
                                                i10 = i6;
                                                if (i62 == 2) {
                                                    Object C = C(i10, obj2, i39);
                                                    int n0 = k41.b.n0(C, y(i39), bArr, i43, i2, dVar);
                                                    bArr2 = bArr;
                                                    D(obj2, i10, C, i39);
                                                    i9 = i39;
                                                    k6Var = k6Var4;
                                                    i43 = i43;
                                                    str = str;
                                                    i47 = n0;
                                                    dVar2 = dVar;
                                                    if (i47 != i43) {
                                                    }
                                                } else {
                                                    bArr2 = bArr;
                                                    i9 = i39;
                                                    k6Var = k6Var4;
                                                    dVar2 = dVar;
                                                    str = str;
                                                    i47 = i43;
                                                    if (i47 != i43) {
                                                    }
                                                }
                                                break;
                                            case 61:
                                                bArr10 = bArr;
                                                dVar12 = dVar;
                                                i43 = i40;
                                                i10 = i6;
                                                if (i62 == 2) {
                                                    int m0 = k41.b.m0(bArr10, i43, dVar12);
                                                    unsafe.putObject(obj2, j2, dVar12.c);
                                                    unsafe.putInt(obj2, j4, i10);
                                                    i9 = i39;
                                                    k6Var = k6Var4;
                                                    i47 = m0;
                                                    dVar2 = dVar12;
                                                    str = str;
                                                    bArr2 = bArr10;
                                                    if (i47 != i43) {
                                                    }
                                                }
                                                i9 = i39;
                                                k6Var = k6Var4;
                                                dVar2 = dVar12;
                                                str = str;
                                                bArr2 = bArr10;
                                                i47 = i43;
                                                if (i47 != i43) {
                                                }
                                                break;
                                            case 63:
                                                bArr10 = bArr;
                                                dVar12 = dVar;
                                                i43 = i40;
                                                i10 = i6;
                                                if (i62 == 0) {
                                                    int d018 = k41.b.d0(bArr10, i43, dVar12);
                                                    int i105 = dVar12.a;
                                                    i45 = d018;
                                                    j5 z3 = z(i39);
                                                    if (z3 == null || z3.a(i105)) {
                                                        unsafe.putObject(obj2, j2, Integer.valueOf(i105));
                                                        unsafe.putInt(obj2, j4, i10);
                                                    } else {
                                                        g5 g5Var6 = (g5) obj2;
                                                        k6 k6Var13 = g5Var6.zzc;
                                                        if (k6Var13 == k6Var4) {
                                                            k6Var13 = k6.a();
                                                            g5Var6.zzc = k6Var13;
                                                        }
                                                        k6Var13.d(i12, Long.valueOf(i105));
                                                        k6Var4 = k6Var4;
                                                    }
                                                    k6 k6Var14 = k6Var4;
                                                    i9 = i39;
                                                    k6Var = k6Var14;
                                                    dVar2 = dVar12;
                                                    str = str;
                                                    i47 = i45;
                                                    bArr2 = bArr10;
                                                    if (i47 != i43) {
                                                    }
                                                }
                                                i9 = i39;
                                                k6Var = k6Var4;
                                                dVar2 = dVar12;
                                                str = str;
                                                bArr2 = bArr10;
                                                i47 = i43;
                                                if (i47 != i43) {
                                                }
                                                break;
                                            case 66:
                                                bArr10 = bArr;
                                                dVar12 = dVar;
                                                i43 = i40;
                                                i10 = i6;
                                                if (i62 == 0) {
                                                    int d019 = k41.b.d0(bArr10, i43, dVar12);
                                                    unsafe.putObject(obj2, j2, Integer.valueOf(m71.a.n0(dVar12.a)));
                                                    unsafe.putInt(obj2, j4, i10);
                                                    i9 = i39;
                                                    k6Var = k6Var4;
                                                    i47 = d019;
                                                    dVar2 = dVar12;
                                                    str = str;
                                                    bArr2 = bArr10;
                                                    if (i47 != i43) {
                                                    }
                                                }
                                                i9 = i39;
                                                k6Var = k6Var4;
                                                dVar2 = dVar12;
                                                str = str;
                                                bArr2 = bArr10;
                                                i47 = i43;
                                                if (i47 != i43) {
                                                }
                                                break;
                                            case 67:
                                                bArr10 = bArr;
                                                dVar12 = dVar;
                                                i43 = i40;
                                                i10 = i6;
                                                if (i62 == 0) {
                                                    i45 = k41.b.i0(bArr10, i43, dVar12);
                                                    unsafe.putObject(obj2, j2, Long.valueOf(m71.a.o0(dVar12.b)));
                                                    unsafe.putInt(obj2, j4, i10);
                                                    k6 k6Var142 = k6Var4;
                                                    i9 = i39;
                                                    k6Var = k6Var142;
                                                    dVar2 = dVar12;
                                                    str = str;
                                                    i47 = i45;
                                                    bArr2 = bArr10;
                                                    if (i47 != i43) {
                                                    }
                                                }
                                                i9 = i39;
                                                k6Var = k6Var4;
                                                dVar2 = dVar12;
                                                str = str;
                                                bArr2 = bArr10;
                                                i47 = i43;
                                                if (i47 != i43) {
                                                }
                                                break;
                                            case 68:
                                                if (i62 == 3) {
                                                    Object C2 = C(i6, obj2, i39);
                                                    int o02 = k41.b.o0(C2, y(i39), bArr, i40, i2, (i12 & (-8)) | 4, dVar);
                                                    bArr10 = bArr;
                                                    i43 = i40;
                                                    D(obj2, i6, C2, i39);
                                                    i9 = i39;
                                                    k6Var = k6Var4;
                                                    i47 = o02;
                                                    dVar2 = dVar;
                                                    str = str;
                                                    i10 = i6;
                                                    bArr2 = bArr10;
                                                    if (i47 != i43) {
                                                    }
                                                }
                                                break;
                                            default:
                                                i9 = i39;
                                                k6Var = k6Var4;
                                                bArr2 = bArr;
                                                dVar2 = dVar;
                                                i43 = i40;
                                                str = str;
                                                i10 = i6;
                                                i47 = i43;
                                                if (i47 != i43) {
                                                }
                                                break;
                                        }
                                    } else if (i62 == 2) {
                                        int i106 = i39 / 3;
                                        Object obj14 = objArr[i106 + i106];
                                        Object object = unsafe.getObject(obj2, j2);
                                        if (!((v5) object).r) {
                                            v5 a = v5.s.a();
                                            e5.c(a, object);
                                            unsafe.putObject(obj2, j2, a);
                                            object = a;
                                        }
                                        t tVar = ((u5) obj14).a;
                                        v5 v5Var = (v5) object;
                                        int d020 = k41.b.d0(bArr15, i40, dVar15);
                                        int i107 = dVar15.a;
                                        if (i107 >= 0 && i107 <= i2 - d020) {
                                            int i108 = d020 + i107;
                                            Object obj15 = "";
                                            Object obj16 = obj15;
                                            while (d020 < i108) {
                                                int i109 = d020 + 1;
                                                int i110 = bArr15[d020];
                                                if (i110 < 0) {
                                                    i109 = k41.b.g0(i110, bArr15, i109, dVar15);
                                                    i110 = dVar15.a;
                                                }
                                                int i111 = i110 >>> 3;
                                                int i112 = i110 & 7;
                                                Object obj17 = obj15;
                                                if (i111 == 1) {
                                                    androidx.glance.appwidget.protobuf.d dVar16 = dVar15;
                                                    obj6 = obj17;
                                                    r6 r6Var = (r6) tVar.a;
                                                    Object obj18 = obj16;
                                                    if (i112 == r6Var.s) {
                                                        int s = s(bArr, i109, i2, r6Var, null, dVar16);
                                                        dVar15 = dVar16;
                                                        obj15 = dVar16.c;
                                                        d020 = s;
                                                        bArr15 = bArr;
                                                        obj16 = obj18;
                                                    } else {
                                                        bArr9 = bArr;
                                                        dVar11 = dVar16;
                                                        obj5 = obj18;
                                                        i42 = i2;
                                                    }
                                                } else if (i111 != 2) {
                                                    i42 = i2;
                                                    obj5 = obj16;
                                                    dVar11 = dVar15;
                                                    obj6 = obj17;
                                                    bArr9 = bArr;
                                                } else {
                                                    r6 r6Var2 = (r6) tVar.b;
                                                    if (i112 == r6Var2.s) {
                                                        androidx.glance.appwidget.protobuf.d dVar17 = dVar15;
                                                        int s2 = s(bArr, i109, i2, r6Var2, "".getClass(), dVar17);
                                                        obj16 = dVar17.c;
                                                        d020 = s2;
                                                        obj15 = obj17;
                                                        bArr15 = bArr;
                                                        dVar15 = dVar17;
                                                    } else {
                                                        androidx.glance.appwidget.protobuf.d dVar18 = dVar15;
                                                        obj6 = obj17;
                                                        obj5 = obj16;
                                                        dVar11 = dVar18;
                                                        bArr9 = bArr;
                                                        i42 = i2;
                                                    }
                                                }
                                                d020 = k41.b.t0(i110, bArr9, i109, i42, dVar11);
                                                byte[] bArr16 = bArr9;
                                                obj16 = obj5;
                                                bArr15 = bArr16;
                                                Object obj19 = obj6;
                                                dVar15 = dVar11;
                                                obj15 = obj19;
                                            }
                                            Object obj20 = obj16;
                                            byte[] bArr17 = bArr15;
                                            androidx.glance.appwidget.protobuf.d dVar19 = dVar15;
                                            Object obj21 = obj15;
                                            if (d020 != i108) {
                                                throw new zzmr(str);
                                            }
                                            v5Var.put(obj21, obj20);
                                            if (i108 != i40) {
                                                z5Var2 = this;
                                                unsafe6 = unsafe;
                                                i46 = i2;
                                                obj7 = obj2;
                                                i48 = i6;
                                                i54 = 1048575;
                                                dVar13 = dVar19;
                                                bArr11 = bArr17;
                                                i53 = i12;
                                                i49 = i39;
                                                i47 = i108;
                                                i52 = i74;
                                            } else {
                                                i9 = i39;
                                                k6Var = k6Var4;
                                                i5 = i15;
                                                i4 = i3;
                                                dVar2 = dVar19;
                                                bArr2 = bArr17;
                                                i13 = i108;
                                                i10 = i6;
                                            }
                                        }
                                    } else {
                                        bArr8 = bArr15;
                                        dVar10 = dVar15;
                                        str2 = str;
                                        k6 k6Var15 = k6Var4;
                                        i9 = i39;
                                        k6Var = k6Var15;
                                        i5 = i15;
                                        dVar2 = dVar10;
                                        bArr2 = bArr8;
                                        str = str2;
                                        i52 = i74;
                                        i4 = i3;
                                        i13 = i40;
                                        i10 = i6;
                                    }
                                    i52 = i74;
                                }
                                i50 = i15;
                            } else if (i62 == 2) {
                                m5 m5Var4 = (m5) unsafe8.getObject(obj13, j2);
                                if (!((t4) m5Var4).r) {
                                    int size3 = m5Var4.size();
                                    m5Var4 = m5Var4.E(size3 == 0 ? 10 : size3 + size3);
                                    unsafe8.putObject(obj13, j2, m5Var4);
                                }
                                m5 m5Var5 = m5Var4;
                                bArr11 = bArr;
                                i46 = i2;
                                i47 = k41.b.r0(z5Var2.y(i73), i53, bArr11, i58, i46, m5Var5, dVar);
                                i50 = i15;
                                dVar13 = dVar;
                                i49 = i73;
                                obj7 = obj;
                                i48 = i6;
                                i52 = i74;
                                i54 = 1048575;
                                i53 = i53;
                                unsafe6 = unsafe8;
                            } else {
                                obj2 = obj13;
                                bArr8 = bArr;
                                dVar10 = dVar;
                                i39 = i73;
                                unsafe = unsafe8;
                                k6Var4 = k6Var5;
                                i40 = i58;
                                str2 = "Failed to parse the message.";
                                i12 = i53;
                                k6 k6Var152 = k6Var4;
                                i9 = i39;
                                k6Var = k6Var152;
                                i5 = i15;
                                dVar2 = dVar10;
                                bArr2 = bArr8;
                                str = str2;
                                i52 = i74;
                                i4 = i3;
                                i13 = i40;
                                i10 = i6;
                            }
                            if (i12 != i4) {
                            }
                            g5 g5Var22222222222222 = (g5) obj2;
                            k6Var2 = g5Var22222222222222.zzc;
                            if (k6Var2 == k6Var) {
                            }
                            int i6822222222222222 = i12;
                            int s022222222222222 = k41.b.s0(i6822222222222222, bArr2, i13, i2, k6Var2, dVar2);
                            dVar13 = dVar;
                            i46 = i2;
                            i50 = i5;
                            obj7 = obj2;
                            i49 = i9;
                            i54 = 1048575;
                            i48 = i10;
                            i53 = i6822222222222222;
                            i47 = s022222222222222;
                            z5Var2 = this;
                            bArr11 = bArr;
                            unsafe6 = unsafe;
                        }
                    }
                    i4 = i3;
                    if (i12 != i4) {
                    }
                    g5 g5Var222222222222222 = (g5) obj2;
                    k6Var2 = g5Var222222222222222.zzc;
                    if (k6Var2 == k6Var) {
                    }
                    int i68222222222222222 = i12;
                    int s0222222222222222 = k41.b.s0(i68222222222222222, bArr2, i13, i2, k6Var2, dVar2);
                    dVar13 = dVar;
                    i46 = i2;
                    i50 = i5;
                    obj7 = obj2;
                    i49 = i9;
                    i54 = 1048575;
                    i48 = i10;
                    i53 = i68222222222222222;
                    i47 = s0222222222222222;
                    z5Var2 = this;
                    bArr11 = bArr;
                    unsafe6 = unsafe;
                } else {
                    z5Var = z5Var2;
                    unsafe = unsafe6;
                    str = "Failed to parse the message.";
                    int i113 = i50;
                    k6Var = k6Var5;
                    objArr = objArr2;
                    i4 = i3;
                    i5 = i113;
                }
            }
            unsafe6 = unsafe3;
            bArr11 = bArr4;
            dVar13 = dVar4;
            i48 = i6;
            i53 = i18;
        }
        throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void w(int i, Object obj, Object obj2) {
        if (o(i, obj2)) {
            int E = E(i) & 1048575;
            Unsafe unsafe = k;
            long j2 = E;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                int i2 = this.a[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            g6 y = y(i);
            if (!o(i, obj)) {
                if (a(object)) {
                    g5 c = y.c();
                    y.d(c, object);
                    unsafe.putObject(obj, j2, c);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                p(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!a(object2)) {
                g5 c2 = y.c();
                y.d(c2, object2);
                unsafe.putObject(obj, j2, c2);
                object2 = c2;
            }
            y.d(object2, object);
        }
    }

    public final void x(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(i2, obj2, i)) {
            int E = E(i) & 1048575;
            Unsafe unsafe = k;
            long j2 = E;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                int i3 = iArr[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            g6 y = y(i);
            if (!q(i2, obj, i)) {
                if (a(object)) {
                    g5 c = y.c();
                    y.d(c, object);
                    unsafe.putObject(obj, j2, c);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                p6.g(i2, iArr[i + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!a(object2)) {
                g5 c2 = y.c();
                y.d(c2, object2);
                unsafe.putObject(obj, j2, c2);
                object2 = c2;
            }
            y.d(object2, object);
        }
    }

    public final g6 y(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        g6 g6Var = (g6) objArr[i3];
        if (g6Var != null) {
            return g6Var;
        }
        g6 a = d6.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final j5 z(int i) {
        int i2 = i / 3;
        return (j5) this.b[i2 + i2 + 1];
    }




































    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class Unsafe {
        public Unsafe() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class b {
        public b() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class h {
        public h() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class k {
        public k() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class n {
        public n() {
        }
    }
}
