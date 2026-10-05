package m11;

import androidx.compose.runtime.o0;
import java.util.HashMap;
import java.util.HashSet;
import v2.a1;
import v2.d1;
import v2.e1;
import v2.g0;
import v2.w1;
import v2.x;
import v2.x0;
import v2.z;
import v2.z0;
import w2.m1;
import x.c0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public /* synthetic */ h() {
    }

    public static final void a(h hVar, w1.q qVar, d1 d1Var) {
        for (w1.q qVar2 = qVar.v; qVar2 != null; qVar2 = qVar2.v) {
            if (qVar2 == ((a1) hVar.c)) {
                g0 w = ((g0) hVar.b).w();
                d1Var.H = w != null ? (v2.s) w.X.d : null;
                hVar.e = d1Var;
                return;
            } else {
                if ((qVar2.t & 2) != 0) {
                    return;
                }
                qVar2.N0(d1Var);
            }
        }
    }

    public static w1.q d(w1.p pVar, w1.q qVar) {
        w1.q qVar2;
        if (pVar instanceof x0) {
            qVar2 = ((x0) pVar).g();
            qVar2.t = e1.f(qVar2);
        } else {
            w1.q bVar = new v2.b();
            bVar.t = e1.d(pVar);
            ((v2.b) bVar).F = pVar;
            new HashSet();
            qVar2 = bVar;
        }
        if (qVar2.E) {
            t2.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        qVar2.z = true;
        w1.q qVar3 = qVar.w;
        if (qVar3 != null) {
            qVar3.v = qVar2;
            qVar2.w = qVar3;
        }
        qVar.w = qVar2;
        qVar2.v = qVar;
        return qVar2;
    }

    public static w1.q e(w1.q qVar) {
        boolean z = qVar.E;
        if (z) {
            c0 c0Var = e1.a;
            if (!z) {
                t2.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            e1.a(qVar, -1, 2);
            qVar.L0();
            qVar.F0();
        }
        w1.q qVar2 = qVar.w;
        w1.q qVar3 = qVar.v;
        if (qVar2 != null) {
            qVar2.v = qVar3;
            qVar.w = null;
        }
        if (qVar3 != null) {
            qVar3.w = qVar2;
            qVar.v = null;
        }
        k71.k.d(qVar3);
        return qVar3;
    }

    public static void j(w1.p pVar, w1.p pVar2, w1.q qVar) {
        if ((pVar instanceof x0) && (pVar2 instanceof x0)) {
            k71.k.e(qVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((x0) pVar2).h(qVar);
            if (qVar.E) {
                e1.c(qVar);
                return;
            } else {
                qVar.A = true;
                return;
            }
        }
        if (!(qVar instanceof v2.b)) {
            t2.a.b("Unknown Modifier.Node type");
            return;
        }
        v2.b bVar = (v2.b) qVar;
        boolean z = ((w1.q) bVar).E;
        if (z) {
            if (!z) {
                t2.a.b("unInitializeModifier called on unattached node");
            }
            if ((((w1.q) bVar).t & 8) != 0) {
                v2.l.w(bVar).G();
            }
        }
        bVar.F = pVar2;
        ((w1.q) bVar).t = e1.d(pVar2);
        if (((w1.q) bVar).E) {
            bVar.O0(false);
        }
        if (qVar.E) {
            e1.c(qVar);
        } else {
            qVar.A = true;
        }
    }

    public void b(String str, String str2) {
        HashMap hashMap = (HashMap) this.i;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public i c() {
        String str = ((String) this.b) == null ? " transportName" : "";
        if (((m) this.f) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.g) == null) {
            str = x.i.f(str, " eventMillis");
        }
        if (((Long) this.h) == null) {
            str = x.i.f(str, " uptimeMillis");
        }
        if (((HashMap) this.i) == null) {
            str = x.i.f(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new i((String) this.b, (Integer) this.d, (m) this.f, ((Long) this.g).longValue(), ((Long) this.h).longValue(), (HashMap) this.i, (Integer) this.e, (String) this.c, (byte[]) this.j, (byte[]) this.k);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean f(int i) {
        return (i & ((w1.q) this.g).u) != 0;
    }

    public void g() {
        for (w1.q qVar = (w1.q) this.g; qVar != null; qVar = qVar.w) {
            qVar.K0();
            if (qVar.z) {
                c0 c0Var = e1.a;
                if (!qVar.E) {
                    t2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                e1.a(qVar, -1, 1);
            }
            if (qVar.A) {
                e1.c(qVar);
            }
            qVar.z = false;
            qVar.A = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0191, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0196, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a0, code lost:
    
        if (r14 <= r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a2, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a4, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b0, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b2, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bd, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c1, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c3, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c5, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c7, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cd, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cf, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b9, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0194, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018d, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x017b, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0179, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026a, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0154, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d0, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0150, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0157, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0159, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015b, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016b, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0170, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0182, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0188, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018a, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018f, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(int i, l1.e eVar, l1.e eVar2, w1.q qVar, boolean z) {
        int i2;
        l1.e eVar3;
        l1.e eVar4;
        int i3;
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        z0 z0Var = (z0) this.k;
        if (z0Var == null) {
            i2 = i;
            eVar3 = eVar;
            eVar4 = eVar2;
            z0Var = new z0(this, qVar, i2, eVar3, eVar4, z);
            this.k = z0Var;
        } else {
            i2 = i;
            eVar3 = eVar;
            eVar4 = eVar2;
            z0Var.a = qVar;
            z0Var.b = i2;
            z0Var.c = eVar3;
            z0Var.d = eVar4;
            z0Var.e = z;
        }
        h hVar = z0Var.f;
        int i9 = eVar3.t - i2;
        int i10 = eVar4.t - i2;
        char c3 = 2;
        int i12 = ((i9 + i10) + 1) / 2;
        o0 o0Var = new o0(i12 * 3);
        o0 o0Var2 = new o0(i12 * 4);
        int i13 = 0;
        o0Var2.e(0, i9, 0, i10);
        int i14 = (i12 * 2) + 1;
        int[] iArr3 = new int[i14];
        int[] iArr4 = new int[i14];
        int[] iArr5 = new int[5];
        while (true) {
            int i15 = o0Var2.b;
            if (i15 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = o0Var2.a;
            int i16 = i13;
            int i17 = i15 - 1;
            o0Var2.b = i17;
            int i18 = iArr6[i17];
            int i19 = i15 - 2;
            o0Var2.b = i19;
            int i20 = iArr6[i19];
            int i22 = i15 - 3;
            o0Var2.b = i22;
            int i23 = iArr6[i22];
            int i24 = i15 - 4;
            o0Var2.b = i24;
            int i25 = iArr6[i24];
            int i26 = i23 - i25;
            int i27 = i14;
            int i28 = i18 - i20;
            int[] iArr7 = iArr3;
            if (i26 >= 1 && i28 >= 1) {
                int i29 = 1;
                int i30 = ((i26 + i28) + 1) / 2;
                int i32 = i27 / 2;
                int i33 = i32 + 1;
                iArr7[i33] = i25;
                iArr4[i33] = i23;
                int i34 = i16;
                while (i34 < i30) {
                    int i35 = i26 - i28;
                    int i36 = i30;
                    iArr = iArr4;
                    int i37 = -i34;
                    int i38 = (Math.abs(i35) & 1) == i29 ? 1 : i16;
                    int i39 = i37;
                    while (true) {
                        if (i39 > i34) {
                            break;
                        }
                        if (i39 != i37) {
                            if (i39 != i34) {
                                i4 = i39;
                                iArr2 = iArr5;
                            } else {
                                i4 = i39;
                                iArr2 = iArr5;
                            }
                            i5 = iArr7[(i4 - 1) + i32];
                            i6 = i5 + 1;
                            int i40 = ((i6 - i25) + i20) - i4;
                            int i42 = i40 - ((i34 == 0 ? 1 : i16) & (i6 != i5 ? 1 : i16));
                            int i43 = i5;
                            i7 = i40;
                            while (i6 < i23 && i7 < i18 && z0Var.a(i6, i7)) {
                                i6++;
                                i7++;
                            }
                            iArr7[i32 + i4] = i6;
                            if (i38 == 0) {
                                int i44 = i7;
                                int i45 = i35 - i4;
                                i8 = i26;
                                if (i45 >= i37 + 1 && i45 <= i34 - 1 && iArr[i32 + i45] <= i6) {
                                    iArr2[i16] = i43;
                                    iArr2[1] = i42;
                                    iArr2[c4] = i6;
                                    iArr2[3] = i44;
                                    iArr2[4] = i16;
                                    c = 1;
                                    break;
                                }
                            } else {
                                i8 = i26;
                            }
                            i39 = i4 + 2;
                            iArr5 = iArr2;
                            i26 = i8;
                        } else {
                            i4 = i39;
                            iArr2 = iArr5;
                        }
                        i5 = iArr7[i4 + 1 + i32];
                        i6 = i5;
                        int i402 = ((i6 - i25) + i20) - i4;
                        int i422 = i402 - ((i34 == 0 ? 1 : i16) & (i6 != i5 ? 1 : i16));
                        int i432 = i5;
                        i7 = i402;
                        while (i6 < i23) {
                            i6++;
                            i7++;
                        }
                        iArr7[i32 + i4] = i6;
                        if (i38 == 0) {
                        }
                        i39 = i4 + 2;
                        iArr5 = iArr2;
                        i26 = i8;
                    }
                    if (Math.min(iArr2[c4] - iArr2[i16], iArr2[3] - iArr2[c]) > 0) {
                        int i46 = iArr2[i16];
                        int i47 = iArr2[c];
                        int i48 = iArr2[3] - i47;
                        int i49 = iArr2[c4] - i46;
                        if (i48 != i49) {
                            i49 = Math.min(i49, i48);
                            int i50 = iArr2[4];
                            int i52 = i50 != 0 ? 1 : i16;
                            int i53 = iArr2[3];
                            c2 = 1;
                            int i54 = iArr2[1];
                            int i55 = i53 - i54;
                            int i56 = iArr2[c4];
                            int i57 = iArr2[i16];
                            int i58 = i46 + (((i55 > i56 - i57 ? 1 : i16) | i52) ^ 1);
                            i47 += (((i53 - i54 > i56 - i57 ? 1 : i16) ^ 1) | (i50 != 0 ? 1 : i16)) ^ 1;
                            i46 = i58;
                        } else {
                            c2 = 1;
                        }
                        o0Var.d(i46, i47, i49);
                    } else {
                        c2 = c;
                    }
                    o0Var2.e(i25, iArr2[i16], i20, iArr2[c2]);
                    o0Var2.e(iArr2[c4], i23, iArr2[3], i18);
                    c3 = c4;
                    i13 = i16;
                    i14 = i27;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c3 = c4;
            i13 = i16;
            i14 = i27;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i59 = i13;
        int i60 = o0Var.b;
        if (i60 % 3 != 0) {
            t2.a.b("Array size not a multiple of 3");
        }
        if (i60 > 3) {
            i3 = i59;
            o0Var.f(i3, i60 - 3);
        } else {
            i3 = i59;
        }
        o0Var.d(i9, i10, i3);
        int i62 = i3;
        int i63 = i62;
        int i64 = i63;
        while (i62 < o0Var.b) {
            int[] iArr8 = o0Var.a;
            int i65 = iArr8[i62];
            int i66 = iArr8[i62 + 2];
            int i67 = i65 - i66;
            int i68 = iArr8[i62 + 1] - i66;
            i62 += 3;
            while (i63 < i67) {
                w1.q qVar2 = z0Var.a.w;
                k71.k.d(qVar2);
                if ((qVar2.t & 2) != 0) {
                    d1 d1Var = qVar2.y;
                    k71.k.d(d1Var);
                    d1 d1Var2 = d1Var.H;
                    d1 d1Var3 = d1Var.G;
                    k71.k.d(d1Var3);
                    if (d1Var2 != null) {
                        d1Var2.G = d1Var3;
                    }
                    d1Var3.H = d1Var2;
                    a(hVar, z0Var.a, d1Var3);
                }
                z0Var.a = e(qVar2);
                i63++;
            }
            while (i64 < i68) {
                w1.q d = d((w1.p) z0Var.d.r[z0Var.b + i64], z0Var.a);
                z0Var.a = d;
                if (z0Var.e) {
                    w1.q qVar3 = d.w;
                    k71.k.d(qVar3);
                    d1 d1Var4 = qVar3.y;
                    k71.k.d(d1Var4);
                    x f = v2.l.f(z0Var.a);
                    if (f != null) {
                        z zVar = new z((g0) hVar.b, f);
                        z0Var.a.N0(zVar);
                        a(hVar, z0Var.a, zVar);
                        ((d1) zVar).H = d1Var4.H;
                        ((d1) zVar).G = d1Var4;
                        d1Var4.H = zVar;
                    } else {
                        z0Var.a.N0(d1Var4);
                    }
                    z0Var.a.E0();
                    z0Var.a.K0();
                    w1.q qVar4 = z0Var.a;
                    c0 c0Var = e1.a;
                    if (!qVar4.E) {
                        t2.a.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    e1.a(qVar4, -1, 1);
                } else {
                    d.z = true;
                }
                i64++;
            }
            while (true) {
                int i69 = i66 - 1;
                if (i66 > 0) {
                    w1.q qVar5 = z0Var.a.w;
                    k71.k.d(qVar5);
                    z0Var.a = qVar5;
                    l1.e eVar5 = z0Var.c;
                    int i70 = z0Var.b;
                    w1.p pVar = (w1.p) eVar5.r[i70 + i63];
                    w1.p pVar2 = (w1.p) z0Var.d.r[i70 + i64];
                    if (!k71.k.b(pVar, pVar2)) {
                        j(pVar, pVar2, z0Var.a);
                    }
                    i63++;
                    i64++;
                    i66 = i69;
                }
            }
        }
        int i72 = i3;
        for (w1.q qVar6 = ((w1.q) ((w1) this.f)).v; qVar6 != null && qVar6 != ((a1) this.c); qVar6 = qVar6.v) {
            i72 |= qVar6.t;
            qVar6.u = i72;
        }
    }

    public void i() {
        z zVar;
        m1 m1Var;
        g0 g0Var = (g0) this.b;
        z zVar2 = (v2.s) this.d;
        for (x xVar = ((w1.q) ((w1) this.f)).v; xVar != null; xVar = ((w1.q) xVar).v) {
            x f = v2.l.f(xVar);
            if (f != null) {
                z zVar3 = ((w1.q) xVar).y;
                if (zVar3 != null) {
                    zVar = zVar3;
                    x xVar2 = zVar.j0;
                    zVar.y1(f);
                    if (xVar2 != xVar && (m1Var = ((d1) zVar).c0) != null) {
                        m1Var.invalidate();
                    }
                } else {
                    zVar = new z(g0Var, f);
                    xVar.N0(zVar);
                }
                ((d1) zVar2).H = zVar;
                ((d1) zVar).G = zVar2;
                zVar2 = zVar;
            } else {
                xVar.N0(zVar2);
            }
        }
        g0 w = g0Var.w();
        ((d1) zVar2).H = w != null ? (v2.s) w.X.d : null;
        this.e = zVar2;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                w1.q qVar = (w1.q) this.g;
                w1.q qVar2 = (w1) this.f;
                if (qVar == qVar2) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (qVar != null && qVar != qVar2) {
                            sb.append(String.valueOf(qVar));
                            if (qVar.w == qVar2) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                qVar = qVar.w;
                            }
                        }
                    }
                }
                String sb2 = sb.toString();
                k71.k.f(sb2, "toString(...)");
                return sb2;
            default:
                return super.toString();
        }
    }

    public h(g0 g0Var) {
        this.b = g0Var;
        a1 a1Var = new a1();
        ((w1.q) a1Var).u = -1;
        this.c = a1Var;
        v2.s sVar = new v2.s(g0Var);
        this.d = sVar;
        this.e = sVar;
        w1 w1Var = sVar.j0;
        this.f = w1Var;
        this.g = w1Var;
        this.j = new l1.e(new w1.r[16]);
    }


}
