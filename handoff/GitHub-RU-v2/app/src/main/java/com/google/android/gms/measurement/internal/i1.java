package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzmr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i1 extends i4 implements g {
    public x.e A;
    public f1 B;
    public y51.c C;
    public x.e D;
    public x.e E;
    public x.e F;
    public x.e v;
    public x.e w;
    public x.e x;
    public x.e y;
    public x.e z;

    public i1(o4 o4Var) {
        super(o4Var);
        this.v = new x.e(0);
        this.w = new x.e(0);
        this.x = new x.e(0);
        this.y = new x.e(0);
        this.z = new x.e(0);
        this.D = new x.e(0);
        this.E = new x.e(0);
        this.F = new x.e(0);
        this.A = new x.e(0);
        this.B = new f1(this);
        this.C = new y51.c(27, this);
    }

    public static final x.e J(com.google.android.gms.internal.measurement.f2 f2Var) {
        x.e eVar = new x.e(0);
        for (com.google.android.gms.internal.measurement.j2 j2Var : f2Var.t()) {
            eVar.put(j2Var.p(), j2Var.q());
        }
        return eVar;
    }

    public static final a2 K(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return a2.AD_STORAGE;
        }
        if (i2 == 2) {
            return a2.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return a2.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return a2.AD_PERSONALIZATION;
    }

    @Override // com.google.android.gms.measurement.internal.i4
    public final void C() {
    }

    public final y1 D(String str, a2 a2Var) {
        z();
        F(str);
        com.google.android.gms.internal.measurement.a2 U = U(str);
        if (U != null) {
            Iterator it = U.u().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.gms.internal.measurement.x1 x1Var = (com.google.android.gms.internal.measurement.x1) it.next();
                if (K(x1Var.p()) == a2Var) {
                    int q = x1Var.q() - 1;
                    if (q == 1) {
                        return y1.GRANTED;
                    }
                    if (q == 2) {
                        return y1.DENIED;
                    }
                }
            }
        }
        return y1.UNINITIALIZED;
    }

    public final boolean E(String str) {
        z();
        F(str);
        com.google.android.gms.internal.measurement.a2 U = U(str);
        if (U == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.x1 x1Var : U.p()) {
            if (x1Var.p() == 3 && x1Var.r() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void F(String str) {
        A();
        z();
        c21.uShadow.d(str);
        x.e eVar = this.z;
        if (eVar.get(str) == null) {
            o oVar = this.t.t;
            o4.U(oVar);
            a5.s F0 = oVar.F0(str);
            x.e eVar2 = this.F;
            x.e eVar3 = this.E;
            x.e eVar4 = this.D;
            x.e eVar5 = this.v;
            if (F0 != null) {
                com.google.android.gms.internal.measurement.e2 e2Var = (com.google.android.gms.internal.measurement.e2) I(str, (byte[]) F0.t).i();
                G(str, e2Var);
                eVar5.put(str, J((com.google.android.gms.internal.measurement.f2) e2Var.e()));
                eVar.put(str, (com.google.android.gms.internal.measurement.f2) e2Var.e());
                H(str, (com.google.android.gms.internal.measurement.f2) e2Var.e());
                eVar4.put(str, ((com.google.android.gms.internal.measurement.f2) e2Var.s).A());
                eVar3.put(str, (String) F0.u);
                eVar2.put(str, (String) F0.s);
                return;
            }
            eVar5.put(str, (Object) null);
            this.x.put(str, (Object) null);
            this.w.put(str, (Object) null);
            this.y.put(str, (Object) null);
            eVar.put(str, (Object) null);
            eVar4.put(str, (Object) null);
            eVar3.put(str, (Object) null);
            eVar2.put(str, (Object) null);
            this.A.put(str, (Object) null);
        }
    }

    public final void G(String str, com.google.android.gms.internal.measurement.e2 e2Var) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        HashSet hashSet = new HashSet();
        x.e eVar = new x.e(0);
        x.e eVar2 = new x.e(0);
        x.e eVar3 = new x.e(0);
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.f2) e2Var.s).z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.b2) it.next()).p());
        }
        for (int i = 0; i < ((com.google.android.gms.internal.measurement.f2) e2Var.s).u(); i++) {
            com.google.android.gms.internal.measurement.c2 c2Var = (com.google.android.gms.internal.measurement.c2) ((com.google.android.gms.internal.measurement.f2) e2Var.s).v(i).i();
            if (c2Var.i().isEmpty()) {
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                s0Var.A.a("EventConfig contained null event name");
            } else {
                String i2 = c2Var.i();
                String g = c2.g(c2Var.i(), c2.a, c2.c);
                if (!TextUtils.isEmpty(g)) {
                    c2Var.b();
                    ((com.google.android.gms.internal.measurement.d2) c2Var.s).w(g);
                    e2Var.b();
                    ((com.google.android.gms.internal.measurement.f2) e2Var.s).H(i, (com.google.android.gms.internal.measurement.d2) c2Var.e());
                }
                if (((com.google.android.gms.internal.measurement.d2) c2Var.s).q() && ((com.google.android.gms.internal.measurement.d2) c2Var.s).r()) {
                    eVar.put(i2, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.d2) c2Var.s).s() && ((com.google.android.gms.internal.measurement.d2) c2Var.s).t()) {
                    eVar2.put(c2Var.i(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.d2) c2Var.s).u()) {
                    if (((com.google.android.gms.internal.measurement.d2) c2Var.s).v() < 2 || ((com.google.android.gms.internal.measurement.d2) c2Var.s).v() > 65535) {
                        s0 s0Var2 = o1Var.w;
                        o1.m(s0Var2);
                        s0Var2.A.c("Invalid sampling rate. Event name, sample rate", c2Var.i(), Integer.valueOf(((com.google.android.gms.internal.measurement.d2) c2Var.s).v()));
                    } else {
                        eVar3.put(c2Var.i(), Integer.valueOf(((com.google.android.gms.internal.measurement.d2) c2Var.s).v()));
                    }
                }
            }
        }
        this.w.put(str, hashSet);
        this.x.put(str, eVar);
        this.y.put(str, eVar2);
        this.A.put(str, eVar3);
    }

    public final void H(String str, com.google.android.gms.internal.measurement.f2 f2Var) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        int y = f2Var.y();
        f1 f1Var = this.B;
        if (y == 0) {
            f1Var.m(str);
            return;
        }
        s0 s0Var = o1Var.w;
        o1.m(s0Var);
        s0Var.F.b(Integer.valueOf(f2Var.y()), "EES programs found");
        com.google.android.gms.internal.measurement.v3 v3Var = (com.google.android.gms.internal.measurement.v3) f2Var.x().get(0);
        try {
            com.google.android.gms.internal.measurement.e0 e0Var = new com.google.android.gms.internal.measurement.e0();
            w51.r rVar = e0Var.a;
            ((HashMap) ((t5) rVar.v).r).put("internal.remoteConfig", new g1(this, str, 2));
            ((HashMap) ((t5) rVar.v).r).put("internal.appMetadata", new g1(this, str, 0));
            ((HashMap) ((t5) rVar.v).r).put("internal.logger", new h1(0, this));
            e0Var.b(v3Var);
            f1Var.l(str, e0Var);
            o1.m(s0Var);
            q0 q0Var = s0Var.F;
            q0Var.c("EES program loaded for appId, activities", str, Integer.valueOf(v3Var.q().q()));
            for (com.google.android.gms.internal.measurement.u3 u3Var : v3Var.q().p()) {
                o1.m(s0Var);
                q0Var.b(u3Var.p(), "EES program activity");
            }
        } catch (zzd unused) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.x.b(str, "Failed to load EES program. appId");
        }
    }

    public final com.google.android.gms.internal.measurement.f2 I(String str, byte[] bArr) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.f2.G();
        }
        try {
            com.google.android.gms.internal.measurement.f2 f2Var = (com.google.android.gms.internal.measurement.f2) ((com.google.android.gms.internal.measurement.e2) w0.m0(com.google.android.gms.internal.measurement.f2.F(), bArr)).e();
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.F.c("Parsed config. version, gmp_app_id", f2Var.p() ? Long.valueOf(f2Var.q()) : null, f2Var.r() ? f2Var.s() : null);
            return f2Var;
        } catch (zzmr e) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.A.c("Unable to merge remote config. appId", s0.H(str), e);
            return com.google.android.gms.internal.measurement.f2.G();
        } catch (RuntimeException e2) {
            s0 s0Var3 = o1Var.w;
            o1.m(s0Var3);
            s0Var3.A.c("Unable to merge remote config. appId", s0.H(str), e2);
            return com.google.android.gms.internal.measurement.f2.G();
        }
    }

    public final com.google.android.gms.internal.measurement.f2 L(String str) {
        A();
        z();
        c21.uShadow.d(str);
        F(str);
        return (com.google.android.gms.internal.measurement.f2) this.z.get(str);
    }

    public final String M(String str) {
        z();
        F(str);
        return (String) this.D.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0483, code lost:
    
        r1 = r24;
        r3 = r25;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0340, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0324, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02cd, code lost:
    
        r0 = r13.w;
        com.google.android.gms.measurement.internal.o1.m(r0);
        r0 = r0.A;
        r3 = com.google.android.gms.measurement.internal.s0.H(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02e2, code lost:
    
        if (r14.p() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e4, code lost:
    
        r5 = java.lang.Integer.valueOf(r14.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02f3, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02f2, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02ed, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0384, code lost:
    
        r27 = r6;
        r5 = r5.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0394, code lost:
    
        if (r5.hasNext() == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0396, code lost:
    
        r6 = (com.google.android.gms.internal.measurement.v1) r5.next();
        r8.A();
        r8.z();
        c21.uShadow.d(r30);
        c21.uShadow.g(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03b0, code lost:
    
        if (r6.r().isEmpty() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03dc, code lost:
    
        r14 = r6.a();
        r23 = r5;
        r5 = new android.content.ContentValues();
        r5.put(r3, r30);
        r26 = r3;
        r5.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03f7, code lost:
    
        if (r6.p() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03f9, code lost:
    
        r3 = java.lang.Integer.valueOf(r6.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0403, code lost:
    
        r5.put(r0, r3);
        r28 = r0;
        r5.put("property_name", r6.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0415, code lost:
    
        if (r6.v() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0417, code lost:
    
        r3 = java.lang.Boolean.valueOf(r6.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0421, code lost:
    
        r5.put("session_scoped", r3);
        r5.put("data", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0433, code lost:
    
        if (r8.o0().insertWithOnConflict("property_filters", null, r5, 5) != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0448, code lost:
    
        r5 = r23;
        r3 = r26;
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0435, code lost:
    
        r0 = r13.w;
        com.google.android.gms.measurement.internal.o1.m(r0);
        r0.x.b(com.google.android.gms.measurement.internal.s0.H(r30), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0446, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0450, code lost:
    
        r1 = r13.w;
        com.google.android.gms.measurement.internal.o1.m(r1);
        r1.x.c("Error storing property filter. appId", com.google.android.gms.measurement.internal.s0.H(r30), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0420, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0402, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03b2, code lost:
    
        r0 = r13.w;
        com.google.android.gms.measurement.internal.o1.m(r0);
        r0 = r0.A;
        r3 = com.google.android.gms.measurement.internal.s0.H(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03c7, code lost:
    
        if (r6.p() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03c9, code lost:
    
        r5 = java.lang.Integer.valueOf(r6.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03d3, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03d2, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0262, code lost:
    
        r0 = r5.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x026e, code lost:
    
        if (r0.hasNext() == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027a, code lost:
    
        if (((com.google.android.gms.internal.measurement.v1) r0.next()).p() != false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x027c, code lost:
    
        r0 = r13.w;
        com.google.android.gms.measurement.internal.o1.m(r0);
        r0.A.c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.s0.H(r30), java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0291, code lost:
    
        r0 = r5.u().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0299, code lost:
    
        r14 = r0.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x029d, code lost:
    
        r23 = r0;
        r0 = "filter_id";
        r24 = r1;
        r25 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02af, code lost:
    
        if (r14 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02b1, code lost:
    
        r14 = (com.google.android.gms.internal.measurement.o1) r23.next();
        r8.A();
        r8.z();
        c21.uShadow.d(r30);
        c21.uShadow.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02cb, code lost:
    
        if (r14.r().isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02fe, code lost:
    
        r26 = r5;
        r5 = r14.a();
        r27 = r6;
        r6 = new android.content.ContentValues();
        r6.put("app_id", r30);
        r6.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0319, code lost:
    
        if (r14.p() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x031b, code lost:
    
        r1 = java.lang.Integer.valueOf(r14.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0325, code lost:
    
        r6.put("filter_id", r1);
        r6.put("event_name", r14.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0335, code lost:
    
        if (r14.z() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0337, code lost:
    
        r0 = java.lang.Boolean.valueOf(r14.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0341, code lost:
    
        r6.put("session_scoped", r0);
        r6.put("data", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0353, code lost:
    
        if (r8.o0().insertWithOnConflict("event_filters", null, r6, 5) != (-1)) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0355, code lost:
    
        r0 = r13.w;
        com.google.android.gms.measurement.internal.o1.m(r0);
        r0.x.b(com.google.android.gms.measurement.internal.s0.H(r30), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0365, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0371, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0372, code lost:
    
        r1 = r13.w;
        com.google.android.gms.measurement.internal.o1.m(r1);
        r1.x.c("Error storing event filter. appId", com.google.android.gms.measurement.internal.s0.H(r30), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0460, code lost:
    
        r8.A();
        r8.z();
        c21.uShadow.d(r30);
        r0 = r8.o0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05f0 A[Catch: SQLiteException -> 0x0601, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0601, blocks: (B:180:0x05d9, B:182:0x05f0), top: B:179:0x05d9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(String str, byte[] bArr, String str2, String str3) {
        SQLiteDatabase sQLiteDatabase;
        com.google.android.gms.internal.measurement.e2 e2Var;
        byte[] bArr2;
        o oVar;
        ContentValues contentValues;
        boolean z;
        A();
        z();
        c21.uShadow.d(str);
        com.google.android.gms.internal.measurement.e2 e2Var2 = (com.google.android.gms.internal.measurement.e2) I(str, bArr).i();
        G(str, e2Var2);
        H(str, (com.google.android.gms.internal.measurement.f2) e2Var2.e());
        com.google.android.gms.internal.measurement.f2 f2Var = (com.google.android.gms.internal.measurement.f2) e2Var2.e();
        x.e eVar = this.z;
        eVar.put(str, f2Var);
        this.D.put(str, ((com.google.android.gms.internal.measurement.f2) e2Var2.s).A());
        this.E.put(str, str2);
        this.F.put(str, str3);
        this.v.put(str, J((com.google.android.gms.internal.measurement.f2) e2Var2.e()));
        o4 o4Var = this.t;
        o oVar2 = o4Var.t;
        o4.U(oVar2);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((com.google.android.gms.internal.measurement.f2) e2Var2.s).w()));
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) oVar2).s;
        int i = 0;
        while (i < arrayList.size()) {
            com.google.android.gms.internal.measurement.l1 l1Var = (com.google.android.gms.internal.measurement.l1) ((com.google.android.gms.internal.measurement.m1) arrayList.get(i)).i();
            x.e eVar2 = eVar;
            if (((com.google.android.gms.internal.measurement.m1) l1Var.s).v() != 0) {
                int i2 = 0;
                while (i2 < ((com.google.android.gms.internal.measurement.m1) l1Var.s).v()) {
                    com.google.android.gms.internal.measurement.n1 n1Var = (com.google.android.gms.internal.measurement.n1) ((com.google.android.gms.internal.measurement.m1) l1Var.s).w(i2).i();
                    com.google.android.gms.internal.measurement.n1 n1Var2 = (com.google.android.gms.internal.measurement.n1) n1Var.clone();
                    o4 o4Var2 = o4Var;
                    com.google.android.gms.internal.measurement.e2 e2Var3 = e2Var2;
                    String g = c2.g(((com.google.android.gms.internal.measurement.o1) n1Var.s).r(), c2.a, c2.c);
                    if (g != null) {
                        n1Var2.b();
                        ((com.google.android.gms.internal.measurement.o1) n1Var2.s).C(g);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    while (i3 < ((com.google.android.gms.internal.measurement.o1) n1Var.s).t()) {
                        com.google.android.gms.internal.measurement.q1 u = ((com.google.android.gms.internal.measurement.o1) n1Var.s).u(i3);
                        boolean z2 = z;
                        com.google.android.gms.internal.measurement.n1 n1Var3 = n1Var;
                        String g2 = c2.g(u.w(), c2.e, c2.f);
                        if (g2 != null) {
                            com.google.android.gms.internal.measurement.p1 p1Var = (com.google.android.gms.internal.measurement.p1) u.i();
                            p1Var.b();
                            ((com.google.android.gms.internal.measurement.q1) p1Var.s).y(g2);
                            com.google.android.gms.internal.measurement.q1 q1Var = (com.google.android.gms.internal.measurement.q1) p1Var.e();
                            n1Var2.b();
                            ((com.google.android.gms.internal.measurement.o1) n1Var2.s).D(i3, q1Var);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i3++;
                        n1Var = n1Var3;
                    }
                    if (z) {
                        l1Var.b();
                        ((com.google.android.gms.internal.measurement.m1) l1Var.s).y(i2, (com.google.android.gms.internal.measurement.o1) n1Var2.e());
                        arrayList.set(i, (com.google.android.gms.internal.measurement.m1) l1Var.e());
                    }
                    i2++;
                    o4Var = o4Var2;
                    e2Var2 = e2Var3;
                }
            }
            com.google.android.gms.internal.measurement.e2 e2Var4 = e2Var2;
            o4 o4Var3 = o4Var;
            if (((com.google.android.gms.internal.measurement.m1) l1Var.s).s() != 0) {
                for (int i4 = 0; i4 < ((com.google.android.gms.internal.measurement.m1) l1Var.s).s(); i4++) {
                    com.google.android.gms.internal.measurement.v1 t = ((com.google.android.gms.internal.measurement.m1) l1Var.s).t(i4);
                    String g3 = c2.g(t.r(), c2.i, c2.j);
                    if (g3 != null) {
                        com.google.android.gms.internal.measurement.u1 u1Var = (com.google.android.gms.internal.measurement.u1) t.i();
                        u1Var.b();
                        ((com.google.android.gms.internal.measurement.v1) u1Var.s).y(g3);
                        l1Var.b();
                        ((com.google.android.gms.internal.measurement.m1) l1Var.s).x(i4, (com.google.android.gms.internal.measurement.v1) u1Var.e());
                        arrayList.set(i, (com.google.android.gms.internal.measurement.m1) l1Var.e());
                    }
                }
            }
            i++;
            eVar = eVar2;
            o4Var = o4Var3;
            e2Var2 = e2Var4;
        }
        com.google.android.gms.internal.measurement.e2 e2Var5 = e2Var2;
        x.e eVar3 = eVar;
        o4 o4Var4 = o4Var;
        oVar2.A();
        oVar2.z();
        c21.uShadow.d(str);
        SQLiteDatabase o0 = oVar2.o0();
        o0.beginTransaction();
        try {
            oVar2.A();
            oVar2.z();
            c21.uShadow.d(str);
            SQLiteDatabase o02 = oVar2.o0();
            o02.delete("property_filters", "app_id=?", new String[]{str});
            o02.delete("event_filters", "app_id=?", new String[]{str});
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                try {
                    int i6 = i5 + 1;
                    com.google.android.gms.internal.measurement.m1 m1Var = (com.google.android.gms.internal.measurement.m1) arrayList.get(i5);
                    oVar2.A();
                    oVar2.z();
                    c21.uShadow.d(str);
                    c21.uShadow.g(m1Var);
                    if (m1Var.p()) {
                        int q = m1Var.q();
                        Iterator it = m1Var.u().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (!((com.google.android.gms.internal.measurement.o1) it.next()).p()) {
                                s0 s0Var = o1Var.w;
                                o1.m(s0Var);
                                s0Var.A.c("Event filter with no ID. Audience definition ignored. appId, audienceId", s0.H(str), Integer.valueOf(q));
                                break;
                            }
                        }
                    } else {
                        s0 s0Var2 = o1Var.w;
                        o1.m(s0Var2);
                        s0Var2.A.b(s0.H(str), "Audience with no ID. appId");
                    }
                    i5 = i6;
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = o0;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase = o0;
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj = arrayList.get(i7);
                i7++;
                com.google.android.gms.internal.measurement.m1 m1Var2 = (com.google.android.gms.internal.measurement.m1) obj;
                arrayList2.add(m1Var2.p() ? Integer.valueOf(m1Var2.q()) : null);
            }
            c21.uShadow.d(str);
            oVar2.A();
            oVar2.z();
            SQLiteDatabase o03 = oVar2.o0();
            try {
                long j0 = oVar2.j0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int max = Math.max(0, Math.min(2000, o1Var.u.H(str, c0.U)));
                if (j0 > max) {
                    ArrayList arrayList3 = new ArrayList();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList2.size()) {
                            String join = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
                            sb.append("(");
                            sb.append(join);
                            sb.append(")");
                            String sb2 = sb.toString();
                            StringBuilder sb3 = new StringBuilder(sb2.length() + 140);
                            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb3.append(sb2);
                            sb3.append(" order by rowid desc limit -1 offset ?)");
                            o03.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i8);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i8++;
                    }
                }
            } catch (SQLiteException e) {
                s0 s0Var3 = o1Var.w;
                o1.m(s0Var3);
                s0Var3.x.c("Database error querying filters. appId", s0.H(str), e);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                e2Var5.b();
                e2Var = e2Var5;
            } catch (RuntimeException e2) {
                e = e2;
                e2Var = e2Var5;
            }
            try {
                ((com.google.android.gms.internal.measurement.f2) e2Var.s).I();
                bArr2 = ((com.google.android.gms.internal.measurement.f2) e2Var.e()).a();
            } catch (RuntimeException e3) {
                e = e3;
                s0 s0Var4 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
                o1.m(s0Var4);
                s0Var4.A.c("Unable to serialize reduced-size config. Storing full config instead. appId", s0.H(str), e);
                bArr2 = bArr;
                oVar = o4Var4.t;
                o4.U(oVar);
                o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s;
                c21.uShadow.d(str);
                oVar.z();
                oVar.A();
                contentValues = new ContentValues();
                contentValues.put("remote_config", bArr2);
                contentValues.put("config_last_modified_time", str2);
                contentValues.put("e_tag", str3);
                if (oVar.o0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                }
                e2Var.b();
                ((com.google.android.gms.internal.measurement.f2) e2Var.s).J();
                eVar3.put(str, (com.google.android.gms.internal.measurement.f2) e2Var.e());
            }
            oVar = o4Var4.t;
            o4.U(oVar);
            o1 o1Var22 = (o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s;
            c21.uShadow.d(str);
            oVar.z();
            oVar.A();
            contentValues = new ContentValues();
            contentValues.put("remote_config", bArr2);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            try {
                if (oVar.o0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    s0 s0Var5 = o1Var22.w;
                    o1.m(s0Var5);
                    s0Var5.x.b(s0.H(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e4) {
                s0 s0Var6 = o1Var22.w;
                o1.m(s0Var6);
                s0Var6.x.c("Error storing remote config. appId", s0.H(str), e4);
            }
            e2Var.b();
            ((com.google.android.gms.internal.measurement.f2) e2Var.s).J();
            eVar3.put(str, (com.google.android.gms.internal.measurement.f2) e2Var.e());
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = o0;
        }
    }

    public final boolean O(String str, String str2) {
        Boolean bool;
        z();
        F(str);
        if ("1".equals(e(str, "measurement.upload.blacklist_internal")) && t4.Y(str2)) {
            return true;
        }
        if ("1".equals(e(str, "measurement.upload.blacklist_public")) && t4.y0(str2)) {
            return true;
        }
        Map map = (Map) this.x.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean P(String str, String str2) {
        Boolean bool;
        z();
        F(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.y.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int Q(String str, String str2) {
        Integer num;
        z();
        F(str);
        Map map = (Map) this.A.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean R(String str) {
        z();
        F(str);
        x.e eVar = this.w;
        if (eVar.get(str) != null) {
            return ((Set) eVar.get(str)).contains("os_version") || ((Set) eVar.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean S(String str) {
        z();
        F(str);
        x.e eVar = this.w;
        return eVar.get(str) != null && ((Set) eVar.get(str)).contains("app_instance_id");
    }

    public final boolean T(String str, a2 a2Var) {
        z();
        F(str);
        com.google.android.gms.internal.measurement.a2 U = U(str);
        if (U == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.x1 x1Var : U.p()) {
            if (a2Var == K(x1Var.p())) {
                return x1Var.q() == 2;
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.a2 U(String str) {
        z();
        F(str);
        com.google.android.gms.internal.measurement.f2 L = L(str);
        if (L == null || !L.B()) {
            return null;
        }
        return L.C();
    }

    @Override // com.google.android.gms.measurement.internal.g
    public final String e(String str, String str2) {
        z();
        F(str);
        Map map = (Map) this.v.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }
    public Object r = null;
    public Object t = null;
}
