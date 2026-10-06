package r4;

import android.graphics.Path;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public char f31153a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f31154b;

    public d(char c10, float[] fArr) {
        this.f31153a = c10;
        this.f31154b = fArr;
    }

    public static void a(Path path, float f6, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11) {
        double d10;
        double d11;
        double radians = Math.toRadians(f15);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d12 = f6;
        double d13 = f10;
        double d14 = f13;
        double d15 = ((d13 * sin) + (d12 * cos)) / d14;
        double d16 = f14;
        double d17 = ((d13 * cos) + ((-f6) * sin)) / d16;
        double d18 = f12;
        double d19 = ((d18 * sin) + (f11 * cos)) / d14;
        double d20 = ((d18 * cos) + ((-f11) * sin)) / d16;
        double d21 = d15 - d19;
        double d22 = d17 - d20;
        double d23 = (d15 + d19) / 2.0d;
        double d24 = (d17 + d20) / 2.0d;
        double d25 = (d22 * d22) + (d21 * d21);
        if (d25 == 0.0d) {
            return;
        }
        double d26 = (1.0d / d25) - 0.25d;
        if (d26 < 0.0d) {
            float sqrt = (float) (Math.sqrt(d25) / 1.99999d);
            a(path, f6, f10, f11, f12, f13 * sqrt, sqrt * f14, f15, z10, z11);
            return;
        }
        double sqrt2 = Math.sqrt(d26);
        double d27 = d21 * sqrt2;
        double d28 = sqrt2 * d22;
        if (z10 == z11) {
            d10 = d23 - d28;
            d11 = d24 + d27;
        } else {
            d10 = d23 + d28;
            d11 = d24 - d27;
        }
        double atan2 = Math.atan2(d17 - d11, d15 - d10);
        double atan22 = Math.atan2(d20 - d11, d19 - d10) - atan2;
        if (z11 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d29 = d10 * d14;
        double d30 = d11 * d16;
        double d31 = (d29 * cos) - (d30 * sin);
        double d32 = (d30 * cos) + (d29 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d33 = -d14;
        double d34 = d33 * cos2;
        double d35 = d16 * sin2;
        double d36 = (d34 * sin3) - (d35 * cos3);
        double d37 = d33 * sin2;
        double d38 = d16 * cos2;
        double d39 = atan22 / ceil;
        double d40 = (cos3 * d38) + (sin3 * d37);
        int i = 0;
        double d41 = d12;
        double d42 = d13;
        double d43 = atan2;
        while (i < ceil) {
            double d44 = d43 + d39;
            double sin4 = Math.sin(d44);
            double cos4 = Math.cos(d44);
            double d45 = d39;
            double d46 = (((d14 * cos2) * cos4) + d31) - (d35 * sin4);
            double d47 = d31;
            double d48 = (d38 * sin4) + (d14 * sin2 * cos4) + d32;
            double d49 = (d34 * sin4) - (d35 * cos4);
            double d50 = (cos4 * d38) + (sin4 * d37);
            double d51 = d44 - d43;
            double tan = Math.tan(d51 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d51)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d36 * sqrt3) + d41), (float) ((d40 * sqrt3) + d42), (float) (d46 - (sqrt3 * d49)), (float) (d48 - (sqrt3 * d50)), (float) d46, (float) d48);
            i++;
            d42 = d48;
            ceil = ceil;
            d37 = d37;
            cos2 = cos2;
            d43 = d44;
            d40 = d50;
            d36 = d49;
            d31 = d47;
            d41 = d46;
            d39 = d45;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(d[] dVarArr, Path path) {
        int i;
        float[] fArr;
        int i10;
        d dVar;
        int i11;
        char c10;
        float f6;
        float f10;
        d dVar2;
        boolean z10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        d[] dVarArr2 = dVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = dVarArr2.length;
        int i12 = 0;
        int i13 = 0;
        char c11 = 'm';
        while (i13 < length) {
            d dVar3 = dVarArr2[i13];
            char c12 = dVar3.f31153a;
            float[] fArr3 = dVar3.f31154b;
            float f19 = fArr2[i12];
            float f20 = fArr2[1];
            float f21 = fArr2[2];
            float f22 = fArr2[3];
            float f23 = fArr2[4];
            int i14 = i12;
            float f24 = fArr2[5];
            switch (c12) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f23, f24);
                    f19 = f23;
                    f21 = f19;
                    f20 = f24;
                    f22 = f20;
                default:
                    i = 2;
                    break;
            }
            float f25 = f23;
            float f26 = f24;
            float f27 = f19;
            float f28 = f20;
            int i15 = i14;
            while (i15 < fArr3.length) {
                if (c12 == 'A') {
                    fArr = fArr3;
                    i10 = i15;
                    dVar = dVar3;
                    float f29 = f27;
                    float f30 = f28;
                    i11 = i13;
                    c10 = c12;
                    int i16 = i10 + 5;
                    int i17 = i10 + 6;
                    a(path, f29, f30, fArr[i16], fArr[i17], fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3] != 0.0f ? 1 : i14, fArr[i10 + 4] != 0.0f ? 1 : i14);
                    f21 = fArr[i16];
                    f6 = fArr[i17];
                    f22 = f6;
                    f10 = f21;
                } else if (c12 == 'C') {
                    fArr = fArr3;
                    i10 = i15;
                    i11 = i13;
                    dVar = dVar3;
                    c10 = c12;
                    int i18 = i10 + 2;
                    int i19 = i10 + 3;
                    int i20 = i10 + 4;
                    int i21 = i10 + 5;
                    path2.cubicTo(fArr[i10], fArr[i10 + 1], fArr[i18], fArr[i19], fArr[i20], fArr[i21]);
                    float f31 = fArr[i20];
                    float f32 = fArr[i21];
                    f21 = fArr[i18];
                    f22 = fArr[i19];
                    f6 = f32;
                    f10 = f31;
                } else if (c12 == 'H') {
                    fArr = fArr3;
                    i10 = i15;
                    dVar = dVar3;
                    c10 = c12;
                    f6 = f28;
                    i11 = i13;
                    path2.lineTo(fArr[i10], f6);
                    f10 = fArr[i10];
                } else if (c12 == 'Q') {
                    fArr = fArr3;
                    i10 = i15;
                    i11 = i13;
                    dVar = dVar3;
                    c10 = c12;
                    int i22 = i10 + 1;
                    int i23 = i10 + 2;
                    int i24 = i10 + 3;
                    path2.quadTo(fArr[i10], fArr[i22], fArr[i23], fArr[i24]);
                    float f33 = fArr[i10];
                    float f34 = fArr[i22];
                    float f35 = fArr[i23];
                    float f36 = fArr[i24];
                    f21 = f33;
                    f22 = f34;
                    f10 = f35;
                    f6 = f36;
                } else if (c12 == 'V') {
                    fArr = fArr3;
                    i10 = i15;
                    i11 = i13;
                    dVar = dVar3;
                    f10 = f27;
                    c10 = c12;
                    path2.lineTo(f10, fArr[i10]);
                    f6 = fArr[i10];
                } else if (c12 != 'a') {
                    if (c12 == 'c') {
                        fArr = fArr3;
                        i10 = i15;
                        int i25 = i10 + 2;
                        int i26 = i10 + 3;
                        int i27 = i10 + 4;
                        int i28 = i10 + 5;
                        path2.rCubicTo(fArr[i10], fArr[i10 + 1], fArr[i25], fArr[i26], fArr[i27], fArr[i28]);
                        float f37 = fArr[i25] + f27;
                        float f38 = fArr[i26] + f28;
                        f27 += fArr[i27];
                        f28 += fArr[i28];
                        f21 = f37;
                        f22 = f38;
                    } else if (c12 != 'h') {
                        if (c12 != 'q') {
                            if (c12 != 'v') {
                                if (c12 == 'L') {
                                    fArr = fArr3;
                                    i10 = i15;
                                    int i29 = i10 + 1;
                                    path2.lineTo(fArr[i10], fArr[i29]);
                                    f10 = fArr[i10];
                                    f6 = fArr[i29];
                                } else if (c12 == 'M') {
                                    fArr = fArr3;
                                    i10 = i15;
                                    f10 = fArr[i10];
                                    f6 = fArr[i10 + 1];
                                    if (i10 > 0) {
                                        path2.lineTo(f10, f6);
                                    } else {
                                        path2.moveTo(f10, f6);
                                        f25 = f10;
                                        f26 = f6;
                                    }
                                } else if (c12 != 'S') {
                                    if (c12 == 'T') {
                                        fArr = fArr3;
                                        i10 = i15;
                                        if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                            f27 = (f27 * 2.0f) - f21;
                                            f28 = (f28 * 2.0f) - f22;
                                        }
                                        int i30 = i10 + 1;
                                        path2.quadTo(f27, f28, fArr[i10], fArr[i30]);
                                        f10 = fArr[i10];
                                        f6 = fArr[i30];
                                        dVar = dVar3;
                                        f21 = f27;
                                        f22 = f28;
                                    } else if (c12 == 'l') {
                                        fArr = fArr3;
                                        i10 = i15;
                                        int i31 = i10 + 1;
                                        path2.rLineTo(fArr[i10], fArr[i31]);
                                        f27 += fArr[i10];
                                        f14 = fArr[i31];
                                    } else if (c12 == 'm') {
                                        fArr = fArr3;
                                        i10 = i15;
                                        float f39 = fArr[i10];
                                        f27 += f39;
                                        float f40 = fArr[i10 + 1];
                                        f28 += f40;
                                        if (i10 > 0) {
                                            path2.rLineTo(f39, f40);
                                        } else {
                                            path2.rMoveTo(f39, f40);
                                            dVar = dVar3;
                                            f10 = f27;
                                            f25 = f10;
                                            f6 = f28;
                                            f26 = f6;
                                        }
                                    } else if (c12 != 's') {
                                        if (c12 != 't') {
                                            fArr = fArr3;
                                            i10 = i15;
                                            dVar = dVar3;
                                            f10 = f27;
                                        } else {
                                            if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                f17 = f27 - f21;
                                                f18 = f28 - f22;
                                            } else {
                                                f18 = 0.0f;
                                                f17 = 0.0f;
                                            }
                                            int i32 = i15 + 1;
                                            path2.rQuadTo(f17, f18, fArr3[i15], fArr3[i32]);
                                            float f41 = f17 + f27;
                                            float f42 = f18 + f28;
                                            float f43 = f27 + fArr3[i15];
                                            f28 += fArr3[i32];
                                            f22 = f42;
                                            fArr = fArr3;
                                            i10 = i15;
                                            dVar = dVar3;
                                            f10 = f43;
                                            f21 = f41;
                                        }
                                        f6 = f28;
                                    } else {
                                        if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                            f15 = f28 - f22;
                                            f16 = f27 - f21;
                                        } else {
                                            f16 = 0.0f;
                                            f15 = 0.0f;
                                        }
                                        int i33 = i15;
                                        int i34 = i33 + 1;
                                        int i35 = i33 + 2;
                                        int i36 = i33 + 3;
                                        fArr = fArr3;
                                        i10 = i33;
                                        path2.rCubicTo(f16, f15, fArr3[i33], fArr3[i34], fArr3[i35], fArr3[i36]);
                                        f11 = fArr[i10] + f27;
                                        f12 = fArr[i34] + f28;
                                        f27 += fArr[i35];
                                        f13 = fArr[i36];
                                    }
                                    i11 = i13;
                                    c10 = c12;
                                } else {
                                    fArr = fArr3;
                                    i10 = i15;
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        f27 = (f27 * 2.0f) - f21;
                                        f28 = (f28 * 2.0f) - f22;
                                    }
                                    float f44 = f27;
                                    float f45 = f28;
                                    int i37 = i10 + 1;
                                    int i38 = i10 + 2;
                                    int i39 = i10 + 3;
                                    path2.cubicTo(f44, f45, fArr[i10], fArr[i37], fArr[i38], fArr[i39]);
                                    f21 = fArr[i10];
                                    f22 = fArr[i37];
                                    f10 = fArr[i38];
                                    f6 = fArr[i39];
                                }
                                i11 = i13;
                                dVar = dVar3;
                                c10 = c12;
                            } else {
                                fArr = fArr3;
                                i10 = i15;
                                path2.rLineTo(0.0f, fArr[i10]);
                                f14 = fArr[i10];
                            }
                            f28 += f14;
                        } else {
                            fArr = fArr3;
                            i10 = i15;
                            int i40 = i10 + 1;
                            int i41 = i10 + 2;
                            int i42 = i10 + 3;
                            path2.rQuadTo(fArr[i10], fArr[i40], fArr[i41], fArr[i42]);
                            f11 = fArr[i10] + f27;
                            f12 = fArr[i40] + f28;
                            f27 += fArr[i41];
                            f13 = fArr[i42];
                        }
                        f28 += f13;
                        f21 = f11;
                        f22 = f12;
                    } else {
                        fArr = fArr3;
                        i10 = i15;
                        path2.rLineTo(fArr[i10], 0.0f);
                        f27 += fArr[i10];
                    }
                    dVar = dVar3;
                    f10 = f27;
                    f6 = f28;
                    i11 = i13;
                    c10 = c12;
                } else {
                    fArr = fArr3;
                    i10 = i15;
                    int i43 = i10 + 5;
                    float f46 = fArr[i43] + f27;
                    int i44 = i10 + 6;
                    float f47 = fArr[i44] + f28;
                    float f48 = fArr[i10];
                    float f49 = fArr[i10 + 1];
                    float f50 = fArr[i10 + 2];
                    if (fArr[i10 + 3] != 0.0f) {
                        dVar2 = dVar3;
                        z10 = 1;
                    } else {
                        dVar2 = dVar3;
                        z10 = i14;
                    }
                    dVar = dVar2;
                    float f51 = f27;
                    c10 = c12;
                    float f52 = f28;
                    i11 = i13;
                    a(path, f51, f52, f46, f47, f48, f49, f50, z10, fArr[i10 + 4] != 0.0f ? 1 : i14);
                    f10 = f51 + fArr[i43];
                    f6 = f52 + fArr[i44];
                    f21 = f10;
                    f22 = f6;
                }
                i15 = i10 + i;
                path2 = path;
                dVar3 = dVar;
                c12 = c10;
                i13 = i11;
                f27 = f10;
                f28 = f6;
                c11 = c12;
                fArr3 = fArr;
            }
            fArr2[i14] = f27;
            fArr2[1] = f28;
            fArr2[2] = f21;
            fArr2[3] = f22;
            fArr2[4] = f25;
            fArr2[5] = f26;
            c11 = dVar3.f31153a;
            i13++;
            dVarArr2 = dVarArr;
            path2 = path;
            i12 = i14;
        }
    }

    public d(d dVar) {
        this.f31153a = dVar.f31153a;
        float[] fArr = dVar.f31154b;
        this.f31154b = b31.b.M(fArr, fArr.length);
    }

    public <T0> T0 b(Object... a) {
        return null;
    }
}
