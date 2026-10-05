package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i2 implements o2 {
    public static final int[] j = new int[0];
    public static final Unsafe k = v2.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final g1 e;
    public final int[] f;
    public final int g;
    public final int h;
    public final r1 i;

    public i2(int[] iArr, Object[] objArr, int i, int i2, g1 g1Var, int[] iArr2, int i3, int i4, r1 r1Var, r1 r1Var2) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = r1Var;
        this.e = g1Var;
    }

    public static Field E(Class cls, String str) {
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
            StringBuilder o = a0.s0.o("Field ", str, " for ", name, " not found. Known fields are ");
            o.append(arrays);
            throw new RuntimeException(o.toString(), e);
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof t1) {
            return ((t1) obj).h();
        }
        return true;
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
    public static i2 u(n2 n2Var, r1 r1Var, r1 r1Var2) {
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
        Field E;
        char charAt10;
        int i27;
        int i28;
        int i29;
        int i30;
        Object obj;
        Field E2;
        Object obj2;
        Field E3;
        int i32;
        char charAt11;
        int i33;
        char charAt12;
        int i34;
        char charAt13;
        int i35;
        char charAt14;
        if (!(n2Var instanceof n2)) {
            n2Var.getClass();
            throw new ClassCastException();
        }
        String str = n2Var.b;
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
        Object[] objArr2 = n2Var.c;
        Class<?> cls2 = n2Var.a.getClass();
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
                        if (n2Var.a() == 1 || i86 != 0) {
                            i29 = i6 + 1;
                            int i95 = i76 / 3;
                            objArr3[i95 + i95 + 1] = objArr4[i6];
                        } else {
                            i30 = 0;
                            int i96 = i93 + i93;
                            i86 = i30;
                            obj = objArr4[i96];
                            if (obj instanceof Field) {
                                E2 = (Field) obj;
                            } else {
                                E2 = E(cls2, (String) obj);
                                objArr4[i96] = E2;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(E2);
                            int i97 = i96 + 1;
                            obj2 = objArr4[i97];
                            if (obj2 instanceof Field) {
                                E3 = (Field) obj2;
                            } else {
                                E3 = E(cls2, (String) obj2);
                                objArr4[i97] = E3;
                            }
                            i23 = i91;
                            i26 = objectFieldOffset2;
                            i22 = 55296;
                            objArr = objArr3;
                            i19 = i2;
                            cls = cls2;
                            i25 = 0;
                            i20 = (int) unsafe.objectFieldOffset(E3);
                        }
                    }
                    i30 = i86;
                    int i962 = i93 + i93;
                    i86 = i30;
                    obj = objArr4[i962];
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(E2);
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
                    i20 = (int) unsafe.objectFieldOffset(E3);
                }
                i6 = i29;
                i30 = i86;
                int i9622 = i93 + i93;
                i86 = i30;
                obj = objArr4[i9622];
                if (obj instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(E2);
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
                i20 = (int) unsafe.objectFieldOffset(E3);
            } else {
                int i98 = i6 + 1;
                Field E4 = E(cls2, (String) objArr4[i6]);
                objArr = objArr3;
                if (i84 == 9 || i84 == 17) {
                    i19 = i2;
                    int i99 = i76 / 3;
                    objArr[i99 + i99 + 1] = E4.getType();
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
                            if (n2Var.a() == 1 || i86 != 0) {
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
                        objectFieldOffset = (int) unsafe.objectFieldOffset(E4);
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
                                E = (Field) obj3;
                            } else {
                                E = E(cls, (String) obj3);
                                objArr4[i108] = E;
                            }
                            i24 = charAt26 % 32;
                            i20 = (int) unsafe.objectFieldOffset(E);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(E4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(E4);
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
        return new i2(iArr2, objArr3, i3, i5, n2Var.a, iArr, i7, i70, r1Var, r1Var2);
    }

    public static int v(long j2, Object obj) {
        return ((Integer) v2.h(j2, obj)).intValue();
    }

    public static int x(int i) {
        return (i >>> 20) & 255;
    }

    public static long z(long j2, Object obj) {
        return ((Long) v2.h(j2, obj)).longValue();
    }

    public final v1 A(int i) {
        int i2 = i / 3;
        return (v1) this.b[i2 + i2 + 1];
    }

    public final o2 B(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        o2 o2Var = (o2) objArr[i3];
        if (o2Var != null) {
            return o2Var;
        }
        o2 a = l2.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final Object C(int i, Object obj) {
        o2 B = B(i);
        int y = y(i) & 1048575;
        if (!p(i, obj)) {
            return B.a();
        }
        Object object = k.getObject(obj, y);
        if (r(object)) {
            return object;
        }
        t1 a = B.a();
        if (object != null) {
            B.h(a, object);
        }
        return a;
    }

    public final Object D(int i, Object obj, int i2) {
        o2 B = B(i2);
        if (!s(i, obj, i2)) {
            return B.a();
        }
        Object object = k.getObject(obj, y(i2) & 1048575);
        if (r(object)) {
            return object;
        }
        t1 a = B.a();
        if (object != null) {
            B.h(a, object);
        }
        return a;
    }

    @Override // com.google.android.gms.internal.play_billing.o2
    public final t1 a() {
        return ((t1) this.e).n();
    }

    @Override // com.google.android.gms.internal.play_billing.o2
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
            int y = y(i7);
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
            if ((268435456 & y) == 0 || q(obj, i2, i, i3, i12)) {
                int x = x(y);
                if (x == 9 || x == 17) {
                    if (q(obj, i2, i, i3, i12) && !B(i2).b(v2.h(y & 1048575, obj))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (x != 27) {
                        if (x == 60 || x == 68) {
                            if (s(i8, obj, i2) && !B(i2).b(v2.h(y & 1048575, obj))) {
                            }
                        } else if (x != 49) {
                            if (x == 50 && !((d2) v2.h(y & 1048575, obj)).isEmpty()) {
                                int i14 = i2 / 3;
                                throw a0.s0.d(this.b[i14 + i14]);
                            }
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) v2.h(y & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        o2 B = B(i2);
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            if (B.b(list.get(i15))) {
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

    @Override // com.google.android.gms.internal.play_billing.o2
    public final void c(Object obj) {
        if (!r(obj)) {
            return;
        }
        if (obj instanceof t1) {
            t1 t1Var = (t1) obj;
            t1Var.g();
            t1Var.zza = 0;
            t1Var.e();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.i.getClass();
                q2 q2Var = ((t1) obj).zzc;
                if (q2Var.e) {
                    q2Var.e = false;
                    return;
                }
                return;
            }
            int y = y(i);
            int i2 = 1048575 & y;
            int x = x(y);
            long j2 = i2;
            if (x != 9) {
                if (x != 60 && x != 68) {
                    switch (x) {
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
                            h1 h1Var = (h1) ((x1) v2.h(j2, obj));
                            if (!h1Var.r) {
                                break;
                            } else {
                                h1Var.r = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = k;
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((d2) object).r = false;
                                unsafe.putObject(obj, j2, object);
                                break;
                            }
                    }
                } else if (s(iArr[i], obj, i)) {
                    B(i).c(k.getObject(obj, j2));
                }
                i += 3;
            }
            if (p(i, obj)) {
                B(i).c(k.getObject(obj, j2));
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o2
    public final int d(g1 g1Var) {
        int i;
        int z0;
        int A0;
        int i2;
        int i3;
        int c;
        int z02;
        int size;
        int o;
        int z03;
        int z04;
        int z05;
        int i4;
        int z06;
        int A02;
        i2 i2Var = this;
        g1 g1Var2 = g1Var;
        Unsafe unsafe = k;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = i2Var.a;
            if (i7 >= iArr.length) {
                return ((t1) g1Var).zzc.a() + i9;
            }
            int y = i2Var.y(i7);
            int x = x(y);
            int i10 = iArr[i7];
            int i12 = iArr[i7 + 2];
            int i13 = i12 & i5;
            if (x <= 17) {
                if (i13 != i6) {
                    i8 = i13 == i5 ? 0 : unsafe.getInt(g1Var2, i13);
                    i6 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = 0;
            }
            int i14 = y & i5;
            if (x >= q1.s.r) {
                q1.t.getClass();
            }
            long j2 = i14;
            switch (x) {
                case 0:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.D(i10 << 3, 8, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 1:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.D(i10 << 3, 4, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 2:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        long j3 = unsafe.getLong(g1Var2, j2);
                        z0 = m1.z0(i10 << 3);
                        A0 = m1.A0(j3);
                        i2 = A0 + z0;
                        i9 += i2;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                case 3:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        long j4 = unsafe.getLong(g1Var2, j2);
                        z0 = m1.z0(i10 << 3);
                        A0 = m1.A0(j4);
                        i2 = A0 + z0;
                        i9 += i2;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                case 4:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        long j5 = unsafe.getInt(g1Var2, j2);
                        z0 = m1.z0(i10 << 3);
                        A0 = m1.A0(j5);
                        i2 = A0 + z0;
                        i9 += i2;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                case 5:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.D(i10 << 3, 8, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 6:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.D(i10 << 3, 4, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 7:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.D(i10 << 3, 1, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 8:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        int i15 = i10 << 3;
                        Object object = unsafe.getObject(g1Var2, j2);
                        if (object instanceof k1) {
                            int z07 = m1.z0(i15);
                            int e = ((k1) object).e();
                            i9 = com.github.rudroid.copilot.h1.E(e, e, z07, i9);
                        } else {
                            int z08 = m1.z0(i15);
                            int b = w2.b((String) object);
                            i9 = com.github.rudroid.copilot.h1.E(b, b, z08, i9);
                        }
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 9:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(g1Var2, j2);
                        o2 B = i2Var.B(i7);
                        r1 r1Var = p2.a;
                        int z09 = m1.z0(i10 << 3);
                        int c2 = ((g1) object2).c(B);
                        i9 = com.github.rudroid.copilot.h1.E(c2, c2, z09, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 10:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        k1 k1Var = (k1) unsafe.getObject(g1Var2, j2);
                        int z010 = m1.z0(i10 << 3);
                        int e2 = k1Var.e();
                        i9 = com.github.rudroid.copilot.h1.E(e2, e2, z010, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 11:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.D(unsafe.getInt(g1Var2, j2), m1.z0(i10 << 3), i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 12:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        long j6 = unsafe.getInt(g1Var2, j2);
                        z0 = m1.z0(i10 << 3);
                        A0 = m1.A0(j6);
                        i2 = A0 + z0;
                        i9 += i2;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                case 13:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.D(i10 << 3, 4, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 14:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        i9 = com.github.rudroid.copilot.h1.D(i10 << 3, 8, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 15:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        int i16 = unsafe.getInt(g1Var2, j2);
                        i9 = com.github.rudroid.copilot.h1.D((i16 >> 31) ^ (i16 + i16), m1.z0(i10 << 3), i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 16:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        long j7 = unsafe.getLong(g1Var2, j2);
                        z0 = m1.z0(i10 << 3);
                        A0 = m1.A0((j7 >> 63) ^ (j7 + j7));
                        i2 = A0 + z0;
                        i9 += i2;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                case 17:
                    if (i2Var.q(g1Var2, i7, i6, i8, i)) {
                        g1 g1Var3 = (g1) unsafe.getObject(g1Var2, j2);
                        o2 B2 = i2Var.B(i7);
                        r1 r1Var2 = p2.a;
                        int z011 = m1.z0(i10 << 3);
                        i3 = z011 + z011;
                        c = g1Var3.c(B2);
                        i2 = c + i3;
                        i9 += i2;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                case 18:
                    i2 = p2.i(i10, (List) unsafe.getObject(g1Var2, j2));
                    i9 += i2;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 19:
                    i2 = p2.h(i10, (List) unsafe.getObject(g1Var2, j2));
                    i9 += i2;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var3 = p2.a;
                    if (list.size() != 0) {
                        z02 = (m1.z0(i10 << 3) * list.size()) + p2.k(list);
                        i9 += z02;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                    z02 = 0;
                    i9 += z02;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var4 = p2.a;
                    size = list2.size();
                    if (size != 0) {
                        o = p2.o(list2);
                        z03 = m1.z0(i10 << 3);
                        z04 = (z03 * size) + o;
                        i9 += z04;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                    z04 = 0;
                    i9 += z04;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var5 = p2.a;
                    size = list3.size();
                    if (size != 0) {
                        o = p2.j(list3);
                        z03 = m1.z0(i10 << 3);
                        z04 = (z03 * size) + o;
                        i9 += z04;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                    z04 = 0;
                    i9 += z04;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 23:
                    i2 = p2.i(i10, (List) unsafe.getObject(g1Var2, j2));
                    i9 += i2;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 24:
                    i2 = p2.h(i10, (List) unsafe.getObject(g1Var2, j2));
                    i9 += i2;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var6 = p2.a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        z02 = (m1.z0(i10 << 3) + 1) * size2;
                        i9 += z02;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                    z02 = 0;
                    i9 += z02;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var7 = p2.a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        z04 = m1.z0(i10 << 3) * size3;
                        for (int i17 = 0; i17 < size3; i17++) {
                            Object obj = list5.get(i17);
                            if (obj instanceof k1) {
                                int e3 = ((k1) obj).e();
                                z04 = com.github.rudroid.copilot.h1.D(e3, e3, z04);
                            } else {
                                int b2 = w2.b((String) obj);
                                z04 = com.github.rudroid.copilot.h1.D(b2, b2, z04);
                            }
                        }
                        i9 += z04;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                    z04 = 0;
                    i9 += z04;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(g1Var2, j2);
                    o2 B3 = i2Var.B(i7);
                    r1 r1Var8 = p2.a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        z05 = 0;
                    } else {
                        z05 = m1.z0(i10 << 3) * size4;
                        for (int i18 = 0; i18 < size4; i18++) {
                            int c3 = ((g1) list6.get(i18)).c(B3);
                            z05 = com.github.rudroid.copilot.h1.D(c3, c3, z05);
                        }
                    }
                    i9 += z05;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var9 = p2.a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        z04 = m1.z0(i10 << 3) * size5;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int e4 = ((k1) list7.get(i19)).e();
                            z04 = com.github.rudroid.copilot.h1.D(e4, e4, z04);
                        }
                        i9 += z04;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                    z04 = 0;
                    i9 += z04;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var10 = p2.a;
                    size = list8.size();
                    if (size != 0) {
                        o = p2.n(list8);
                        z03 = m1.z0(i10 << 3);
                        z04 = (z03 * size) + o;
                        i9 += z04;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                    z04 = 0;
                    i9 += z04;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var11 = p2.a;
                    size = list9.size();
                    if (size != 0) {
                        o = p2.g(list9);
                        z03 = m1.z0(i10 << 3);
                        z04 = (z03 * size) + o;
                        i9 += z04;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                    z04 = 0;
                    i9 += z04;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 31:
                    i2 = p2.h(i10, (List) unsafe.getObject(g1Var2, j2));
                    i9 += i2;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 32:
                    i2 = p2.i(i10, (List) unsafe.getObject(g1Var2, j2));
                    i9 += i2;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var12 = p2.a;
                    size = list10.size();
                    if (size != 0) {
                        o = p2.l(list10);
                        z03 = m1.z0(i10 << 3);
                        z04 = (z03 * size) + o;
                        i9 += z04;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                    z04 = 0;
                    i9 += z04;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var13 = p2.a;
                    size = list11.size();
                    if (size != 0) {
                        o = p2.m(list11);
                        z03 = m1.z0(i10 << 3);
                        z04 = (z03 * size) + o;
                        i9 += z04;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                    z04 = 0;
                    i9 += z04;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var14 = p2.a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i9 = com.github.rudroid.copilot.h1.E(size6, m1.z0(i10 << 3), size6, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 36:
                    List list13 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var15 = p2.a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i9 = com.github.rudroid.copilot.h1.E(size7, m1.z0(i10 << 3), size7, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 37:
                    int k2 = p2.k((List) unsafe.getObject(g1Var2, j2));
                    if (k2 > 0) {
                        i9 = com.github.rudroid.copilot.h1.E(k2, m1.z0(i10 << 3), k2, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 38:
                    int o2 = p2.o((List) unsafe.getObject(g1Var2, j2));
                    if (o2 > 0) {
                        i9 = com.github.rudroid.copilot.h1.E(o2, m1.z0(i10 << 3), o2, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 39:
                    int j8 = p2.j((List) unsafe.getObject(g1Var2, j2));
                    if (j8 > 0) {
                        i9 = com.github.rudroid.copilot.h1.E(j8, m1.z0(i10 << 3), j8, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 40:
                    List list14 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var16 = p2.a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i9 = com.github.rudroid.copilot.h1.E(size8, m1.z0(i10 << 3), size8, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 41:
                    List list15 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var17 = p2.a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i9 = com.github.rudroid.copilot.h1.E(size9, m1.z0(i10 << 3), size9, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 42:
                    List list16 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var18 = p2.a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i9 = com.github.rudroid.copilot.h1.E(size10, m1.z0(i10 << 3), size10, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 43:
                    int n = p2.n((List) unsafe.getObject(g1Var2, j2));
                    if (n > 0) {
                        i9 = com.github.rudroid.copilot.h1.E(n, m1.z0(i10 << 3), n, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 44:
                    int g = p2.g((List) unsafe.getObject(g1Var2, j2));
                    if (g > 0) {
                        i9 = com.github.rudroid.copilot.h1.E(g, m1.z0(i10 << 3), g, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 45:
                    List list17 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var19 = p2.a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i9 = com.github.rudroid.copilot.h1.E(size11, m1.z0(i10 << 3), size11, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 46:
                    List list18 = (List) unsafe.getObject(g1Var2, j2);
                    r1 r1Var20 = p2.a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i9 = com.github.rudroid.copilot.h1.E(size12, m1.z0(i10 << 3), size12, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 47:
                    int l = p2.l((List) unsafe.getObject(g1Var2, j2));
                    if (l > 0) {
                        i9 = com.github.rudroid.copilot.h1.E(l, m1.z0(i10 << 3), l, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 48:
                    int m = p2.m((List) unsafe.getObject(g1Var2, j2));
                    if (m > 0) {
                        i9 = com.github.rudroid.copilot.h1.E(m, m1.z0(i10 << 3), m, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 49:
                    List list19 = (List) unsafe.getObject(g1Var2, j2);
                    o2 B4 = i2Var.B(i7);
                    r1 r1Var21 = p2.a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i20 = 0; i20 < size13; i20++) {
                            g1 g1Var4 = (g1) list19.get(i20);
                            int z012 = m1.z0(i10 << 3);
                            i4 += g1Var4.c(B4) + z012 + z012;
                        }
                    }
                    i9 += i4;
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 50:
                    int i22 = i7 / 3;
                    d2 d2Var = (d2) unsafe.getObject(g1Var2, j2);
                    if (i2Var.b[i22 + i22] != null) {
                        throw new ClassCastException();
                    }
                    if (d2Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = d2Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 51:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.D(i10 << 3, 8, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 52:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.D(i10 << 3, 4, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 53:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        long z = z(j2, g1Var2);
                        z06 = m1.z0(i10 << 3);
                        A02 = m1.A0(z);
                        i9 += A02 + z06;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                case 54:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        long z2 = z(j2, g1Var2);
                        z06 = m1.z0(i10 << 3);
                        A02 = m1.A0(z2);
                        i9 += A02 + z06;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                case 55:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        long v = v(j2, g1Var2);
                        z06 = m1.z0(i10 << 3);
                        A02 = m1.A0(v);
                        i9 += A02 + z06;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                case 56:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.D(i10 << 3, 8, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 57:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.D(i10 << 3, 4, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 58:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.D(i10 << 3, 1, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 59:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        int i23 = i10 << 3;
                        Object object3 = unsafe.getObject(g1Var2, j2);
                        if (object3 instanceof k1) {
                            int z013 = m1.z0(i23);
                            int e5 = ((k1) object3).e();
                            i9 = com.github.rudroid.copilot.h1.E(e5, e5, z013, i9);
                        } else {
                            int z014 = m1.z0(i23);
                            int b3 = w2.b((String) object3);
                            i9 = com.github.rudroid.copilot.h1.E(b3, b3, z014, i9);
                        }
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 60:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        Object object4 = unsafe.getObject(g1Var2, j2);
                        o2 B5 = i2Var.B(i7);
                        r1 r1Var22 = p2.a;
                        int z015 = m1.z0(i10 << 3);
                        int c4 = ((g1) object4).c(B5);
                        i9 = com.github.rudroid.copilot.h1.E(c4, c4, z015, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 61:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        k1 k1Var2 = (k1) unsafe.getObject(g1Var2, j2);
                        int z016 = m1.z0(i10 << 3);
                        int e6 = k1Var2.e();
                        i9 = com.github.rudroid.copilot.h1.E(e6, e6, z016, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 62:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.D(v(j2, g1Var2), m1.z0(i10 << 3), i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 63:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        long v2 = v(j2, g1Var2);
                        z06 = m1.z0(i10 << 3);
                        A02 = m1.A0(v2);
                        i9 += A02 + z06;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                case 64:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.D(i10 << 3, 4, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 65:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        i9 = com.github.rudroid.copilot.h1.D(i10 << 3, 8, i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 66:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        int v3 = v(j2, g1Var2);
                        i9 = com.github.rudroid.copilot.h1.D((v3 >> 31) ^ (v3 + v3), m1.z0(i10 << 3), i9);
                    }
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
                case 67:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        long z3 = z(j2, g1Var2);
                        z06 = m1.z0(i10 << 3);
                        A02 = m1.A0((z3 >> 63) ^ (z3 + z3));
                        i9 += A02 + z06;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                case 68:
                    if (i2Var.s(i10, g1Var2, i7)) {
                        g1 g1Var5 = (g1) unsafe.getObject(g1Var2, j2);
                        o2 B6 = i2Var.B(i7);
                        r1 r1Var23 = p2.a;
                        int z017 = m1.z0(i10 << 3);
                        i3 = z017 + z017;
                        c = g1Var5.c(B6);
                        i2 = c + i3;
                        i9 += i2;
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i2Var = this;
                        g1Var2 = g1Var;
                        i5 = 1048575;
                    }
                default:
                    i7 += 3;
                    i2Var = this;
                    g1Var2 = g1Var;
                    i5 = 1048575;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.o2
    public final void e(Object obj, c2 c2Var) {
        int[] iArr;
        int i;
        int i2;
        i2 i2Var = this;
        m1 m1Var = (m1) c2Var.a;
        Unsafe unsafe = k;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr2 = i2Var.a;
            if (i5 >= iArr2.length) {
                ((t1) obj).zzc.d(c2Var);
                return;
            }
            int y = i2Var.y(i5);
            int x = x(y);
            int i7 = iArr2[i5];
            if (x <= 17) {
                int i8 = iArr2[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                iArr = iArr2;
                i = 1 << (i8 >>> 20);
            } else {
                iArr = iArr2;
                i = 0;
            }
            long j2 = y & i3;
            char c = 3;
            switch (x) {
                case 0:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        m1Var.q0(i7, Double.doubleToRawLongBits(v2.c.a(j2, obj)));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 1:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        m1Var.o0(i7, Float.floatToRawIntBits(v2.c.b(j2, obj)));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 2:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        m1Var.x0(i7, unsafe.getLong(obj, j2));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 3:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        m1Var.x0(i7, unsafe.getLong(obj, j2));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 4:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        m1Var.s0(i7, unsafe.getInt(obj, j2));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 5:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        m1Var.q0(i7, unsafe.getLong(obj, j2));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 6:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        m1Var.o0(i7, unsafe.getInt(obj, j2));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 7:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        boolean g = v2.c.g(j2, obj);
                        m1Var.w0(i7 << 3);
                        m1Var.m0(g ? (byte) 1 : (byte) 0);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 8:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            String str = (String) object;
                            m1Var.w0((i7 << 3) | 2);
                            int i10 = m1Var.c;
                            byte[] bArr = m1Var.b;
                            int i12 = m1Var.d;
                            try {
                                int z0 = m1.z0(str.length() * 3);
                                int z02 = m1.z0(str.length());
                                if (z02 == z0) {
                                    int i13 = i12 + z02;
                                    m1Var.d = i13;
                                    int a = w2.a(str, bArr, i13, i10 - i13);
                                    m1Var.d = i12;
                                    m1Var.w0((a - i12) - z02);
                                    m1Var.d = a;
                                } else {
                                    m1Var.w0(w2.b(str));
                                    int i14 = m1Var.d;
                                    m1Var.d = w2.a(str, bArr, i14, i10 - i14);
                                }
                            } catch (IndexOutOfBoundsException e) {
                                throw new zzfa("CodedOutputStream was writing to a flat byte array and ran out of space.", e);
                            }
                        } else {
                            k1 k1Var = (k1) object;
                            m1Var.w0((i7 << 3) | 2);
                            m1Var.w0(k1Var.e());
                            k1Var.g(m1Var);
                        }
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 9:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        c2Var.c(i7, unsafe.getObject(obj, j2), i2Var.B(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 10:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        k1 k1Var2 = (k1) unsafe.getObject(obj, j2);
                        m1Var.w0((i7 << 3) | 2);
                        m1Var.w0(k1Var2.e());
                        k1Var2.g(m1Var);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 11:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        m1Var.v0(i7, unsafe.getInt(obj, j2));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 12:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        m1Var.s0(i7, unsafe.getInt(obj, j2));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 13:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        m1Var.o0(i7, unsafe.getInt(obj, j2));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 14:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        m1Var.q0(i7, unsafe.getLong(obj, j2));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 15:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        int i15 = unsafe.getInt(obj, j2);
                        m1Var.v0(i7, (i15 >> 31) ^ (i15 + i15));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 16:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        long j3 = unsafe.getLong(obj, j2);
                        m1Var.x0(i7, (j3 >> 63) ^ (j3 + j3));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 17:
                    if (i2Var.q(obj, i5, i4, i6, i)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        m1Var.u0(i7, 3);
                        i2Var.B(i5).e((g1) object2, c2Var);
                        m1Var.u0(i7, 4);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 18:
                    i2 = i5;
                    p2.r(iArr[i2], (List) unsafe.getObject(obj, j2), c2Var, false);
                    i5 = i2;
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 19:
                    i2 = i5;
                    p2.v(iArr[i2], (List) unsafe.getObject(obj, j2), c2Var, false);
                    i5 = i2;
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 20:
                    i2 = i5;
                    p2.x(iArr[i2], (List) unsafe.getObject(obj, j2), c2Var, false);
                    i5 = i2;
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 21:
                    i2 = i5;
                    p2.e(iArr[i2], (List) unsafe.getObject(obj, j2), c2Var, false);
                    i5 = i2;
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 22:
                    i2 = i5;
                    p2.w(iArr[i2], (List) unsafe.getObject(obj, j2), c2Var, false);
                    i5 = i2;
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 23:
                    i2 = i5;
                    p2.u(iArr[i2], (List) unsafe.getObject(obj, j2), c2Var, false);
                    i5 = i2;
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 24:
                    i2 = i5;
                    p2.t(iArr[i2], (List) unsafe.getObject(obj, j2), c2Var, false);
                    i5 = i2;
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 25:
                    i2 = i5;
                    p2.q(iArr[i2], (List) unsafe.getObject(obj, j2), c2Var, false);
                    i5 = i2;
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 26:
                    int i16 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j2);
                    r1 r1Var = p2.a;
                    if (list != null && !list.isEmpty()) {
                        int i17 = 0;
                        while (i17 < list.size()) {
                            String str2 = (String) list.get(i17);
                            m1Var.w0((i16 << 3) | 2);
                            int i18 = m1Var.c;
                            byte[] bArr2 = m1Var.b;
                            char c2 = c;
                            int i19 = m1Var.d;
                            try {
                                int z03 = m1.z0(str2.length() * 3);
                                int i20 = i5;
                                int z04 = m1.z0(str2.length());
                                if (z04 == z03) {
                                    int i22 = i19 + z04;
                                    m1Var.d = i22;
                                    int a2 = w2.a(str2, bArr2, i22, i18 - i22);
                                    m1Var.d = i19;
                                    m1Var.w0((a2 - i19) - z04);
                                    m1Var.d = a2;
                                } else {
                                    m1Var.w0(w2.b(str2));
                                    int i23 = m1Var.d;
                                    m1Var.d = w2.a(str2, bArr2, i23, i18 - i23);
                                }
                                i17++;
                                c = c2;
                                i5 = i20;
                            } catch (IndexOutOfBoundsException e2) {
                                throw new zzfa("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
                            }
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                    break;
                case 27:
                    int i24 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    o2 B = i2Var.B(i5);
                    r1 r1Var2 = p2.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i25 = 0; i25 < list2.size(); i25++) {
                            c2Var.c(i24, list2.get(i25), B);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                    break;
                case 28:
                    int i26 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    r1 r1Var3 = p2.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i27 = 0; i27 < list3.size(); i27++) {
                            k1 k1Var3 = (k1) list3.get(i27);
                            m1Var.w0((i26 << 3) | 2);
                            m1Var.w0(k1Var3.e());
                            k1Var3.g(m1Var);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                    break;
                case 29:
                    p2.d(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, false);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 30:
                    p2.s(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, false);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 31:
                    p2.y(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, false);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 32:
                    p2.a(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, false);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 33:
                    p2.b(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, false);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 34:
                    p2.c(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, false);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 35:
                    p2.r(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, true);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 36:
                    p2.v(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, true);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 37:
                    p2.x(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, true);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 38:
                    p2.e(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, true);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 39:
                    p2.w(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, true);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 40:
                    p2.u(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, true);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 41:
                    p2.t(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, true);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 42:
                    p2.q(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, true);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 43:
                    p2.d(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, true);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 44:
                    p2.s(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, true);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 45:
                    p2.y(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, true);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 46:
                    p2.a(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, true);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 47:
                    p2.b(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, true);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 48:
                    p2.c(iArr[i5], (List) unsafe.getObject(obj, j2), c2Var, true);
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 49:
                    int i28 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    o2 B2 = i2Var.B(i5);
                    r1 r1Var4 = p2.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i29 = 0; i29 < list4.size(); i29++) {
                            g1 g1Var = (g1) list4.get(i29);
                            m1Var.u0(i28, 3);
                            B2.e(g1Var, c2Var);
                            m1Var.u0(i28, 4);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        int i30 = i5 / 3;
                        throw a0.s0.d(i2Var.b[i30 + i30]);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 51:
                    if (i2Var.s(i7, obj, i5)) {
                        m1Var.q0(i7, Double.doubleToRawLongBits(((Double) v2.h(j2, obj)).doubleValue()));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 52:
                    if (i2Var.s(i7, obj, i5)) {
                        m1Var.o0(i7, Float.floatToRawIntBits(((Float) v2.h(j2, obj)).floatValue()));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 53:
                    if (i2Var.s(i7, obj, i5)) {
                        m1Var.x0(i7, z(j2, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 54:
                    if (i2Var.s(i7, obj, i5)) {
                        m1Var.x0(i7, z(j2, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 55:
                    if (i2Var.s(i7, obj, i5)) {
                        m1Var.s0(i7, v(j2, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 56:
                    if (i2Var.s(i7, obj, i5)) {
                        m1Var.q0(i7, z(j2, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 57:
                    if (i2Var.s(i7, obj, i5)) {
                        m1Var.o0(i7, v(j2, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 58:
                    if (i2Var.s(i7, obj, i5)) {
                        boolean booleanValue = ((Boolean) v2.h(j2, obj)).booleanValue();
                        m1Var.w0(i7 << 3);
                        m1Var.m0(booleanValue ? (byte) 1 : (byte) 0);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 59:
                    if (i2Var.s(i7, obj, i5)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            String str3 = (String) object3;
                            m1Var.w0((i7 << 3) | 2);
                            int i32 = m1Var.c;
                            byte[] bArr3 = m1Var.b;
                            int i33 = m1Var.d;
                            try {
                                int z05 = m1.z0(str3.length() * 3);
                                int z06 = m1.z0(str3.length());
                                if (z06 == z05) {
                                    int i34 = i33 + z06;
                                    m1Var.d = i34;
                                    int a3 = w2.a(str3, bArr3, i34, i32 - i34);
                                    m1Var.d = i33;
                                    m1Var.w0((a3 - i33) - z06);
                                    m1Var.d = a3;
                                } else {
                                    m1Var.w0(w2.b(str3));
                                    int i35 = m1Var.d;
                                    m1Var.d = w2.a(str3, bArr3, i35, i32 - i35);
                                }
                            } catch (IndexOutOfBoundsException e3) {
                                throw new zzfa("CodedOutputStream was writing to a flat byte array and ran out of space.", e3);
                            }
                        } else {
                            k1 k1Var4 = (k1) object3;
                            m1Var.w0((i7 << 3) | 2);
                            m1Var.w0(k1Var4.e());
                            k1Var4.g(m1Var);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 60:
                    if (i2Var.s(i7, obj, i5)) {
                        c2Var.c(i7, unsafe.getObject(obj, j2), i2Var.B(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 61:
                    if (i2Var.s(i7, obj, i5)) {
                        k1 k1Var5 = (k1) unsafe.getObject(obj, j2);
                        m1Var.w0((i7 << 3) | 2);
                        m1Var.w0(k1Var5.e());
                        k1Var5.g(m1Var);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 62:
                    if (i2Var.s(i7, obj, i5)) {
                        m1Var.v0(i7, v(j2, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 63:
                    if (i2Var.s(i7, obj, i5)) {
                        m1Var.s0(i7, v(j2, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 64:
                    if (i2Var.s(i7, obj, i5)) {
                        m1Var.o0(i7, v(j2, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 65:
                    if (i2Var.s(i7, obj, i5)) {
                        m1Var.q0(i7, z(j2, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 66:
                    if (i2Var.s(i7, obj, i5)) {
                        int v = v(j2, obj);
                        m1Var.v0(i7, (v >> 31) ^ (v + v));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 67:
                    if (i2Var.s(i7, obj, i5)) {
                        long z = z(j2, obj);
                        m1Var.x0(i7, (z >> 63) ^ (z + z));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                case 68:
                    if (i2Var.s(i7, obj, i5)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        m1Var.u0(i7, 3);
                        i2Var.B(i5).e((g1) object4, c2Var);
                        m1Var.u0(i7, 4);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
                default:
                    i5 += 3;
                    i3 = 1048575;
                    i2Var = this;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o2
    public final void f(Object obj, byte[] bArr, int i, int i2, androidx.glance.appwidget.protobuf.d dVar) {
        t(obj, bArr, i, i2, 0, dVar);
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
    @Override // com.google.android.gms.internal.play_billing.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(t1 t1Var) {
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
                return t1Var.zzc.hashCode() + (i6 * 53);
            }
            int y = y(i5);
            int i7 = 1048575 & y;
            int x = x(y);
            int i8 = iArr[i5];
            long j2 = i7;
            int i9 = 1237;
            int i10 = 37;
            switch (x) {
                case 0:
                    i = i6 * 53;
                    doubleToLongBits = Double.doubleToLongBits(v2.c.a(j2, t1Var));
                    Charset charset = z1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    floatToIntBits = Float.floatToIntBits(v2.c.b(j2, t1Var));
                    i6 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    doubleToLongBits = v2.f(j2, t1Var);
                    Charset charset2 = z1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    doubleToLongBits = v2.f(j2, t1Var);
                    Charset charset3 = z1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    floatToIntBits = v2.e(j2, t1Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    doubleToLongBits = v2.f(j2, t1Var);
                    Charset charset4 = z1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    floatToIntBits = v2.e(j2, t1Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean g = v2.c.g(j2, t1Var);
                    Charset charset5 = z1.a;
                    break;
                case 8:
                    i2 = i6 * 53;
                    floatToIntBits = ((String) v2.h(j2, t1Var)).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object h = v2.h(j2, t1Var);
                    if (h != null) {
                        i10 = h.hashCode();
                    }
                    i6 = i4 + i10;
                    break;
                case 10:
                    i2 = i6 * 53;
                    floatToIntBits = v2.h(j2, t1Var).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    floatToIntBits = v2.e(j2, t1Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    floatToIntBits = v2.e(j2, t1Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    floatToIntBits = v2.e(j2, t1Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    doubleToLongBits = v2.f(j2, t1Var);
                    Charset charset6 = z1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    floatToIntBits = v2.e(j2, t1Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    doubleToLongBits = v2.f(j2, t1Var);
                    Charset charset7 = z1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object h2 = v2.h(j2, t1Var);
                    if (h2 != null) {
                        i10 = h2.hashCode();
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
                    floatToIntBits = v2.h(j2, t1Var).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    floatToIntBits = v2.h(j2, t1Var).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 51:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) v2.h(j2, t1Var)).doubleValue());
                        Charset charset8 = z1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) v2.h(j2, t1Var)).floatValue());
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 53:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = z(j2, t1Var);
                        Charset charset9 = z1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = z(j2, t1Var);
                        Charset charset10 = z1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j2, t1Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 56:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = z(j2, t1Var);
                        Charset charset11 = z1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j2, t1Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 58:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i3 = i6 * 53;
                        boolean booleanValue = ((Boolean) v2.h(j2, t1Var)).booleanValue();
                        Charset charset12 = z1.a;
                        break;
                    }
                case 59:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ((String) v2.h(j2, t1Var)).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 60:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v2.h(j2, t1Var).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 61:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v2.h(j2, t1Var).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 62:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j2, t1Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 63:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j2, t1Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 64:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j2, t1Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 65:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = z(j2, t1Var);
                        Charset charset13 = z1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j2, t1Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 67:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = z(j2, t1Var);
                        Charset charset14 = z1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!s(i8, t1Var, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v2.h(j2, t1Var).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
            }
            i5 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.o2
    public final void h(Object obj, Object obj2) {
        Object obj3;
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                p2.p(obj, obj2);
                return;
            }
            int y = y(i);
            int i2 = y & 1048575;
            int x = x(y);
            int i3 = iArr[i];
            long j2 = i2;
            switch (x) {
                case 0:
                    if (p(i, obj2)) {
                        u2 u2Var = v2.c;
                        obj3 = obj;
                        u2Var.e(obj3, j2, u2Var.a(j2, obj2));
                        l(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (p(i, obj2)) {
                        u2 u2Var2 = v2.c;
                        u2Var2.f(obj, j2, u2Var2.b(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (p(i, obj2)) {
                        v2.k(obj, j2, v2.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (p(i, obj2)) {
                        v2.k(obj, j2, v2.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (p(i, obj2)) {
                        v2.j(v2.e(j2, obj2), j2, obj);
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (p(i, obj2)) {
                        v2.k(obj, j2, v2.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (p(i, obj2)) {
                        v2.j(v2.e(j2, obj2), j2, obj);
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (p(i, obj2)) {
                        u2 u2Var3 = v2.c;
                        u2Var3.c(obj, j2, u2Var3.g(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (p(i, obj2)) {
                        v2.l(j2, obj, v2.h(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    j(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (p(i, obj2)) {
                        v2.l(j2, obj, v2.h(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (p(i, obj2)) {
                        v2.j(v2.e(j2, obj2), j2, obj);
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (p(i, obj2)) {
                        v2.j(v2.e(j2, obj2), j2, obj);
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (p(i, obj2)) {
                        v2.j(v2.e(j2, obj2), j2, obj);
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (p(i, obj2)) {
                        v2.k(obj, j2, v2.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (p(i, obj2)) {
                        v2.j(v2.e(j2, obj2), j2, obj);
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (p(i, obj2)) {
                        v2.k(obj, j2, v2.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    j(i, obj, obj2);
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
                    x1 x1Var = (x1) v2.h(j2, obj);
                    x1 x1Var2 = (x1) v2.h(j2, obj2);
                    int size = x1Var.size();
                    int size2 = x1Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((h1) x1Var).r) {
                            x1Var = x1Var.h(size2 + size);
                        }
                        x1Var.addAll(x1Var2);
                    }
                    if (size > 0) {
                        x1Var2 = x1Var;
                    }
                    v2.l(j2, obj, x1Var2);
                    obj3 = obj;
                    break;
                case 50:
                    r1 r1Var = p2.a;
                    v2.l(j2, obj, r1.c(v2.h(j2, obj), v2.h(j2, obj2)));
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
                    if (s(i3, obj2, i)) {
                        v2.l(j2, obj, v2.h(j2, obj2));
                        v2.j(i3, iArr[i + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    k(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(i3, obj2, i)) {
                        v2.l(j2, obj, v2.h(j2, obj2));
                        v2.j(i3, iArr[i + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    k(i, obj, obj2);
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

    @Override // com.google.android.gms.internal.play_billing.o2
    public final boolean i(t1 t1Var, t1 t1Var2) {
        boolean f;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int y = y(i);
                long j2 = y & 1048575;
                switch (x(y)) {
                    case 0:
                        if (!o(t1Var, t1Var2, i)) {
                            break;
                        } else {
                            u2 u2Var = v2.c;
                            if (Double.doubleToLongBits(u2Var.a(j2, t1Var)) != Double.doubleToLongBits(u2Var.a(j2, t1Var2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!o(t1Var, t1Var2, i)) {
                            break;
                        } else {
                            u2 u2Var2 = v2.c;
                            if (Float.floatToIntBits(u2Var2.b(j2, t1Var)) != Float.floatToIntBits(u2Var2.b(j2, t1Var2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (o(t1Var, t1Var2, i) && v2.f(j2, t1Var) == v2.f(j2, t1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (o(t1Var, t1Var2, i) && v2.f(j2, t1Var) == v2.f(j2, t1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (o(t1Var, t1Var2, i) && v2.e(j2, t1Var) == v2.e(j2, t1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (o(t1Var, t1Var2, i) && v2.f(j2, t1Var) == v2.f(j2, t1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (o(t1Var, t1Var2, i) && v2.e(j2, t1Var) == v2.e(j2, t1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!o(t1Var, t1Var2, i)) {
                            break;
                        } else {
                            u2 u2Var3 = v2.c;
                            if (u2Var3.g(j2, t1Var) != u2Var3.g(j2, t1Var2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (o(t1Var, t1Var2, i) && p2.f(v2.h(j2, t1Var), v2.h(j2, t1Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (o(t1Var, t1Var2, i) && p2.f(v2.h(j2, t1Var), v2.h(j2, t1Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (o(t1Var, t1Var2, i) && p2.f(v2.h(j2, t1Var), v2.h(j2, t1Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (o(t1Var, t1Var2, i) && v2.e(j2, t1Var) == v2.e(j2, t1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (o(t1Var, t1Var2, i) && v2.e(j2, t1Var) == v2.e(j2, t1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (o(t1Var, t1Var2, i) && v2.e(j2, t1Var) == v2.e(j2, t1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (o(t1Var, t1Var2, i) && v2.f(j2, t1Var) == v2.f(j2, t1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (o(t1Var, t1Var2, i) && v2.e(j2, t1Var) == v2.e(j2, t1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (o(t1Var, t1Var2, i) && v2.f(j2, t1Var) == v2.f(j2, t1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (o(t1Var, t1Var2, i) && p2.f(v2.h(j2, t1Var), v2.h(j2, t1Var2))) {
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
                        f = p2.f(v2.h(j2, t1Var), v2.h(j2, t1Var2));
                        break;
                    case 50:
                        f = p2.f(v2.h(j2, t1Var), v2.h(j2, t1Var2));
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
                        if (v2.e(j3, t1Var) == v2.e(j3, t1Var2) && p2.f(v2.h(j2, t1Var), v2.h(j2, t1Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (f) {
                    i += 3;
                }
            } else if (t1Var.zzc.equals(t1Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final void j(int i, Object obj, Object obj2) {
        if (p(i, obj2)) {
            int y = y(i) & 1048575;
            Unsafe unsafe = k;
            long j2 = y;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            o2 B = B(i);
            if (!p(i, obj)) {
                if (r(object)) {
                    t1 a = B.a();
                    B.h(a, object);
                    unsafe.putObject(obj, j2, a);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                l(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!r(object2)) {
                t1 a2 = B.a();
                B.h(a2, object2);
                unsafe.putObject(obj, j2, a2);
                object2 = a2;
            }
            B.h(object2, object);
        }
    }

    public final void k(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (s(i2, obj2, i)) {
            int y = y(i) & 1048575;
            Unsafe unsafe = k;
            long j2 = y;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            o2 B = B(i);
            if (!s(i2, obj, i)) {
                if (r(object)) {
                    t1 a = B.a();
                    B.h(a, object);
                    unsafe.putObject(obj, j2, a);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                v2.j(i2, iArr[i + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!r(object2)) {
                t1 a2 = B.a();
                B.h(a2, object2);
                unsafe.putObject(obj, j2, a2);
                object2 = a2;
            }
            B.h(object2, object);
        }
    }

    public final void l(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        v2.j((1 << (i2 >>> 20)) | v2.e(j2, obj), j2, obj);
    }

    public final void m(int i, Object obj, Object obj2) {
        k.putObject(obj, y(i) & 1048575, obj2);
        l(i, obj);
    }

    public final void n(Object obj, int i, Object obj2, int i2) {
        k.putObject(obj, y(i2) & 1048575, obj2);
        v2.j(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final boolean o(t1 t1Var, t1 t1Var2, int i) {
        return p(i, t1Var) == p(i, t1Var2);
    }

    public final boolean p(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 == 1048575) {
            int y = y(i);
            long j3 = y & 1048575;
            switch (x(y)) {
                case 0:
                    if (Double.doubleToRawLongBits(v2.c.a(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(v2.c.b(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (v2.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (v2.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (v2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (v2.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (v2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return v2.c.g(j3, obj);
                case 8:
                    Object h = v2.h(j3, obj);
                    if (h instanceof String) {
                        if (((String) h).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(h instanceof k1)) {
                            throw new IllegalArgumentException();
                        }
                        if (k1.s.equals(h)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (v2.h(j3, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (k1.s.equals(v2.h(j3, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (v2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (v2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (v2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (v2.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (v2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (v2.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (v2.h(j3, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & v2.e(j2, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? p(i, obj) : (i3 & i4) != 0;
    }

    public final boolean s(int i, Object obj, int i2) {
        return v2.e((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int t(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, androidx.glance.appwidget.protobuf.d r41) {
        /*
            Method dump skipped, instructions count: 3996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.i2.t(java.lang.Object, byte[], int, int, int, androidx.glance.appwidget.protobuf.d):int");
    }

    public final int w(int i, int i2) {
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

    public final int y(int i) {
        return this.a[i + 1];
    }





}
